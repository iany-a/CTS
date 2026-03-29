package ro.ase.csie.cts.designpatterns.singleton.eager;

import ro.ase.csie.cts.designpatterns.singleton.IService;

public class ServiceEager implements IService {
    private static final ServiceEager serviceEager = new ServiceEager();
    private String name;

    private ServiceEager(){
        System.out.println("Default constructor called..");
    }

    public static synchronized ServiceEager getInstance(){
        return serviceEager;
    }


    @Override
    public void execute() {
        System.out.println("Executing service...");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
