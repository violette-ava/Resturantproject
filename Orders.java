import java.util.ArrayList;
public class Orders {
    private ArrayList<Food> dishes; 
    private int orderNumber;
    private static int totalOrders = 0;
    private String status;
    
    public Orders(ArrayList<Food> dishes) {
        this.dishes = dishes;
        totalOrders++;
        this.orderNumber = totalOrders;
        status = "Placed";
    }

    public Orders(){
        totalOrders++;
        this.orderNumber = totalOrders;
        dishes = new ArrayList<>();
        this.status = status;
    }

   
    public ArrayList<Food> getDishes() {
        return dishes;
        return orderNumber == o.orderNumber;        //TODO
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

    public boolean equals(Orders o){
        return orderNumber == o.orderNumber;
        
    }

    public double getTotal(){
        return 0.0;
    }

    public String toString(){
        return "Order No:"+orderNumber+" Status: "+status+" Number of Dishes:"+dishes.size()+" Total: "+getTotal()+" ";
    }



    

   
}
