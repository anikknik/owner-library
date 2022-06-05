1. Запуск веб-тестов:
> ./gradlew clean test --tests WebTest -Dconfig-test=local // локальные настройки

> ./gradlew clean test --tests WebTest -Dconfig-test=remote // удалённые настройки


2. Запуск api тестов:

> ./gradlew clean test --tests ApiTest -DbaseUrl=https://github.com -DbearerToken=eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJINHNJQUFBQUFBQUFc // с настройками из команды

> ./gradlew clean test --tests ApiTest // с настройками из файла 
