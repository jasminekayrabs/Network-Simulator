package cz.pcu.devices;
import cz.pcu.devices.RoutingTable;

public abstract class NetworkProtocol {
    private String name;
    private String type;
    private RoutingTable routingTable;

    public NetworkProtocol(String name, String type) {
        this.name = name;
        this.type = type;
        this.routingTable = new RoutingTable();
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public RoutingTable getRoutingTable() {
        return routingTable;
    }

    // Other methods if needed
}
