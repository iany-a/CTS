package ro.ase.csie.cts.design.patterns.factory;

public class MainFactory {
    public static void main(String[] args) {

        //do not use tight coupling
        //if constructor changes in class, the object will return an error in main
        //AbstractDocument  htmlDoc = new AbstractDocument (param 1) //but constructor changed with param1, param 2 instead

        //loose coupling - DIP
        //ignores constructor parameters changes

        //factory needs only 1 method (e.g. getActivity())
        //use the method to create objects via an enum parameter for type and name as param 2
        //htmlDoc = DocSimpleFactory.getDocument(DocType.HTML, "robots.html");


    }
}
