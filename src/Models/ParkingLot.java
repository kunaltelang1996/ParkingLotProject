package Models;

import Models.Enums.ParkingLotStatus;
import Models.Enums.VehicleType;
import Service.BillCalculationStrategy.BillCalculationStrategy;
import Service.SpotAllocationStrategy.SpotAllocationStrategy;

import java.time.LocalDateTime;
import java.util.List;

public class ParkingLot extends BaseModel{
    private String name;
    private String address;
    private List<ParkingFloor> floors;
    private ParkingLotStatus parkingLotStatus;
    private List<VehicleType> vehicleTypeSupported;
    private int capacity;
    private BillCalculationStrategy billCalculationStrategy;
    private SpotAllocationStrategy spotAllocationStrategy;

    public ParkingLot(int id, LocalDateTime createdAt, LocalDateTime updatedAt, String createdBy, String updatedBy, String name, String address, List<ParkingFloor> floors, ParkingLotStatus parkingLotStatus, List<VehicleType> vehicleTypeSupported, int capacity, BillCalculationStrategy billCalculationStrategy, SpotAllocationStrategy spotAllocationStrategy) {
        super(id, createdAt, updatedAt, createdBy, updatedBy);
        this.name = name;
        this.address = address;
        this.floors = floors;
        this.parkingLotStatus = parkingLotStatus;
        this.vehicleTypeSupported = vehicleTypeSupported;
        this.capacity = capacity;
        this.billCalculationStrategy = billCalculationStrategy;
        this.spotAllocationStrategy = spotAllocationStrategy;
    }

    public ParkingLot() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public List<VehicleType> getVehicleTypeSupported() {
        return vehicleTypeSupported;
    }

    public void setVehicleTypeSupported(List<VehicleType> vehicleTypeSupported) {
        this.vehicleTypeSupported = vehicleTypeSupported;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public BillCalculationStrategy getBillCalculationStrategy() {
        return billCalculationStrategy;
    }

    public void setBillCalculationStrategy(BillCalculationStrategy billCalculationStrategy) {
        this.billCalculationStrategy = billCalculationStrategy;
    }

    public SpotAllocationStrategy getSpotAllocationStrategy() {
        return spotAllocationStrategy;
    }

    public void setSpotAllocationStrategy(SpotAllocationStrategy spotAllocationStrategy) {
        this.spotAllocationStrategy = spotAllocationStrategy;
    }
}
