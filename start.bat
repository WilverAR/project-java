REM COMMAND INIT → ./start.bat [ONLY TO OPEN BY LOCAL]
@echo off

docker-compose up -d

timeout /t 30

start http://localhost:8090/swagger-ui.html
