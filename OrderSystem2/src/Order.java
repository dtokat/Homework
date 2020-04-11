public class Order {

    Item[] order;

    public Order(Item[] order) {
        this.order = order;
        print();
    }

    public double getTotalPrice() {
        double sum = 0;
        for (Item e : order) {
            sum += e.getPrice();
        }
        return sum;
    }

    public void print() {
        for (Item e : order) {
            e.print();
        }
        System.out.println("=================");
        System.out.println(getTotalPrice());
    }
}
