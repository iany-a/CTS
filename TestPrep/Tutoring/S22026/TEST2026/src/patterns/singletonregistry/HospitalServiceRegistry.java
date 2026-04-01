package patterns.singletonregistry;

public enum HospitalServiceRegistry implements IHospitalService{
    PATIENT_NOTIFICATION("01", "Patient notification"),
    BILLING("02", "Billing"),
    APPOINTMENT("03", "Appointment"),
    LAB_RESULT("04", "Lab results");

    private String id;
    private String desc;

    HospitalServiceRegistry(String id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    @Override
    public String getServiceId() {
        return "Id: " + this.id;
    }

    @Override
    public String getServiceDescription() {
        return "Desc: " + this.desc;
    }

    @Override
    public void startService() {
        System.out.println("Starting service " + this.desc);
    }
}
