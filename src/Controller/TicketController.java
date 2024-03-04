package Controller;

import Models.Ticket;
import Models.Vehicle;
import Service.TicketService;
import Exception.InvalidRequestExcetion;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public Ticket generateTicket(Vehicle vehicle, int gateId, int parkingLotId) {
        if (gateId <= 0 || parkingLotId <= 0) {
            throw new InvalidRequestExcetion("Please enter valid information");
        }
        return ticketService.generateTicket(vehicle, gateId, parkingLotId);
    }
}
