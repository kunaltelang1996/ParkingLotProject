package Service.SpotAllocationStrategy;

import Models.Enums.SpotStatus;
import Models.ParkingFloor;
import Models.ParkingLot;
import Models.ParkingSpot;
import Models.Vehicle;
import Exception.ParkingSpotNotFpundForVehicleException;

import java.util.List;

public class LinearSpotAllocationStrategy implements SpotAllocationStrategy{
    @Override
    public ParkingSpot allocateParkingSpot(ParkingLot parkingLot, Vehicle vehicle) {
        List<ParkingFloor> parkingFloors = parkingLot.getFloors();
        for(ParkingFloor parkingFloor : parkingFloors)
        {
            for(ParkingSpot parkingSpot : parkingFloor.getSpots()){
                if(parkingSpot.getSpotStatus().equals(SpotStatus.EMPTY) &&
                parkingSpot.getVehicleType().equals(vehicle.getVehicleType()))
                {
                    return parkingSpot;
                }
            }
        }
        throw new ParkingSpotNotFpundForVehicleException("No parking spot available for parking your vehicle");
    }
}
