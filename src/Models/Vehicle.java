package Models;

import Models.Enums.VehicleType;

import java.time.LocalDateTime;

public class Vehicle extends BaseModel{
    private String vehicleNo;
    private VehicleType vehicleType;
    private String color;

    public Vehicle(int id, LocalDateTime createdAt, LocalDateTime updatedAt, String createdBy, String updatedBy, String vehicleNo, VehicleType vehicleType, String color) {
        super(id, createdAt, updatedAt, createdBy, updatedBy);
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
        this.color = color;
    }

    public Vehicle() {
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
