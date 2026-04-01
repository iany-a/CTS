package patterns.singletonregistry;

public class MainHospital {
    public static void main(String[] args) {
        HospitalServiceRegistry h1 = HospitalServiceRegistry.PATIENT_NOTIFICATION;
        //HospitalServiceRegistry h2 = new HospitalServiceRegistry(); <-defeats the purpose

        HospitalServiceRegistry h2 = HospitalServiceRegistry.APPOINTMENT;
        HospitalServiceRegistry h3 = HospitalServiceRegistry.PATIENT_NOTIFICATION;

        if (h1 == h2) System.out.println("Same instance");
        else System.out.println("Different instance");

        if (h1 == h3) System.out.println("Same instance");
        else System.out.println("Different instance");

        System.out.println(h3.getServiceId());
        System.out.println(h2.getServiceDescription());
        h1.startService();


    }
}
