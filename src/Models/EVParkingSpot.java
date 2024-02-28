package Models;

import Models.Enums.SpotStatus;
import Models.Enums.VehicleType;

import java.time.LocalDateTime;

public class EVParkingSpot extends ParkingSpot{
    private String charger;

    public EVParkingSpot(int id, LocalDateTime createdAt, LocalDateTime updatedAt, String createdBy, String updatedBy, String spotNumber, VehicleType vehicleType, SpotStatus spotStatus, Vehicle vehicle, String charger) {
        super(id, createdAt, updatedAt, createdBy, updatedBy, spotNumber, vehicleType, spotStatus, vehicle);
        this.charger = charger;
    }

    public EVParkingSpot() {
    }

    public String getCharger() {
        return charger;
    }

    public void setCharger(String charger) {
        this.charger = charger;
    }
}
