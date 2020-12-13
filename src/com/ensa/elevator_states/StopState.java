package com.ensa.elevator_states;


import com.ensa.Elevator;

public class StopState implements ElevatorStatee {
    private Elevator elevator=new Elevator();


    @Override
    public int distance(int floor , int c) {
        return -1;
    }

    @Override
    public void setContext(Context context) {

    }
}
