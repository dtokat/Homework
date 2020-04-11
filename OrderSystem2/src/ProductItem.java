public class ProductItem extends Item {
    private double pricePerUnit;
    private int amount;

    public ProductItem(String description, double ppUnit, int amnt){
        super.description = description;
        pricePerUnit = ppUnit;
        amount = amnt;
    }

    @Override
    public double getPrice() {
        return this.pricePerUnit * this.amount;
    }

    @Override
    public void print() {
        System.out.print(this.description + "_____");
        System.out.print(this.pricePerUnit + "_____");
        System.out.println(this.amount);

    }
}
