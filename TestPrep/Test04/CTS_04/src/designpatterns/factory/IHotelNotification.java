package designpatterns.factory;

public interface IHotelNotification {
    void sendNotification(String message);
    String getChannelType();
}