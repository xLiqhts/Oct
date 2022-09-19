import java.util.*;

public class BMRyasaybacalso {

    public static void main(String[] args) {

        int iweight, iage, iheight;
        double BMR; // declaration of var

        Scanner iscan = new Scanner(System.in);

        System.out.println("==BMR Calculator for Women==");

        // scanning of data
        System.out.println("\n==Please Input==");
        System.out.print("Enter your Weight(in kg): ");
        iweight = iscan.nextInt();
        System.out.print("Enter your Height(in cm): ");
        iheight = iscan.nextInt();
        System.out.print("Enter your Age(in years): ");
        iage = iscan.nextInt();

        // computation of data
        BMR = 655 + (9.563 * iweight) + (1.850 * iheight) - (4.676 * iage);

        // print result
        System.out.println("\n==Your Data==");
        System.out.println("Your Weight : " + iweight + "kg");
        System.out.println("Your Height : " + iheight + "cm");
        System.out.println("Your Age : " + iage + " years old");

        System.out.println("\n==The Result==");
        System.out.println("Your BMR is " + String.format("%.2f", BMR));
        // conditional statement
        if (BMR >= 2000) {
            System.out.println("You have an average calorie intake per day.");
        } else if (BMR >= 2500) {
            System.out.println("You have a high calorie intake per day.");
        } else
            System.out.println("You have a low calorie intake per day.");

        iscan.close();
    }
}