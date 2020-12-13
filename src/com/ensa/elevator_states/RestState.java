package com.ensa.elevator_states;


import com.ensa.Elevator;

public class RestState implements ElevatorStatee {

    private Elevator elevator = new Elevator();
    private Context context;

    public RestState() {

    }

    public Elevator getElevator() {
        return elevator;
    }

    public void setElevator(Elevator elevator) {
        this.elevator = elevator;
    }



    @Override
    public int distance(int floor , int current_floor ) {
        System.out.println("REST r");
        return Math.abs(floor-current_floor);
    }

    @Override
    public void setContext(Context context) {
        this.context=context;
    }

    public Context getContext() {
        return context;
    }
}
