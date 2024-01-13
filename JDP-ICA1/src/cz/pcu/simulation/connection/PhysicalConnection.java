package cz.pcu.simulation.connection;

import cz.pcu.devices.Device;

public class PhysicalConnection implements IConnection {
    private Device device1;
    private Device device2;

    public PhysicalConnection(Device device1, Device device2) {
        this.device1 = device1;
        this.device2 = device2;
    }

    public boolean isActive() {
        // Implementation here
        return true; // Placeholder
    }

    public Device getDevice1() {
        return device1;
    }


    public Device getDevice2() {
        return device2;
    }

    @Override
    public void transferData() {

    }

    @Override
    public void handleEvent(String event) {

    }

    @Override
    public void addConnection(Device device1, Device device2) {

    }
}

