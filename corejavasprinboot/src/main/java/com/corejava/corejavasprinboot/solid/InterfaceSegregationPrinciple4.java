package com.corejava.corejavasprinboot.solid;

/**
 * ISP states that a class should not be forced to implement interfaces it does not use.
 */
///  violates ISP
///
interface  Worker{
    void work();
    void eat();
}
class Robot implements Worker{

    @Override
    public void work() {

    }

    @Override
    public void eat() {
        // no use of this
    }
}
/// / follows ISP
///

interface  Workable{
    void work();
}
interface Eatable{
    void eat();
}
class  HumanWorker implements Workable,Eatable{

    @Override
    public void eat() {
        System.out.println("Human is working");
    }

    @Override
    public void work() {
        System.out.println("Human is eating");
    }
}
class RobotWorker implements Workable{

    @Override
    public void work() {
        System.out.println("Robot is working and it does not require to eat");
    }
}
public class InterfaceSegregationPrinciple4 {

}
