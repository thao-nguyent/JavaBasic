package Lab01;

import java.util.Scanner;

public class Operator2Number {
    public static void main(String[] args) {

        String isContinuous = "Y";
        while (isContinuous.equals("Y")) {
            Scanner input1 = new Scanner(System.in);
            Scanner input2 = new Scanner(System.in);

            System.out.println("Please input the first integer number:");

            int num1 = input1.nextInt();

            System.out.println("Please input the second integer number:");

            int num2 = input2.nextInt();


            int sum = num1 + num2;
            System.out.printf("Sum= %d\n", sum);
            int sub;

            if (num1 > num2) {
                sub = num1 - num2;
            } else {
                sub = num2 - num1;
            }
            System.out.printf("Sub= %d\n", sub);

            int mul = num1 * num2;

            System.out.printf("Mul= %d\n", mul);

            if (num2 != 0) {

                double div = (double) num1 / num2;
                System.out.printf("Dev= %.2f\n", div);
            } else {
                System.out.println("The division invalid!\n");
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
