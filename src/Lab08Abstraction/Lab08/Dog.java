package Lab08Abstraction.Lab08;

public class Dog extends Animal {

    @Override
    public int speed() {
        return 40;
    }

    @Override
    public boolean flyable() {
        return false;
    }
}
