/*
 * Prajeet Bohara
 * 01/01/2024
 * P12: Hangman
 */

import java.util.*;

public class Hangman {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        Random rand = new Random ();
        int newWord = rand.nextInt(49);
        String wordArray = word(newWord);
        String []word = new String[wordArray.length()];
        String[]blanks = new String[wordArray.length()];
        for (int i=0; i < blanks.length; i++){
            blanks[i]= "_";
        }
        for (int i=0; i < word.length; i++){
            word[i]= String.valueOf(wordArray.charAt(i));
        }
        String[] misses = {" "," "," "," "," "," "};
        
        int guessedScore = 0;
        int missScore = 0;
        
        while (guessedScore < wordArray.length() && missScore < 6){
        System.out.println("\nGuess: ");
        String input = scan.nextLine();
       
        for (int i=0; i < word.length; i++){
            if (input.equals(word[i])){
                blanks[i]= input;
                guessedScore ++;
                break;
            }
        }
        
     
        boolean missed = misses(word,input);
        if (missed){
            missScore += 1;
            misses[missScore-1]= input;
        }
        drawMan(missScore);
        
        System.out.print("Word:  ");
         printBlank(blanks);

        System.out.print("\nMisses:  ");
            printMiss(misses);
           
        
   
      }
        if (guessedScore == 5){
            System.out.println("\nYou Won!");
        }
        if (missScore == 6){
            System.out.println("\nYou Lose");
            System.out.print("The correct word is ' ");
            printWord(word);
            System.out.println("'");
        }
        scan.close();
        
            
            
    }
    public static boolean misses(String[]array, String input){
        for(int i=0; i < array.length; i++){
            if (array[i].equals(input)){
                return false;
            }
           
        }
         return true;
    }
    public static void printMiss(String[]array){
        for (int i=0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void printBlank(String[]array){
        for (int i=0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void printWord(String[]array){
        for (int i=0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void drawMan(int miss){
        switch(miss){
            case 0:
                System.out.println(""
  + "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n");
                break;
            case 1:
                System.out.println(""
  + "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n");
                break;
            case 2:
                System.out.println(""+

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n");
                break;
            case 3:
                System.out.println(""+

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n");
                break;
            case 4:
                System.out.println(""+

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\ |\n" + 
    "     |\n" +
    "     |\n" +
    " =========\n");
                break;
            case 5:
                System.out.println(""+

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n");
                break;
            case 6:
                System.out.println(""+

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"); 
                break;
                
           
        }
    }
    
    public static String word(int num){
        String [] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};
        
        String word = words[num];
        return word;
    }
    
   }

