package Lab02;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        String isContinuous = "Y";
        while (isContinuous.equals("Y")) {
            Scanner inputNum = new Scanner(System.in);
            System.out.println("Please enter the number: ");
            int num = inputNum.nextInt();
            long factorial=1;

            if(num != 0){
                for(int i=num;i>0;i--){
                    factorial = factorial*i;
                }
            }
            System.out.printf("%d!= %d\n",num,factorial);

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
