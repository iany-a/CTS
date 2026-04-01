package patterns.factory;

public class Factory {
    public static AbstractAuditService getService(Type type, String name){
        return switch(type){
            case DOCTOR -> new Doctor(name, "doctor", "doc respons");
            case NURSE -> new Nurse(name, "nurse", "nursing");
            case LAB_TECHNICIAN -> new LabTechnician(name, "labtech", "lab tech");
            case RECEPTIONIST -> new Receptionist(name, "receptionist", "greet guests");
        };
    }
}
