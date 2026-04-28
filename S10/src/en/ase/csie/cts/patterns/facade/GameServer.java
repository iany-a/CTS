package en.ase.csie.cts.patterns.facade;

public class GameServer {
    private String IP;
    private String name;

    public GameServer(String IP, String name) {
        this.IP = IP;
        this.name = name;
    }

    public String getIP() {
        return IP;
    }

    public String getName() {
        return name;
    }
}
