import java.util.ArrayList;

public class TakeoutOrder extends Orders {
    private String customer;


    public TakeoutOrder(String customer){
        this.customer = customer;
    }

    public TakeoutOrder(String customer, ArrayList<Food> dishes){
        super(dishes);
        this.customer = customer;

    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String toString(){
        return super.toString()+ customer;
    }

    public String[] getPossibleStatuses(){
        String[] s = {"Placed", "Cooking", "Waiting for Pickup", "Delivered", "Canceled"};
        return s;
    }



}
