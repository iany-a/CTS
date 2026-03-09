package ro.ase.csie.cts.course.clean.code.srp.main;

import ro.ase.csie.cts.course.clean.code.srp.accounting.PayByCard;
import ro.ase.csie.cts.course.clean.code.srp.accounting.PayByCash;
import ro.ase.csie.cts.course.clean.code.srp.containers.DependencyContainer;
import ro.ase.csie.cts.course.clean.code.srp.interfaces.IAccounting;

public class Test {
    public static void main(String[] args) {
        DependencyContainer iocContainer = new DependencyContainer();

        iocContainer.register(IAccounting.class, new PayByCash());
        iocContainer.register(IAccounting.class, new PayByCard());
    }
}
