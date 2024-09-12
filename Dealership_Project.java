/*
 * Prajeet Bohara
 * 12/13/2023
 * P3: Dealership Project
 */

import java.util.*;

public class Dealership_Project {
    public static void main(String[] args) {
         Scanner inscan = new Scanner(System.in);
         System.out.println("Welcome to car Dealership!!");
         System.out.println("Type 'a' to buy a car!");
         System.out.println("Type 'b' to sell a car!");
         
         String entry = inscan.nextLine();
 
 //***********USING IF-ELSE-METHOD**************
 //****You can also do this using CASE method***
         
         if (entry.equals("a")){
             System.out.println("You choose to buy a car!");
             
             System.out.println("What is your budget?");
             int budget = inscan.nextInt();
             
             if (budget >= 10000){
                 System.out.println("Great! Hyundai Elantra is available for.");
                 System.out.println("Do you have insurance? Write 'yes' or 'no'");
                 inscan.nextLine();
                 String insurance = inscan.nextLine();
                 if(insurance.equals("yes")){
                     System.out.println("Do you have a license? Write 'yes' or 'no.'");
                     String License = inscan.nextLine();
                     if(License.equals("yes")){
                         System.out.println("What is your credit score?");
                         int creditScore = inscan.nextInt();
                         if(creditScore > 660){
                             System.out.println("Congratulations! you are approved! Pleasure doing business with you!");
                         }
                         else{
                             System.out.println("We're sorry. You are not eligible.");
                         }
                     }
                     else if (License.equals("no")){
                         System.out.println("We're sorry. You are not eligible.");
                     }else{
                         System.out.println("Invalid Input");
                     }
                 }
                 else if ( insurance.equals("no")){
                     System.out.println("We're sorry. You are not eligible.");
                 }
                 else{
                     System.out.println("Invalid input");
                 }
             }
             else{
                 System.out.println("We're sorry. You are not eligible.");
             }
         }
         else if (entry.equals("b")){
             System.out.println("You choose to sell a car!");
             System.out.println("What is your car valued at?");
             int value = inscan.nextInt();
             System.out.println("What is selling price?");
             int price = inscan.nextInt();
             inscan.close();
             
             if (value > price && price < 30000){
                 System.out.println("We are interested. Pleasure doing business with you!");
             }
             else{
                 System.out.println("Sorry, we are not interested");
             }
         }
         else{
             System.out.println("Invalid entry "+entry);
         }
    }
}

//**********USING SWITCH METHOD********

