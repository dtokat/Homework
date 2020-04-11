public class OrderTest {
    public static void main(String[] args) {
        Item[] a = new Item[3];
        a[0] = new ProductItem("Bread", 5, 4);
        a[1] = new ProductItem("Milk", 3, 1);
        a[2] = new ServiceItem("Delivery", 2);

        Item[] b = new Item[3];
        b[0] = new ProductItem("Cheese", 3, 2);
        b[1] = new ProductItem("Pasta", 2,2);
        b[2] = new BundleItem("Corona indirimi", 10, a);

        Order order = new Order(b);

    }
}
