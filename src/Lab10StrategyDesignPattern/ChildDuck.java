package Lab10StrategyDesignPattern;

public class ChildDuck extends Duck{

    public ChildDuck(){
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println("I'm a real child Duck!");
    }
}
