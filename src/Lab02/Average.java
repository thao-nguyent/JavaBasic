package Lab02;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        String isContinuous = "Y";
        while (isContinuous.equals("Y")) {
            int sum = 0;
            float average;
            System.out.println("Please enter the number in array: (separated by commas)");
            Scanner inputNum = new Scanner(System.in);
            String input = inputNum.nextLine();

            String[] arrStr = input.split(",");
            int lengthArr = arrStr.length;
            try {
                for (int i = 0; i < lengthArr; i++) {
                    sum = sum + Integer.parseInt(arrStr[i]);
                }
                average = (float) sum / lengthArr;
                System.out.printf("Average= %.2f\n", average);
            } catch (Exception e) {
                System.out.println("Data input invalid!\n");
            }
            System.out.println("Do you want to try again? (Y/N)");
            Scanner inputAgain = new Scanner(System.in);
            isContinuous = inputAgain.nextLine();
            isContinuous = isContinuous.toUpperCase();
            if (!isContinuous.equals("Y") && !isContinuous.equals("N")) {
                isContinuous = "N";
            }
        }


    }
}
