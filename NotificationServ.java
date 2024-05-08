package solidPrinciple;

public class NotificationServ implements Notification {
    @Override
    public void sendEmailNotification(String email) {
        System.out.println("Email notification sent to: " + email);
    }
}
