package ro.ase.csie.cts.designpatterns.factory.docexample.derived;

import ro.ase.csie.cts.designpatterns.factory.docexample.root.AbstractDocument;

public class Cpp extends AbstractDocument {

    private int version;

    public Cpp(String title, int version) {
        this.setTitle(title);
        this.version = version;
    }

    @Override
    public void open() {
        System.out.println("Opening Cpp file inside Visual Studio");
    }
}
