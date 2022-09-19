//Angelo Y. Yasay
//BSIT_2R9

import java.util.*;
public class YasayBacalso_Calories {

    public static void main(String[] Strings) {

       int numWeight;
       int numHeight;
       int numAge;
       
       double a = 9.563;
       double b = 1.850;
       double c = 4.676;
       
       Scanner Calories = new Scanner (System.in);
       
       System.out.print("Enter Weight: ");
       numWeight = Calories.nextInt();
       
       System.out.print("Enter Height: ");
       numHeight = Calories.nextInt();
       
       System.out.print("Enter Age: ");
       numAge = Calories.nextInt();
       
       double bmr = 655 + (a * numWeight) + (b * numHeight) + (c * numAge);
       System.out.print(String.format("Your Calories overall is: " + "%.2f\n", bmr )); 
       
       if (bmr>2500){
            System.out.print(String.format("You have a High Calorie intake of: " + "%.2f" , bmr ));
       }
        else if(bmr>2000){
                System.out.print(String.format("You have a Moderate Calorie intake of: " + "%.2f" , bmr ));
        }

        else
            System.out.print(String.format("You have a Low Calorie intake of: " + "%.2f" , bmr ));
        
    }
  }