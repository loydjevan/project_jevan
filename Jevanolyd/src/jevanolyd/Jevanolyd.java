/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jevanolyd;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Jevanolyd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Scanner input =new Scanner(System.in);
     System.out.println("Enter a number");
     int a =input.nextInt();
     System.out.println(a);
     
    if (a >= 1 && a <= 10) {
        System.out.println("numbers betwwen 1 and 10");
        System.out.println("enter to numbers");
        System.out.print("enter number 1:");
        int x = input.nextInt();
        System.out.println("enter nember 2:");
        int y = input.nextInt();
        
        int sum=x+y;
        System.out.println("the sum is:"+sum);
    
     
    }  if (a >=11 && a <= 20) {
         System.out.println("numbers between 11 and 20");
         System.out.println("enter to numbers");
        System.out.print("enter number 1:");
        int x = input.nextInt();
        System.out.println("enter nember 2:");
        int y = input.nextInt();
        
        int difference=x-y;
        System.out.println("the difference is:"+difference);
    
         }  if (a >=21 && a <= 30) {
         System.out.println("numbers between 21 and 30");
         System.out.println("enter to numbers");
        System.out.print("enter number 1:");
        int x = input.nextInt();
        System.out.println("enter nember 2:");
        int y = input.nextInt();
        
        int quotient=x/y;
        System.out.println("the quotient is"+quotient);
    
         }  if (a >=31 && a <= 40) {
         System.out.println("numbers between 31 and 40");
         System.out.println("enter to numbers");
        System.out.print("enter number 1:");
        int x = input.nextInt();
        System.out.println("enter nember 2:");
        int y = input.nextInt();
        
        int product=x*y;
        System.out.println("the product is"+product);
    
    
   
    
    
    
    }else if (a == 21 || a == 22) {
         System.out.println("a is equal to 21 or 22");
         
           
         
     }
     
    }
    
}
