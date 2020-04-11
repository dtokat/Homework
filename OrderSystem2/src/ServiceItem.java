public class ServiceItem extends Item{
    private double price;

    public ServiceItem(String description, double price){
        super.description = description;
        this.price = price;
    }


    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println(this.description + "_____" + this.price);
    }
}
