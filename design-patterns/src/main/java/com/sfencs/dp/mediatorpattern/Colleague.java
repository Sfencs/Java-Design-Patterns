package com.sfencs.dp.mediatorpattern;

public abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }
}
