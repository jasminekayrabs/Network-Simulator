package cz.pcu.network.builder;

import cz.pcu.devices.Device;
import cz.pcu.simulation.connection.IConnection;

import java.util.List;

public class NetworkTopology {
    private List<Device> devices;
    private List<IConnection> connections;

    public NetworkTopology(List<Device> devices, List<IConnection> connections) {
        this.connections = connections;
        this.devices = devices;
    }


    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public List<IConnection> getConnections() {
        return connections;
    }

    public void setConnections(List<IConnection> connections) {
        this.connections = connections;
    }
}
