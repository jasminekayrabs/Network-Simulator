package cz.pcu.simulation.connection;

public abstract class EnvEffectsDecorator implements IConnection {
    protected IConnection connection;

    public EnvEffectsDecorator(IConnection connection) {
        this.connection = connection;
    }

    @Override
    public boolean isActive() {
        return connection.isActive();
    }

    @Override
    public void transferData() {
        applyEffect();
        connection.transferData();
    }


    protected abstract void applyEffect();
}
