package cz.pcu;

public class DataCorruptionDecorator extends EnvEffectsDecorator {
    public DataCorruptionDecorator(NetworkConnection connection) {
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
}