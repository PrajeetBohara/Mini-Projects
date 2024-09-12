/*
 * Prajeet Bohara
 * 12/14/2023
 * P5: The Royal Bank of Java
 */

import java.util.*;

public class Trivia_Quiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int score = 0;
        System.out.println("What is your name?");
        String name = scan.nextLine();
        
        System.out.println("Welcome to Trivia Quiz!");
        System.out.println("Type 'yes' to start the quiz or 'no' to end");
        String start = scan.nextLine();
        if (start.equals("yes")){
            System.out.println("1. Who is the chief scientist of the current AI company 'OpanAI'?");
            System.out.println("a.Elon Musk \nb.Sam Altman \nc.Iliya \nd.Lex Fridman");
            String answer_a = scan.nextLine();
            
            System.out.println("2.What is the capital of Nepal?(Bonus = 2)");
            System.out.println("a.Kathmandu \nb.Lake Charles \nc.Bhaktapur \nd.Gulariya");
            String answer_b = scan.nextLine();
            
            if (answer_a.equals("c")|| answer_a.equals("c.")){
                score ++;
            }
            if (answer_b.equals("a")|| answer_b.equals("a.")){
                score += 2;
            }
            scan.close();
        }
       else{
            System.out.println("Thanks for stopping by!");
          }
        System.out.println("Thank you for playing trivia quiz "+name+ 
                ". Your total score is "+ score+".");
        
        System.out.println("\nThe correct answers are:"
                + "\nQ.1 = c \nQ.2 =a");
        
        
    }
}

//System.out.println("1. Who is the chief scientist of the current AI company 'OpanAI'?");
//            System.out.println("a.Elon Musk \nb.Sam Altman \nc.Iliya \nd.Lex Fridman");
//            String answer_a = scan.nextLine();
//            if (answer_a.equals("a") || answer_a.equals("b")|| answer_a.equals("c")|| answer_a.equals("d")){
//                score ++;
//                System.out.println("What is the capital of Nepal?(Bonus = 2");
//                System.out.println("a.Kathmandu \nb.Lake Charles \nc.Bhaktapur \nd.Gulariya");
//                String answer_b = scan.nextLine();
//                if (answer_b.equals("a")||answer_b.equals("b")||answer_b.equals("c")||answer_b.equals("d")){
//                    score += 2;
//                    System.out.println("Congratulations, "+name+" You scored "+score);
//                }
//                else{
//                    System.out.println("Wrong input. Please only type 'a' or 'a.'!");
//                }
//            }
//            else{
//                System.out.println("Wrong input. Please only type 'a' or 'a.'!");
//            }
//            
//        }