package ro.ase.csie.cts.design.patterns.eagerSingleton;

public class TestLogger {
    public static void main(String[] args) {
        GameLogger logger1 = GameLogger.getLogger();
        GameLogger logger2 = GameLogger.getLogger();

        if(logger1 == logger2) System.out.println("Same.");
        else System.out.println("Different.");

    }
}
