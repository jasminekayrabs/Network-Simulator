package cz.pcu;

public class WirelessConnection implements NetworkConnection {
    private Device device1;
    private Device device2;

    public WirelessConnection(Device device1, Device device2) {
        this.device1 = device1;
        this.device2 = device2;
    }

    @Override
    public boolean isActive() {
        return false;
    }

    @Override
    public Device getDevice1() {
        return null;
    }

    @Override
    public Device getDevice2() {
        return null;
    }

    @Override
    public void transferData() {

    }

}
