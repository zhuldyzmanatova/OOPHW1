public class HotDrink extends Product{
    public HotDrink(String name, double volume, int temperature){
        super(name, volume, temperature);
    }

    @Override
    public String toString() {
        return "Hot Drink name: " + name + 
                ", volume: " + volume + " ml" + 
                ", temperature: " + temperature + "°C";
    }
}
