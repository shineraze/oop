package repository;

import java.util.ArrayList;
import java.util.List;

import Model.Ticket;

public class TicketRepository {
 private final List<Ticket> tickets = new ArrayList<>();
 public void add(Ticket ticket) {
 tickets.add(ticket);
 }
 public List<Ticket> findAll() {
 return new ArrayList<>(tickets);
 }
}
