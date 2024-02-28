package Models;

import Models.Enums.SpotStatus;
import Models.Enums.VehicleType;

import java.time.LocalDateTime;

public class ParkingSpot extends BaseModel{
    private int spotNumber;
    private VehicleType vehicleType;
    private SpotStatus spotStatus;
    private Vehicle vehicle;

    public ParkingSpot(int id, LocalDateTime createdAt, LocalDateTime updatedAt, String createdBy, String updatedBy, int spotNumber, VehicleType vehicleType, SpotStatus spotStatus, Vehicle vehicle) {
        super(id, createdAt, updatedAt, createdBy, updatedBy);
        this.spotNumber = spotNumber;
        this.vehicleType = vehicleType;
        this.spotStatus = spotStatus;
        this.vehicle = vehicle;
    }

    public ParkingSpot() {
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public SpotStatus getSpotStatus() {
        return spotStatus;
    }

    public void setSpotStatus(SpotStatus spotStatus) {
        this.spotStatus = spotStatus;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
