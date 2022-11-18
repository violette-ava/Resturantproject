public class TableOrder extends Orders  {
    private String customer;
    private int numOfGuests;
    public int getNumOfGuests() {
        return numOfGuests;
    }

    public TableOrder(String customer, int numOfGuests, int tableNumber){
        super();
        this.customer = customer;
        this.numOfGuests = numOfGuests;
        this.tableNumber = tableNumber;

    }

    public void setNumOfGuests(int numOfGuests) {
        this.numOfGuests = numOfGuests;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    private int tableNumber;


    public String getCustomer(){
        return customer;
    }

    public void setCustomer(String customer){
        this.customer = customer;
    }

    public String toString(){
        return super.toString()+ customer+ " "+ numOfGuests+ " "+tableNumber;
    }

    public String[] getPossibleStatuses(){
        String[] s= {"Placed", "Cooking", "Served", "Canceled"};
        return s;
    }
    
    
}
