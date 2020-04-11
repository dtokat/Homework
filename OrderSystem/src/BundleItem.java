public class BundleItem extends Item {
    private int discount;
    Item[] list;

    public BundleItem(String label, int discount, Item[] list) {
        super.description = label;
        this.discount = discount;
        this.list = list;
    }

    @Override
    public double getPrice() {
        double sum = 0;
        for (Item e : list) {
            sum += e.getPrice() - e.getPrice() * discount / 100;
        }
        return sum;
    }

    @Override
    public void print() {
        System.out.println(getPrice());
        for (Item e : list) {
            e.print();
        }
    }
}
