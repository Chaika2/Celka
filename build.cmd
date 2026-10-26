@echo off
rem Builds the standalone launcher app-image and the distributable zip.
rem Requirements: JDK 21 (see gradle.properties / java.toolchain).
setlocal
cd /d "%~dp0"
call gradlew.bat packageLauncher launcherZip
if errorlevel 1 (
    echo.
    echo Build failed.
    exit /b 1
)
echo.
echo Done:
echo   build\launcher-app\CelestialLauncher\CelestialLauncher.exe
echo   build\distributions\CelestialLauncher-windows-x64.zip
endlocal
