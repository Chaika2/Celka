# Baritone movement placement NPE (ancient debris)

## Symptom

Baritone starts a path (for example `#mine ancient_debris`) and then spams chat
with:

```
(Celestial) > Pathing exception: java.lang.NullPointerException: Cannot invoke
"celestial.rpr_3.id_implements()" because
"celestial.Gr_1.id_class[...][<local10>]" is null
```

The stack trace in `run/logs/latest.log` ends with:

```
celestial.Gr_1.id_class
celestial.Ea_1.id_class
celestial.EC.id_class
celestial.Ek_1.id_break
celestial.EW.id_class
celestial.BO.id_class
java.util.concurrent.ThreadPoolExecutor.runWorker
```

The pathfinder catches the exception, retries, and fails again, so the task
never completes.

## Root cause

Celestial ships an obfuscated copy of Baritone (`celestial.BO` is
`PathingBehavior`, `celestial.Gr_1` is `MovementAscend`, etc.).

Upstream Baritone has this constant in `baritone.pathing.movement.Movement`:

```java
public static final Direction[] HORIZONTALS_BUT_ALSO_DOWN_____SO_EVERY_DIRECTION_EXCEPT_UP =
        {Direction.NORTH, Direction.SOUTH, Direction.EAST, Direction.WEST, Direction.DOWN};
```

`MovementAscend.cost()` iterates over it to find a block to place against when
the destination cannot be walked on:

```java
for (int i = 0; i < 5; i++) {
    int againstX = destX + HORIZONTALS_BUT_ALSO_DOWN_____SO_EVERY_DIRECTION_EXCEPT_UP[i].getXOffset();
    ...
}
```

In the Celestial runtime the array is created but never filled. The decompiled
`celestial.Ev_1` (the `Movement` base class) had:

```java
private static void id_continue() {
    rpr_3[] rpr_3Array = new rpr_3[5];          // all five entries are null
    Object[] objectArray = new Object[]{rpr_3Array};
    id_class = objectArray;
}
```

`rpr_3` is `Direction`, and `id_implements()` is `getXOffset()`, so the loop
dereferences `null`. This branch is common while mining ancient debris in the
Nether, where ascending paths need a placement move over lava or air.

## Fix

`baritone-fix-src/Ev1DirectionFix.java` rewrites only the
`celestial/Ev_1.id_continue()V` method with ASM. The patched initializer now
builds the same array as upstream Baritone:

```java
id_class = new Object[]{
    new rpr_3[]{rpr_3.NORTH, rpr_3.SOUTH, rpr_3.EAST, rpr_3.WEST, rpr_3.DOWN}
};
```

The Gradle task `prepareBaritoneMovementFix` extracts the original
`celestial/Ev_1.class` from the SHA-256 gated runtime jar, applies the rewrite,
and writes the result to both `build/celestial-fix` and `run/celestial-fix`.
The nested game classloader prepends that directory, so the patched class wins
over the jar. The runtime jar itself is never modified.

After the patch:

```java
Class.forName("celestial.Ev_1").getField("id_class").get(null)
// [0] = [north, south, east, west, down]
```

## Verification

```powershell
.\gradlew.bat prepareBaritoneMovementFix
javap -p -c -classpath build\celestial-fix celestial.Ev_1
```

`id_continue()` should contain `getstatic celestial/rpr_3.NORTH` through
`celestial/rpr_3.DOWN` followed by `putstatic celestial/Ev_1.id_class`.

As a temporary workaround on an unpatched build, disabling block placement
(`#set allowPlace false`) avoids this branch, at the cost of Baritone not
bridging or placing blocks.
