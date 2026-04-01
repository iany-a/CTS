package patterns.prototype;

import java.util.ArrayList;

public class MainPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("string 1");
        arrayList1.add("string 2");
        arrayList1.add("string 3");
        arrayList1.add("string 4");

        BloodAnalysis b1 = new BloodAnalysis(
                "Patient 1", "Lab1", "0226", arrayList1, "no meds", false);

        BloodAnalysis b2 = (BloodAnalysis) b1.clone();
    }
}
