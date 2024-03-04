import Controller.InitController;
import Controller.TicketController;
import Repository.*;
import Service.InitialisationService;
import Service.TicketService;

import java.util.Scanner;

public class ParkingLotMain {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        GateRepository gateRepository = new GateRepository();
        TicketRepository ticketRepository = new TicketRepository();

        InitialisationService initialisationService = new InitialisationService(
                gateRepository,
                parkingLotRepository,
                parkingSpotRepository,
                parkingFloorRepository
        );

        TicketService ticketService = new TicketService(
                ticketRepository,
                parkingLotRepository,
                parkingSpotRepository,
                gateRepository
        );

        TicketController ticketController = new TicketController(ticketService);
        InitController initController = new InitController(initialisationService);


    }
}
