package Lab09Interface.Lab9_1;

public class Tiger extends Animals{
    private static final double MIN_WEIGHT = 250;
    private static final double MAX_WEIGHT = 400;

    private final double weight;

    public Tiger() {
        iRacingBehavior = new Animal4Legs();
        weight = MIN_WEIGHT + (Math.random() * (MAX_WEIGHT- MIN_WEIGHT));
    }

    @Override
    double getCurrentSpeed() {
        return weight*0.06;
    }
}
