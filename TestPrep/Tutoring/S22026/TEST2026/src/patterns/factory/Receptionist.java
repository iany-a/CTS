package patterns.factory;

public class Receptionist extends AbstractAuditService{

    public Receptionist(String name, String role, String responsibility) {
        this.name = name;
        this.role = role;
        this.responsibility = responsibility;
    }


}
