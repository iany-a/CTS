package ro.ase.csie.cts.designpatterns.singleton.registry;

public enum ServiceRegistry implements IService {
    LOAD("Load","Loads file", "L"),
    SAVE("Save", "Saves file", "S"),
    DELETE("Delete","Deletes file", "D"),
    CLEAR("Clear","Clears file content", "C");

    private String name;
    private String description;
    private String code;

    private ServiceRegistry(String name, String description, String code) {
        this.name = name;
        this.description = description;
        this.code = code;
    }

    @Override
    public void execute() {
        System.out.println("Executing command " + this);
    }

    @Override
    public String getName() {
        return this.name;


//        return switch(this){
//            case LOAD -> "Load";
//            case SAVE -> "Save";
//            case DELETE -> "Delete";
//            case CLEAR -> "Clear";
//        };
    }
}
