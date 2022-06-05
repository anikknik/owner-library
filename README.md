Локальный запуск:
gradle clean test --tests WebTest -Dconfig-test==local

Удаленный запуск:
gradle clean test --tests WebTest -Dconfig-test=remote


Запуск api теста используя системные свойства:
gradle clean test --tests ApiTest -DbaseUrl= -DbearerToken=

Классический запуск api теста:
gradle clean test --tests ApiTest
