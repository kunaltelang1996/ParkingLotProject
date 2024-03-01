package Service;

import Models.Enums.*;
import Models.Gate;
import Models.ParkingFloor;
import Models.ParkingLot;
import Models.ParkingSpot;
import Repository.*;

import java.util.ArrayList;
import java.util.List;

public class InitialisationService {

    private GateRepository gateRepository;
    private ParkingLotRepository parkingLotRepository;
    private ParkingSpotRepository parkingSpotRepository;
    private ParkingFloorRepository parkingFloorRepository;

    public InitialisationService(GateRepository gateRepository, ParkingLotRepository parkingLotRepository, ParkingSpotRepository parkingSpotRepository, ParkingFloorRepository parkingFloorRepository) {
        this.gateRepository = gateRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingSpotRepository = parkingSpotRepository;
        this.parkingFloorRepository = parkingFloorRepository;
    }

    public ParkingLot init()
    {
        System.out.println("****Starting Initialisation****");

        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setName("Smart Parking Center");
        parkingLot.setAddress("DB Mall, MP Nagar, Bhopal, Madhya Pradesh");
        parkingLot.setParkingLotStatus(ParkingLotStatus.OPEN);
        parkingLot.setCapacity(100);
        parkingLot.setVehicleTypeSupported(List.of(VehicleType.FOUR_WHEELER,VehicleType.TWO_WHEELER,VehicleType.EV, VehicleType.LUXE));

        List<ParkingFloor> floors = new ArrayList<>();
        for(int i=1;i<+10;i++)
        {
            ParkingFloor parkingFloor = new ParkingFloor();
            parkingFloor.setFloorNo(i);
            parkingFloor.setFloorStatus(FloorStatus.AVAILABLE);
            parkingFloor.setId(i);
            List<ParkingSpot> spots = new ArrayList<>();
            for (int j = 1; j <=10 ; j++)
            {
                ParkingSpot parkingSpot = new ParkingSpot();
                parkingSpot.setId(j);
                parkingSpot.setSpotNumber((i*100) + j);
                parkingSpot.setSpotStatus(SpotStatus.EMPTY);
                parkingSpot.setVehicleType(VehicleType.FOUR_WHEELER);
                spots.add(parkingSpot);
                parkingSpotRepository.put(parkingSpot);
            }
            parkingFloor.setSpots(spots);

            Gate entryGate = new Gate();
            entryGate.setId((i*1000) + 1);
            entryGate.setGateNumber((i*100) + 1);
            entryGate.setGateStatus(GateStatus.OPEN);
            entryGate.setGateType(GateType.ENTRY);
            entryGate.setOperator("Operator" + i+1);
            parkingFloor.setEntryGate(entryGate);
            gateRepository.put(entryGate);

            Gate exitGate = new Gate();
            exitGate.setId((i*1000) + 1);
            exitGate.setGateNumber((i*100) + 1);
            exitGate.setGateType(GateType.EXIT);
            exitGate.setGateStatus(GateStatus.OPEN);
            exitGate.setOperator("Operator" + i + 2);
            parkingFloor.setExitGate(exitGate);
            gateRepository.put(exitGate);

            floors.add(parkingFloor);
            parkingFloorRepository.put(parkingFloor);
        }
        parkingLot.setFloors(floors);
        parkingLotRepository.put(parkingLot);
        return parkingLotRepository.get(1);
    }
}
