package ro.ase.csie.cts.designpatterns.factory.docexample.derived;

import ro.ase.csie.cts.designpatterns.factory.docexample.root.AbstractDocument;

public class HTML extends AbstractDocument {

    private boolean hasCss;

    public HTML(String title, boolean hasCss) {
        this.setTitle(title);
        this.hasCss = hasCss;
    }

    @Override
    public void open() {
        System.out.println("Opening HTML file with Mozilla Firefox");
    }
}
