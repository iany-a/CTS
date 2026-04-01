package patterns.prototype;

import java.util.ArrayList;

public abstract class AbstractBloodAnalysisReport {

    protected String patientName;
    protected String labTechnician;
    protected String collectionDate;

    protected ArrayList<String> biomarkers; // e.g., Hemoglobin, Glucose, Cholesterol

    protected String medicalComments;
    protected boolean requiresUrgentAttention;


}