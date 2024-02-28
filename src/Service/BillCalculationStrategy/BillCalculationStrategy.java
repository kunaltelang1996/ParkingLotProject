package Service.BillCalculationStrategy;

import Models.Bill;
import Models.Ticket;

public interface BillCalculationStrategy {
    Bill calculateBill(Ticket ticket);
}
