package Lab08Abstraction.Lab08;

public class Squirrel extends Animal{
    @Override
    public int speed() {
        return 50;
    }

    @Override
    public boolean flyable() {
        return false;
    }
}
