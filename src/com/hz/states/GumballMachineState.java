package com.hz.states;

import com.hz.GumballMachine;

public interface GumballMachineState {
    public void insertQuarter(GumballMachine machine);
    public void ejectQuarter(GumballMachine machine);
    public void turnCrank(GumballMachine machine);
    public void dispense(GumballMachine machine);
    public String toString();
}
