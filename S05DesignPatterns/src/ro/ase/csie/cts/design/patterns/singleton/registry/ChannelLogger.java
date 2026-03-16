package ro.ase.csie.cts.design.patterns.singleton.registry;

public enum ChannelLogger {
    //1. define the symbols
    ERROR("error.log", 24),
    INFO("info.log", 7*24),
    STATUS("status.log", 30*24),
    GAMEPLAY("gameplay.log", 1);

    private String fileName;
    private float rotationTime;

    private ChannelLogger(String fileName, float rotationTime) {
        this.rotationTime = rotationTime;
        this.fileName = fileName;
    }

    public void log(String msg){
        System.out.printf(this.fileName + " <- "+msg);
    }


}
