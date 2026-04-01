package patterns.prototype;

import java.util.ArrayList;

public class BloodAnalysis extends AbstractBloodAnalysisReport{
    public BloodAnalysis() {
    }


    public BloodAnalysis(String patientName, String labTechnician, String collectionDate, ArrayList<String> biomarkers,
                         String medicalComments, boolean requiresUrgentAttention) {
        this.patientName = patientName;
        this.labTechnician = labTechnician;
        this.collectionDate = collectionDate;
        this.biomarkers = biomarkers;
        this.medicalComments = medicalComments;
        this.requiresUrgentAttention = requiresUrgentAttention;

        System.out.println("Object created with initializing all parameters, taking time.");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        BloodAnalysis copy = new BloodAnalysis();
        copy.patientName = this.patientName;
        copy.labTechnician = this.labTechnician;
        copy.collectionDate = this.collectionDate;
        copy.biomarkers = (ArrayList<String>) this.biomarkers.clone();
        copy.medicalComments = this.medicalComments;
        copy.requiresUrgentAttention = this.requiresUrgentAttention;
        //int[]
        //copy.arrayInt = Arrays.copyOf(this.arrayInt, this.arrayInt.lenght);
        System.out.println("Cloning created object.");
        return copy;
    }
}
