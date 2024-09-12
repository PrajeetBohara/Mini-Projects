/*
 * Dice Project
 * Prajeet Bohara
 * 12/18/2023
 */

import java.util.*;
import javax.swing.*;

public class DiceJack {
        
    public static void main(String[] args) {
        
        Scanner inscan = new Scanner(System.in);
        
        JOptionPane.showMessageDialog(null,"Title","Enter 3 numbers", 0);
        int num1 = inscan.nextInt();
        int num2 = inscan.nextInt();
        int num3 = inscan.nextInt();
        int sum = num1 + num2 + num3;
        int difference = 
        System.out.println("Now rolling the dice 3 times");
    }
    public static double rollDice(){
        
        Random rand = new Random();
        
        int d1 = rand.nextInt(6);
        int d2 = rand.nextInt(6);
        int d3 = rand.nextInt(6);
        
        System.out.println("your random numbers are "+d1 + d2 + d3);
        int dice = d1 + d2 + d3;
        return dice;
               
    }
}
