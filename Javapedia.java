/*
 * Prajeet Bohara
 * 12/28/2023
 * P10: Javapedia
 */

import java.util.*;

public class Javapedia {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many historical figures will you register?");
        int num = keyboard.nextInt();
        
        String [][] database = new String [num][3];
        
        for (int i = 0; i < database.length; i++){
            keyboard.nextLine();
            System.out.println("Name: ");
            database[i][0] = keyboard.nextLine();
            System.out.println("Date of Birth: ");
            database[i][1] = keyboard.nextLine();
            System.out.println("Occupation: ");
            database[i][2] = keyboard.nextLine();
        }
        printArray(database);
    }
    public static void printArray(String[][]database){
        System.out.println("These are the values you stored:");
        System.out.println("\t"+database[0][0]+" "+database[0][1]+" "+database[0][2]);
        System.out.println("\t"+database[1][0]+" "+database[1][1]+" "+database[1][2]);
        System.out.println("\t"+database[2][0]+" "+database[2][1]+" "+database[2][2]);
    }
}
//Task is also to retrieve the data. Look over javapedia in array one for task and also for solution if found struggle.
