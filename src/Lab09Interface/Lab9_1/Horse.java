package Lab09Interface.Lab9_1;

public class Horse extends Animals{
    private static final double MIN_SPEED = 15.0;
    private static final double MAX_SPEED = 24.0;

    private final double speed;

    public Horse() {
        iRacingBehavior = new Animal4Legs();
        speed = MIN_SPEED + Math.random()*(MAX_SPEED-MIN_SPEED);
    }

    @Override
    double getCurrentSpeed() {
        return speed;
    }
}
