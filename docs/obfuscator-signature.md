# Obfuscator signature notes

## What the obfuscator actually did

### 1. Name obfuscation
Everything is renamed to short synthetic names:
* classes: `rrnD_2`, `rrAB`, `cb_3`, ...
* methods: `id_class`, `id_break`, `id_byte`, `id_protected`, `id_throws`, ...
* fields: `id_byte`, `id_protected`, `id_throws`, `id_case`, ...

The `id_*` prefix is a fixed vocabulary reused for every original name, so the
same method name `id_class` appears thousands of times with different signatures.

### 2. Constant-pool array indirection ("staticField<hash>")
Real constants are lifted out of the bytecode into per-class static arrays, and
the code reads them back by index. Example from `celestial.rrnD_2`:

| helper | array created | sample contents |
| --- | --- | --- |
| `id_implements()` | `boolean[77]` | sparse `true` at 4, 6, 7, 8, 9, ... |
| `id_native()` | `long[2]` | (zeroed) |
| `id_final()` | `float[9]` | `3.4028235E38f`, `2.0f`, `1.0f`, `0.8f` |
| `id_package()` | `double[8]` | `-0.15233518685055708d`, `0.43152384527073195d`, `0.0548933470320776d`, `0.1d` |

These are *not* business logic; they are the original `<clinit>` split into pieces.
816 classes carry the `staticField<hash>` marker that goes with this scheme.

### 3. Split static initialiser (`ntfClinit`)
The real class initialiser is renamed `ntfClinit()` and simply calls the array
initialisers in order:

```
private static void ntfClinit() {
    id_implements();
    id_native();
    id_int();
    id_final();
    id_package();
    id_finally();
    ...
}
```

Decompilers show these as unrelated empty-ish methods, which is why the classes
look broken.

### 4. Dead string-decryptor stubs
Every class carries an unused `javax/crypto` DES/CBC method
(`public static String id_class(String) throws Exception`). Nothing calls it —
see `docs/deobfuscation-audit.md`. Strings are plain UTF-8 in the constant pool.

### 5. Enum-shaped artifacts
658 classes mention `java/lang/Enum`. Some are genuine enums; most are classes the
obfuscator marked so that decompilers emit illegal `extends Enum<...>` code.

## Which obfuscator

The bundled detection rules were run directly against the jar
(`DetectRules`, see below). Only two rules matched, and neither is a flow/string
obfuscator:

```
MATCH: generic.RuleIllegalSignature
  Found illegal field signature for celestial/rnp_3 rLcelestial/rnn_3;
  -> IllegalSignatureRemover

MATCH: smoke.RuleNumberObfuscation
  Found potential number obfuscation (4 times) in celestial/AJ id_break(String)
  -> smoke.NumberObfuscationTransformer
```

**No `RuleSuperblaubeereObfuscation` match, no Stringer/Zelix/Allatori/DashO
match.** So this is *not* Superblaubeere (an earlier guess here was wrong) and not
any of the well-known commercial obfuscators. It is a **lightweight custom
renamer + constant-pool splitter**:

* name obfuscation with a fixed `id_*` vocabulary,
* constants lifted into per-class static arrays (`staticField<hash>` marker, 816 classes),
* original `<clinit>` split into `ntfClinit` + array-initialiser helpers,
* **dead** unused `javax/crypto` decryptor stubs injected into 1567 classes,
* illegal field signatures on some generics (658 classes mention `java/lang/Enum`).

There is **no control-flow obfuscation and no live string encryption**, which is
why the detection rules stay silent. That makes this jar much easier to clean up
than a commercial-protected one.

## Transformer plan

| stage | transformers | risk |
| --- | --- | --- |
| 1 | peephole + removers + Class/Method/FieldNormalizer | low (names + junk only) |
| 2 | `normalizer.EnumNormalizer`, `normalizer.DuplicateRenamer` | low |
| 3 | re-decompile with Vineflower and eyeball | — |

No flow-obfuscation transformer is needed. Stage 1 is
`deobf-work/config.yml`; it needs a large heap (the 3 GB default OOMs inside
`MethodNormalizer` on a 7657-class jar — use `-Xmx8g`).

### The two detection matches, assessed

* `generic.RuleIllegalSignature` — **real**. `celestial/rnp_3` has a field with
  signature `Lcelestial/rnn_3;` where the declared type is non-generic; some
  obfuscators leave illegal generic signatures. Already handled by
  `IllegalSignatureRemover` in stage 1.

* `smoke.RuleNumberObfuscation` — **false positive, do not use the transformer.**
  The rule flagged `celestial/AJ.id_break(String)`, but that method is a plain
  server-ping MOTD parser (it scans for the literal tags `[MOTD]`, `[/MOTD]`,
  `[AD]`, `[/AD]`). Its `ifge` / `iflt` / `if_icmpge` sequences merely look like
  the number-obfuscation idiom. Running `NumberObfuscationTransformer` here would
  corrupt working code, so it is deliberately left out of the config.
