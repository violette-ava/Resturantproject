import java.util.Scanner;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class Resturant {
    private static ArrayList<Order> orders = new ArrayList<>();
    private static ArrayList<Food> menu = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    String[] PossibleStatuses;

    public static void main(String[] args) {


        
        menu.add(new Food("1) Pizza", 5));
        menu.add(new Food("2) Ice Cream", 3));
        menu.add(new Food("3) Salad", 7));
        menu.add(new Food("4) Sandwich", 12));
        menu.add(new Food("5) Cake", 8));

        int choice = 1;
        while (choice > 0) {
            System.out.println();
            System.out.println();
            System.out.println("Welcome");
            System.out.println("1) Dine-In");
            System.out.println("2) Takeout");
            System.out.println("3) Delievery");
            System.out.println("4) List Orders");
            System.out.println("5) Update Order");
            System.out.println("0. Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Customer Name");
                    String customer = sc.nextLine();
                    System.out.println("Number of guests?");
                    int numOfGuests = sc.nextInt();
                    sc.nextLine();
                    TableOrder ta = new TableOrder(customer, numOfGuests, numOfGuests);
                    orders.add(ta);
                    int tableNumber = 1;
                    break;
                case 2:
                    System.out.println("Customer Name");
                    customer = sc.nextLine();
                    TakeoutOrder to = new TakeoutOrder(customer);
                    orders.add(to);
                    break;
                case 3:
                    System.out.print("Customer Name: ");
                    customer = sc.nextLine();
                    System.out.print("Address: ");
                    String addr = sc.nextLine();
                    System.out.print("Phone: ");
                    String phone = sc.nextLine();
                    ArrayList<Food> dishes = getDishes();
                    DeliveryOrder dl = new DeliveryOrder(customer, addr, phone);
                    dl.setDishes(dishes);
                    orders.add(dl);

                    break;
                case 4:
                    choice = 4;
                    while (choice < 1 || choice > 3) {
                        System.out.println("Sort by:  1.Order number 2.Type 3.Status");
                        choice = sc.nextInt();
                        sc.nextLine();
                    }
                    listOrders(choice);
                    break;
                case 5:
                    choice = 5;
                    System.out.println("Update Order:");
                    System.out.println("1) Update Status");
                    System.out.println("2) Add Dish");
                    System.out.println("3) Remove Dish");
                    System.out.println("4) Cancel Order");
                    System.out.println();
                    System.out.println("Choice: ");
                    int choice2 = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < orders.size(); i++) {
                        System.out.println(i + " " + orders.get(i));
                    }
                    System.out.println("Choice:");
                    int on = sc.nextInt();
                    sc.nextLine();
                    Order o = orders.get(on);

                    if (choice2 == 1) {
                        optionUpdateStatus(o);
                    } else if (choice2 == 2) {
                        optionAddDish(o);
                    } else if (choice2 == 3) {
                        optionRemoveDish(o);
                    } else if (choice2 == 4) {
                        optionCancelOrder(o);
                    }
            }

        }

    }

    public static ArrayList<Food> getDishes() {
        ArrayList<Food> Dishes = new ArrayList<>();
        int ans = 1;
        while (ans != 0) {
            for (int i = 0; i < menu.size(); i++) {
                System.out.println(i + 1 + " " + menu.get(i));
            }
            System.out.println("Enter Choice (-1 to exit): ");
            System.out.println(menu);
            ans = sc.nextInt();
            sc.nextLine();
            if (ans > 0 && ans <= menu.size()) {
                menu.add(menu.get(ans));
            } else if (ans == -1) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
        return Dishes;
    }

    private static String getType(Order o) {
        if (o instanceof TakeoutOrder) {
            return "TakeoutOrder";
        } else if (o instanceof DeliveryOrder) {
            return "DeliveryOrder";
        } else if (o instanceof TableOrder) {
            return "TableOrder";
        } else {
            return "";
        }

    }

    public static void listOrders(int n) {
        if (n == 1) {
            for (Order o : orders) {
                System.out.println(o);
            }
        } else if (n == 2) {
            HashSet<String> orderTypes = new HashSet<>();
            for (Order o : orders)
                orderTypes.add(getType(o));

            for (String orderType : orderTypes) {
                for (Order o : orders) {
                    if (getType(o).equals(orderType)) {
                        System.out.println(o);
                    }
                }
            }

        } else if (n == 3) { // Print order by status
            for (Order o : orders) {
                System.out.println("Status:" + o.setStatus);
            }

        }
    }

    public String[] getPossibleStatuses() {
        String[] s = { "Placed", "Cooking", "Canceled" };
        return s;
    }

    public void setStatus(String s) {
        String status = s;
    }

    private static void optionUpdateStatus(Order o) {

        System.out.println("Updating Status...");
        String[] statuses = o.getPossibleStatuses();

        for (int i = 0; i < statuses.length; i++) {
            System.out.println(i + " " + statuses[i]);
        }
        int choice = sc.nextInt();
        sc.nextLine();

        o.setStatus(statuses[choice]);

    }

    private static void optionAddDish(Order o) {
        System.out.println("Add a Dish");
        System.out.println(menu);
        int menuItem = sc.nextInt();
        sc.nextLine();

        o.addDish(menu.get(menuItem));

    }

    private static void optionRemoveDish(Order o) {
        System.out.println("Remove a Dish");
        System.out.println(menu);
        int menuItem = sc.nextInt();
        sc.nextLine();

        o.removeDish(menu.get(menuItem));

    }

    private static Order optionCancelOrder(Order o) {
        System.out.println("Canceling Order");
        o.setStatus = "Canceled";
        return o;
    }

}
