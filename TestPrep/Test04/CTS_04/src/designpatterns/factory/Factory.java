package designpatterns.factory;

import designpatterns.factory.models.Email;
import designpatterns.factory.models.Mobile;
import designpatterns.factory.models.SMS;

public class Factory {
    public static IHotelNotification getType(Type type){
        return switch(type){
            case EMAIL -> new Email("E-mail");
            case SMS -> new SMS("SMS");
            case MOBILE_APP -> new Mobile("Mobile");
        };
    }
}
