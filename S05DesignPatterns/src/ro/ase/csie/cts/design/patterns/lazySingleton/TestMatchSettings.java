package ro.ase.csie.cts.design.patterns.lazySingleton;

public class TestMatchSettings {
    public static void main(String[] args) {

//        MatchSettings settings1 = new MatchSettings();
//        MatchSettings settings2 = new MatchSettings();

    MatchSettings settings1 = MatchSettings.getSettings();
    MatchSettings settings2 = MatchSettings.getSettings();

    //1st req: lazy singleton
    if(settings1 == settings2) System.out.println("Same object.");
    else System.out.println("Different objects.");

    }
}
