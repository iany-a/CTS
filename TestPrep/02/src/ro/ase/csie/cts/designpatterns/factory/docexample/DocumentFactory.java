package ro.ase.csie.cts.designpatterns.factory.docexample;

import ro.ase.csie.cts.designpatterns.factory.docexample.derived.Cpp;
import ro.ase.csie.cts.designpatterns.factory.docexample.derived.Doc;
import ro.ase.csie.cts.designpatterns.factory.docexample.derived.HTML;
import ro.ase.csie.cts.designpatterns.factory.docexample.derived.Text;
import ro.ase.csie.cts.designpatterns.factory.docexample.derived.enums.DocType;
import ro.ase.csie.cts.designpatterns.factory.docexample.derived.enums.Extensions;
import ro.ase.csie.cts.designpatterns.factory.docexample.root.AbstractDocument;

public class DocumentFactory {
    public static AbstractDocument getType(DocType type, String title){
        return switch(type){
            case CPP -> new Cpp(title, 21);
            case DOC -> new Doc(title, Extensions.DOCX);
            case HTML -> new HTML(title, true);
            case TEXT -> new Text(title, 200);
            default -> throw new UnsupportedOperationException("Invalid document type");
        };
    }
}
