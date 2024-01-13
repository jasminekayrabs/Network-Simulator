package cz.pcu;

public class DataCorruptionDecorator extends EnvEffectsDecorator {
    public DataCorruptionDecorator(IConnection connection) {
        super(connection);
    }

    @Override
    protected void applyEffect() {
        System.out.println("Applying data corruption effect to the connection.");
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
