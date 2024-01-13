package cz.pcu;

//Singleton
//Priority queue to sort events based on their time stamps


import java.util.PriorityQueue;
import java.util.Queue;
import java.time.LocalDateTime;

public class EventScheduler implements IEventScheduler {
    private static EventScheduler instance;
    private Queue<Event> eventQueue;

    private EventScheduler() {
        eventQueue = new PriorityQueue<>((e1, e2) -> e1.getTimestamp().compareTo(e2.getTimestamp()));
    }

    public static synchronized EventScheduler getInstance() {
        if (instance == null) {
            instance = new EventScheduler();
        }
        return instance;
    }

    @Override
    public void scheduleEvent(Event event) {
        eventQueue.add(event);
    }

    @Override
    public void runNextEvent() {
        if (!eventQueue.isEmpty()) {
            Event event = eventQueue.poll();
            event.getCommand().execute();
        }
    }

    public boolean isEventQueueEmpty() {
        return eventQueue.isEmpty();
    }
}


