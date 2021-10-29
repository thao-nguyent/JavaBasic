package Lab09Interface.Lab9_1;

public abstract class Animals {
    IRacingBehavior iRacingBehavior;
    double speed;

    public Animals() {
    }

    protected boolean isRaceApplicable(){
        return iRacingBehavior.racingable();
    }

    double getCurrentSpeed(){
        return speed;
    }
}
