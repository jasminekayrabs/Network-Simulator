package cz.pcu;

abstract class Device {
    int id;
    String name;
    String macAddress;
    List<NetworkInterface> interfaces;
    NetworkProtocol protocol; 

    public Device(NetworkProtocol protocol) {
        this.protocol = protocol;
    }
}
