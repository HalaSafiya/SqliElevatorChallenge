package com.ensa;



import com.ensa.elevator_states.*;
import com.ensa.elevator_states.dispatcher.Dispatche;
import com.ensa.elevator_states.dispatcher.Dispatcher;
import com.ensa.factory.ElevatorCFactory;
import com.ensa.factory.ElevatorFactory;

import java.util.Map;

public class Building {

    private int numberOfFloors;
    private Map<String , Elevator> elevators;
    private Dispatche dispatche= Dispatcher.getInstance();
    private ElevatorFactory elevatorFactory= new ElevatorCFactory();
    private Context context;


    public Building(int numberOfFloors,String... elevators ) {
        this.numberOfFloors=numberOfFloors;
        this.elevators= elevatorFactory.getElevators(elevators);
    }

    public String requestElevator() {
         dispatche.init(this.elevators);
         return dispatche.min_distance(numberOfFloors);
    }

    public void move(String id, String state) {
        Elevator elevator=elevators.get(id);
        switch (state){
            case "UP":
                ElevatorStatee upState = new UpState();
                elevators.get(id).getContext().setElevatorStatee(upState);
                break;
            case "DOWN":
                ElevatorStatee downState = new DownState();
                elevators.get(id).getContext().setElevatorStatee(downState);

                break;

        }


    }

    public void stopAt(String id, int floor) {
        Elevator elevator=elevators.get(id);
        elevator.setCurrent_floor(floor);
        elevator.getContext().setElevatorStatee(new StopState());
    }

    public String requestElevator(int i) {
        dispatche.init(elevators);
        return dispatche.min_distance(i);
    }
}
