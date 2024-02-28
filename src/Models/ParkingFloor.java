package Models;

import Models.Enums.FloorStatus;

import java.time.LocalDateTime;
import java.util.List;

public class ParkingFloor extends BaseModel{
    private List<ParkingSpot> spots;
    private int FloorNo;
    private FloorStatus floorStatus;
    private Gate entryGate;
    private Gate exitGate;

    public ParkingFloor(int id, LocalDateTime createdAt, LocalDateTime updatedAt, String createdBy, String updatedBy, List<ParkingSpot> spots, int floorNo, FloorStatus floorStatus, Gate entryGate, Gate exitGate) {
        super(id, createdAt, updatedAt, createdBy, updatedBy);
        this.spots = spots;
        FloorNo = floorNo;
        this.floorStatus = floorStatus;
        this.entryGate = entryGate;
        this.exitGate = exitGate;
    }

    public ParkingFloor() {
    }

    public List<ParkingSpot> getSpots() {
        return spots;
    }

    public void setSpots(List<ParkingSpot> spots) {
        this.spots = spots;
    }

    public int getFloorNo() {
        return FloorNo;
    }

    public void setFloorNo(int floorNo) {
        FloorNo = floorNo;
    }

    public FloorStatus getFloorStatus() {
        return floorStatus;
    }

    public void setFloorStatus(FloorStatus floorStatus) {
        this.floorStatus = floorStatus;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }
}
