package Repository;

import Models.Ticket;
import Exception.*;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
    private Map<Integer, Ticket> ticketMap;

    public TicketRepository() {
        this.ticketMap = new HashMap<>();
    }

    public Ticket get(int ticketId)
    {
        Ticket ticket = ticketMap.get(ticketId);
        if(ticket == null)
        {
            throw new TicketNotFoundException("There is no ticket with this ticket ID");
        }
        return ticket;
    }

    public void put(Ticket ticket)
    {
        ticketMap.put(ticket.getId(), ticket);
        System.out.println("Ticket has been added successfully");
    }
}
