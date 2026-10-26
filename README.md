# Celestial Sources

Сборка лаунчера и патчей для клиента Celestial (Minecraft 1.16.5, MineLegacy).

## Что здесь

| Каталог | Содержимое |
| --- | --- |
| `src/` | Исходники лаунчера, бутстрапа и патчей (`launcher`, `net.minecraft.client.main`, `offline`, `celestial`) |
| `shieldbreak-src/` | Shadow-классы `rrnD_2`, `rrwI_2` — фикс слома щита (ByPass SB) |
| `packettap-src/` | Перехватчик пакетов для отладки |
| `deobf/`, `deobf-final/` | Декомпилированные классы клиента для справки |
| `docs/` | Описание фиксов и результаты аудита |
| `libs/` | Библиотеки, с которыми компилируется проект |

`build/`, `run/`, `*.log` в репозиторий не попадают (см. `.gitignore`): это
сгенерированные артефакты и игровые логи, часть файлов там больше лимита
GitHub в 100 МБ.

## Требования

* JDK 21 (`C:\Program Files\Java\jdk-21`)
* Runtime-jar клиента:
  `%APPDATA%\CollapseLoader\celestial-libraries\celestial-client-remapped.jar`
  (его скачивает CollapseLoader; jar не модифицируется, патчи подгружаются
  отдельным каталогом `celestial-fix`)

## Сборка и запуск

```powershell
.\gradlew prepareAq1Fix prepareShieldBreakFix   # патч-классы в build/celestial-fix и run/celestial-fix
.\gradlew packageLauncher launcherZip           # app-image + build/distributions/*.zip
.\gradlew launcher                              # окно лаунчера без упаковки
```

Готовый лаунчер: `build\launcher-app\CelestialLauncher\CelestialLauncher.exe`.

## Документация

* `docs/aq1-teleport-fix.md` — фикс кика при телепорте
* `docs/shield-break-fix.md` — слом щита топором (`ByPass SB`)
* `docs/launcher.md` — устройство лаунчера
* `docs/deobfuscation-audit.md`, `docs/obfuscator-signature.md` — аудит деобфускации
* `docs/prior-attempt-Modules_Renamed.md` — история предыдущей попытки
