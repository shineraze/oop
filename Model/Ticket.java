package Model;

public class Ticket {
 long id;
 String title;
 String description;
 String status;
 public Ticket(long id, String title, String description) {
 this.id = id;
 this.title = title;
 this.description = description;
 this.status = "NEW";
 }
}
