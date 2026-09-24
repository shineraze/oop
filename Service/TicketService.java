package Service;

import Model.Ticket;

public class TicketService {
 private final NotificationService notificationService;
 public TicketService(NotificationService notificationService) {
 this.notificationService = notificationService;
 }
 public void startTicket(Ticket ticket) {
 ticket.startProcessing();
 notificationService.send(
 "Заявка №" + ticket.getId() + " принята в работу"
 );
 }
}