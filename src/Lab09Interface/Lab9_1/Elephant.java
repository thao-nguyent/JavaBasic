package Lab09Interface.Lab9_1;

public class Elephant extends Animals{
    private static final double MIN_LEG_HEIGHT = 3.0;
    private static final double MAX_LEG_HEIGHT = 4.0;

    private final double legHeight;

    public Elephant() {
        iRacingBehavior = new Animal4Legs();
        legHeight = MIN_LEG_HEIGHT + (Math.random() * (MAX_LEG_HEIGHT-MIN_LEG_HEIGHT));
    }

    @Override
    double getCurrentSpeed() {
        return legHeight*6.0;
    }
}
