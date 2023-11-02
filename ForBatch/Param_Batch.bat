@echo off
REM Check if a parameter was provided
if "%~1"=="" (
    echo Usage: hello.bat ^<Name^>
) else (
    echo Hello %1
)
