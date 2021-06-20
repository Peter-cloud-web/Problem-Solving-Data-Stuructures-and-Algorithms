package com.company.bankDemo.inheritance;

public class ArithmeticProgression extends Progression {

    protected long increment;

    //    Constructs progression 0,1,2,3...
//    Start at 0 with an increment of 1
    public ArithmeticProgression() {
        this(1, 0);
    }

    //    Constructs progression 0, stepsize, 2∗stepsize
    public ArithmeticProgression(long stepsize) {
        this(stepsize, 0);
    }

    //  Constructs arithmetic progression with arbitrary start and increment.
    public ArithmeticProgression(long stepsize, long start) {
        super(start);
        increment = stepsize;
    }

    protected void advance() {
        current = +increment;
    }

}
