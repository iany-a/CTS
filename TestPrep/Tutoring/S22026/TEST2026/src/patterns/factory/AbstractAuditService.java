package patterns.factory;

public abstract class AbstractAuditService {
    protected String name;
    protected String role;
    protected String responsibility;

    void displayRole(){
        System.out.println("Role: " + this.role);
    }

    void displayResponsibility(){
        System.out.println("Responsibility: " + this.responsibility);
    }

}
