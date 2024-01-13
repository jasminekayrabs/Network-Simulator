package cz.pcu;
public class RoutingTableRecord {
    private String networkDestination;
    private String netmask;
    private String gateway;
    private NetworkInterface port;

    public RoutingTableRecord(String networkDestination, NetworkInterface port) {
        this.networkDestination = networkDestination;
        this.port = port;
    }

    public String getNetworkDestination() {
        return networkDestination;
    }

    public String getNetmask() {
        return netmask;
    }

    public String getGateway() {
        return gateway;
    }

    public NetworkInterface getPort() {
        return port;
    }
}
