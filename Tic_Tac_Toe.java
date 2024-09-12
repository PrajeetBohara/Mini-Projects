/*
 * Prajeet Bohara
 * 12/29/2023
 * P11: Tic Tac Toe
 */

import java.util.*;

public class Tic_Tac_Toe {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        System.out.println("Let's play tic tac toe:");
        
        String [][] board = {
                {"-","-","-"},
                {"-","-","-"},
                {"-","-","-"}
        };
        
        printBoard(board);
        
    for (int i = 0; i < 9; i ++)
    {
         int value = i%2;
            
         if (value == 0){
         System.out.println("Turn: X");
         System.out.println("Pick a row and column number:");
         int x_row = scan.nextInt();
         int x_column = scan.nextInt();
             if(board[x_row][x_column].equals("-")){
             board[x_row][x_column] = "x";
                   }
             else{
             System.out.println("Spot taken, try again");
              }
              printBoard(board);
         }
         else{
           System.out.println("Turn: o");
           System.out.println("Pick a row and column number:");
           int x_row = scan.nextInt();
           int x_column = scan.nextInt();
                 if(board[x_row][x_column].equals("-")){
                 board[x_row][x_column] = "o";
                    }
                 else{
                 System.out.println("Spot taken, try again");
                        }
                  printBoard(board);
              }
 
       }
        System.out.println("Here is the final board:\n");
         printBoard(board);
       int count = 0;  
       int score = 0;
       for (int i=0; i < board.length; i++){
           for (int j = 0; j < board[i].length; j++){
               if (board[i][j].equals("x")){
                   count +=1;
               }
               else{ 
                  count += -1;
                   }
           }
           if (count == 3){
               score += 1;
           }
           else{
               score += 0;
           }
          
       }
       
    }
    public static void printBoard(String [][]board){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
