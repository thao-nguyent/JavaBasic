package Lab07Encapsulation.Lab07_2;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;

public class RacingAnimalTest {
    //Controller
    public static Animal getMaxSpeedAnimal(List<Animal> animals){
        Animal winner = null;
        String name;

        for (Animal animal : animals) {
            if(animal.getSpeed() != 0){
                System.out.println(animal.getName() + ", You can race! Please wait for enough members!!");
                if(winner == null){
                    winner = animal;
                }else if(winner.getSpeed() < animal.getSpeed()){
                    winner = animal;
                }
            } else
                System.out.println(animal.getName() + ", You can't race! Please standing outside as a spectator!!");
        }

        return winner;
    }
    public static void main(String[] args) {
        Animal horse = new Animal.Builder().name("Horse").speed(new SecureRandom().nextInt(75)).isFlyable(false).build();
        Animal tiger = new Animal.Builder().name("Tiger").speed(new SecureRandom().nextInt(100)).isFlyable(false).build();
        Animal dog = new Animal.Builder().name("Dog").speed(new SecureRandom().nextInt(50)).isFlyable(false).build();
        Animal goose = new Animal.Builder().name("Goose").speed(new SecureRandom().nextInt(20)).isFlyable(true).build();
        Animal eagle = new Animal.Builder().name("Eagle").speed(new SecureRandom().nextInt(400)).isFlyable(true).build();
        Animal falcon = new Animal.Builder().name("Falcon").speed(new SecureRandom().nextInt(500)).isFlyable(true).build();

        Animal winner = getMaxSpeedAnimal(Arrays.asList(dog,horse,tiger,goose,eagle,falcon));

        System.out.println("Winner is " + winner.getName() + ", with speed: " + winner.getSpeed());
    }
}
