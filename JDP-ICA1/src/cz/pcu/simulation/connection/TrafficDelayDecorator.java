package cz.pcu.simulation.connection;

import cz.pcu.devices.Device;

public class TrafficDelayDecorator extends EnvEffectsDecorator {
    public TrafficDelayDecorator(IConnection connection) {
        super(connection);
    }

    @Override
    protected void applyEffect() {
        System.out.println("Applying traffic delay effect to the connection.");
    }

    @Override
    public Device getDevice1() {
        return null;
    }

    @Override
    public Device getDevice2() {
        return null;
    }

    @Override
    public void handleEvent(String event) {

    }

    @Override
    public void addConnection(Device device1, Device device2) {

    }
}
