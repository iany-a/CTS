package patterns.factory;

public class LabTechnician extends AbstractAuditService {

    public LabTechnician(String name, String role, String responsibility) {
        this.name = name;
        this.role = role;
        this.responsibility = responsibility;
    }


}
