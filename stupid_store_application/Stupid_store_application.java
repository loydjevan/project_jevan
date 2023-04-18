
package stupid_store_application;

import java.util.Scanner;

public class Stupid_store_application {
    public static Scanner input = new Scanner(System.in);
    public static String again;
    public static int discount=1;
    public static int choose,quantity=1;
    public static double total=0,pay;
    
    public static void menu(){
   
    System.out.println("\t\t\t\t+=========================================+");
    System.out.println("\t\t\t\t           jevan MENU          ");
    System.out.println("\t\t\t\t   1. A5 Wagyu Steak       Php. 329.00");
    System.out.println("\t\t\t\t   2. Beluga Caviar        Php. 279.00");
    System.out.println("\t\t\t\t   3. Fourchu Lobster      Php. 349.00");
    System.out.println("\t\t\t\t   4. Tiger Fugu           Php. 250.00");
    System.out.println("\t\t\t\t   5. White Alba Truffle   Php. 229.00");
    System.out.println("\t\t\t\t+=========================================+");
        System.out.println("");
    System.out.println("\t\t\t\t   AVAIL OUR PROMO NOW!");
    System.out.println("\t\t   - Total order of Php 700.00 or more to get 1 pitcher of any drink of your choice!");
    System.out.println("\t\t   - Total order of Php 1500.00 or more get 1 order of Tiger Fugu it's on the house!!!");
    System.out.println("\t\t    Note: Can avail both promos at the same time.");
        System.out.println("");
    System.out.println("\t\t\t\t   We also offer discounts on the following:");
    System.out.println("\t\t\t\t     Code 1 - Couple discount ( 5% off )");
    System.out.println("\t\t\t\t     Code 2 - Birthday discount ( 10% off )");
    System.out.println("\t\t\t\t     Note: Discounts cannot be stacked");
    }
    
     public static void list1() {    
        switch (choose) {
            case 1 -> System.out.println("\t" + quantity + " A5 Wagyu Steak");
            case 2 -> System.out.println("\t" + quantity + " Beluga Caviar");
            case 3 -> System.out.println("\t" + quantity + " Fourchu Lobster");
            case 4 -> System.out.println("\t" + quantity + " Tiger Fugu");
            case 5 -> System.out.println("\t" + quantity + " White Alba Truffle");
            default -> {
            }
        }
  }
    public static void list2(){
        switch (choose) {
            case 1 -> System.out.println("\t" + quantity + " A5 Wagyu Steak");
            case 2 -> System.out.println("\t" + quantity + " Beluga Caviar");
            case 3 -> System.out.println("\t" + quantity + " Fourchu Lobster");
            case 4 -> System.out.println("\t" + quantity + " Tiger Fugu");
            case 5 -> System.out.println("\t" + quantity + " White Alba Truffle");
            default -> {
            }
        }
    }
    public static void list3(){
        switch (choose) {
            case 1 -> System.out.println("\t" + quantity + " A5 Wagyu Steak");
            case 2 -> System.out.println("\t" + quantity + " Beluga Caviar");
            case 3 -> System.out.println("\t" + quantity + " Fourchu Lobster");
            case 4 -> System.out.println("\t" + quantity + " Tiger Fugu");
            case 5 -> System.out.println("\t" + quantity + " White Alba Truffle");
            default -> {
            }
        }
    }
    public static void list4(){
        switch (choose) {
            case 1 -> System.out.println("\t" + quantity + " A5 Wagyu Steak");
            case 2 -> System.out.println("\t" + quantity + " Beluga Caviar");
            case 3 -> System.out.println("\t" + quantity + " Fourchu Lobster");
            case 4 -> System.out.println("\t" + quantity + " Tiger Fugu");
            case 5 -> System.out.println("\t" + quantity + " White Alba Truffle");
            default -> {
            }
        }
    }
    public static void list5(){
        switch (choose) {
            case 1 -> System.out.println("\t" + quantity + " A5 Wagyu Steak");
            case 2 -> System.out.println("\t" + quantity + " Beluga Caviar");
            case 3 -> System.out.println("\t" + quantity + " Fourchu Lobster");
            case 4 -> System.out.println("\t" + quantity + " Tiger Fugu");
            case 5 -> System.out.println("\t" + quantity + " White Alba Truffle");
            default -> {
            }
        }
    }
    
    public static void order(){
        System.out.println("");
        System.out.println("Enter 6: CANCEL");     
        System.out.println("Enter the number code of your order: "); choose = input.nextInt();
        System.out.println("");                
         
        switch (choose) {
 
            case 1:
                System.out.println("You chose A5 Wagyu Steak");
                System.out.println("Enter the quantity of your order: "); quantity =input.nextInt();   
                total = total +(quantity*329);
      break;
            
            case 2:
                System.out.println("You chose Beluga Caviar");
                System.out.println("Enter the quantity of your order: "); quantity =input.nextInt();         
                total = total +(quantity*279);        
       break;
           
            case 3:
                System.out.println("You chose Fourchu Lobster");
                System.out.println("Enter the quantity of your order: "); quantity =input.nextInt();               
                total = total +(quantity*349);
       break;
            
            case 4:
                System.out.println("You chose is Tiger Fugu");
                System.out.println("Enter the quantity of your order: ");
                quantity =input.nextInt();
                total = total +(quantity*250);
      break;
            
            case 5:
                System.out.println("You chose White Alba Truffle");
                System.out.println("Enter the quantity of your order: ");
                quantity =input.nextInt();
                total = total +(quantity*229);
      break;
            
            case 6:
                System.exit(0);
            
            default:
                System.out.println("Choose 1 to 6 only!");
                order();
        break;
        }
        
                if(total >=700){
                    System.out.println("You have 1 free pitcher of any drink of your choice!");
                }       
                if( total >=1500){
                    System.out.println("You have 1 order of Tiger Fugu it's on the house!!!");
                }
                              
                System.out.println("");
                System.out.println("Add more?");
                System.out.println("Enter 1 for Yes and 2 for No: ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    order();                
                }
                else{
                    System.out.println("\t---Discount List---");
                    System.out.println(" We also offer discount to the following:");
                System.out.println(" Code 1 - Couple discount ( 5% off )");
                System.out.println(" Code 2 - Birthday discount ( 10% off )");
                System.out.println(" Note: Discounts cannot be stacked");
                    System.out.println("");
                    System.out.println("Enter 3 if neither applicable");
                    System.out.println("Enter your Code: "); discount = input.nextInt();
                    if(discount ==1){
                        total = total*0.95;
                    }
                    if(discount ==2){
                        total = total*0.90;
                    }
                    if(discount==3){
                        System.out.println("No discount applicable");
                        total = total - 0;
                    }                                                               
                    System.out.println("");
                    System.out.println("The bill is Php " + total + "0");
                    System.out.println("Enter Cash: "); pay = input.nextDouble();
                    
                    if(pay <total){
                        System.out.println("---Input sufficient cash amount---");
                        System.out.println("Enter Cash: "); pay = input.nextDouble();
                    }  
                    if(pay <total){
                        System.out.println("---Input sufficient cash amount---");
                        System.out.println("Enter Cash: "); pay = input.nextDouble();
                    }
                    if(pay <total){
                        System.out.println("---Input sufficient cash amount---");
                        System.out.println("3 Consecutive input invalid cash amount");
                    }
                    else{
                        total = pay-total;
                        System.out.println("The change is Php " + total + "0");
                      }
                    }                            
                System.out.println("Order again?");
                System.out.println("Enter 1 for Yes and 2 for No: ");
                        choose = input.nextInt();
                        if(choose==1){
                            System.out.println("\t\t\t\t+=========================================+");
    System.out.println("\t\t\t\t           Jamielicious MENU          ");
    System.out.println("\t\t\t\t   1. A5 Wagyu Steak       Php. 329.00");
    System.out.println("\t\t\t\t   2. Beluga Caviar        Php. 279.00");
    System.out.println("\t\t\t\t   3. Fourchu Lobster      Php. 349.00");
    System.out.println("\t\t\t\t   4. Tiger Fugu           Php. 250.00");
    System.out.println("\t\t\t\t   5. White Alba Truffle   Php. 229.00");
    System.out.println("\t\t\t\t+=========================================+");
        System.out.println("");
    System.out.println("\t\t\t\t   AVAIL OUR PROMO NOW!");
    System.out.println("\t\t   - Total order of Php 700.00 or more to get 1 pitcher of any drink of your choice!");
    System.out.println("\t\t   - Total order of Php 1500.00 or more get 1 order of Tiger Fugu it's on the house!!!");
    System.out.println("\t\t    Note: Can avail both promos at the same time.");
        System.out.println("");
    System.out.println("\t\t\t\t   We also offer discounts on the following:");
    System.out.println("\t\t\t\t     Code 1 - Couple discount ( 5% off )");
    System.out.println("\t\t\t\t     Code 2 - Birthday discount ( 10% off )");
    System.out.println("\t\t\t\t     Note: Discounts cannot be stacked");
    total=total-total;
                            order();}
                        else{System.exit(0);}    
    }     
   
    public static void main(String[] args) {    
       menu();
       order();       
    }
    
}
