/*
 * Java Chatbot
 * Prajeet Bohara
 * 12/7/2023
 * Project 2
 */

import java.util.Scanner;

public class Java_Chatbot {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
         String intro = "Hello! welcome to Java Chatbot.\n"
            + "I'm the chatbot!"
            + "\nLet's know each other first.";
    
          System.out.println(intro);
          
          System.out.println("What is your name?");
          String name = scan.nextLine();
          
          System.out.println("Hello "+name+" Nice meeting you."
                  + "I'm a Java Chatbot created by Prajeet.");
          System.out.println("Where are you from?");
          String place = scan.nextLine();
          
          System.out.println("Great!!, I know "+place+", It is a really beautiful place!");
          
          System.out.println("I think we will be having a great conversation.");
          System.out.println("Let me ask you, how old are you?");
          int age = scan.nextInt();
          System.out.println("Okay, guess what, you are "+(400-age)+" years younger than me."
                  + " I'm 400 years old.");
          
          System.out.println("What is your favorite programming language? Please dont say Python");
          scan.nextLine();//To avoid the next line trap.
          
          String language = scan.nextLine();
          System.out.println("Okay "+name+" I gotta go now. Catch you next time, Prajeet have to do some"
                  + " configuration on me. So, logging OFF!!");
    }
    
   
    
}
