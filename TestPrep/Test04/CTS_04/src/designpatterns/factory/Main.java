package designpatterns.factory;

public class Main {
    public static void main(String[] args) {
        IHotelNotification notif1 = Factory.getType(Type.EMAIL);
        IHotelNotification notif2 = Factory.getType(Type.SMS);
        IHotelNotification notif3 = Factory.getType(Type.MOBILE_APP);

        notif1.sendNotification("Hello! sending e-mail notification.");
        notif1.sendNotification("Hello! sending SMS notification.");
        notif1.sendNotification("Hello! sending Mobile Push notification.");

        System.out.println(notif1.getChannelType());
        System.out.println(notif2.getChannelType());
        System.out.println(notif3.getChannelType());
    }
}
