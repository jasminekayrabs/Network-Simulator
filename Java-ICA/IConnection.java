public interface IConnection {
    boolean isActive();
    void setActive(boolean active);
    EnvironmentalEffects getEnvironmentalEffects();
    Device getDevice1();
    Device getDevice2();
    void simulateTrafficDelay();
}
