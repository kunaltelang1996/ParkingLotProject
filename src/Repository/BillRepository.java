package Repository;

import Models.Bill;
import Exception.BillNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class BillRepository {
    private Map<Integer, Bill> billMap;

    public BillRepository() {
        this.billMap = new HashMap<>();
    }

    public Bill get(int billId)
    {
        Bill bill = billMap.get(billId);
        if(bill == null)
        {
            throw new BillNotFoundException("There is no bill with this bill ID");
        }
        return bill;
    }

    public void put(Bill bill)
    {
        billMap.put(bill.getId(), bill);
        System.out.println("Bill has been added successfully" + bill.getId());
    }
}
