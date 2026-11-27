# Productstar Demo

## Описание проекта

**Productstar Demo** — учебный Java-проект на Gradle для практики модульного тестирования с помощью JUnit 5.

## Что делает проект

Проект демонстрирует:
- базовую работу Java-приложения;
- вспомогательные методы в классе `Utils`, включая сложение двух чисел;
- форматирование информации о товаре в виде `Item: название, Cost: цена`;
- автоматические тесты JUnit 5;
- подготовку и очистку тестовых данных с помощью `@BeforeEach` и `@AfterEach`;
- группировку тестов с помощью `@Tag`;
- параметризованные тесты с помощью `@ParameterizedTest` и `@ValueSource`.

## Как открыть и запустить проект

1. Склонируйте репозиторий:
   ```bash
   git clone https://github.com/Liachim707/Productstar-demo.git
   ```
2. Откройте папку `Productstar-demo` в IntelliJ IDEA как Gradle-проект.
3. Убедитесь, что для проекта выбрана JDK 17 или новее и Gradle использует эту JDK.
4. Дождитесь завершения синхронизации Gradle.

### Запуск приложения

В корне проекта выполните:

- Windows:
  ```bat
  gradlew.bat run
  ```
- macOS / Linux:
  ```bash
  ./gradlew run
  ```

### Запуск тестов

- Windows:
  ```bat
  gradlew.bat test
  ```
- macOS / Linux:
  ```bash
  ./gradlew test
  ```

После выполнения тестов HTML-отчёт Gradle будет доступен по пути:

`build/reports/tests/test/index.html`

## Теги тестов

- `smoke` — тег класса, применяемый ко всем тестам в `AppTest`;
- `unit` — дополнительный тег двух обычных модульных тестов.

Запустить только тесты с тегом `unit`:

- Windows:
  ```bat
  gradlew.bat test -PincludeTags=unit
  ```
- macOS / Linux:
  ```bash
  ./gradlew test -PincludeTags=unit
  ```

Запустить тесты с тегом `smoke` можно аналогично, заменив значение на `smoke`. Чтобы исключить тег, используйте параметр `-PexcludeTags=тег`.
