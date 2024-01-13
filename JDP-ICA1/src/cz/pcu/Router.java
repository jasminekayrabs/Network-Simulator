package cz.pcu;
import java.util.List;

class Router extends Device {
    private String defaultGateway;

    public Router(int id, String name, String macAddress, List<NetworkInterface> interfaces, NetworkProtocol protocol, String defaultGateway) {
        super(id, name, macAddress, interfaces, protocol);
        this.defaultGateway = defaultGateway;
    }
}
