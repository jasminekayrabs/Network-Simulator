package cz.pcu;

public class ElectromagneticInterferenceDecorator extends EnvEffectsDecorator {
    public ElectromagneticInterferenceDecorator(NetworkConnection connection) {
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
}
