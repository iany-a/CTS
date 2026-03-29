package ro.ase.csie.cts.designpatterns.factory.docexample;

import ro.ase.csie.cts.designpatterns.factory.docexample.derived.enums.DocType;
import ro.ase.csie.cts.designpatterns.factory.docexample.root.AbstractDocument;

public class Main {
    public static void main(String[] args) {
        AbstractDocument doc1 = DocumentFactory.getType(DocType.TEXT, "notes.txt");
        AbstractDocument doc2 = DocumentFactory.getType(DocType.CPP, "Source.cpp");
        AbstractDocument doc3 = DocumentFactory.getType(DocType.HTML, "index.html");
        AbstractDocument doc4 = DocumentFactory.getType(DocType.DOC, "Project.docx");

        doc1.open();
        doc2.open();
        doc3.open();
        doc4.open();

    }


}
