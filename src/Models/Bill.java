package Models;

import Models.Enums.BillStatus;

import java.time.LocalDateTime;

public class Bill extends BaseModel{
    private LocalDateTime exitTime;
    private double amount;
    private Ticket ticket;
    private Gate exitGate;
    private BillStatus billStatus;

    public Bill(int id, LocalDateTime createdAt, LocalDateTime updatedAt, String createdBy, String updatedBy, LocalDateTime exitTime, double amount, Ticket ticket, Gate exitGate, BillStatus billStatus) {
        super(id, createdAt, updatedAt, createdBy, updatedBy);
        this.exitTime = exitTime;
        this.amount = amount;
        this.ticket = ticket;
        this.exitGate = exitGate;
        this.billStatus = billStatus;
    }

    public Bill() {
    }


    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }
}
