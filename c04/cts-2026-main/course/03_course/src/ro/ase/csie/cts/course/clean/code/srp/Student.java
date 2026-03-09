package ro.ase.csie.cts.course.clean.code.srp;

import ro.ase.csie.cts.course.clean.code.srp.interfaces.IAccounting;

public class Student {
	String name;
	
	IAccounting accounting = null;
	
	// setter injection
	public void setAccounting(IAccounting accountingRef) {
		this.accounting = accountingRef;
	}
	
	// constructor injection
	// doesn't look ok in this case
	public Student(String name, IAccounting accountingRef) {
		this.accounting = accountingRef;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// remove dependency on Accounting by using the external ref
	void payTuition(Student student, double value){


		//call-back the Accounting module action
		if(accounting != null) {
			accounting.payTuition(this, value);
		}
		else {
			throw new UnsupportedOperationException("Missing IAccounting reference");
		}
	}
	void takeOOPExam(){ 
		// implementation of taking exam
	}
	void saveToDB(){ 
		// implementation of saving data to DB
	}

}
