package Lab08Abstraction.Lab08;

public class Eagle extends Animal{
    @Override
    public int speed() {
        return 500;
    }

    @Override
    public boolean flyable() {
        return true;
    }
}
