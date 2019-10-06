package tech.v2c.minecraft.plugins.lode.RESTful.global.entities.server;

public class ServerDTO {
    private int port;
    private String version;
    private int onlinePlayerCount;
    private String ip;
    private int maxPlayerCount;
    private String motd;
    private String subMotd;
    private String nukkitVersion;
    private String apiVersion;
    private int gameMode;
    private int difficulty;
    private int pluginCount;
    private boolean isAutoSave;
    private boolean hasWhiteList;
    private String serverType;

    public String getServerType() {
        return serverType;
    }

    public void setServerType(String serverType) {
        this.serverType = serverType;
    }

    public boolean isHasWhiteList() {
        return hasWhiteList;
    }

    public void setHasWhiteList(boolean hasWhiteList) {
        this.hasWhiteList = hasWhiteList;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getOnlinePlayerCount() {
        return onlinePlayerCount;
    }

    public void setOnlinePlayerCount(int onlinePlayerCount) {
        this.onlinePlayerCount = onlinePlayerCount;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getMaxPlayerCount() {
        return maxPlayerCount;
    }

    public void setMaxPlayerCount(int maxPlayerCount) {
        this.maxPlayerCount = maxPlayerCount;
    }

    public String getMotd() {
        return motd;
    }

    public void setMotd(String motd) {
        this.motd = motd;
    }

    public String getSubMotd() {
        return subMotd;
    }

    public void setSubMotd(String subMotd) {
        this.subMotd = subMotd;
    }

    public String getNukkitVersion() {
        return nukkitVersion;
    }

    public void setNukkitVersion(String nukkitVersion) {
        this.nukkitVersion = nukkitVersion;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public int getGameMode() {
        return gameMode;
    }

    public void setGameMode(int gameMode) {
        this.gameMode = gameMode;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getPluginCount() {
        return pluginCount;
    }

    public void setPluginCount(int pluginCount) {
        this.pluginCount = pluginCount;
    }

    public boolean isAutoSave() {
        return isAutoSave;
    }

    public void setAutoSave(boolean autoSave) {
        isAutoSave = autoSave;
    }
}
