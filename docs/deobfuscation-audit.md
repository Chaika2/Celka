# Deobfuscation audit — celestial-client-remapped.jar

Runtime jar: `%APPDATA%\CollapseLoader\celestial-libraries\celestial-client-remapped.jar`
(22,509,149 bytes; classes are **class file major 62 / Java 18**, so tools must run on a JDK 18+).

## Jar profile

| Metric | Value |
| --- | --- |
| classes | 7657 |
| total class bytes | ~24.3 MB |
| classes referencing `javax/crypto` | 1567 |
| classes with the `staticField<hash>` marker | 816 |
| classes mentioning `java/lang/Enum` | 658 |
| obfuscated-looking names (`rr[A-Za-z0-9_]+`) | 2056 |
| human-readable names | 5601 |

## String "encryption": NOT PRESENT

This was the biggest feared obstacle, and it turned out not to exist.

Evidence (all produced by ASM-based scans in `%TEMP%\opencode\decstrings`):

1. **Strings in the constant pool are plain UTF-8.**
   Example from `celestial.AttackAura`:
   raw bytes `D0 90 D0 B2 D1 82 D0 BE D0 BC D0 B0 D1 82 D0 B8 D1 87 D0 B5 D1 81 D0 BA D0 B8`
   = `Автоматически`. The garbled output from `javap`/console is a *display* issue
   (the tooling decodes UTF-8 as Latin-1 and then the console re-encodes), not a cipher.

2. **No decryptor is ever called with a constant.** A full scan for
   `ldc <String>; invokestatic (Ljava/lang/String;)Ljava/lang/String;` found only **76**
   call sites in the whole jar, and none of them target a string decryptor:

   | callee | calls |
   | --- | --- |
   | `celestial/rrba_3.id_class` (OptiFine option names) | 48 |
   | `java/lang/System.getProperty` | 26 |
   | `com/mojang/util/QueueLogAppender.getNextLogEvent` | 1 |
   | `java/lang/System.getenv` | 1 |

3. **Non-constant `(String)->String` calls (93)** all target legitimate library or
   utility methods (`System.getProperty`, `DigestUtils.sha1Hex`, `FilenameUtils.*`,
   `StringUtils.*`, `StringEscapeUtils.*`, ...). The `celestial/*` ones are real
   utilities, not decryptors:
   * `rTA.id_class(String)` — a Mojang `PrimitiveCodec`/`DSL` type
   * `rql_3` — `StringUtil`-style formatting helpers
   * `rrbb_3` — config/IO helper (OptiFine-like `Config`)
   * `rgF_2` — `ChatFormatting`-style enum

4. **The decryptor stubs are dead code.** 1558 classes contain an *unused*
   `javax/crypto` DES/CBC template (e.g. `celestial.rrzU_2`, `celestial.rrnD_2`).
   The obfuscator emitted the stub in every class but the actual call sites were
   stripped/inlined. These methods are never invoked.

5. **No reflection indirection hides a decryptor.** `ReflectionAudit` counted the
   whole jar's dynamic-dispatch surface:

   | construct | count |
   | --- | --- |
   | `Class.forName` | 26 |
   | `Method.invoke` | 25 |
   | `Class.getDeclaredMethod` | 2 |
   | `Class.getDeclaredField` | 5 |

   All are ordinary OptiFine / ShadersMod / plugin-loading code. The 192 strings
   that at first looked like base64 blobs turned out to be **legitimate long
   CamelCase identifiers** (GLSL uniform names such as
   `gbufferProjectionInverse`, `shadowHardwareFiltering0`) — the "suspicious"
   regex simply matched any word ≥ 24 chars.

### Consequence

No string-decryption transformer is needed. This is proven three independent ways:
constant-pool bytes are plain UTF-8, no `ldc <String>` ever reaches a `(String)->String`
method that is a decryptor, and there is no reflection-based dispatch to one. Any
remaining "unreadable" content is pure identifier obfuscation plus dead stub methods.

## What is left to remove

| Layer | Present | How to handle |
| --- | --- | --- |
| String encryption | **no** | nothing to do |
| Identifier obfuscation (`id_class`, `rrnD_2`, ...) | yes | name mapping / `ClassNormalizer` + `MethodNormalizer` + `FieldNormalizer` |
| Constant-array indirection | **62,231 read sites** | dedicated folding pass (NOT done by normalizers) |
| Split `<clinit>` (`ntfClinit` + helpers) | yes | constant folding + manual merge |
| Enum-shaped artifacts | partly (658) | `EnumNormalizer` |

### Constant-array indirection — the real obstacle

`ArraySmear` counted every `GETSTATIC <array>; <const index>; xALOAD` sequence in the
jar:

```
constant-index static array reads : 62231
```

| array type | read sites | what the array really holds |
| --- | --- | --- |
| `short[]` | 29,087 | index tables (`id_protected[x]`) |
| `boolean[]` | 12,082 | boolean literals (`id_finally[x]`) |
| `String[]` | 6,881 | string literals (`id_private[x]`) |
| `byte[]` | 6,818 | byte literals |
| `float[]` | 4,560 | float literals |
| `double[]` | 1,671 | double literals |
| `long[]` | 468 | long literals |
| `int[]` | 348 | int literals |
| `Object[]` | 295 | the per-class field table (`id_break[x]`) |

The `normalizer.*` transformers only **rename**. They do not undo
`this.id_break[id_protected[172]]`, so a stage-1/stage-2 run yields *renamed but
still array-smeared* code. Recovering these 62k sites into plain literals is a
separate, dedicated pass and is by far the largest single readability win available
— bigger than all the renaming combined.

## Tooling

* Decompilers already used: CFR 0.152, Vineflower 1.10.1 (`%TEMP%\opencode\cfr`).
* Deobfuscator: java-deobfuscator `latest` (2023-04-26, ASM 9.5) at
  `%TEMP%\opencode\decstrings\tools\deobfuscator.jar`.
* Run it with **JDK 21** (`C:\Program Files\Java\jdk-21`) so class major 62 loads.

## Baseline decompile (the "before" picture)

The original runtime jar was decompiled with Vineflower into
`deobf-baseline/` (18,656 files — the jar bundles all of Minecraft):

```
java -jar vineflower.jar -s <celestial-client-remapped.jar> deobf-baseline
```

Vineflower emits many `Unable to simplify switch on enum: const(N) not found`
warnings — these *are* the enum-obfuscation artifacts that `EnumNormalizer`
(stage 2) targets.

A sample of what the baseline looks like, from `deobf-baseline/celestial/AttackAura.java`:

```java
public class AttackAura extends Module implements rrnF_2, rrnL_2 {
   private static double[] id_byte;
   private static short[] id_protected;
   private static float[] id_throws;
   private static long[] id_catch;
   private static String[] id_private;
   private static byte[] id_implements;
   public Object[] id_break;
   private static boolean[] id_finally;
   private rrIk_1 celestialSilentRotation;

   public rrIk_1 id_boolean() {
      this.u();
      return (rrIk_1)this.id_break[id_protected[172]];
   }
   ...
```

This shows the constant-array indirection directly: what should read as
`this.celestialSilentRotation = getModule(...)` is smeared into
`this.id_break[id_protected[172]]`. Field reads and literals are lifted into the
static arrays (`id_finally[75]`, `id_private[57]`, ...). That smearing, plus the
`id_*` names, is the entire readability problem — and it is exactly what the
normalizers + a constant-array folding pass would undo.

`deobf-baseline/` is thus the reference "before" that the stage-1/stage-2 output
will be compared against once the deobfuscator finishes.

## Deobfuscation work tree

```
deobf-work/
  in/celestial.jar             copy of the runtime jar
  out/celestial-stage1.jar     output of stage 1 (config.yml)
  out/celestial-stage2.jar     output of stage 2 (config-stage2.yml)
  config.yml                   stage 1: peephole + removers + name normalizers
  config-stage2.yml            stage 2: DuplicateRenamer + EnumNormalizer
  stage1.log                   stage-1 console log
```

Run stage 1 (needs a big heap — 3 GB OOMs inside `MethodNormalizer`):

```
java -Xmx8g -jar <deobfuscator.jar> --config deobf-work/config.yml
```

## Environment notes

* JDK 17 (`C:\Program Files\Java\jdk-17`) — cannot load the jar's classes (major 62 > 61).
* JDK 21 (`C:\Program Files\Java\jdk-21`) — works.
* PowerShell console mangles Cyrillic; always write UTF-8 to files and read those,
  never trust console output for non-ASCII.
* Files written by the `write` tool may get a UTF-8 BOM; strip it before `javac`
  (`EF BB BF` prefix) or compilation fails with `illegal character: '\u00bb'`.

## FoldConstants — constant-array folding (the pass that actually worked)

`java-deobfuscator` was a dead end for this jar (`MethodNormalizer` hangs in a
combinatorial search), and no renamer touches the array indirection anyway. The
one pass that moves the needle is a purpose-built constant folder.

Tool: `%TEMP%\opencode\decstrings\FoldConstants.java` (ASM 9.5, run on JDK 21).

```
java -Xmx5g -cp tools\asm;out FoldConstants <runtime.jar> folded.jar
```

What it does:

1. **Pass 1 — safety.** For every class, collect the static array fields and mark
   any that are written *outside* the static-initialiser chain
   (`<clinit>` / `ntfClinit` / transitively-called helpers) as "mutated". Those are
   runtime-mutated and must never be folded.
2. **Pass 2 — recovery.** Interpret each initialiser method on a small symbolic
   stack to recover the element values of every non-mutated array
   (`NEWARRAY`/`ANEWARRAY` + `xASTORE` idiom, plus the `new String("lit")` idiom).
   A method that hits any opcode the model does not understand **taints** the
   array it is building, and the array is then discarded — so unknown writes can
   never be mistaken for JVM defaults.
3. **Pass 3 — folding.** Replace every `GETSTATIC arr; <const idx>; xALOAD` with
   the recovered literal, repeatedly, so nested lookups
   (`id_private[id_protected[172]]`) collapse in one pass.
   Sites that are a control-flow join point (a jump target) or sit inside a
   try/catch range are left alone, because shrinking them invalidates the
   surrounding frames/handlers.

Result on the full jar:

| metric | before | after |
| --- | --- | --- |
| constant arrays recovered | — | 5,561 |
| constant-index array reads | 62,231 | 9,360 |
| reads folded | — | **58,191 (93.5%)** |
| `VerifyError` on load (vs original) | 0 | **0** |

The ~9,360 remaining reads are `Object[]`/`String[]` arrays that are genuinely
mutated at runtime, plus the small set of try/catch/jump-target sites kept
deliberately for safety.

### Before / after on `celestial.AttackAura`

Real excerpt, `deobf-baseline/celestial/AttackAura.java` vs
`deobf-folded2/celestial/AttackAura.java`:

```java
// BEFORE (deobf-baseline)
public boolean id_char() { return id_finally[75]; }
return (rrIk_1)this.id_break[id_protected[172]];
return !this.S().id_byte().equals(id_private[57]) && ...;
super(id_private[0], id_private[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_protected[0]]);

// AFTER (deobf-folded2)
public boolean id_char() { return false; }
return (rrIk_1)this.id_break[29];
return !this.S().id_byte().equals("Legit") && ...;
super("Attack Aura", "Автоматически бьет окружающих\nвас существ", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[0]);
```

Indices, strings and booleans are back where they belong. Decompile of the folded
jar: `deobf-folded2/` (7,657 `.java` files, Vineflower 1.10.1).

### Still open

* Identifiers are still `id_*` / `rrXX_N`. A rename pass is needed, but a naive
  strip-the-`id_`-prefix breaks the build (it produces Java keywords such as
  `private`, `finally`, `break`; see `docs/prior-attempt-Modules_Renamed.md`).
* The `id_break` per-class field table (`Object[]`) is still indexed; folding it
  requires resolving the constructor writes, which pass 2 deliberately skips.

