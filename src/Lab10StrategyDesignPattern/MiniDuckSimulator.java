package Lab10StrategyDesignPattern;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck childDuck = new ChildDuck();
        childDuck.performQuack();
        childDuck.performFly();
    }
}
