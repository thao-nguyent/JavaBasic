package Lab10StrategyDesignPattern;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Fly no way!");
    }
}
