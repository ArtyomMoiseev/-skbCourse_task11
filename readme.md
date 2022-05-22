# java_skbCourse_hw11
## Обслуживание
## Демонстрация работы
### Количество запросов,  и время их выполнения
`http://127.0.0.1:8080/actuator/metrics/http.server.requests`
![](md_images/requests.png)
### Кастомный актуатор
`http://localhost:8080/actuator/dateTime`
![](md_images/custom1.png)
![](md_images/custom2.png)
### Кастомная метрика
`http://localhost:8080/actuator/metrics/custom.counter.time`
![](md_images/metric.png)
P.S Значение увеличивается каждые 5 секунд.
## Запуск
1. Выполните команду: `mvn spring-boot:run`

