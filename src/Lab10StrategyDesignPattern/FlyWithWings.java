package Lab10StrategyDesignPattern;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly with wings!");
    }
}
