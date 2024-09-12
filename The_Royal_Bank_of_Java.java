/*
 * Prajeet Bohara
 * 12/14/2023
 * P4: The Royal Bank of Java
 */

import java.util.*;

public class The_Royal_Bank_of_Java {
    public static void main(String[] args) {
        
        Scanner inscan = new Scanner (System.in);
        
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        
        String mortgage = inscan.nextLine();
        
        if (mortgage.equals("yes")){
            System.out.println("How much do you have in your savings?"
                    + "How much do you owe in credit card?");
            int savings = inscan.nextInt();
            int credit = inscan.nextInt();
            
            if (savings >= 10000 && credit < 5000){
                System.out.println("How many years have you worked for?");
                int time = inscan.nextInt();
                if(time > 2){
                    System.out.println("What is your name?");
                    inscan.nextLine();
                    String name = inscan.nextLine();
                    System.out.println("Congratulations! "+name+", you have been approved!");
                }
                else{
                    System.out.println("OK! Thanks for stopping by. Have a nice day!!");
                }
            }
            else{
                System.out.println("OK! Thanks for stopping by. Have a nice day!!");
            }
        }
        else{
            System.out.println("OK! Thanks for stopping by. Have a nice day!!");
        }
    }
}
