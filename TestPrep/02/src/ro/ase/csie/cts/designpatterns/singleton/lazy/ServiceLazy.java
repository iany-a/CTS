package ro.ase.csie.cts.designpatterns.singleton.lazy;


import ro.ase.csie.cts.designpatterns.singleton.IService;

public class ServiceLazy implements IService {

    private static ServiceLazy serviceLazy = null;
    private String name;

    private ServiceLazy(){
        System.out.println("Default constructor called...");
    }

    public static synchronized ServiceLazy getInstance(){
        if (serviceLazy == null) serviceLazy = new ServiceLazy();
        return serviceLazy;
    }


    @Override
    public void execute() {
        System.out.println("Executing lazy singleton..");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
