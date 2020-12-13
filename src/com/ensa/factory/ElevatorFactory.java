package com.ensa.factory;


import com.ensa.Elevator;

import java.util.Map;

public abstract class ElevatorFactory {
    public abstract Map<String, Elevator> getElevators(String... id);


}

