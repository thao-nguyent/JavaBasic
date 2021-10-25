package Lab08Abstraction.Lab08;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Controller {

    public void runContest(List<Animal> animals){
        List<Animal> applicableAnimals = applicableAnimals(animals);

        Animal winner = null;
        int speedWinner = 0;

        System.out.print("The animals races: ");
        for (Animal applicableAnimal : applicableAnimals) {
            System.out.print(applicableAnimal.getClass().getSimpleName() + ", ");
            if(winner == null){
                winner = applicableAnimal;
                speedWinner = randomSpeed(winner.speed());
            } else {
                int speedAnimal = randomSpeed(applicableAnimal.speed());
                if( speedWinner < speedAnimal){
                    winner = applicableAnimal;
                    speedWinner = speedAnimal;
                }
            }

        }

        System.out.println("\nWinner is " + winner.getClass().getSimpleName() + ", with speed: " + speedWinner);
    }

    private List<Animal> applicableAnimals(List<Animal> animals){
        List<Animal> applicableAnimals = new ArrayList<>();

        for (Animal animal : animals) {
            if(animal.flyable() == false){
                applicableAnimals.add(animal);
            }
        }
        return applicableAnimals;
    }

    private int randomSpeed(int speedMax){
        int speed = new Random().nextInt(speedMax);
        return speed;
    }
}
