package Models;

import Models.Enums.BillStatus;
import Models.Enums.PaymentMode;
import Models.Enums.PaymentStatus;

import java.time.LocalDateTime;

public class Payment extends BaseModel{
    private int amount;
    private PaymentMode paymentMode;
    private Bill bill;
    private int ReferenceNumber;
    private PaymentStatus paymentStatus;
    private LocalDateTime paymentTime;

    public Payment(int id, LocalDateTime createdAt, LocalDateTime updatedAt, String createdBy, String updatedBy, int amount, PaymentMode paymentMode, Bill bill, int referenceNumber, PaymentStatus paymentStatus, LocalDateTime paymentTime) {
        super(id, createdAt, updatedAt, createdBy, updatedBy);
        this.amount = amount;
        this.paymentMode = paymentMode;
        this.bill = bill;
        ReferenceNumber = referenceNumber;
        this.paymentStatus = paymentStatus;
        this.paymentTime = paymentTime;
    }

    public Payment() {
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public int getReferenceNumber() {
        return ReferenceNumber;
    }

    public void setReferenceNumber(int referenceNumber) {
        ReferenceNumber = referenceNumber;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(LocalDateTime paymentTime) {
        this.paymentTime = paymentTime;
    }
}
