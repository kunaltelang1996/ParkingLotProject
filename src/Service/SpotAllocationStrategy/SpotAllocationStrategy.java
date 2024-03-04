package Service.SpotAllocationStrategy;

import Models.ParkingLot;
import Models.ParkingSpot;
import Models.Vehicle;

public interface SpotAllocationStrategy {
    ParkingSpot allocateParkingSpot(ParkingLot parkingLot, Vehicle vehicle);
}
