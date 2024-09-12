/*
 * Prajeet Bohara
 * 12/21/2023
 * P8: Pokerito
 */

import java.util.*;
public class Pokerito {
    public static void main(String[] args) {
        Scanner scanText = new Scanner(System.in);
        
        System.out.println("Let's play Pokerito. Type anything when you're ready.\n" +
"It's like Poker, but a lot simpler.\n" +
"- There are two players, you and the computer.\n" +
"- The dealer will give each player one card.\n" +
"- Then, the dealer will draw five cards (the river)\n" +
"- The player with the most river matches wins!\n" +
"- If the matches are equal, everyone's a winner!\n" +
"- Ready? Type anything if you are.");
  scanText.nextLine();
  int humanScore = 0;
  int compScore =0;
  
  String humanPick = card();
  String computerPick = card();
  
  while (humanPick.equals(computerPick)){
      humanPick = card();
      computerPick = card();   
  }
  System.out.println("This is your card:\n"+ humanPick);
  System.out.println("This is computer's card:\n"+ computerPick);
  
  System.out.println("Now the dealer will pick 5 random cards!");
  for (int count = 1; count < 6; count ++){
      String dealer = card();
      System.out.println("Card "+count+":\n");
      System.out.println(dealer);
      if (dealer.equals(humanPick)){
          humanScore += 1;
      }
      if(dealer.equals(computerPick)){
          compScore += 1;
      }
    
  }
        System.out.println("Your matches :"+ humanScore);
        System.out.println("Computer matches :"+ compScore);
        
  if (humanScore > compScore){
      System.out.println("Congratulations you won!!");
  }
  else if (humanScore < compScore){
           System.out.println("You Lose, Computer won!");
           }
  else {
      System.out.println("It's a tie!");
  }
  
    }
    public static String card(){
        Random rand = new Random();
        int num = rand.nextInt(13)+1;
        switch(num){
            case 1:
            return "   _____\n"+
                   "  |A _  |\n"+ 
                   "  | ( ) |\n"+
                   "  |(_'_)|\n"+
                   "  |  |  |\n"+
                   "  |____V|\n";
            
            case 2:
             return "   _____\n"+              
                    "  |2    |\n"+ 
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n";
             
            case 3:
           return "   _____\n" +
                  "  |3    |\n"+
                  "  | o o |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____E|\n";
           
            case 4:
           return  "   _____\n" +
                   "  |4    |\n"+
                   "  | o o |\n"+
                   "  |     |\n"+
                   "  | o o |\n"+
                   "  |____h|\n";
           
            case 5:
            return  "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";
            
            case 6:
            return  "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";
            
            case 7:
            return  "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";
            
            case 8:
            return  "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";
            
            case 9:
             return "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";
             
            case 10:
             return "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";
             
            case 11:
             return "   _____\n" +
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n";
             
            case 12:
             return "   _____\n" +
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n";
             
            case 13:
             return "   _____\n" +
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n";
             
            default:
             return "Invalid Pick";

        }
      
    }
}
