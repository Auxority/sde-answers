package com.hz;

import com.hz.states.GumballMachineState;
import com.hz.states.NoQuarter;
import com.hz.states.SoldOut;

public class GumballMachine {
    int count = 0;

    GumballMachineState state;

    public GumballMachine(int count) {
        this.count = count;
        this.state = initializeState();
    }

    public void insertQuarter()
    {
        this.state.insertQuarter(this);
    }

    public void ejectQuarter()
    {
        this.state.ejectQuarter(this);
    }

    public void turnCrank()
    {
        this.state.turnCrank(this);
    }

    public void dispense()
    {
        this.state.dispense(this);
    }

    public void refill(int numGumBalls) {
        if (numGumBalls > 0) {
            this.count += numGumBalls;
            this.state = this.initializeState();
        } else {
            System.out.println("Hey, stop trying to fill the machine with negative gumballs!");
        }
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004\n");
        result.append("Inventory: " + this.count + " gumball");
        if (this.count != 1) {
            result.append("s");
        }
        result.append("\nMachine is " + this.state.toString() + "\n");
        return result.toString();
    }

    public void setState(GumballMachineState newState)
    {
        this.state = newState;
    }

    public void addGumball()
    {
        this.count++;
    }

    public void removeGumball()
    {
        this.count--;
    }

    public int countGumballs()
    {
        return this.count;
    }

    private GumballMachineState initializeState() {
        if (this.count > 0) {
            return new NoQuarter();
        }
        return new SoldOut();
    }

}
