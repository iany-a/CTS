package interfaces;

public interface IHotelIncidentLog {
    void addEvent(String event);
    void removeEvent(String event);
    int getTotalEvents();
    void printAllEvents();
}