package designpatterns.factory.models;

import designpatterns.factory.IHotelNotification;

public class Mobile implements IHotelNotification {

    private String channelType;

    public Mobile(String channelType) {
        this.channelType = channelType;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println(message);
    }

    @Override
    public String getChannelType() {
        return "Type: " + this.channelType;
    }
}
