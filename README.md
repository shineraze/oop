# Технологии и методы программирования
ПРАКТИЧЕСКАЯ РАБОТА по технологии и методы программирования.
Help Desk — консольное приложение (ООП на Java)
Описание проекта

Консольная система Help Desk, разработанная в рамках практической работы №1 по ООП на Java. Клиент создаёт заявку, специалист поддержки принимает её в работу, меняет статус, решает и закрывает заявку. Система отправляет уведомления на каждом этапе жизненного цикла заявки.

Технологии
Java 17
src/main/java/
├── Main.java
├── model/
│   ├── Ticket.java
│   ├── TicketStatus.java
│   ├── User.java
│   ├── Customer.java
│   ├── SupportAgent.java
│   └── Administrator.java
├── service/
│   ├── NotificationService.java
│   ├── ConsoleNotificationService.java
│   └── TicketService.java
└── repository/
    └── TicketRepository.java

    Жизненный цикл заявки
    Статус	            Значение
    NEW	заявка           создана и ожидает обработки
    IN_PROGRESS	         специалист принял заявку в работу
    RESOLVED	          проблема решена
    CLOSED	            заявка закрыта

Как запустить
Открыть проект в Visual Studio Code (или другой IDE с поддержкой Java 17)
Запустить Main.java
