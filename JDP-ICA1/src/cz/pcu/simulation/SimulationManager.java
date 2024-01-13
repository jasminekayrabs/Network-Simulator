package cz.pcu.simulation;

import cz.pcu.networkbuilder.NetworkTopology;
import cz.pcu.simulation.connection.IConnection;
import cz.pcu.simulation.event.IEventScheduler;

public class SimulationManager {
    private NetworkTopology networkTopology;
    private static SimulationManager instance;
    private IEventScheduler eventScheduler;

    // Private constructor for Singleton
    private SimulationManager() {

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
        for (IConnection connection : networkTopology.getConnections()) {
            if (connection.isActive()) {
                connection.transferData();
            }
        }
    }
    public IEventScheduler getEventScheduler() {
        return eventScheduler;
    }

    public void setEventScheduler(IEventScheduler eventScheduler) {
        this.eventScheduler = eventScheduler;
    }

}
