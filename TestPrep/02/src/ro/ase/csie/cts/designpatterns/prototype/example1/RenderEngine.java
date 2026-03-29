package ro.ase.csie.cts.designpatterns.prototype.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RenderEngine implements Cloneable {
    String name;
    int memory;
    int[] points;
    ArrayList<Integer> vertices;


    public RenderEngine(String name) throws InterruptedException {
        System.out.println("Init render engine for " + name);
        this.name = name;
        Thread.sleep(5000);
        Random random = new Random();
        this.points = new int[10];
        for(int i=0; i<10; i++){
            this.points[i] = random.nextInt(100);
        }
        this.vertices = new ArrayList();
        for(int i=0; i<5; i++){
            this.vertices.add(random.nextInt(10000));
        }
        System.out.println("Model created.");
    }

    private RenderEngine(){
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        RenderEngine copy = new RenderEngine();
        copy.name = this.name;
        copy.memory = this.memory;
        copy.points = Arrays.copyOf(this.points, this.points.length);
        copy.vertices = (ArrayList<Integer>) this.vertices.clone();
//        ArrayList<Integer> copyArrayList = new ArrayList<Integer>(this.vertices.size());
//        for(int i=0; i<this.vertices.size(); i++){
//            copy.vertices.set(i, this.vertices.get(i));
//        }
        System.out.println("Model cloned from previously created model.");

        return copy;
    }
}
