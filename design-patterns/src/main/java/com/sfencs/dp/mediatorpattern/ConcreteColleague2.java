package com.sfencs.dp.mediatorpattern;

public class ConcreteColleague2 extends Colleague{
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
        mediator.setC2(this);
    }

    /**
     * 自己的方法
     */
    public void selfMethod2(){
        System.out.println("222");
    }

    public void depMethod(){
        // 自己的逻辑
        System.out.println("222");
        // 委托给中介者处理的逻辑
        super.mediator.doSomething2();
    }
}