import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderID;
    private String customerName;
    private List<MenuItem> items= new ArrayList<>();
    private boolean isCompleted;

    public void addMenu(MenuItem menuItem){
        items.add(menuItem);
    }
    private double sum=0;
    public double calculateTotal(){
        for (MenuItem menu : items) {
            sum+=menu.getPrice();
        }
        return sum;
    }
    public void completeOrder(){
        isCompleted=true;
    }

    public Order(int orderID, String customerName, boolean isCompleted) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.isCompleted = isCompleted;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
