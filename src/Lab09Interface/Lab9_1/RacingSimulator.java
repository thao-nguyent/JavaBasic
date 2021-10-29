package Lab09Interface.Lab9_1;

import java.util.*;

public class RacingSimulator {
    private static Map<String, Integer > animalRacing = new HashMap<>();

    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            Animals tiger1 = new Tiger();
            Animals horse1 = new Horse();
            Animals elephant1 = new Elephant();
            Animals bird1 = new Bird();
            Animals tiger2 = new Tiger();
            Animals horse2 = new Horse();
            Animals elephant2 = new Elephant();
            Animals bird2 = new Bird();

            String winner = racing(applicableAnimals(Arrays.asList(tiger1,horse1, elephant1, bird1,tiger2,horse2, elephant2, bird2)));

            if(animalRacing.get(winner) == null){
                animalRacing.put(winner,1);
            } else{
                animalRacing.put(winner,animalRacing.get(winner)+ 1);
            }
        }

        System.out.println("Winner is " + findWinnerFinally());

    }

    public static String findWinnerFinally(){
        Set<String> keySet = animalRacing.keySet();
        String winnerFinally = "";
        int countFinally = 0;
        for (String s : keySet) {
            if(winnerFinally.equals("")){
                winnerFinally = s;
                countFinally = animalRacing.get(s);
            } else
            if(countFinally < animalRacing.get(s)){
                winnerFinally = s;
            }
        }

        return winnerFinally;

    }

    public static List<Animals> applicableAnimals(List<Animals> animals){
        List<Animals> applicableAnimals = new ArrayList<>();

        for (Animals animal : animals) {
            if(animal.isRaceApplicable() == true){
                applicableAnimals.add(animal);
            }
        }
        return applicableAnimals;
    }

    public static String racing(List<Animals> animals){
            Animals winner = null;
            double speedWinner = 0;
            for (Animals animal : animals) {
                double animalSpeed = animal.getCurrentSpeed();
                if (winner == null){
                    winner = animal;
                    speedWinner = animalSpeed;
                } else {
                    if (speedWinner < animalSpeed)
                        winner = animal;
                }
            }

        return winner.getClass().getSimpleName();
    }
}
