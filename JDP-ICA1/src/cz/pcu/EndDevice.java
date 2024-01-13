package cz.pcu;
import java.util.List;

class EndDevice extends Device {
    public EndDevice(int id, String name, String macAddress, List<NetworkInterface> interfaces, NetworkProtocol protocol) {
        super(id, name, macAddress, interfaces, protocol);
    }
}
