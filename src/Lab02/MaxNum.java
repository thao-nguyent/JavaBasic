package Lab02;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {

        String isContinuous = "Y";
        while (isContinuous.equals("Y")) {
            System.out.println("Please enter the number in array: (separated by commas)");
            Scanner inputNum = new Scanner(System.in);
            String input = inputNum.nextLine();

            String[] arrStr = input.split(",");
            int lengthArr = arrStr.length;
            try {
                int max = Integer.parseInt(arrStr[0]);

                for (int i = 1; i < lengthArr; i++) {
                    if (max < Integer.parseInt(arrStr[i])) {
                        max = Integer.parseInt(arrStr[i]);
                    }
                }
                System.out.printf("Max number in array: %d\n", max);
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
