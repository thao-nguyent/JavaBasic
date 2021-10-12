package Lab06;

import java.util.HashMap;
import java.util.Map;

public class RacingAnimalTest {
    public static void main(String[] args) {

        Map<String, Integer> speedList = new HashMap<>();
        Dog dog = new Dog();
        int dogSpeed = dog.speed();
        speedList.put(dog.getClass().getSimpleName(),dogSpeed);

        Horse horse = new Horse();
        int horseSpeed = horse.speed();
        speedList.put(horse.getClass().getSimpleName(),horseSpeed);

        Tiger tiger = new Tiger();
        int tigerSpeed = tiger.speed();
        speedList.put(tiger.getClass().getSimpleName(),tigerSpeed);

        int maxSpeed = 0;
        String winnerAnimal ="";

        for (String animalName : speedList.keySet()){
            if(speedList.get(animalName) > maxSpeed){
                maxSpeed = speedList.get(animalName);
                winnerAnimal = animalName;
            }
        }

        System.out.println("Winner is " + winnerAnimal + ", with speed: " + maxSpeed);

    }
}
