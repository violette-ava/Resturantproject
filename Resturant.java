import java.util.Scanner;
import java.util.Scanner;
import java.util.ArrayList;

public class Resturant {
    static Scanner sc = new Scanner(System.in);
    private static ArrayList<Food> menu;
    private static ArrayList<Orders> orders;
    
    

    public static void main(String[] args){
        ArrayList<Food> menu = new ArrayList<>();
        menu.add(new Food("Pizza", 5));//DO THIS FOR ALL OF THEM
        menu.add("Ice Cream");
        menu.add("Salad");
        menu.add("Sandwich");
        menu.add("Cake");
       
        System.out.print("Welcome To My Resturant");

        
        int choice = 1;
        while(choice >0){
            System.out.println();
            System.out.println();
            System.out.println("Where will you being dining tonight?");
            System.out.println("1) Dine-In");
            System.out.println("2) Takeout");
            System.out.println("3) Delievery");
            System.out.println("4) Exit");
            System.out.println();
           
            choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1){
                optionOne();
            }
            else if(choice == 2){
                optionTwo();
            }
            else if(choice == 3){
                optionThree();
            }
            else if(choice == 4){ //USE TEAMS PROJECT
                optionFour();
            }

           

            



           

        }
        










    }


    private static void optionThree() {
        System.out.println("Thank you for choosing to Deliver");
        System.out.print("Customer Name: ");
        String CustomerName = sc.nextLine();
        System.out.print("Address: ");
        String addr =sc.nextLine();
        System.out.print("Phone: ");
        String phone = sc.nextLine();
        ArrayList<Food> dishes = getmenu();//This function is inside  of Restaurant
        DeliveryOrder  o = new DeliveryOrder(customer, addr, phone);
        o.setDishes(dishes);
        orders.add(o);
        
    }


    private static void optionTwo() {
        System.out.println("Thank you for choosing to Takeout");
        System.out.println("What would you like to order?");
        System.out.println(menu);
        int choice = 1;
        choice = sc.nextInt();
        sc.nextLine();
        switch(choice){
            System.out.println(//TAKEOUT ORDER CODE");
        }

    }


    private static void optionOne() {
        System.out.println("Thank you for choosing to Dine-In");
        System.out.println("What would you like to order?");
        System.out.println(menu);
        int choice = 1;
        choice = sc.nextInt();
        sc.nextLine();
        switch (choice){
            System.out.println(//TABLE ORDER CODE)
            
        }
       
        }

    



    }


  
    
}
