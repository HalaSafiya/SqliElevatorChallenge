package com.ensa.elevator_states;


import com.ensa.Elevator;

public class DownState implements ElevatorStatee {
    Elevator elevator=new Elevator();
    private Context context;

    public DownState() {
    }



    @Override
    public int distance(int floor, int c) {
        System.out.println("DOWN");
        context.setElevatorStatee(this);
        int current_floor=elevator.getCurrent_floor();
        if(floor > current_floor)
            return floor + elevator.getNumberOfFloors() - current_floor;
        return current_floor-floor;
    }

    @Override
    public void setContext(Context context) {
        this.context=context;
    }

    public Context getContext() {
        return context;
    }
}
