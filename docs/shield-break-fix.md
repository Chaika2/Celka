# Celestial shield-break (axe) fix

## Symptom

With AttackAura's shield-break switch enabled, an opponent holding a raised
shield never lost it. MineLegacy validates the weapon server-side, so the
shield only pops from a real axe hit.

## Root cause

The shipped shield breaker lives in `celestial/rrnD_2` (the AttackAura hit
handler), method `id_class(iB_2)`:

```java
private void id_class(iB_2 var1) {
   if (var1 instanceof rhd_3 var2) {
      if (var1.id_extends(2) && (!var2.id_native() || !var2.id_implements())
            && rrfH_2.id_class(var1, rdy_3.kN) != null) {
         int var3 = this.id_class(var2, false);   // this hit is sent with the
                                                  // item currently held (a sword)
         if (var3 > 8) {
            ((Ax_1)id_import.id_class[55]).id_class(var3);  // VISIBLE held-slot
                                                            // change, and only
                                                            // *after* the hit
         }
      }
   }
}
```

Two problems:

1. The hit was sent **before** any swap, so the server counted it against the
   item currently held (the sword), not an axe.
2. The hotbar path only sent the held-item change around a hit that had already
   been sent, and the inventory path (`Ax_1.id_class(int)`, the `rZs_1` slot
   swap) ran after the hit as well, under a `var3 > 8` guard that only matched
   inventory axes.

## Fix

`shieldbreak-src/celestial/rrnD_2.java` is a shadow copy of the runtime jar
class, compiled **against the runtime jar** (flat `celestial.*` package names),
with a rewritten shield-break path.

The aura's own hit is now sent **with the axe already in hand**, so the tick
contains exactly one attack:

1. before the aura sends its hit, `shieldBreakPrepare(target)` bails out unless
   the target is actively blocking with a shield (`id_extends(2)` +
   `rrfH_2.id_class(target, rdy_3.kN) != null`);
2. it locates an axe with `rrfY_2.id_class(rxM_2.class)`: `-2` main hand, `-3`
   off hand, `0..8` hotbar slot. If it is already in the main hand, nothing has
   to be swapped;
3. axe in the hotbar: the **local** selected slot
   (`PlayerInventory.id_protected`) is set to the axe slot. The hit wrapper the
   aura uses (`Ax_1.id_class(player, target, true)` -> `Ax_1.id_byte`) starts
   with `Ax_1.id_new()`, which sends `rme_3(axeSlot)` (`CPacketHeldItemChange`)
   and then the `UseEntity/ATTACK` packet;
4. right after the hit, `shieldBreakRestore(oldSlot)` puts the local slot back
   and `Ax_1.id_package()` (= `id_new()`) sends `rme_3(oldSlot)`:

   ```
   rme_3(axeSlot)  ->  rZq_1 ATTACK  ->  rme_3(oldSlot)
   ```

   The player never sees the switch (the local selected slot is only flipped for
   the duration of one synchronous call and nothing is rendered in between), and
   the server resolves the attack with the axe in the main hand;
5. axe in the main inventory (`9..44`): it cannot be moved into the hotbar within
   the same tick (the move needs a server round-trip, and a hit sent right after
   the packet would still use the old item), so the fallback only sends the
   pick-item packet `Ax_1.id_class(invSlot)` (`rZs_1`). The server puts the axe
   into a free hotbar slot and the next aura tick takes the hotbar path above.

Why the hit must be sent **after** the swap, and not as a second attack after
the aura's normal hit: on a server with 1.16 attack cooldown the second
`UseEntity/ATTACK` inside the same tick is ignored (cooldown reset by the first
hit), so the shield would survive. One attack, sent with the axe, works on both
1.8-style and 1.16-style combat.

Why not ClickSlot SWAP: the server answers a container swap into the selected
slot with a full `rFT` window resync plus a `rFM` for the clicked slot and
reverts it, so the following ATTACK was counted against the item that was
actually held (the sword). `rme_3` is processed as a normal selected-slot change
and the ATTACK that follows it is resolved with the axe.

### Why the earlier attempts did not work

* The first version passed an inventory index as the **window id** and used
  `button = 40` (off hand), so the server ignored the click.
* The next version used `ClickSlot SWAP` into the selected slot
  (`Ax_1.id_class(windowId, slot, selectedSlot, rXa_1.SWAP)`). Packet capture
  showed the server reverting the click (`rFT` WindowItems resync +
  `rFM{-1,-1,air}`), so the hit still used the sword.
* The version after that sent the aura's normal (sword) hit first and the axe
  hit as a second attack in the same tick. On a cooldown server that second
  attack is dropped, which is why the swap now happens *around the aura's own
  hit* instead.

## Single "ByPass SB" switch

The breaker no longer has its own group/setting. The shipped AttackAura switch
`rrIk_1("Ломать щит", true)` inside the `"Удары"` group is the only switch and
it is renamed to `ByPass SB` by `ensureShieldBreakLabel()`:

```java
((AttackAura)this.id_break[0]).id_this().id_byte("ByPass SB");
```

`AttackAura.id_this()` returns `break_[27]`, i.e. exactly that checkbox, so no
extra state is needed. The hit path gates on the same getter:

```java
if (((AttackAura)this.id_break[0]).id_this().id_class()) {
   var19 = this.shieldBreakPrepare(var1);   // swap before the aura's hit
}
...
if (var19 >= 0) {
   this.shieldBreakRestore(var19);          // swap back after it
}
```

The rename is triggered from two places:

* the patched `celestial/rrwI_2#b()` — the settings-list accessor of every
  module. The click GUI calls it when it builds the module panel, and the config
  manager calls it while saving/loading. `rrwI_2` is a shadow class
  (`shieldbreak-src/celestial/rrwI_2.java`) that is behaviourally identical to
  the original, except for one line in `b()`:

  ```java
  if (this instanceof AttackAura) {
      rrnD_2.shieldRenameHook((AttackAura)this);
  }
  ```

  The hook resolves `AttackAura.id_long()` (the `rrnD_2` instance) and calls
  `ensureShieldBreakLabel()`. This makes the label appear right away, even if
  Attack Aura has never been enabled in this session;
* `id_class(CheckGroup)` on every aura tick, as a fallback. The
  `shieldBreakRenamed` flag makes both paths one-shot.

`rrwI_2` is the base class of `Module`, so the shadow copy must keep all
original methods; only the `b()` hook was added.

Config values are stored by the setting name (`rrww_3.break_` uses
`Setting.id_throws()` as the JSON key, `rrww_3.class_(rrwI_2, JsonObject)`
loads by the same key). If the rename happens during the startup config load,
the old `"Ломать щит"` key is already past, so the checkbox falls back to its
default value (`true`) once; the next save writes `"ByPass SB"` and the value is
stable from then on. A config saved after this fix keeps working normally.

Because the settings live in shadow classes, `AttackAura.class` itself does not
have to be recompiled or patched.

## Wiring

The game loads `celestial.*` from the SHA-256 gated runtime jar
(`%APPDATA%\CollapseLoader\celestial-libraries\celestial-client-remapped.jar`)
inside a child `URLClassLoader`, so neither `src/main/java` nor the remapped
build jar (`libs/celestial-client-remapped.jar`, whose packages are
`celestial.util.*`, `celestial.module.combat.*`, ...) can override it.

`net.minecraft.client.main.Main#resolveAq1FixDir()` prepends a `celestial-fix/`
directory to that loader. The `prepareShieldBreakFix` Gradle task compiles every
source in `shieldbreak-src` against the runtime jar plus the bundled libraries
and writes all resulting classes into:

* `build/celestial-fix/celestial/` (`rrnD_2.class`, `rrwI_2.class`)
* `run/celestial-fix/celestial/` (used by `run`/`runClient`/`launcher`, whose
  game directory is `run/`)

`run`, `runClient` and `launcher` depend on it. `packageLauncher` copies
`build/celestial-fix` into the app-image (`app/celestial-fix`), so the packaged
launcher ships the same patched classes.

## How to verify

1. Launch the client (packaged launcher or `gradlew launcher`). The launcher log
   should contain `[Celestial] ShieldBreak patch loaded (held-item swap)`; if it
   does not, the patch directory was not picked up (check the
   `Celestial Aq_1 fix:` line).
2. Attack Aura -> group `"Удары"` now has exactly one shield switch: `ByPass SB`.
   It is visible immediately, without enabling Attack Aura first. There is no
   `ShieldBreaker` group.
3. With `ByPass SB` on, put an axe in the hotbar, hold any item (sword, blocks,
   food, ...) and hit a player who is blocking with a shield. The client switches
   the selected slot to the axe, sends the hit and switches back in the same
   tick (the local player never sees the switch), and the shield is disabled. In
   `packetdebug.log` this is the `rme_3` -> `rZq_1` (ATTACK) -> `rme_3` triple,
   with the ATTACK *between* the two held-item changes.
4. With the axe only in the main inventory the first tick only sends the
   pick-item packet (`rZs_1`) that moves the axe into a free hotbar slot; the
   next tick pops the shield with the normal hotbar path.
5. With `ByPass SB` off, the target's shield stays up.
