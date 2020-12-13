package com.ensa.elevator_states;

public class Context {
    private ElevatorStatee elevatorStatee;

    public Context() {
    }

    public Context(ElevatorStatee elevatorStatee) {
        this.elevatorStatee = elevatorStatee;
    }


    public ElevatorStatee getElevatorStatee() {
        return elevatorStatee;
    }

    public void setElevatorStatee(ElevatorStatee elevatorStatee) {
        this.elevatorStatee = elevatorStatee;
  this.elevatorStatee.setContext(this);
    }
}
