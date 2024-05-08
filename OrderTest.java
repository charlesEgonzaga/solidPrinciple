package solidPrinciple;

public class OrderTest {
    public static void main(String[] args) {
        OrderCalculation orderCalculation = new OrderCalculationServ();
        OrderProcess orderProcess = new ProcessOrderServ();
        OrderInvoice orderInvoice = new OrderInvoiceServ();
        Notification notification = new NotificationServ();

        orderCalculation.calculateTotal(250, 4);
        orderProcess.placeOrder("Charles Gonzaga", "26 Buli Muntinlupa City");
        orderInvoice.generateInvoice("InvoiceReceipt.jpg");
        notification.sendEmailNotification("charles.gonzaga@neu.edu");
    }
}
