package patterns.singletonregistry;

public interface IHospitalService {
    String getServiceId();
    String getServiceDescription();
    void startService();
}