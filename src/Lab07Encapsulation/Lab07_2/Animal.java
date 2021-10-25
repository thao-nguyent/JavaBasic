package Lab07Encapsulation.Lab07_2;

import java.security.SecureRandom;

public class Animal {

    private  final String name;
    private final int speed;
    private final boolean isFlyAble;

    private Animal(Builder builder) {
        this.speed = builder.speed;
        this.isFlyAble = builder.isFlyAble;
        this.name = builder.name;
    }

    public int getSpeed(){
        if(this.isFlyAble == false){
            return this.speed;
        }else{
            return 0;
        }
    }

    public String getName(){
        return this.name;
    }

    public static class Builder {
        private int speed;
        private boolean isFlyAble;
        private String name;

        public Builder() {
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder speed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder isFlyable(boolean isFlyAble) {
            this.isFlyAble = isFlyAble;
            return this;
        }

        public Animal build(){
            return new Animal(this);
        }
    }
}
