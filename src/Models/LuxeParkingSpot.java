package Models;

import Models.Enums.SpotStatus;
import Models.Enums.VehicleType;

import java.time.LocalDateTime;

public class LuxeParkingSpot extends ParkingSpot{

    private String guard;

    public LuxeParkingSpot(int id, LocalDateTime createdAt, LocalDateTime updatedAt, String createdBy, String updatedBy, String spotNumber, VehicleType vehicleType, SpotStatus spotStatus, Vehicle vehicle, String guard) {
        super(id, createdAt, updatedAt, createdBy, updatedBy, spotNumber, vehicleType, spotStatus, vehicle);
        this.guard = guard;
    }

    public LuxeParkingSpot() {
    }

    public String getGuard() {
        return guard;
    }

    public void setGuard(String guard) {
        this.guard = guard;
    }
}
