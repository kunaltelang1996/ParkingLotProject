package Repository;

import Models.ParkingLot;
import Exception.ParkingLotNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {

    int idCounter = 0;
    private Map<Integer, ParkingLot> parkingLotMap;

    public ParkingLotRepository() {
        this.parkingLotMap = new HashMap<>();
    }

    public ParkingLot get(int parkingLotId)
    {
        ParkingLot parkingLot = parkingLotMap.get(parkingLotId);
        if(parkingLot == null)
        {
            throw new ParkingLotNotFoundException("There is no parkingLot with this parkingLot ID");
        }
        return parkingLot;
    }

    public void put(ParkingLot parkingLot)
    {
        parkingLot.setId(++idCounter);
        parkingLotMap.put(parkingLot.getId(), parkingLot);
        System.out.println("ParkingLot has been added successfully");
    }
}
