#!/bin/bash

# Farm Manager - Compile and Run Script for Codespaces
echo "🌱 Starting Farm Manager..."

# Check if we're in the right directory
if [ ! -f "Main.java" ]; then
    echo "❌ Main.java not found. Please run this from the project directory."
    exit 1
fi

# Compile all Java files
echo "📦 Compiling Java files..."
javac *.java

if [ $? -eq 0 ]; then
    echo "✅ Compilation successful!"
    echo "🚀 Starting Farm Manager GUI..."
    
    # Set display for GUI applications
    export DISPLAY=:1
    
    # Run the application
    java Main
else
    echo "❌ Compilation failed. Please check your Java files for errors."
    exit 1
fi