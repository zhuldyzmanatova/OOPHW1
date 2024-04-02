public abstract class Product {

    protected String name;
    protected String category;
    protected int amount;
    protected double price;
    protected int temperature;
    protected double volume;

    Product(String name, double price, String category, int amount){
        this.name = name;
        this.price = price;
        this.category = category;
        this.amount = amount;
    }

    Product(String name, double volume, int temperature){
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount() {
        this.amount = amount;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature() {
        this.temperature = temperature;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume() {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}