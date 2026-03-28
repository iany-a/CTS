package ro.ase.csie.cts.design.patterns.eagerSingleton;

import ro.ase.csie.cts.design.patterns.interfaces.ILogging;

public class GameLogger implements ILogging {

    //init object = either private and non-final with getter OR public and final with no getter
    private static GameLogger logger = new GameLogger();

    private String fileName;

    private GameLogger() {
        System.out.println("Creating the game log file: game.log");
        this.fileName = "game.log";
    }

    //the object getter
    public static synchronized GameLogger getLogger(){
        return GameLogger.logger;
    }

    @Override
    public void logInfo(String info) {
        System.out.println("Log into the file INFO: "+ info);
    }

    @Override
    public void logError(String error) {
        System.out.println("Log into the file ERROR: " + error);
    }
}
