package com.hz.states;

import com.hz.GumballMachine;

public class HasQuarter implements GumballMachineState {

    @Override
    public void insertQuarter(GumballMachine machine) {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter(GumballMachine machine) {
        machine.setState(new NoQuarter());
        System.out.println("Quarter returned");
    }

    @Override
    public void turnCrank(GumballMachine machine) {
        System.out.println("You turned...");
        machine.setState(new Sold());
        machine.dispense();
    }

    @Override
    public void dispense(GumballMachine machine) {
        System.out.println("No gumball dispensed");
    }

    @Override
    public String toString() {
        return "waiting for turn of crank";
    }
}
