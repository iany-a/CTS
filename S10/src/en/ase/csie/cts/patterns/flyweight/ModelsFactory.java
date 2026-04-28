package en.ase.csie.cts.patterns.flyweight;

import java.util.HashMap;

public class ModelsFactory {
    private static HashMap<String, Model3D> models = new HashMap<>();

    //registry singleton
    public static synchronized Model3D getModel(String modelName){
        Model3D model = models.get(modelName);

        if (model == null){
            System.out.println("Generating 3D model for "+ modelName + ".");
            model = new Model3D(modelName);
            models.put(modelName, model);
        }

        return model;
    }
}
