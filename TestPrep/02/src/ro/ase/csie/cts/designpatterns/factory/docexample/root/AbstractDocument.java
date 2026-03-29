package ro.ase.csie.cts.designpatterns.factory.docexample.root;

public abstract class AbstractDocument {
    private String title;

    // A shared property for all documents
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    // The "Contract": Every subclass MUST decide how to open itself
    public abstract void open();
}