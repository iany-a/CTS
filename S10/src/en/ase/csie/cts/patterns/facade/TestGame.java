package en.ase.csie.cts.patterns.facade;

public class TestGame {
    public static void main(String[] args) {
        //auth user
        GameServer gs1 = new GameServer("10.0.0.1", "Beta testing");
        UserCredentials uc1 = new UserCredentials("demo", "1234");
        PlayerAuthentication auth = new PlayerAuthentication(gs1);
        if (auth.checkUser(uc1)){
            System.out.println("User authenticated.");
        }


        //using FACADE method:
        if(GameSimpleAPI.authenticate("demo","1234","10.0.0.1")){
            System.out.println("User authenticated.");
        }

    }
}
