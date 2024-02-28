package Service.SpotAllocationStrategy;

import Models.ParkingSpot;
import Models.Vehicle;

public interface SpotAllocationStrategy {
    ParkingSpot allocateParkingSpot(Vehicle vehicle);
}
