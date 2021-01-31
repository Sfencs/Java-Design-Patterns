package com.sfencs.dp.mediatorpattern;

public class ConcreteColleague1 extends Colleague{
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
        mediator.setC1(this);
    }

    /**
     * 自己的方法
     */
    public void selfMethod1(){
        System.out.println("111");
    }

    public void depMethod(){
        System.out.println("111");
        // 自己的逻辑
        // 委托给中介者处理的逻辑
        super.mediator.doSomething1();
    }
}
