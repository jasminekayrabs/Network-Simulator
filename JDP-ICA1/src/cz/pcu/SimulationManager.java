package cz.pcu;

import java.util.ArrayList;
import java.util.List;

public class SimulationManager {
    private List<IConnection> connections;
    private List<Device> devices;
    private static SimulationManager instance;
    private IEventScheduler eventScheduler;

    // Private constructor for Singleton
    private SimulationManager() {
        connections = new ArrayList<>();
        devices = new ArrayList<>();

    }

    public static synchronized SimulationManager getInstance() {
        if (instance == null) {
            instance = new SimulationManager();
        }
        return instance;
    }

    // Method to build the network
    public void buildNetwork() {
//        Device device1 = new Device("Device1");
//        Device device2 = new Device("Device2");
//        IConnection connection = ConnectionFactory.createConnection("wired", device1, device2);
//
//        addDevice(device1);
//        addDevice(device2);
//        addConnection(connection);
    }

    public void startSimulation() {
        for (IConnection connection : connections) {
            if (connection.isActive()) {
                connection.transferData();
            }
        }
    }

    public void addConnection(IConnection connection) {
        connections.add(connection);
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public List<IConnection> getConnections() {
        return connections;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public IEventScheduler getEventScheduler() {
        return eventScheduler;
    }

    public void setEventScheduler(IEventScheduler eventScheduler) {
        this.eventScheduler = eventScheduler;
    }

}
