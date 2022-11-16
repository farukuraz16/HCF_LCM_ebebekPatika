import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);
        System.out.println("enter 1. number= ");//get number from user
        int num1 = dat.nextInt();
        System.out.println("enter 2. number= ");//get number from user
        int num2 = dat.nextInt();

        int hcf = 0, i = 1;//create data type.. we need to have int i data type while loop..

        while (i < num1) {//while loop
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;//assign "i" value every loop... last one is biggest.
            }
            i++;
        }

        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + (num1 * num2) / hcf);

    }
}



