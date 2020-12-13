package com.ensa.factory;


import com.ensa.Elevator;
import com.ensa.elevator_states.Context;
import com.ensa.elevator_states.RestState;

import java.util.HashMap;
import java.util.Map;

public class ElevatorCFactory extends ElevatorFactory {
    private Map<String, Elevator> map=new HashMap<String, Elevator>();
    private Context context=new Context();

    public ElevatorCFactory() {
    }


    public Map<String,Elevator> getElevators(String... id){
        System.out.println("get");
        for(String number:id){
            String one = number.split(":")[0];
            int currentFloor = Integer.valueOf(number.split(":")[1]);
            Elevator elevator=new Elevator(one,currentFloor);
            RestState elevatorStatee = new RestState();
           elevator.setElevatorState(elevatorStatee);
            map.put(one,elevator);
        }
        return map;
    }
}
