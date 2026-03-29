package ro.ase.csie.cts.designpatterns.prototype.example1;

public class Main {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        RenderEngine re1 = new RenderEngine("Obj1");
        //RenderEngine re2 = new RenderEngine("Obj2");

        RenderEngine re3 = (RenderEngine) re1.clone();

    }
}
