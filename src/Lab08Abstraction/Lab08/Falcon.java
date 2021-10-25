package Lab08Abstraction.Lab08;

public class Falcon extends Animal{
    @Override
    public int speed() {
        return 700;
    }

    @Override
    public boolean flyable() {
        return true;
    }
}
