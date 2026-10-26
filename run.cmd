@echo off
rem Opens the Celestial launcher window without packaging an app-image.
rem Requirements: JDK 21 (see gradle.properties / java.toolchain).
setlocal
cd /d "%~dp0"
call gradlew.bat launcher
endlocal
