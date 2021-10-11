package Lab02;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {

        String isContinuous = "Y";
        while (isContinuous.equals("Y")) {
            System.out.println("Please enter a number: ");
            Scanner inputNum = new Scanner(System.in);
            int num = inputNum.nextInt();
            boolean isPrime = true;

            if(num!=1 && num!= 0){
                for (int i = num - 1; i > 1; i--) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }else{
                isPrime = false;
            }

            if(isPrime){
                System.out.printf("%d is a prime!\n",num);
            }else{
                System.out.printf("%d is not a prime!\n",num);
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
