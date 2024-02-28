package Models;

import java.time.LocalDateTime;

public class Ticket extends BaseModel{
    private ParkingSpot parkingSpot;
    private Vehicle vehicle;
    private LocalDateTime entryTime;

    public Ticket(int id, LocalDateTime createdAt, LocalDateTime updatedAt, String createdBy, String updatedBy, ParkingSpot parkingSpot, Vehicle vehicle, LocalDateTime entryTime) {
        super(id, createdAt, updatedAt, createdBy, updatedBy);
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
        this.entryTime = entryTime;
    }

    public Ticket() {
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }
}
