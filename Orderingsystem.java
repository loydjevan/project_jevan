/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class Orderingsystem {
    
    public static Scanner input = new Scanner(System.in);
    public static String again;
    public static int choose,quantity=1;
    public static double total=0,pay;
    public static void menu(){
    System.out.println("\t\t\t\t+===================================+");
    System.out.println("\t\t\t\t           Viand  menu        ");
    System.out.println("\t\t\t\t   1. Sari-sari  Php. 30");
    System.out.println("\t\t\t\t   2. Humba  Php. 50");
    System.out.println("\t\t\t\t   3. Giniling   Php. 40");
    System.out.println("\t\t\t\t   4. Fried Chicken   Php. 40");
     System.out.println("\t\t\t\t   5. Bulalo   Php. 100");
    System.out.println("\t\t\t\t   6. CANCEL                         ");
    System.out.println("\t\t\t\t+====================================+");
    }
    
    public static void order(){
    System.out.println("Press 1 to Sari-Sari , Press 2 to Humba, Press 3 to Giniling,Press 4 to Fried chicken, Press 5 to Bulalo, and Press 6 to Cancel");
    System.out.print("Press you want to buy? :");
    choose = input.nextInt();
        //conditions
        switch (choose) {
            case 1:
                System.out.println("You Choose Sari-Sari");
                System.out.print("How much Sari-Sari you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*30);
                System.out.println("You want to buy again? ");
                System.out.println("Press Y for Yes and N for N : ");
                again = input.next();
                if(again.equalsIgnoreCase("Y")){
                    order();//call the method you to create
                }else{
                    System.out.println("Enter a payment ");
                    pay = input.nextDouble();
                    if(pay <=total){
                        System.out.println("Not enough payment");
                    }else{
                        System.out.println("Total price is " + total);
                        total = pay-total;
                        System.out.println("The change is " + total);
                    }
                }       break;
            case 2:
                System.out.println("You choose Humba");
                System.out.print("How much HUmba you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*50);
                System.out.println("You want to buy again? ");
                System.out.println("Press Y for Yes and N for N : ");
                again = input.next();
                if(again.equalsIgnoreCase("Y")){
                    order();//call the method you to create
                }else{
                    System.out.println("Enter a payment ");
                    pay = input.nextDouble();
                    if(pay <=total){
                        System.out.println("Not enough payment");
                    }else{
                        System.out.println("Total price is " + total);
                        total = pay-total;
                        System.out.println("The change is " + total);
                    }
                }       break;
            case 3:
                System.out.println("You choose Giniling");
                System.out.print("How much Giniling you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*40
                        );
                System.out.println("You want to buy again? ");
                System.out.println("Press Y for Yes and N for N : ");
                again = input.next();
                if(again.equalsIgnoreCase("Y")){
                    order();//call the method you to create
                }else{
                    System.out.println("Enter a payment ");
                    pay = input.nextDouble();
                    if(pay <=total){
                        System.out.println("Not enough payment");
                    }else{
                        System.out.println("Total price is " + total);
                        total = pay-total;
                        System.out.println("The change is " + total);
                    }
                }       break;
                 case 4:
                System.out.println("You choose Fried Chicken");
                System.out.print("How much Fried Chicken you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*40
                        );
                System.out.println("You want to buy again? ");
                System.out.println("Press Y for Yes and N for N : ");
                again = input.next();
                if(again.equalsIgnoreCase("Y")){
                    order();//call the method you to create
                }else{
                    System.out.println("Enter a payment ");
                    pay = input.nextDouble();
                    if(pay <=total){
                        System.out.println("Not enough payment");
                    }else{
                        System.out.println("Total price is " + total);
                        total = pay-total;
                        System.out.println("The change is " + total);
                    }
                }       break;
                case 5:
                System.out.println("You choose Bulalo");
                System.out.print("How much Bulalo you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*100
                        );
                System.out.println("You want to buy again? ");
                System.out.println("Press Y for Yes and N for N : ");
                again = input.next();
                if(again.equalsIgnoreCase("Y")){
                    order();//call the method you to create
                }else{
                    System.out.println("Enter a payment ");
                    pay = input.nextDouble();
                    if(pay <=total){
                        System.out.println("Not enough payment");
                    }else{
                        System.out.println("Total price is " + total);
                        total = pay-total;
                        System.out.println("The change is " + total);
                    }
                }       break;
            case 6:
                System.exit(0);//close program
            default:
                System.out.println("Choose 1 to 6 only!");
                order();
                break;
        }
    }
    public static void main(String[] args) {
       menu();
       order();
  
}

}

