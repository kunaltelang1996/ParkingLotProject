import Controller.InitController;
import Controller.TicketController;
import Models.Enums.VehicleType;
import Models.ParkingLot;
import Models.Ticket;
import Models.Vehicle;
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

        System.out.println("Parking Lot Initialisation - Begin");
        ParkingLot parkingLot = initController.init();
        System.out.println("Parking Lot Initialisation - Finish");
        System.out.println("Please select one of the below Option");
        System.out.println("1. Enter Parking Lot");
        System.out.println("2. Exit Parking Lot");
        System.out.println("3. Exit");
        int option = scn.nextInt();
        while(true)
        {
            if(option == 1)
            {
                Vehicle vehicle = new Vehicle();
                System.out.println("Welcome to Smart Parking Center");
                System.out.println("Enter your Vehicle details");
                System.out.println("Enter the vehicle Number");
                String number = scn.next();
                vehicle.setVehicleNo(number);
                System.out.println("Enter the color of your Vehicle");
                String color = scn.next();
                vehicle.setColor(color);
                System.out.println("Please choose the vehicle type");
                System.out.println("Press 1 - Car \nPress 2 - Bike");
                int n = scn.nextInt();
                if(n==1)
                {
                    vehicle.setVehicleType(VehicleType.FOUR_WHEELER);
                } else if (n==2) {
                    vehicle.setVehicleType(VehicleType.TWO_WHEELER);
                }
                System.out.println("Please Enter the parking Lot Id");
                int parkingLotId = scn.nextInt();
                System.out.println("Please Enter the gate Id");
                int gateId = scn.nextInt();
                Ticket ticket = ticketController.generateTicket(vehicle, parkingLotId, gateId);
                System.out.println("Ticket Details : \n" + ticket);
            }
//            else if (option == 2)
//            {
//
//            }
        }
    }
}
