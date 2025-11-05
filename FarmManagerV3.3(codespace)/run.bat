@echo off
REM Farm Manager - Windows Batch Script for Local Development

echo 🌱 Starting Farm Manager...

REM Check if we're in the right directory
if not exist "Main.java" (
    echo ❌ Main.java not found. Please run this from the project directory.
    pause
    exit /b 1
)

REM Compile all Java files
echo 📦 Compiling Java files...
javac *.java

if %errorlevel% equ 0 (
    echo ✅ Compilation successful!
    echo 🚀 Starting Farm Manager GUI...
    java Main
) else (
    echo ❌ Compilation failed. Please check your Java files for errors.
    pause
    exit /b 1
)

pause