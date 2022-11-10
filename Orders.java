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
    }

    public Orders(){
        totalOrders++;
        this.orderNumber = totalOrders;
        dishes = new ArrayList<>();
        this.status = status;
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

    public boolean equals(Orders o){
        return orderNumber == o.orderNumber;
        
    }

    

   
}
