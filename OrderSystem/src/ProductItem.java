public class ProductItem extends Item {

    public double pricePerUnit;
    public int amount;

    public ProductItem(String description, double ppUnit, int amnt) {
        super.description = description;
        this.pricePerUnit = ppUnit;
        this.amount = amnt;
    }


    @Override
    public double getPrice() {
        return pricePerUnit * amount;
    }

    @Override
    public void print() {
        System.out.print(this.description + "_____");
        System.out.print(this.pricePerUnit + "_____");
        System.out.println(this.amount);
    }
}
