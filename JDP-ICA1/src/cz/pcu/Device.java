package cz.pcu;
import java.util.List;

abstract class Device {
    private int id;
    private String name;
    private String macAddress;
    private List<NetworkInterface> interfaces;
    private NetworkProtocol protocol; 

    public Device(int id, String name, String macAddress, List<NetworkInterface> interfaces, NetworkProtocol protocol) {
        this.id = id;
        this.name = name;
        this.macAddress = macAddress;
        this.interfaces = interfaces;
        this.protocol = protocol;
    }
}
