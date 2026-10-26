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

`run`, `runClient` and `launcher` all depend on `prepareAq1Fix` and
`prepareShieldBreakFix`, so the patched classes in `run/celestial-fix` are
always up to date before the game starts.

## Nickname

The field accepts 1–16 characters: Latin letters, digits and `_`. The value is
stored in `%USERPROFILE%\.celestial-launcher.properties` (`username=...`) and
restored on the next start, so the name only has to be set once.

The nickname is used for:

* `--username` passed to the client;
* the offline UUID, derived exactly like a vanilla offline server does:
  `UUID.nameUUIDFromBytes("OfflinePlayer:" + nick)`. The same nickname always
  produces the same UUID, which keeps inventories/permissions stable on offline
  servers.

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
  * game directory: `<project>/run` (created if missing);
  * assets: `run/assets` if it has `indexes/1.16.json`, otherwise
    `../Celestial/assets`, `C:/Celestial/assets`, `.minecraft/assets`,
    `CollapseLoader/assets`;
  * natives: `<project>/natives`, then `CollapseLoader/natives-windows`,
    `CollapseLoader/natives`;
  * patched classes: `<gameDir>/celestial-fix` or `<project>/build/celestial-fix`.
  * `-Dcelestial.aq1fix` is passed explicitly so the patch is found regardless
    of the working directory.
* **Log**: stdout/stderr of the child process (merged) is shown in the window
  and the exit code is reported when the game closes.

## Files

* `src/main/java/launcher/CelestialLauncher.java` — the window (Swing),
  nickname validation/persistence, log view.
* `src/main/java/launcher/GameLauncher.java` — command construction, path
  discovery, child process + log pump.
* `build.gradle` — `application { mainClass = 'launcher.CelestialLauncher' }`
  and the `launcher` task.

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
│   ├── celestial-client-app.jar
│   ├── *.jar                  <- every client library from libs/
│   ├── natives/               <- LWJGL/JNA natives
│   └── celestial-fix/         <- patched celestial/*.class (Aq_1 + rrnD_2)
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
* The game directory and assets are **not** bundled: `run/` is created next to
  the launcher (or the project), and assets are found in `run/assets`,
  `../Celestial/assets`, `C:/Celestial/assets`, `.minecraft/assets` or
  `CollapseLoader/assets`.
* A WiX-less machine cannot build an *installer*; `app-image` is used instead.
  It is fully portable: copy the whole `CelestialLauncher` folder (or unzip
  `CelestialLauncher-windows-x64.zip`) anywhere and run the `.exe`.

Command-line switches (handy for shortcuts and for smoke tests):

| Switch | Effect |
| --- | --- |
| `--username <nick>` | Pre-fills the nickname (also accepted as a bare first argument). |
| `--autostart` | Skips the window and launches the game immediately, then exits with the game's exit code. |
