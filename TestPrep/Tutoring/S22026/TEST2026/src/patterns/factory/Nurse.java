package patterns.factory;

public class Nurse extends AbstractAuditService{

    public Nurse(String name, String role, String responsibility) {
        this.name = name;
        this.role = role;
        this.responsibility = responsibility;
    }

}
