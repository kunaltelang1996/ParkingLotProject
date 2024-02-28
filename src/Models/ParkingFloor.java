package Models;

import Models.Enums.FloorStatus;

import java.util.List;

public class ParkingFloor extends BaseModel{
    private List<ParkingSpot> spots;
    private int FloorNo;
    private FloorStatus floorStatus;
    private Gate entryGate;
    private Gate exitGate;
}
