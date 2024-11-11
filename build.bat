@echo off

rem This is a script to build the launcher
rem This project is only on github. If you see this project in other website.
rem You need to in plateau's issue(arbitrarily issue) to update a issue
rem and we will look it

echo Test maven ...
set mvnw = mvnw.cmd
if exist mvnw goto start
else goto exit
:start
echo TEST SUCCESS

rem use maven to build jar
mvnw clean package

echo YES! you can go to ./target/ folder to play!
echo Please press any key to exit build script...
pause>nul

:exit
echo can't find mvnw.cmd!
echo Press any key to exit ...
pause>nul