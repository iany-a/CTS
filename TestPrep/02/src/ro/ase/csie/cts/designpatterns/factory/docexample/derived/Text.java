package ro.ase.csie.cts.designpatterns.factory.docexample.derived;

import ro.ase.csie.cts.designpatterns.factory.docexample.root.AbstractDocument;

public class Text extends AbstractDocument {

    private int noLines;

    public Text(String title, int noLines) {
        this.setTitle(title);
        this.noLines = noLines;
    }

    @Override
    public void open() {
        System.out.println("Opening text file using Notepad");
    }
}
