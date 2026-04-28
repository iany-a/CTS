package en.ase.csie.cts.patterns.facade;

import java.util.Random;

public class PlayerAuthentication {
    GameServer gameServer;

    public PlayerAuthentication(GameServer gameServer) {
        this.gameServer = gameServer;
    }

    public boolean checkUser(UserCredentials userCredentials){
        System.out.println("Connecting to game server at IP " + gameServer.getIP() + ".");
        System.out.println("Checking credentials for "+ userCredentials.getName() + ".");
        return new Random().nextBoolean(); //temp T/F mechanism - needs to be correctly implemented
    }






}
