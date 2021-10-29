package Lab10StrategyDesignPattern;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Mute quack!");
    }
}
