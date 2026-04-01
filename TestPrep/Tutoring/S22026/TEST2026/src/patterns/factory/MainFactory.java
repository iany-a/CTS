package patterns.factory;

public class MainFactory {
    public static void main(String[] args) {
        AbstractAuditService a1 = Factory.getService(Type.DOCTOR, "Doc1");
        a1.displayResponsibility();
        a1.displayRole();

        AbstractAuditService a2 = Factory.getService(Type.LAB_TECHNICIAN, "Bob");
        a2.displayRole();
        a2.displayResponsibility();


        AbstractAuditService a3 = Factory.getService(Type.RECEPTIONIST, "Marry");
        a3.displayResponsibility();
        a3.displayRole();

        AbstractAuditService a4 = Factory.getService(Type.NURSE, "John");
        a4.displayRole();
        a4.displayResponsibility();

        AbstractAuditService a5 = Factory.getService(Type.DOCTOR, "Mick");
        a5.displayResponsibility();
        a5.displayRole();

    }
}
