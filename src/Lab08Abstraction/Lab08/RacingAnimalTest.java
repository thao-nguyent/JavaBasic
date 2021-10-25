package Lab08Abstraction.Lab08;

import java.util.Arrays;
import java.util.List;

public class RacingAnimalTest {
    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal eagle = new Eagle();
        Animal falcon = new Falcon();
        Animal squirrel = new Squirrel();

        Controller controller = new Controller();


        controller.runContest(Arrays.asList(dog,horse,tiger,eagle,falcon,squirrel));
    }
}
