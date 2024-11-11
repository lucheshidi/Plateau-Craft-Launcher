package net.plateau.common.util.readInfo.json;

public class Config {
    private Dirs dirs;
    private String isEggHuntFound;
    private JavaMemory javaMemory;

    // Getter and Setter for dirs
    public Dirs getDirs() {
        return dirs;
    }

    public void setDirs(Dirs dirs) {
        this.dirs = dirs;
    }

    // Getter and Setter for isEggHuntFound
    public String getIsEggHuntFound() {
        return isEggHuntFound;
    }

    public void setIsEggHuntFound(String isEggHuntFound) {
        this.isEggHuntFound = isEggHuntFound;
    }

    // Getter and Setter for javaMemory
    public JavaMemory getJavaMemory() {
        return javaMemory;
    }

    public void setJavaMemory(JavaMemory javaMemory) {
        this.javaMemory = javaMemory;
    }
}
