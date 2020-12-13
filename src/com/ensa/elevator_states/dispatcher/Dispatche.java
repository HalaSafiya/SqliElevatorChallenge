package com.ensa.elevator_states.dispatcher;

import com.ensa.Elevator;

import java.util.Map;

public interface Dispatche {
    public String min_distance(int floor);
    public void init(Map<String, Elevator> elevatorsMap) ;
}
