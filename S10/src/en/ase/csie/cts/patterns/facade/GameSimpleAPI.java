package en.ase.csie.cts.patterns.facade;

//facade class
public class GameSimpleAPI {
    public static boolean authenticate(String username, String password, String serverIP){
        GameServer gameServer = new GameServer(serverIP, "");
        UserCredentials user = new UserCredentials(username, password);
        PlayerAuthentication auth = new PlayerAuthentication(gameServer);
        return auth.checkUser(user);
    }
}
