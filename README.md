# Игры разума (Java)

[![hexlet-check](https://github.com/mikitasazan/java-project-61/actions/workflows/hexlet-check.yml/badge.svg)](https://github.com/mikitasazan/java-project-61/actions)

Погрузитесь в экосистему Java, научитесь настраивать рабочее окружение. Подружитесь с Spotless (линтером и форматтером кода) и фреймворком для автоматизации сборки проектов Gradle. Поймёте, чем git отличается от GitHub, поработаете с внешними репозиториями. Получите опыт построения архитектуры полноценного приложения и написания чистого кода.

Учебный проект Хекслета: https://ru.hexlet.io/programs/java
Как это должно работать: https://asciinema.org/a/gNnJBjpEYJublKT1LuzK4Ep9h

## Стек

- Java 21, Gradle (application plugin)
- Spotless + google-java-format — стиль кода
- gradle-versions-plugin — проверка обновлений зависимостей

## Установка

```bash
git clone https://github.com/mikitasazan/java-project-61.git
cd java-project-61/app
```

## Использование

```bash
cd app
./gradlew installDist
make run-dist
```

Приложение показывает меню из пяти игр («Чётное число», «Калькулятор», «НОД»,
«Прогрессия», «Простое число»). Игрок отвечает на три вопроса подряд — три
верных ответа подряд дают победу, любой неверный ответ завершает игру.

---

<details>
<summary>Автоматические тесты Хекслета</summary>

Тесты запускаются на каждый коммит. За запуск отвечает файл `.github/workflows/hexlet-check.yml` — не удаляйте и не переименовывайте ни его, ни репозиторий.

</details>

## О Хекслете

[Хекслет](https://ru.hexlet.io/) — школа программирования: авторские программы обучения с практикой, поддержкой наставников и реальными проектами, которые остаются в резюме. Этот репозиторий — один из таких проектов.
