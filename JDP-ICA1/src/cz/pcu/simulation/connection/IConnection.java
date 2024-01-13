package cz.pcu.simulation.connection;

import cz.pcu.devices.Device;

public interface IConnection {
    boolean isActive();
    Device getDevice1();
    Device getDevice2();
    void transferData();
    void handleEvent(String event);
    void addConnection(Device device1, Device device2);
}
