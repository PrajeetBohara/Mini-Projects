/*
 * Prajeet
 * 12/05/2023
 * Project 1
 */

import java.util.*;

public class Number_Guesser {
    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner (System.in);
        Random randGen = new Random();
        
        System.out.println("Think of a Random Number");
        System.out.println("Press Y when you are ready!");
        String response1 = scanner.nextLine();
        if (response1.equalsIgnoreCase("y")){
            System.out.println("Now double this number!");
            System.out.println("Press Y when you are ready!");
            String response2 = scanner.nextLine();
            if (response2.equalsIgnoreCase("y")){
                int randomNumber = randGen.nextInt();
                System.out.println("Now add "+ randomNumber+ " to this number!");
                System.out.println("Press Y when you are ready!");
                String response3 = scanner.nextLine();
                if(response2.equalsIgnoreCase("y")){
                    System.out.println("Now half this number that you have in "
                            + "your mind");
                    System.out.println("Press Y when you are ready!");
                    String response4 = scanner.nextLine();
                    double finalr = ((double)randomNumber/2);
                    System.out.println("VIOALA the number in your mind is "+ finalr);
                }
            }
        
    }
        
        
    } 
   
}
