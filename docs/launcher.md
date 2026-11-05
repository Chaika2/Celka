# Celestial launcher (nickname + start button)

`launcher.CelestialLauncher` is a small standalone launcher window for the
Celestial client. It replaces the "type `gradlew run`, wait, no way to change
the name" flow with a nickname field and a start button, and it keeps the
client log visible in the same window.

## Running it

| Command | What happens |
| --- | --- |
| `gradlew launcher` | Opens the launcher window. Press **Запустить Celestial** to play. |
| `gradlew run` / `gradlew runClient` | Starts the game directly, without the window (unchanged). |
| `gradlew installDist`, then `build/install/Celestial-Sources/bin/Celestial-Sources.bat` | Same launcher, as a portable distribution. |
| `gradlew packageLauncher` | Builds the standalone Windows app-image with a bundled Java 21 runtime: `build/launcher-app/CelestialLauncher/CelestialLauncher.exe`. |
| `gradlew launcherZip` | Same image packed into `build/distributions/CelestialLauncher-windows-x64.zip`. |

`run`, `runClient` and `launcher` all depend on `prepareAq1Fix`,
`prepareShieldBreakFix` and `prepareClientPatches`, so the patched classes in
`run/celestial-fix` are always up to date before the game starts.

`packageLauncher` and `launcherZip` additionally need
`runtime/celestial-client-runtime.jar` (see [Game runtime](#game-runtime)).
It is the flat-name client jar the game actually loads; the remapped jar in
`libs/` is only used to compile the launcher itself and cannot be used at
runtime.

## Nickname

The field accepts 1–16 characters: Latin letters, digits and `_`. The value is
stored in `%USERPROFILE%\.celestial-launcher.properties` (`username=...`) and
restored on the next start, so the name only has to be set once.

The nickname is used for:

* `--username` passed to the client;
* the offline UUID, derived exactly like a vanilla offline server does:
  `UUID.nameUUIDFromBytes("OfflinePlayer:" + nick)`. The same nickname always
  produces the same UUID, which keeps inventories/permissions stable on offline
  servers;
* the **WaterMark** in the client HUD. The bootstrap stores `--username` in the
  `celestial.username` system property and the patched `ru.ntfhack.UserInfo`
  reads it, so the HUD shows the same nick instead of `LORDMAKAVTOJJ`. The UID
  shown next to it is random (six digits) and changes on every launch.

It is **not** a Mojang/Ely.by login: this is an offline session
(`--accessToken 0 --userType legacy`), which is what the client already used.

## How it starts the game

`launcher.GameLauncher` builds a child-JVM command and runs it with the
launcher's working directory:

```
<java.home>/bin/java.exe
    -Xms512m -Xmx4g
    -Djava.library.path=<natives> -Djna.library.path=... -Dorg.lwjgl.librarypath=...
    -Dcelestial.aq1fix=<patched classes dir>
    --add-opens=... --add-exports=...
    -cp <same classpath as the launcher>
    offline.launcher.OfflineLauncher
    --username <nick> --version "Beta 1.16.5" --gameDir <root>/run
    --assetsDir <assets> --assetIndex 1.16 --uuid <offline uuid> ...
```

Details:

* **Same classpath and JVM flags** as the Gradle `run` tasks (the list is kept
  in `GameLauncher.buildCommand` and mirrors `configureClientExec` in
  `build.gradle`), so behaviour is identical apart from the entry point.
* **Separate process**: the game runs in its own JVM; the launcher window stays
  responsive and keeps streaming the log. Closing the launcher window does not
  stop the game.
* **Paths are resolved automatically**:
  * game directory: `<project>/run` (created if missing); inside the
    jpackage app-image it is `<image>/app/run`;
  * assets: `run/assets` if it has `indexes/1.16.json`, otherwise
    `../Celestial/assets`, `C:/Celestial/assets`, `.minecraft/assets`,
    `CollapseLoader/assets`; if none of them has an index, `run/assets` is
    used and populated by the provisioner below;
  * natives: `<image>/app/natives`, `<project>/natives`, then
    `CollapseLoader/natives-windows`, `CollapseLoader/natives`;
  * patched classes: `<image>/app/celestial-fix`, `<gameDir>/celestial-fix` or
    `<project>/build/celestial-fix`.
  * `-Dcelestial.aq1fix` is passed explicitly so the patch is found regardless
    of the working directory.
* **Log**: stdout/stderr of the child process (merged) is shown in the window
  and the exit code is reported when the game closes.

## Minecraft assets (sounds, languages)

The client jar only contains code and a handful of textures: vanilla sounds,
translations and `sounds.json` live in the asset index. On a clean machine the
game would start completely silent.

`launcher.AssetProvisioner` fixes that before the game starts:

1. if `assets/indexes/1.16.json` is missing, the index bundled in
   `celestial-launcher.jar` (`assets/indexes/1.16.json`) is extracted;
2. every indexed object is checked for existence and exact size in
   `assets/objects/<first two hash chars>/<hash>`;
3. the missing ones are downloaded from
   `https://resources.download.minecraft.net/` (8 threads, 4 attempts per
   file, progress logged every 100 files), written to a `.tmp` file and moved
   into place only after the size matches.

The full index has 2615 objects (~320 MB), dominated by sounds (~253 MB) and
translations (~49 MB). `en_us.json` is intentionally absent from the official
index — the client loads its English strings from
`assets/minecraft/celestial/lang/en_us.json` inside the jar.

Download failures never abort the launch: the log shows a warning, the game
still starts (possibly without some sounds), and the next start resumes the
download because already-present objects are skipped.

## Files

* `src/main/java/launcher/CelestialLauncher.java` — the window (Swing),
  nickname validation/persistence, log view.
* `src/main/java/launcher/GameLauncher.java` — command construction, path
  discovery, child process + log pump.
* `src/main/java/launcher/AssetProvisioner.java` — bundled asset index,
  missing-object detection and download from the Mojang CDN.
* `build.gradle` — `application { mainClass = 'launcher.CelestialLauncher' }`,
  the `launcher` task, and the jpackage/image packaging tasks.

`offline.launcher.OfflineLauncher` is still the game entry point and is still
used unchanged; the launcher only calls it with explicit arguments (when
arguments are present, `OfflineLauncher.prepareArguments` passes them through).

## Standalone `.exe` (jpackage app-image)

`gradlew packageLauncher` runs `jpackage --type app-image` and produces:

```
build/launcher-app/CelestialLauncher/
├── CelestialLauncher.exe      <- double-click this
├── app/
│   ├── CelestialLauncher.cfg  <- classpath + main class
│   ├── celestial-launcher.jar <- launcher classes (first on the classpath)
│   ├── celestial-client-app.jar <- client resources (no Main.class)
│   ├── *.jar                  <- every client library from libs/ + assets
│   ├── celestial-libraries/
│   │   └── celestial-client-remapped.jar <- game runtime (flat celestial.*)
│   ├── natives/               <- LWJGL/JNA natives
│   ├── celestial-fix/         <- patched classes (Aq_1, rrnD_2, BE, UserInfo)
│   └── run/                   <- created on first launch: configs, worlds, assets/
└── runtime/                   <- bundled Java 21 (all modules) + java.exe
```

Notes:

* **No installed Java is required.** The image carries its own runtime
  (`runtime/`), and `GameLauncher` starts the child game JVM with
  `<image>/runtime/bin/java.exe`, so the game uses exactly the same Java
  version as the launcher.
* jpackage deliberately omits `java.exe`/`javaw.exe` from the runtime, but the
  launcher needs them to spawn the game. The `packageLauncher` task copies both
  back into `runtime/bin` after packaging and fails the build if they are
  missing.
* Every JDK module is bundled (`--add-modules` = output of `java --list-modules`)
  because Minecraft 1.16.5 needs far more than `java.base` (desktop, http,
  zipfs, `jdk.unsupported`/`Unsafe`, charsets, ...).
* `celestial-launcher.jar` is listed first in `app.classpath` and
  `net/minecraft/client/main/Main.class` is stripped from both client jars, so
  the launcher bootstrap (`offline.launcher.OfflineLauncher`) always wins.
* `app/celestial-libraries` is copied **after** jpackage runs, so it is not in
  `CelestialLauncher.cfg` and does not leak into the launcher's own classpath.
  `net.minecraft.client.main.Main` builds a nested classloader from it
  (see [Game runtime](#game-runtime)).
* The game directory and assets are **not** bundled: `run/` is created next to
  the launcher (or the project), assets are found in `run/assets`,
  `../Celestial/assets`, `C:/Celestial/assets`, `.minecraft/assets` or
  `CollapseLoader/assets`, and `AssetProvisioner` downloads whatever is missing
  into `run/assets`.
* A WiX-less machine cannot build an *installer*; `app-image` is used instead.
  It is fully portable: copy the whole `CelestialLauncher` folder (or unzip
  `CelestialLauncher-windows-x64.zip`) anywhere and run the `.exe`.
* Use `-PlauncherAppDir=<name>` to build into `build/<name>` when an already
  running launcher holds files in `build/launcher-app` (Windows locks the
  `.exe` and the bundled runtime).
* Rebuilding an existing image preserves player data: if
  `<image>/app/run` exists, `packageLauncher` copies it to
  `build/<appDir>-run-backup`, rebuilds the image, then restores it (and only
  then deletes the backup). Worlds, configs and the asset cache survive
  `gradlew packageLauncher`; a failed build leaves the backup in place.

## Game runtime

The game is not started from `libs/celestial-client-remapped.jar`. That jar is
remapped (`celestial.setting.Setting`, `celestial.rrNd_1.id_class(...)`) and is
only used to compile the launcher and the patches.

The runtime the game loads is `runtime/celestial-client-runtime.jar`: the
client jar with flat names (`celestial.Setting`), exactly what the patched
classes in `celestial-fix` were compiled against. `packageLauncher` copies it
to `app/celestial-libraries/celestial-client-remapped.jar` and fails with a
hint if the file is missing.

`Main` picks it up like this:

1. `appHome()` finds the app-image directory (`app/`) by checking that
   `app/celestial-client-app.jar` or
   `app/celestial-libraries/celestial-client-remapped.jar` exists;
2. `bundledLibraryJars()` returns every jar in `app/celestial-libraries` plus
   the library jars in `app/`, excluding `celestial-launcher.jar` and
   `celestial-client-app.jar`;
3. the real `Main` is loaded from that jar in a nested `URLClassLoader`, and
   natives are taken from `app/natives`.

If no bundled runtime is found (a real CollapseLoader installation or a Gradle
run), the legacy path is used: `%APPDATA%/CollapseLoader/celestial-libraries`,
downloading it from the Collapse CDN if absent. The packaged launcher never
needs that download, which is why it works on networks where the CDN times
out.

Command-line switches (handy for shortcuts and for smoke tests):

| Switch | Effect |
| --- | --- |
| `--username <nick>` | Pre-fills the nickname (also accepted as a bare first argument). |
| `--autostart` | Skips the window and launches the game immediately, then exits with the game's exit code. |
