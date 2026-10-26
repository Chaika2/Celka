import os, re, sys, io

# Mechanical deobfuscation: constant-propagation of per-class substitution arrays.
# Pattern: an array field F (static constant table) is initialized with a literal
# `F = new <type>[]{...}` and later accessed as `F[<const>]`. We replace those
# accesses with the literal element. Iterate to fixpoint (nested lookups).

PRIM = ("byte", "short", "long", "float", "double", "boolean")
ALLObj = ("Object", "java.lang.Object", "String", "java.lang.String")

# match:  NAME = new [mod]TYPE[] { ... }      (braced literal -> constant table)
re_braced = re.compile(
    r'(?P<name>[A-Za-z_$][\w$]*)\s*=\s*new\s+(?:[\w$.]+\s*>?\s*)?'
    r'(?P<type>byte|short|long|float|double|boolean|char|Object|java\.lang\.Object|String|java\.lang\.String)\s*\[\]\s*\{',
    re.M)

# match access: NAME [ <number> ]    (bare, not preceded by . or word char)
re_access = re.compile(r'(?<![\w.$])(?P<name>[A-Za-z_$][\w$]*)\s*\[\s*(?P<idx>-?\d+)\s*\]')

def split_top(s):
    out, depth, cur = [], 0, []
    for ch in s:
        if ch in '([{':
            depth += 1
        elif ch in ')]}':
            depth -= 1
        if ch == ',' and depth == 0:
            out.append(''.join(cur)); cur = []
        else:
            cur.append(ch)
    if ''.join(cur).strip():
        out.append(''.join(cur))
    return out

def find_matching_brace(s, i):
    depth = 0
    while i < len(s):
        if s[i] == '{':
            depth += 1
        elif s[i] == '}':
            depth -= 1
            if depth == 0:
                return i
        elif s[i] == '"':
            i += 1
            while i < len(s) and s[i] != '"':
                if s[i] == '\\': i += 1
                i += 1
        i += 1
    return -1

def parse_tables(text):
    """Return dict name -> list[str] of raw element literals (order preserved)."""
    tables = {}
    for m in re_braced.finditer(text):
        name = m.group('name')
        start = m.end() - 1  # at '{'
        end = find_matching_brace(text, start)
        if end < 0:
            continue
        body = text[start+1:end]
        elems = [e.strip() for e in split_top(body)]
        # only accept simple literal-ish tables (no '{' inside, no method calls)
        if any(('{' in e or '}' in e) for e in elems):
            continue
        tables[name] = elems
    return tables

def norm(val, kind):
    v = val.strip()
    if kind == 'boolean':
        return v
    v = re.sub(r'^\((?:byte|short|long|float|double|int|char)\)\s*', '', v)
    return v

def is_bool_table(tables, name):
    return all(e in ('true', 'false') for e in tables[name]) and len(tables[name]) > 0

def bool_ctx_numeric(left, right):
    l = left.rstrip()
    r = right.lstrip()
    if re.search(r'(valueOf|parseInt|parseLong|parseDouble|parseFloat)\(\s*$', l):
        return True
    if re.search(r'\(int\)\s*$|\(long\)\s*$|\(byte\)\s*$|\(short\)\s*$|\(float\)\s*$|\(double\)\s*$', l):
        return True
    if re.search(r'[+\-*/%]\s*$', l):
        return True
    if re.search(r'(<=|>=|==|!=|<|>)\s*$', l):
        return True
    if re.search(r'[\[(]\s*$', l) and re.search(r'(get|set|valueOf|equals)\(?\s*$', l):
        return True
    if re.search(r'\[\s*$', l):
        return True
    if re.match(r'^(<=|>=|==|!=|<|>|\+|\-|\*|/|%|\[)', r):
        return True
    return False

def substitute(text, tables):
    changed_any = False
    boolnames = set(n for n in tables if is_bool_table(tables, n))
    for _ in range(8):
        changed = False
        def repl(m):
            nonlocal changed
            name = m.group('name')
            if name not in tables:
                return m.group(0)
            try:
                idx = int(m.group('idx'))
            except ValueError:
                return m.group(0)
            elems = tables[name]
            if not (0 <= idx < len(elems)):
                return m.group(0)
            changed = True
            val = elems[idx]
            if name in boolnames:
                left = text[max(0, m.start()-24):m.start()]
                right = text[m.end():m.end()+6]
                if bool_ctx_numeric(left, right):
                    return '1' if val == 'true' else '0'
                return val
            return val
        text = re_access.sub(repl, text)
        if changed:
            changed_any = True
        else:
            break
    return text, changed_any

def leftover(text, tables):
    bad = []
    for m in re_access.finditer(text):
        name = m.group('name')
        if name in tables:
            try:
                idx = int(m.group('idx'))
            except ValueError:
                continue
            if not (0 <= idx < len(tables[name])):
                bad.append((name, idx, len(tables[name])))
    return bad

def process(path, outdir):
    with io.open(path, 'r', encoding='utf-8', errors='replace') as f:
        text = f.read()
    tables = parse_tables(text)
    new, changed = substitute(text, tables)
    bad = leftover(new, tables)
    os.makedirs(outdir, exist_ok=True)
    out = os.path.join(outdir, os.path.basename(path))
    with io.open(out, 'w', encoding='utf-8') as f:
        f.write(new)
    return len(tables), changed, bad

def main():
    src = sys.argv[1]; dst = sys.argv[2]
    total = 0
    for name in sorted(os.listdir(src)):
        if not name.endswith('.java'):
            continue
        p = os.path.join(src, name)
        nt, ch, bad = process(p, dst)
        total += 1
        flag = ''
        if bad:
            flag = '  BAD:' + ','.join('%s[%d/%d]' % b for b in bad[:5])
        if nt == 0:
            print('%-22s tables=0%s' % (name, flag))
        else:
            print('%-22s tables=%d changed=%s%s' % (name, nt, ch, flag))
    print('processed', total, 'files ->', dst)

if __name__ == '__main__':
    main()
