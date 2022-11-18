import java.util.Scanner;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class Resturant {
    private static ArrayList<Orders>  orders = new ArrayList<>();
    private static ArrayList<Food> menu = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    String[] PossibleStatuses;
    PossibleStatuses = new String[];
   


    

    
    

    public static void main(String[] args){

        int choice = 1;
        while(choice >0){
            System.out.println();
            System.out.println();
            System.out.println("Where will you being dining tonight?");
            System.out.println("1) Dine-In");
            System.out.println("2) Takeout");
            System.out.println("3) Delievery");
            System.out.println("4) List Orders");
            System.out.println("5) Update Order");
            System.out.println("0. Exit");
            choice = sc.nextInt();
            sc.nextLine();




            switch(choice){ 
                case 1:
                System.out.println("TableOrder code goes here");//TODO 
                break;
                case 2:
                System.out.println("TakeoutOrder goes here"); //TODO 
                break;
                case 3:
                System.out.print("Customer Name: ");
                String customer = sc.nextLine();
                System.out.print("Address: ");
                String addr =sc.nextLine();
                System.out.print("Phone: ");
                String phone = sc.nextLine();
                ArrayList<Food> dishes = getDishes();//TODO
                DeliveryOrder  o = new DeliveryOrder(customer, addr, phone);
                o.setDishes(dishes);
                orders.add(o);

                break;
                case 4:
                choice = 4;
                while(choice <1 || choice > 3){
                    System.out.println("Sort by:  1.Order number 2)Type 3)Status ");
                    choice = sc.nextInt();
                    sc.nextLine(); 
                }    
                listOrders(choice);//TODO
                break;
                case 5:
                choice = 5;
                System.out.println("Update Order:");
                System.out.println("1)Update Status");
                System.out.println("2) Add Dish");
                System.out.println("3) Remove Dish");
                System.out.println("4) Cancel Order");
                System.out.println(); 
                System.out.println("Choice: ");
                int choice2 = sc.nextInt();
                sc.nextLine();

                if (choice2 == 1) {
                    optionUpdateStatus(orders);
                } else if (choice2 == 2) {
                    optionAddDish(orders);
                } else if (choice2 == 3) {
                    optionRemoveDish(orders);
                } else if (choice2 == 4) {
                    optionCancelOrder(orders);
                }
            }



            }

            ArrayList<Food> menu = new ArrayList<>();
            menu.add(new Food("Pizza", 5));
            menu.add(new Food("Ice Cream", 3));
            menu.add(new Food("Salad",7));
            menu.add(new Food("Sandwich",12));
            menu.add(new Food("Cake",8));

    





            public static ArrayList<Food> getDishes(){//TODO
                ArrayList<Food>  Dishes =new ArrayList<>();
                int ans = 1;
                while(ans !=0){
                    for(int i = 0; i < menu.size();i++){
                        System.out.println(i+1+" "+menu.get(i));
                    }
                    System.out.println("Enter Choice (-1 to exit): ");
                    ans = sc.nextInt();
                    sc.nextLine();
                    if(ans > 0 && ans <=menu.size()){
                        menu.add(menu.get(ans));
                    }
                    else if(ans== -1){
                        break;
                    }else{
                        System.out.println("Invalid choice");
                    }
                }
                return Dishes;//TODO
    





                public static void listOrders(int n){                   //TODO
                    if(n == 1){
                    }else if(n == 2){
                        HashSet<String> orderTypes = new HashSet<>();
                        for(Orders o: orders)
                            orderTypes.add(getType(o));
            
                        for(String orderType:  orderTypes){
                            for(Orders o: orders){
                                if(getType(o).equals(orderType)){
                                    System.out.println(o);
                                }
                            }
                        }
            
            
                    }else if(n == 3){//Print orders by status TODO
            
                    }
                }
            




            private static String getType(Orders o) {//TODO
                
            }
    
        }

    

 
}

    public String[] getPossibleStatuses(){
    String[] s= {"Placed", "Cooking", "Served", "Canceled"};
    return s;
    
}



    private static void optionUpdateStatus(ArrayList<Orders> orders2) {
       
        System.out.print("Updating Status...");
        for(String i=0; i<PossibleStatuses.length;)
        orders2.getPossibleStatuses(i+1);

    }

    private static void optionAddDish(ArrayList<Orders> orders2){
        System.out.println("Add a Dish");
        System.out.println(menu);
        String d = sc.nextLine();
        orders2.add(d);
      
    }

    private static void optionRemoveDish(ArrayList<Orders> orders2){
        System.out.println("Remove a Dish");
        ArrayList<Orders> orderToRemove= r.getDishes();
        for (int index = 0; index < Orders.size(); index++) {
            System.out.println(index + " " + Orders.get(index));
        System.out.println("Choice:");
        int ans = sc.nextInt();
        Orders c = orders.get(ans);
        r.removeDish(c);
    }

    private static void optionCancelOrder(ArrayList<Orders> orders2){
        System.out.println("Canceling Order");
        //HOW DO I DO THIS
    }



   
}
