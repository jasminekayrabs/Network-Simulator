package cz.pcu.devices;

class CAMTableRecord {
    private String macAddress;
    private NetworkInterface port;

    public CAMTableRecord(String macAddress, NetworkInterface port) {
        this.macAddress = macAddress;
        this.port = port;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public NetworkInterface getPort() {
        return port;
    }

    public void setPort(NetworkInterface port) {
        this.port = port;
    }
}
