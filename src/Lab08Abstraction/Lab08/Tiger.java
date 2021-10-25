package Lab08Abstraction.Lab08;

public class Tiger extends Animal {

    @Override
    public int speed() {
        return 100;
    }

    @Override
    public boolean flyable() {
        return false;
    }
}
