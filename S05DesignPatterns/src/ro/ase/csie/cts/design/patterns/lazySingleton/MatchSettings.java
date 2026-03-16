package ro.ase.csie.cts.design.patterns.lazySingleton;

public class MatchSettings {

    //IMPORTANT: DECLARE AS STATIC!!!
    private static MatchSettings settings = null; //type is the same as the class, needs to be private and static

    private float maxDuration;
    private int maxPlayers;
    private int noPlayers;
    private String mapName;

    //IMPORTANT: DECLARE AS PRIVATE!!!
    private MatchSettings() {
        System.out.println("Reading game config file...");
        this.maxDuration = 60;
        this.maxPlayers = 100;
        this.noPlayers = 0;
        this.mapName = "CityCentral";
    }
    //IMPORTANT: DECLARE AS PUBLIC + STATIC!!!
    public static synchronized MatchSettings getSettings(){
        if (MatchSettings.settings == null){
            MatchSettings.settings = new MatchSettings();
        }
        return MatchSettings.settings;
    }


}
