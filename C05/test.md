DESIGN PATTERNS

Creational designs: Singleton, Builder, Prototype, Factory



For first lab test - we can use cheat sheets on acs.ase.ro/cts
https://acs.ase.ro/Media/Default/documents/designpatterns/designpatternscard.pdf
https://acs.ase.ro/Media/Default/documents/cts/curs/DiagrameDesignPatterns.pdf



2nd test - no cheat sheets



1 hour for the test

\-some source code is provided like abstract classes, implementation, etc

\-we need to chose the right design pattern and implement it

\-for singleton, a frequent error that students make is not declaring the constructor as private

&#x09;\*the static getInstance() needs to be public instead, AND static (does not require objects to be created)

\-main reason for failing is superficiality - not studying, only relying on the cheat sheets





**SINGLETON**

\*slide 26 - SINGLETON problem - good for practice



example: 2 modules creating 2 connections to the same IP instead of using 1 single connection



to define a db connection and prevent duplicate connections, use SINGLETON



public class Singleton {

&#x09;private static Singleton instance = null;

&#x09;private Singleton() { }

&#x09;public static synchronized Singleton getInstance() {

&#x09;	if (instance == null) {

&#x09;		instance = new Singleton ();

&#x09;	}

&#x09;	return instance;

&#x09;}

}



block the constructor from the class itself, hence we need the "PRIVATE" constructor

\*default constructor is PUBLIC so it needs to be manually implemented in the class as PRIVATE



&#x09;*private Singleton() { }*



\*SINGLETON has a static private instance attribute mandatory declared;



&#x09;*private static Singleton instance = null;*





\*the public static synchronized method in SINGLETON is needed for checking if the instance is created



&#x09;*public static synchronized Singleton getInstance() {*

&#x09;	*if (instance == null) {*

&#x09;		*instance = new Singleton ();*

&#x09;	*}*

&#x09;	*return instance;*

&#x09;*}*



*public* = can be called outside the class

*static* = does not require an object to be created

*synchronized* = prevents multi-threading issues

\*IMPORTANT: DO NOT PASS ANY PARAMETERS IN THIS FUNCTION!





In JAVA, a simpler singleton implementation can be done using Enums.



Implementation types:

Lazy = create objects only when needed - this loads the objects only when required by the user actions, implying  instant runtime, but brief moments of slowness during usage

Eager = create objects at the start of the project to use them later - this loads everything at the application runtime, which may imply slower initial load, but no other slowness during runtime



Standard of SIGNLETON is Lazy implementation => object is created when it is required.

\*You can change the implementation to Eager, by declaring the object as *public final* at the start, and removing the getter.





To handle multiple connections using SINGLETON, you need to use a HashMap<>

*\*In this case, the getConnection() function can have parameters*

Once you create a connection, do not forget to put it in the HashMap



FACTORY











