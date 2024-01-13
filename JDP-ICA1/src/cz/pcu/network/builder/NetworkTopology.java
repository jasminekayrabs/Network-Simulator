package cz.pcu.network.builder;

import java.util.List;

public class NetworkTopology {
    private List<Device> devices;
    private List<IConnection> connections;

    public NetworkTopology(List<Device> devices, List<IConnection> connections) {
        this.connections = connections;
        this.devices = devices;
    }

    public List<Device> getDevices() {
        return Devices;
    }

    public List<IConnection> getConnections() {
        return Connections;
    }
}
