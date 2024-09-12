/*
 * Prajeet Bohara
 * 12/21/2023
 * P9: BlackJack
 */
 
import java.util.*;

public class BlackJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int playerCard1 = card();
        int playerCard2 = card();
        int playerSum = Math.min(playerCard1, 10) + Math.min(playerCard2,10);//There is no card counted as 11, 12 or 13 in Black jack so any value higher than 10, we are taking as 10 using builtin math function)
        System.out.println("Your card 1:\n "+ cardImages(playerCard1));
        System.out.println("Your card 2:\n "+ cardImages(playerCard2));
        
        int dealerCard1 = card();
        int dealerCard2 = card();
        int dealerSum = Math.min(dealerCard1,10) + Math.min(dealerCard2, 10);
        System.out.println("Dealer's card 1: \n"+ cardImages(dealerCard1));
        System.out.println("Dealer's card 2: \n"+ faceDown());
        
        if (playerSum == 21){
            System.out.println("You Won");
            System.exit(0);
        }
        
        System.out.println("You wanna 'hit' or 'stay' ?");
        String userInput = scan.nextLine();
        
        if (userInput.equals("hit")){
            while(userInput.equals("hit")){
                int playerCard3 = card();
                System.out.println("Your third card is: \n"+ cardImages(playerCard3));
                int playerTotal = dealerSum + Math.min(playerCard3,10);
                System.out.println("your total is "+ playerTotal);
                if ( playerTotal > 21){
                    System.out.println("You Lose. Your total is more than 21");
                    break;
                }
                else{
                System.out.println("'Hit' or 'Stay'");
                userInput = scan.nextLine();
                }
            }
          }
         else if (userInput.equals("stay")){
                System.out.println("Its dealers turn now");
                if (dealerSum <= 17){
                    System.out.println("You Lose, Dealer Won!!");
                }
                else if (dealerSum >= 21){
                    System.out.println("You Won!");
                }
                else{
                    int dealerTotal = dealerSum;
                    while (dealerTotal < 21){
                        int dealerCard3 = card();
                        System.out.println("Dealer's third card is: \n"+ cardImages(dealerCard3));
                        dealerTotal += Math.min(dealerCard3,10);
                    }
                    System.out.println("Dealer lost, You WOn!");
                }
              
           }
            else {
                    System.out.println("Wrong input. Please enter either 'hit' or 'stay'");
                    
            }
           scan.close();
         
      
    }
    public static int card(){
        Random rand = new Random();
        int num = rand.nextInt(13)+1;
        return num;
        
    }
    public static String faceDown(){
        String hiddenCard =      "   _____\n"+
                           "  |     |\n"+ 
                           "  |  J  |\n"+
                           "  | JJJ |\n"+
                           "  |  J  |\n"+
                           "  |_____|\n";
        return hiddenCard;
    }
    public static String cardImages(int cardNum){
        
        switch(cardNum){
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
             return "Invalid Card Number";
        }

    }
}
