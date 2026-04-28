package en.ase.csie.cts.patterns.flyweight;

public class SpriteFlyweight implements SpriteFlyweightActions{

    private String modelName;
    private Model3D model;
    //can't reference ModelsFactory since it's static.


    public SpriteFlyweight(String modelName) {
        this.modelName = modelName;
        this.model = ModelsFactory.getModel(modelName);
    }

    @Override
    public void displayOnScreen(int xCoord, int yCoord, int zCoord, String textureColor) {
        System.out.println("Displaying " + this.modelName + " at " + xCoord + ", " + yCoord + ", " + zCoord +
                ", using color: " + textureColor + ".");
        System.out.println("Rendering 3d model...");
    }
}
