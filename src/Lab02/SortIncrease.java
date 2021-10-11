package Lab02;

import java.util.Scanner;

public class SortIncrease {
    public static void main(String[] args) {

        String isContinuous = "Y";
        while (isContinuous.equals("Y")) {
            System.out.println("Please enter the number in array: (separated by commas)");
            Scanner inputNum = new Scanner(System.in);
            String input = inputNum.nextLine();

            String[] arrStr = input.split(",");
            int lengthArr = arrStr.length;
            int[] arrNum = new int[lengthArr];
            int tmp = 0;

            try {
                for (int i = 0; i < lengthArr; i++) {
                    arrNum[i] = Integer.parseInt(arrStr[i]);
                }

                for (int i = 0; i < lengthArr; i++) {
                    for (int j = 0; j < lengthArr - 1; j++) {
                        if (arrNum[j] > arrNum[j + 1]) {
                            tmp = arrNum[j];
                            arrNum[j] = arrNum[j + 1];
                            arrNum[j + 1] = tmp;
                        }
                    }

                }

                System.out.printf("Array after sort: ");
                for (int i = 0; i < lengthArr - 1; i++) {
                    System.out.printf("%d, ", arrNum[i]);
                }
                System.out.printf("%d\n", arrNum[lengthArr - 1]);

            } catch (Exception e) {
                System.out.println("Data input invalid!\n");
            }

            //check continuous the program
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
