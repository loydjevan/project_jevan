/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jevanloyd;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Jevanloyd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
            int square;
            System.out.println("Enter a number");

            int a = input.nextInt();
            square = a * a;
            System.out.println(square);

            if (square >= 36 && square <= 199) {
                System.out.println("The number belongs between 36 and 199! \n enter  number: \n");
                int x = input.nextInt();

                int cube = x * x * x;

                int sum= square + cube;
                
                System.out.println(sum + "the sum is:" + sum);

            }
            else{
                System.out.println("the number if squared will not belong between 36 and 199");
            }
    
    }
    
}
