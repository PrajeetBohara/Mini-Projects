/*
 * Rock, Papers and Scissors
 * Prajeet Bohara
 * 12/19/2023
 */

import java.util.*;

public class RockPaperScissors {
 
    public static void main(String[] args) {
        
         Scanner inscan = new Scanner(System.in);
        System.out.println("Let's Play Rock, Papers, Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.");
        
        System.out.println("Are you ready? Write 'yes' if you are.");
        String response = inscan.nextLine();
        if(response.equals("yes")){
          for (int dex = 0; dex < 3; dex ++){  
            String human1 = humanChoice();
            System.out.println("You choose "+ human1);
            String comp1 = compChoice();
            System.out.println("The computer choose "+ comp1);
            String result = score(human1, comp1);
            System.out.println(result);
            int humanLeaderboard = HumanPoints(result);
            int compLeaderboard = compPoints(result);
              System.out.println("Your score is "+ humanLeaderboard
              +"Computer score is "+ compLeaderboard);
          }
        }
        else{
            System.out.println("Aight!, see ya next time boi!");
        }
    }
    public static String humanChoice(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Great!"
                    + "rock-paper-scissors, shoot!");
        String human = scan.nextLine();
        return human;
    }
    public static String compChoice(){
        Random rand = new Random();
        int num = rand.nextInt(2);
        switch(num){
            case 0:
                return "rock";
                
            case 1:
                return "paper";
                
            case 2:
                return "scissors";
                 
            default:
                return "invalid";
               
        }
    }
    public static String score(String human1, String comp1){
        if ((human1.equals("paper")&& comp1.equals("rock"))|| (human1.equals("rock") && comp1.equals("scissors")) || (human1.equals("scissors")&& comp1.equals("paper"))){
            return "You Win";
        }
        else if ((comp1.equals("rock")&& human1.equals("scissors"))|| (comp1.equals("paper")&& human1.equals("rock"))|| (comp1.equals("scissors")&& human1.equals("paper"))){
            return "you lose";
        }
        else if ((comp1.equals(human1))){
            return "Its a tie";
        }
        else{
           return "something is invalid";
             }
        }
    public static int HumanPoints(String result){
        int humanScore = 0;
        switch (result){
            case "You Win":
                humanScore += 1;
                return humanScore;
                
            case "you lose":
                humanScore = 0;
                return humanScore;
            case "Its a tie":
                humanScore += 1;
                return humanScore;
            default :
                return 0;
        }
    }
        public static int compPoints(String result){
            int compScore = 0;
        switch (result){
            case "You Win":
                compScore = 0;
                return compScore;
                
            case "you lose":
                compScore += 1;
                return compScore;
            case "Its a tie":
                compScore += 1;
                return compScore;
            default:
                return 0;
        }
          
    }
 }

