package cz.pcu;

public interface IEventScheduler {
    void scheduleEvent(Event event);
    void runNextEvent();
}
