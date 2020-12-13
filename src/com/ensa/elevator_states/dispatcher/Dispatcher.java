package com.ensa.elevator_states.dispatcher;


import com.ensa.Elevator;

import java.util.HashMap;
import java.util.Map;

public class Dispatcher implements Dispatche{

    private Map<String, Elevator> elevatorMap =new HashMap<>();

    public static Dispatcher _instance=null;
    private Dispatcher(){}
    public static Dispatcher getInstance(){
        if(_instance==null)
            return new Dispatcher();
        return _instance;
    }

    public void init(Map<String, Elevator> elevatorsMap) {
        this.elevatorMap = elevatorsMap;
    }

    @Override
    public String min_distance(int floor) {
        int distance=10;
        String idCloser="";
        for (String id:elevatorMap.keySet()) {
            System.out.println("dis");
            System.out.println(elevatorMap.get(id).distance(floor,elevatorMap.get(id).getContext()));
            System.out.println(elevatorMap.get(id).getCurrent_floor());
            if (elevatorMap.get(id).distance(floor,elevatorMap.get(id).getContext()) != -1 &&
                            elevatorMap.get(id).distance(floor,elevatorMap.get(id).getContext()) <= distance){
            distance=elevatorMap.get(id).distance(floor,elevatorMap.get(id).getContext());
            idCloser=id;
        }}
        return idCloser;
    }

    public Map<String, Elevator> getElevatorMap() {
        return elevatorMap;
    }


    public void setElevatorMap(Map<String, Elevator> elevatorMap) {
        this.elevatorMap = elevatorMap;
    }
}
