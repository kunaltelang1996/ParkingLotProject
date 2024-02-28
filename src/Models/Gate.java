package Models;

import Models.Enums.GateStatus;
import Models.Enums.GateType;

import java.time.LocalDateTime;

public class Gate extends BaseModel{
    private GateType gateType;
    private int gateNumber;
    private String operator;
    private GateStatus gateStatus;

    public Gate(int id, LocalDateTime createdAt, LocalDateTime updatedAt, String createdBy, String updatedBy, GateType gateType, int gateNumber, String operator, GateStatus gateStatus) {
        super(id, createdAt, updatedAt, createdBy, updatedBy);
        this.gateType = gateType;
        this.gateNumber = gateNumber;
        this.operator = operator;
        this.gateStatus = gateStatus;
    }

    public Gate() {
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }
}
