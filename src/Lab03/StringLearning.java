package Lab03;

import java.util.Scanner;

public class StringLearning {
    public static void main(String[] args) {
        /*Exercise1*/
        String exercise01Str = "2hrs and 5 minutes";

        String[] timeArr = exercise01Str.split(" and ");

        int hour = Integer.parseInt(timeArr[0].replace("hrs",""));
        int minute = Integer.parseInt(timeArr[1].replace(" minutes",""));

        int sumTime = hour*60+minute;

        System.out.printf("Time total: %d minutes", sumTime);

        /*Exercise2*/
        String exercise02Str = "password123";
        final int MAX_ENTER = 3;
        int userEnter = 0;
        Scanner enterPass = new Scanner(System.in);

        do{
            System.out.println("Please enter password: ");

            String passInput = enterPass.nextLine();
            if (passInput.equals(exercise02Str)){
                System.out.println("Your password corrected!!!!!");
                break;
            }
            userEnter++;
        }while (userEnter < MAX_ENTER);

        System.out.println("See you next time!!");

        /*Exercise3*/
        String exercise3Str = "100 minutes";
        char[] characterArr = exercise3Str.toCharArray();

        System.out.println("String after extract: ");
        for (char character : characterArr) {
            if(Character.isDigit(character)){
                System.out.printf("%s",character);
            }

        }

        /*Exercise4*/
        String exercise4Str = "https://google.com";

        String[] strArr1 = exercise4Str.split("://");
        String str2 = strArr1[1];
        String[] strArr2 = str2.split("\\.");

        String protocolStr = strArr1[0];
        String domainStr = strArr2[0];
        String domainExtension = strArr2[1];

        if(protocolStr.equals("https")){
            System.out.println("URL is https protocol");
        }else
            System.out.println("URL is http protocol");

        System.out.println("Domain URL: " + domainStr);

        System.out.println("Domain name extension: " + domainExtension);

    }
}
