package designpatterns.factory.models;

import designpatterns.factory.IHotelNotification;

public class SMS implements IHotelNotification {

    private String channelType;

    public SMS(String channelType) {
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
