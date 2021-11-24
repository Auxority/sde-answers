package com.hz.states;

import com.hz.GumballMachine;

public class NoQuarter implements GumballMachineState {

    @Override
    public void insertQuarter(GumballMachine machine) {
        System.out.println("You inserted a quarter");
        machine.setState(new HasQuarter());
    }

    @Override
    public void ejectQuarter(GumballMachine machine) {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank(GumballMachine machine) {
        System.out.println("You turned but there's no quarter");
    }

    @Override
    public void dispense(GumballMachine machine) {
        System.out.println("You need to pay first");
    }

    @Override
    public String toString() {
        return "waiting for quarter";
    }
}
