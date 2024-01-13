package cz.pcu.simulation.event;

public interface IEventScheduler {
    void scheduleEvent(Event event);
    void runNextEvent();
}
