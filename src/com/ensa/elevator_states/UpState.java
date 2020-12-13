package com.ensa.elevator_states;

import com.sqli.elevator.Elevator;

public class UpState implements ElevatorStatee {
    Elevator elevator=new Elevator();
    private Context context;

    public UpState()
    {

    }



    @Override
    public int distance(int floor , int current) {
        System.out.println("UPP");
        context.setElevatorStatee(this);
        int current_floor=elevator.getCurrent_floor();
        if(floor>=current_floor)
        return floor-current_floor;
        else
            return floor + elevator.getNumberOfFloors() - current;
    }

    @Override
    public void setContext(Context context) {
       this.context=context;
    }

    public Context getContext() {
        return context;
    }


}
