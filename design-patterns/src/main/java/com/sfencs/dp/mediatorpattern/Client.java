package com.sfencs.dp.mediatorpattern;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        ConcreteColleague1 concreteColleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 concreteColleague2 = new ConcreteColleague2(mediator);
        concreteColleague1.depMethod();

        concreteColleague2.depMethod();
    }
}
