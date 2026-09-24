package Model;

public class Ticket {
 private long id;
 private String title;
 private String description;
 private TicketStatus status;
 public long getId() { return id; }
public String getTitle() { return title; }
public String getDescription() { return description; }
public TicketStatus getStatus() { return status; }
 public Ticket(long id, String title, String description) {
 this.id = id;
 this.title = title;
 this.description = description;
 this.status = TicketStatus.NEW;
 }
public void resolve() {
 if (status!=TicketStatus.IN_PROGRESS) {
 System.out.println("Ошибка: решить можно только заявку в работе");
 return;
 }
 status = TicketStatus.RESOLVED;
}
public void close() {
    if (status != TicketStatus.RESOLVED) {
        System.out.println("Ошибка. Лох");
        return;
    }
    status = TicketStatus.CLOSED;
}
public void startProcessing() {
    if (status != TicketStatus.NEW) {
        System.out.println("Ошибка. Лох x2");
        return;
    }
    status = TicketStatus.IN_PROGRESS;
}
}