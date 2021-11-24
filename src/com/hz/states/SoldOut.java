package com.hz.states;

import com.hz.GumballMachine;

public class SoldOut implements GumballMachineState {

    @Override
    public void insertQuarter(GumballMachine machine) {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter(GumballMachine machine) {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank(GumballMachine machine) {
        System.out.println("You turned, but there are no gumballs");
    }

    @Override
    public void dispense(GumballMachine machine) {
        System.out.println("No gumball dispensed");
    }

    @Override
    public String toString() {
        return "sold out";
    }
    
}
