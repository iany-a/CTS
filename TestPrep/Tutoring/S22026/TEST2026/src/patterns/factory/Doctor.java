package patterns.factory;

public class Doctor extends AbstractAuditService {

    public Doctor(String name, String role, String responsibility) {
        this.name = name;
        this.role = role;
        this.responsibility = responsibility;
    }

}
