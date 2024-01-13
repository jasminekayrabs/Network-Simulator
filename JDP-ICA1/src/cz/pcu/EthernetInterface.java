package cz.pcu;

public class EthernetInterface extends NetworkInterface {
    public EthernetInterface(String name, int id, String ipAddress, String mask, String connectedIP) {
        super(name, id, ipAddress, mask, connectedIP);
    }

    @Override
    public void handleEvent() {
        // Implement custom behavior for EthernetInterface
        System.out.println("Handling event in EthernetInterface");
    }
}
