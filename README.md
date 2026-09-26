# Технологии и методы программирования
ПРАКТИЧЕСКАЯ РАБОТА по технологии и методы программирования.
Help Desk — консольное приложение (ООП на Java)
Описание проекта

Консольная система Help Desk, разработанная в рамках практической работы №1 по ООП на Java. Клиент создаёт заявку, специалист поддержки принимает её в работу, меняет статус, решает и закрывает заявку. Система отправляет уведомления на каждом этапе жизненного цикла заявки.

Технологии
Java 17

src/main/java/com/helpdesk/
├── Main.java
├── model/
│   ├── User.java (абстрактный класс)
│   ├── Customer.java
│   ├── SupportAgent.java
│   ├── Administrator.java
│   ├── Ticket.java
│   └── TicketStatus.java (enum)
├── service/
│   ├── NotificationService.java (интерфейс)
│   ├── ConsoleNotificationService.java
│   ├── TicketService.java
│   └── HelpDeskApplication.java
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
