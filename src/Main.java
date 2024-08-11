

public class Main {
    public static void main(String[] args) {
        MenuItem menuItem= new MenuItem("dish",120);
        MenuItem menuItem1= new MenuItem("dish1",100);
        MenuItem menuItem2= new MenuItem("dish2",140);
        MenuItem menuItem3= new MenuItem("dish3",90);

        Order order= new Order(123,"Custom",false);
        Order order1= new Order(223,"Custom1",false);
        Order order2= new Order(122,"Custom2",false);
        order.addMenu(menuItem);
        order.addMenu(menuItem1);
        order.addMenu(menuItem2);

        //System.out.println(order.calculateTotal());
        Restaurant restaurant= new Restaurant();

        restaurant.addMenuItem(menuItem3);
        restaurant.addMenuItem(menuItem1);
        restaurant.addMenuItem(menuItem);

        restaurant.placeOrder(order);
        restaurant.placeOrder(order1);
        restaurant.placeOrder(order2);

        System.out.println(restaurant.getOrderById(23));

        restaurant.completeOrder(142);
    }
}
