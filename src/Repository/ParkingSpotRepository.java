package Repository;

import Models.ParkingSpot;
import Exception.ParkingSpotNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class ParkingSpotRepository {
    private Map<Integer, ParkingSpot> parkingSpotMap;

    public ParkingSpotRepository() {
        this.parkingSpotMap = new HashMap<>();
    }

    public ParkingSpot get(int parkingSpotId)
    {
        ParkingSpot parkingSpot = parkingSpotMap.get(parkingSpotId);
        if(parkingSpot == null)
        {
            throw new ParkingSpotNotFoundException("There is no parkingSpot with this parkingSpot ID");
        }
        return parkingSpot;
    }

    public void put(ParkingSpot parkingSpot)
    {
        parkingSpotMap.put(parkingSpot.getId(), parkingSpot);
        System.out.println("ParkingSpot has been added successfully" + parkingSpot.getId());
    }
}
