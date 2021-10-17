package Lab06;

import java.security.SecureRandom;

public class Animal {

    private int speed;

    public Animal() {
    }

    public Animal(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int speed(){
        int randomSpeed = new SecureRandom().nextInt(speed);
        return randomSpeed;
    }
}
