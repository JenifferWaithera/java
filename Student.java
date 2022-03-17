/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import java.util.Scanner;

/**
 *
 * @author Waithera
 */
public class Student {

  
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner in = new Scanner(System.in);
         
        System.out.print("Enter name of student: ");
        String n = in.nextLine();
        System.out.print("Enter subject names: ");
        String s = in.nextLine();
        System.out.print("Enter marks in 1st subject: ");
        int m1 = in.nextInt();
        System.out.print("Enter marks in 2nd subject: ");
        int m2 = in.nextInt();
        System.out.print("Enter marks in 3rd subject: ");
        int m3 = in.nextInt();
        System.out.print("Enter marks in 4th subject: ");
        int m4 = in.nextInt();
        System.out.print("Enter marks in 5th subject: ");
        int m5 = in.nextInt();
        
       
        
    }
}
    

