package Lab06;

public class RacingAnimalTest {
    public static void main(String[] args) {

        Dog dog = new Dog();
        int maxSpeed = dog.speed();
        String winnerAnimal = dog.getClass().getSimpleName();

        Horse horse = new Horse();
        int horseSpeed = horse.speed();
        if(maxSpeed < horseSpeed){
            maxSpeed = horseSpeed;
            winnerAnimal = horse.getClass().getSimpleName();
        }

        Tiger tiger = new Tiger();
        int tigerSpeed = tiger.speed();
        if(maxSpeed < tigerSpeed){
            maxSpeed = tigerSpeed;
            winnerAnimal = tiger.getClass().getSimpleName();
        }

        System.out.println("Winner is " + winnerAnimal + ", with speed: " + maxSpeed);

    }
}
