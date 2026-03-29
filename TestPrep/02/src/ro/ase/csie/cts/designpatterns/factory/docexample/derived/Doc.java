package ro.ase.csie.cts.designpatterns.factory.docexample.derived;

import ro.ase.csie.cts.designpatterns.factory.docexample.derived.enums.Extensions;
import ro.ase.csie.cts.designpatterns.factory.docexample.root.AbstractDocument;

public class Doc extends AbstractDocument {

    private Extensions extension;

    public Doc(String title, Extensions extension) {
        this.setTitle(title);
        this.extension = extension;
    }

    @Override
    public void open() {
        System.out.println("Opening document with Microsoft Word");
    }
}
