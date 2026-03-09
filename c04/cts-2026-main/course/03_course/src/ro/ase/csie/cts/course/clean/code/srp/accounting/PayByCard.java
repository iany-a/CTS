package ro.ase.csie.cts.course.clean.code.srp.accounting;

import ro.ase.csie.cts.course.clean.code.srp.interfaces.IAccounting;
import ro.ase.csie.cts.course.clean.code.srp.Student;

public class PayByCard implements IAccounting {

    @Override
    public void payTuition(Student student, double value) {
        System.out.println(student.getName() + "pays by card.");
    }
}
