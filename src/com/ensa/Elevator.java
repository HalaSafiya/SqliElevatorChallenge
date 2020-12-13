package com.ensa;


import com.ensa.elevator_states.Context;
import com.ensa.elevator_states.ElevatorStatee;
import com.ensa.elevator_states.RestState;

public class Elevator {
    private int numberOfFloors;
    private int current_floor;
    private String id;
    private Context context= new Context();

    public Elevator() {
    }

    private ElevatorStatee elevatorState;


    public Elevator(String id,int current_floor){

        this.id=id;
        this.current_floor=current_floor;
        ElevatorStatee restingState = new RestState();
        this.context.setElevatorStatee(restingState);
    }

    public int distance(int floor,Context context){
        return this.getContext().getElevatorStatee().distance(floor,this.current_floor);
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }



    public int getCurrent_floor() {
        return current_floor;
    }

    public void setCurrent_floor(int current_floor) {
        this.current_floor = current_floor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ElevatorStatee getElevatorState() {
        return elevatorState;
    }

    public void setElevatorState(ElevatorStatee elevatorState) {
        this.elevatorState = elevatorState;
    }






}
