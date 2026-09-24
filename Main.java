import java.util.ArrayList;
import java.util.List;

import Model.Administrator;
import Model.Customer;
import Model.SupportAgent;
import Model.Ticket;
import Model.User;
import Service.ConsoleNotificationService;
import Service.NotificationService;
import Service.TicketService;
import repository.TicketRepository;

public class Main {
 public static void main(String[] args) {
 System.out.println("=== HELP DESK ===");
    Ticket ticket = new Ticket(
 1,
 "Не работает интернет",
 "После перезагрузки компьютера пропало подключение"
);
   Ticket ticket2 = new Ticket(
                2,
                "Ошибка приложения",
                "Приложение вылетает при запуске"
        );
        Ticket ticket3 = new Ticket(
                3,
                "Не печатает принтер",
                "Принтер не реагирует на команду печати"
        );
TicketRepository ticketRepository = new TicketRepository();
        ticketRepository.add(ticket);
        ticketRepository.add(ticket2);
        ticketRepository.add(ticket3);
for (Ticket t : ticketRepository.findAll()) {
            System.out.println("#" + t.getId() + " " + t.getTitle() + " | " + t.getStatus());
        }
List<User> users = new ArrayList<>();
users.add(new Customer(1, "Анна", "anna@mail.ru"));
users.add(new SupportAgent(2, "Сергей", "sergey@helpdesk.ru"));
users.add(new Administrator(3, "Олег", "admin@helpdesk.ru"));
for (User user : users) {
 user.performAction();
}
 Customer customer = new Customer(1, "Анна Петрова", "anna.petrova@mail.ru");
        System.out.println("Клиент: " + customer.getName());
NotificationService notificationService =
 new ConsoleNotificationService();
System.out.println("Заявка #1: Не работает Wi-Fi | NEW");
TicketService ticketService =
 new TicketService(notificationService);
ticketService.startTicket(ticket);
        System.out.println("Статус: " + ticket.getStatus());
ticket.resolve();
        notificationService.send("По заявке №" + ticket.getId() + " найдено решение");
        System.out.println("Статус: " + ticket.getStatus());
ticket.close();
        notificationService.send("Заявка №" + ticket.getId() + " закрыта");
        System.out.println("Статус: " + ticket.getStatus());
System.out.println();
        for (Ticket t : ticketRepository.findAll()) {
            System.out.println("#" + t.getId() + " " + t.getTitle() + " | " + t.getStatus());
        }
    }
   }


