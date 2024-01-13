package cz.pcu;

public abstract class EnvEffectsDecorator implements NetworkConnection {
    protected NetworkConnection connection;

    public EnvEffectsDecorator(NetworkConnection connection) {
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
