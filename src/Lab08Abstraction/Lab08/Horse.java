package Lab08Abstraction.Lab08;

import java.security.SecureRandom;

public class Horse extends Animal {
    @Override
    public int speed() {
        return 100;
    }

    @Override
    public boolean flyable() {
        return false;
    }
}
