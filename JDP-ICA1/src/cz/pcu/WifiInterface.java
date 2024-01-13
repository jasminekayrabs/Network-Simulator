package cz.pcu;

public class WifiInterface extends NetworkInterface {
    public WifiInterface(String name, int id, String ipAddress, String mask, String connectedIP) {
        super(name, id, ipAddress, mask, connectedIP);
    }

    @Override
    public void handleEvent() {
        // Implement custom behavior for WifiInterface
        System.out.println("Handling event in WifiInterface");
    }
}
