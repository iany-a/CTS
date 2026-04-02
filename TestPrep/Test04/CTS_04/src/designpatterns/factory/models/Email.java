package designpatterns.factory.models;

import designpatterns.factory.IHotelNotification;
import designpatterns.factory.Type;

public class Email implements IHotelNotification {

    private String channelType;

    public Email(String channelType) {
        this.channelType = channelType;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println(message);

    }

    @Override
    public String getChannelType() {
        return "Channel type: " + this.channelType;
    }
}
