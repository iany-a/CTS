package ro.ase.csie.cts.design.patterns.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SpaceObject3DModel implements Cloneable{
    String name;
    int memory;
    int[] points;
    ArrayList<Integer> vertices;

    public SpaceObject3DModel(String name) throws InterruptedException {
        System.out.println("Init 3D model for " + name);
        this.name = name;
        Thread.sleep(5000);
        Random random = new Random(); //do not use it for thesis
        this.memory = random.nextInt(1000);
        this.points = new int[10];
        for (int i=0; i<10; i++){
            this.points[i] = random.nextInt(100);
        }

        this.vertices = new ArrayList<>();
        for (int i=0; i<5; i++){
            this.vertices.add(random.nextInt(10000));
        }

        System.out.println("3D model created");
    }

    private SpaceObject3DModel(){
        //default constructor to do NOTHING
    }

    //for test, if we do shallow copy we get 0 points

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //this is not OK, defeats the purpose
        //SpaceObject3DModel copy = new SpaceObject3DModel(this.name);

        SpaceObject3DModel copy = new SpaceObject3DModel();
        copy.name = this.name;
        copy.memory = this.memory;
        //copy.vertices = this.vertices //SHALLOW COPY
        copy.vertices = (ArrayList<Integer>) this.vertices.clone();
        copy.points = Arrays.copyOf(this.points, this.points.length); //deep copy of array

        return copy;
    }
}
