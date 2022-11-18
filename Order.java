import java.util.ArrayList;
public class Order {
    private ArrayList<Food> dishes; 
    private int orderNumber;
    private static int totalOrders = 0;
    private String status;
    public String setStatus;
    
    public Order(ArrayList<Food> dishes) {
        this.dishes = dishes;
        totalOrders++;
        this.orderNumber = totalOrders;
        status = "Placed";
    }

    public Order(){
        totalOrders++;
        this.orderNumber = totalOrders;
        dishes = new ArrayList<>();
        this.status = "Placed";
     }

   
    public ArrayList<Food> getDishes() {
        return dishes;
          
    }

    public void setDishes(ArrayList<Food> dishes) {
        this.dishes = dishes;
    }

   
    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public boolean equals(Order o){
        return orderNumber == o.orderNumber;
        
    }

    public double getTotal(){
        return 0.0;
    }

    public void addDish(Food f){
        dishes.add(f);
    }

    public String[] getPossibleStatuses(){
        String[] statuses = {"Placed","Cooking", "Done"};
        return statuses;
    }

    public void setStatus(String s){
        status =s;
    }

    public void removeDish(Food f){
        dishes.remove(f);
    }

    public String toString(){
        return "Order No:"+orderNumber+" Status: "+status+" Number of Dishes:"+dishes.size()+" Total: "+getTotal()+" ";
    }



    

   
}
