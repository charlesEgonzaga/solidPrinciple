package solidPrinciple;

public class ProcessOrderServ implements OrderProcess {
    
    @Override
    public void placeOrder(String customerName, String address) {
        System.out.println("Order placed for " + customerName + " at " + address);
    }
}