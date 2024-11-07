package com.klebermagno.code.advanced.stream.eventscheduler;

import java.util.*;

/**
 * Create an event scheduler that stores and manages events, where each event
 * has a name, a start time, and an end time.
 * Your task is to implement an event scheduler that supports adding events and
 * retrieving the list of events in chronological order based on their start
 * time.
 * 
 * Additionally, you need to ensure that:
 * 
 * Events with the same start time are sorted by their name.
 * You should be able to check if a new event conflicts with any existing events
 * (i.e., if it overlaps with any existing event's time).
 * Instructions:
 * Create a class field in EventScheduler to store the events.
 * Provide methods in EventScheduler to add events (while checking for
 * conflicts) and retrieve the list of events in chronological order.
 * You can also modify the Event class if you need to.
 */

class Event {
    String name;
    int startTime;
    int endTime;

    Event(String name, int startTime, int endTime) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return name + " from " + startTime + " to " + endTime;
    }

    public static void main(String[] args) {
        EventScheduler scheduler = new EventScheduler();

        scheduler.addEvent(new Event("Meeting", 900, 1000));
        scheduler.addEvent(new Event("Workshop", 1030, 1200));
        scheduler.addEvent(new Event("Conference", 900, 930));
        scheduler.addEvent(new Event("Lunch", 1200, 1300));
        scheduler.addEvent(new Event("Follow-up Meeting", 1000, 1100));

        System.out.println("Schedule:");
        // This should print all the events in chronological order
        for (var event : scheduler.getEvents()) {
            System.out.println(event);
        }

        var conflictingEvent = new Event("Review", 915, 1015);
        // This shouldn't add the event because of a conflict with another event
        scheduler.addEvent(conflictingEvent);

    }

    // You don't need generics, this is just boilerplate code
    public static class EventScheduler {

        public EventScheduler() {
        }

        private final List events = new ArrayList();

        public boolean addEvent(Event event) {
            // events.stream().filter((storedEvent)->{
            // if(event.startTime <= storedEvent.startTime && event }
            // )
            // .ifPresent()
            return false;
        }

        /**
         * Retrieving the list of events in chronological order based on their start
         * time.
         * Event with same start time are sorted by their name.
         */
        public List getEvents() {
            // events.sort((event1, event2) -> {if (event1.startTime == event2.starTime) {
            // return event1.name.compare(event2.name)
            // } else if (event1.startTime > event2.startTime) {
            // return 1;
            // } else {
            // return -1;
            // }
            // })
            return events;
        }

    }
}
