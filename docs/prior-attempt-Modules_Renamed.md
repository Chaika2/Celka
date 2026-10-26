# Existing prior attempt — Modules_Renamed

Location given by the user:
`C:\Users\Chaik\OneDrive\Рабочий стол\Modules_Renamed`

100 module sources, already grouped into categories:

| folder | files |
| --- | --- |
| `Combat/` | 18 (`AttackAura`, `AutoTotem`, `Criticals`, `HitBoxes`, ...) |
| `Movement/` | 11 (`Flight`, `Speed`, `NoSlow`, `Timer`, ...) |
| `Player/` | 20 (`AutoTool`, `ChestStealer`, `Blink`, `FreeCamera`, ...) |
| `Render/` | 18 (`Esp2D`, `Hud`, `BlockEsp`, `ChinaHat`, ...) |
| `Util/` | 33 (`AutoFish`, `AutoBuy`, `CasinoBot`, `ChatHelper`, ...) |

## What it did, and why it is not usable as-is

The files are decompiled with `package protected;` and the obfuscator suffixes
stripped from identifiers:

```java
// Modules_Renamed/Combat/AttackAura.java
public class AttackAura extends rrvq implements rrnF, rrnL {
   private static double[] byte;
   private static short[] protected;
   private static float[] throws;
   private static long[] catch;
   private static String[] private;
   private static byte[] implements;
   public Object[] break;
   private static boolean[] finally;

   public rrIk boolean() {
      this.u();
      return (rrIk)this.break[protected[172]];
   }
```

Two problems:

1. **Java keywords used as identifiers.** Stripping the `id_` prefix turned
   `id_private` into `private`, `id_throws` into `throws`, `id_break` into
   `break`, and so on. All 49 Java keywords appear as identifiers somewhere in the
   folder. **The code cannot compile** — `private static String[] private;` is not
   valid Java.

2. **The array smearing is untouched.** `this.break[protected[172]]` is exactly
   the same indirection the baseline has. So the file is not actually more
   readable for logic work; it only has shorter names.

The class hierarchy names were also lost (`extends rrvq` instead of
`extends Module`).

## What this tells us

It confirms the audit from the other direction: **renaming alone does not solve the
readability problem, and a naive rename actively breaks the code.** Any usable
result needs:

* names that avoid the Java keyword set (e.g. keep a suffix, or use a safe rename
  vocabulary), and
* the constant-array folding pass, which no renaming tool performs.

The category grouping (`Combat`, `Movement`, ...) is genuinely useful and can be
reused — it gives a human map of which obfuscated class is which module. For
example `Combat/AttackAura.java` corresponds to `celestial.AttackAura`
(so `AttackAura` was *not* renamed by the obfuscator) and its `id_break[...]`
lookups are the place where the shield-break fix was applied.
