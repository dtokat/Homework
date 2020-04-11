
public class OrderTest {
    public static void main(String[] args) {
        Item[] a = new Item[3];
        a[0] = new ProductItem("Bread", 5, 3);
        a[1] = new ProductItem("Milk", 3, 1);
        a[2] = new ServiceItem("Delivery", 2);
        Order ord = new Order(a);
    }

}
