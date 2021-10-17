package Lab06;

import java.lang.reflect.Array;
import java.util.*;

public class RacingAnimalTest {
    //Controller
    public static Animal getMaxSpeedAnimal(List<Animal> animals){
        Animal winner = null;

        for (Animal animal : animals) {
            if(winner == null){
                winner = animal;
            } else {
                if(winner.getSpeed() < animal.speed()){
                    winner = animal;
                }
            }
        }

        return winner;
    }
    public static void main(String[] args) {

        Dog dog = new Dog();
        Horse horse = new Horse();
        Tiger tiger = new Tiger();

        Animal winner = getMaxSpeedAnimal(Arrays.asList(dog,horse,tiger));

        System.out.println("Winner is " + winner.getClass().getSimpleName() + ", with speed: " + winner.getSpeed());

    }
}
