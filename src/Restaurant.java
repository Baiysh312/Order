import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static java.lang.System.err;

public class Restaurant {
    private List<Order>orders= new ArrayList<>();
    private List<MenuItem>menus= new ArrayList<>();

    public void addMenuItem( MenuItem menuItem){
        menus.add(menuItem);
    }
    public void placeOrder(Order order){
        orders.add(order);
    }

    public Order getOrderById(int orderId){
        try {
            int count=0;
            for (Order ord : orders) {
                if(ord.getOrderID()==orderId){
                    return ord;
                }else count++;
            }
            if(count==orders.size()){
                throw new NoSuchElementException();
            }
        }catch (NoSuchElementException err){
            System.out.println("not element");
        }return null;
    }

    public void completeOrder(int orderId)throws IllegalArgumentException{
        int counter = 0;
        try {
        for (Order ordArr:orders) {
            if(ordArr.getOrderID()==orderId){
                System.out.println(ordArr.getCustomerName());
            }else counter++;
        }
        if(counter==orders.size()) {
            throw new IllegalArgumentException();
        }
        }
        catch (IllegalArgumentException e){
            System.out.println("element ne naiden"+e.getMessage());
        }
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<MenuItem> getMenus() {
        return menus;
    }

    public void setMenus(List<MenuItem> menus) {
        this.menus = menus;
    }
}
