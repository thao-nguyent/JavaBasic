package Lab06;

import java.security.SecureRandom;

public class Animal {

    public static int speedMax;

    public Animal() {
    }

    public int speed(){
        int randomSpeed = new SecureRandom().nextInt(speedMax);
        return randomSpeed;
    }
}
