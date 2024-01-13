package cz.pcu;
import java.util.List;

public abstract class NetworkInterface {
    private String name;
    private int id;
    private String ipAddress;
    private String mask;
    private String connectedIP;

    public NetworkInterface(String name, int id, String ipAddress, String mask, String connectedIP) {
        this.name = name;
        this.id = id;
        this.ipAddress = ipAddress;
        this.mask = mask;
        this.connectedIP = connectedIP;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getMask() {
        return mask;
    }

    public String getConnectedIP() {
        return connectedIP;
    }

    public abstract void handleEvent();
}
