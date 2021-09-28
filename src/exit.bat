@echo off
setlocal
for /f "usebackq delims=" %%t in (`jps ^| find "Discord-Typing-Sites-RPC.jar" /c`) do set PIDC=%%t
for /l %%n in (1,1,%PIDC%) do (
setlocal ENABLEDELAYEDEXPANSION
for /f "usebackq delims=" %%A in (`jps ^| find "Discord-Typing-Sites-RPC.jar"`) do set HOGE=%%A
taskkill /pid !HOGE: Discord-Typing-Sites-RPC.jar=!
)