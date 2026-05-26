@echo off
setlocal
cd /d "%~dp0"

echo ========================================
echo  StructLab Manager
echo  Run Shortcut
echo ========================================

where javac >nul 2>nul
if errorlevel 1 (
    echo Java compiler javac tidak ditemukan di PATH.
    echo Pastikan JDK sudah terpasang dan PATH sudah benar.
    pause
    exit /b 1
)

where java >nul 2>nul
if errorlevel 1 (
    echo Java runtime java tidak ditemukan di PATH.
    echo Pastikan JRE/JDK sudah terpasang dan PATH sudah benar.
    pause
    exit /b 1
)

javac src\StructLabManager.java
if errorlevel 1 (
    echo Gagal compile program.
    pause
    exit /b 1
)

java -cp src StructLabManager
pause
