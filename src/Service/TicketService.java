package Service;

import Models.Enums.SpotStatus;
import Models.ParkingLot;
import Models.ParkingSpot;
import Models.Ticket;
import Models.Vehicle;
import Repository.GateRepository;
import Repository.ParkingLotRepository;
import Repository.ParkingSpotRepository;
import Repository.TicketRepository;
import Service.SpotAllocationStrategy.SpotAllocationStrategy;
import Service.SpotAllocationStrategy.SpotAllocationStrategyFactory;

import java.time.LocalDateTime;

public class TicketService {
    private TicketRepository ticketRepository;
    private ParkingLotRepository parkingLotRepository;
    private ParkingSpotRepository parkingSpotRepository;
    private GateRepository gateRepository;

    public TicketService(TicketRepository ticketRepository, ParkingLotRepository parkingLotRepository, ParkingSpotRepository parkingSpotRepository, GateRepository gateRepository) {
        this.ticketRepository = ticketRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingSpotRepository = parkingSpotRepository;
        this.gateRepository = gateRepository;
    }

    public Ticket generateTicket(Vehicle vehicle, int gateId, int parkingLotId)
    {
        SpotAllocationStrategy strategy = SpotAllocationStrategyFactory.getSpotAllocationStrategy();
        ParkingLot parkingLot =parkingLotRepository.get(parkingLotId);

        ParkingSpot allocatedSpot = strategy.allocateParkingSpot(parkingLot,vehicle);
        allocatedSpot.setSpotStatus(SpotStatus.OCCUPIED);
        allocatedSpot.setVehicle(vehicle);
        parkingSpotRepository.put(allocatedSpot);


        Ticket ticket =new Ticket();
        ticket.setEntryTime(LocalDateTime.now());
        ticket.setVehicle(vehicle);
        ticket.setParkingSpot(allocatedSpot);
        ticket.setEntryGate(gateRepository.get(gateId));
        return ticketRepository.put(ticket);
    }
}
