public class BundleItem extends Item {
    private int discount;
    Item[] bundle;

    public BundleItem(String label, int discount, Item[] bundle) {
        super.description = label;
        this.discount = discount;
        this.bundle = bundle;
    }
    @Override
    public double getPrice() {
        double sum = 0;
        for (Item item : bundle) {
            sum = sum + item.getPrice() - item.getPrice() * discount / 100;
        }
        return sum;
    }
    @Override
    public void print() {
        for (Item item : bundle) {
            item.print();
        }
        System.out.println(getPrice());
    }
}
//public class BundleItem extends Item {
//    private int discount;
//
//    Item[] list;
//
//    public BundleItem(String label, int discount, Item[] list){
//        super.description = label;
//        this.discount = discount;
//        this.list = list;
//    }
//
//
//
//    @Override
//    public double getPrice() {
//        double sum = 0;
//        for (Item e: list) {
//            if (e instanceof BundleItem){
//                sum += e.getPrice();
//            } else
//            {
//                sum += e.getPrice() - e.getPrice() * discount /100;
//            }
//        }
//        return sum;
//    }
//
//    @Override
//    public void print() {
//        System.out.println(getPrice());
//        for (Item e: list) {
//            e.print();
//        }
//    }
//}
