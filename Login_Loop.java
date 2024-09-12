/*
 * Prajeet Bohara
 * 12/20/2023
 * P7: Id, pass login
 */

import java.util.*;
import javax.swing.*;

public class Login_Loop {

    public static void main(String[] args) 
    {
       Random rand = new Random();
       Scanner inscan = new Scanner(System.in);
        System.out.println("Username:");
        String name = inscan.nextLine();
        System.out.println("Password:");
        int pass = inscan.nextInt();
        
        while(!name.equals("John")&& pass!= 123){
            System.out.println("Incorrect! Try Again\n");
            System.out.println("Username");
            inscan.nextLine();
            name = inscan.nextLine();
            System.out.println("Password:");
            pass = inscan.nextInt();
        }
        System.out.println("\nPERMISSION GRANTED!");
    }
  }
    