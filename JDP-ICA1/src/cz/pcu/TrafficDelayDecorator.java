package cz.pcu;

public class TrafficDelayDecorator extends EnvEffectsDecorator {
    public TrafficDelayDecorator(NetworkConnection connection) {
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
}
