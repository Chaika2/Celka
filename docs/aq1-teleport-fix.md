# Celestial `Aq_1` teleport-rotation fix

## Symptom

On MineLegacy **grief** mode a cross-world teleport (`/rtp`, plugin teleports,
respawns) ends with:

```
Вы были телепортированы в Lobby.
Клиент не подтвердил обязательную телепортацию
```

Same-world teleports and MineLegacy **anarchy** were unaffected.

## Root cause

`celestial/Aq_1.id_class(rvD_2)` is the clientbound `SPlayerPositionLook`
handler. When the server sends a teleport it must be confirmed with
`CConfirmTeleport` **and** followed by a `CPlayerPositionAndRotation` (`rZX`)
that reflects the rotation the server just set.

The shipped code took that follow-up rotation from the local player instead of
from the packet:

```java
float f  = packet.yaw;    // -16.68106   <- what the server sent
float f2 = packet.pitch;  //  3.1690278
if (flags.contains(X_ROT)) f2 += player.pitch;
if (flags.contains(Y_ROT)) f  += player.yaw;
float f3 = f, f4 = f2;
if (TeleportEvent.id_case()) {   // always taken in practice
    f3 = player.yaw;             // -180.0  <- hardcoded below
    f4 = player.pitch;           //    0.0
}
rrAH a = rrAH.id_class(player.yaw, player.pitch, true);   // <- player, not f3/f4
... C_break bus event (rrCS rewrites a back to the player rotation) ...
send(new rZX(player.x, player.y, player.z, a.yaw, a.pitch, false));
```

`player.yaw` is force-set to `-180.0f` in `Aq_1.id_class(rvZ_2)` (the
`SJoinGame` handler), and `player.pitch` is left at `0.0f`. So on every
teleport the client confirmed and then immediately reported `yaw=-180,
pitch=0`.

The server-side validator (`rmy_3.id_class(rZO)`) treats a confirm whose
following position/rotation does not converge on the teleport target as
unconfirmed. It re-issues the teleport with a new teleport id every 20 ticks
(`this.id_throws - this.id_try > 20`) and, when the "mandatory teleport" timer
expires, moves the player to Lobby and disconnects.

Grief's `/rtp` is the mode that sends a **non-zero** teleport rotation
(`yaw=-16.68, pitch=3.17` on grief vs `0/0` elsewhere), so the `-180/0` mismatch
only manifests there -- which is why anarchy and same-world teleports never
kicked.

`celestial/rrCS` is a listener on the same event bus that also rewrites the
`rrAH` payload back to the local player rotation, so it had to be worked around
as well (by not reading `rrAH` for the outgoing `rZX`).

## Fix

The runtime jar
(`%APPDATA%\CollapseLoader\celestial-libraries\celestial-client-remapped.jar`)
is SHA-256 gated and is re-downloaded from the CDN when modified, so it is not
touched. Instead `src/main/java/net/minecraft/client/main/Main.java` prepends a
`celestial-fix/` directory to the nested game classloader's URL list, exactly
like the existing packet tap does. `celestial/Aq_1.class` in that directory
wins over the jar copy.

The patch is six length-preserving bytecode edits inside
`Aq_1.id_class(rvD_2)`. Total class size is unchanged, so no branch offsets and
no `StackMapTable` offsets move:

| File offset | Original | Patched |
|---|---|---|
| 53108 (17 B) | `f3 = player.yaw` | nops |
| 53125 (17 B) | `f4 = player.pitch` | nops |
| 53142 (15 B) | `rrAH` arg1 = `player.yaw` | `fload 34` + nops |
| 53157 (15 B) | `rrAH` arg2 = `player.pitch` | `fload 35` + nops |
| 53263 ( 5 B) | `rZX` yaw = `rrAH` | `fload 34` + nops |
| 53268 ( 5 B) | `rZX` pitch = `rrAH` | `fload 35` + nops |

Local slots 34/35 hold the rotation computed from the packet plus any relative
rotation flags. After the patch the outgoing `CPlayerPositionAndRotation`
carries the server's rotation, and it is read directly from those locals rather
than from `rrAH`, so the `rrCS` bus listener can no longer undo it.

## Building and running

`prepareAq1Fix` (in `build.gradle`) reads `Aq_1.class` from the runtime jar,
verifies the six byte patterns, applies the edits and writes
`build/celestial-fix/celestial/Aq_1.class`. `run` and `runClient` depend on it.
The class must also exist under the game working directory
(`run/celestial-fix/celestial/Aq_1.class`) for a direct launch.

`packettap-src/tools/PatchAq1.java` is a standalone equivalent of the same
patch (`java PatchAq1 <in.class> <out.class>`), useful for inspecting the diff.

## Verification

`run/packetdebug.log` contains an instrumented packet trace. Comparing the
`rZX` sent immediately after each `CConfirmTeleport`:

* before the fix: 5 of 6 confirms sent `yaw=-180.0, pitch=0.0`;
* after the fix: 10 of 10 confirms sent the rotation from the teleport packet
  (e.g. `/rtp` to `28 162 -947`: `yaw=-16.68106, pitch=3.1690278`).

The class also disassembles and verifies cleanly (`javap` exits 0).
