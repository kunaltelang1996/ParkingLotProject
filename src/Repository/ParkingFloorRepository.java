package Repository;

import Models.ParkingFloor;
import Exception.ParkingFloorNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloorRepository {

    private Map<Integer, ParkingFloor> parkingFloorMap;

    public ParkingFloorRepository() {
        this.parkingFloorMap = new HashMap<>();
    }

    public ParkingFloor get(int parkingFloorId)
    {
        ParkingFloor parkingFloor = parkingFloorMap.get(parkingFloorId);
        if(parkingFloor == null)
        {
            throw new ParkingFloorNotFoundException("There is no parkingFloor with this parkingFloor ID");
        }
        return parkingFloor;
    }

    public void put(ParkingFloor parkingFloor)
    {
        parkingFloorMap.put(parkingFloor.getId(), parkingFloor);
        System.out.println("ParkingFloor has been added successfully" + parkingFloor.getId());
    }
}
