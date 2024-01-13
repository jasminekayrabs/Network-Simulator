package cz.pcu.simulation.connection;

import cz.pcu.devices.Device;

public class ElectromagneticInterferenceDecorator extends EnvEffectsDecorator {
    public ElectromagneticInterferenceDecorator(IConnection connection) {
        super(connection);
    }

    @Override
    protected void applyEffect() {
        // Logic to apply electromagnetic interference effect
        System.out.println("Applying electromagnetic interference effect to the connection.");
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
