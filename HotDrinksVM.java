import java.util.ArrayList;
import java.util.List;

public class HotDrinksVM implements VendingMachine{
    private List<Product> products;

    public void initProducts(List<Product> productList) {
        this.products = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public Product getProduct(String name, double volume, int temperature) {
        for (Product product : products) {
            if (product.getName().equals(name) && product.getVolume() == volume && product.getTemperature() == temperature) {
                return product;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HotDrinksVM hotdrinksVM = new HotDrinksVM();

        List<Product> listHotDrinks = new ArrayList<>();
        listHotDrinks.add(new HotDrink("Espresso", 0.05, 93));
        listHotDrinks.add(new HotDrink("Cappuccino", 0.17, 70));
        listHotDrinks.add(new HotDrink("Americano", 0.22, 85));


        hotdrinksVM.initProducts(listHotDrinks);

        System.out.println(hotdrinksVM.getProduct("Espresso", 0.05, 93));
        System.out.println(hotdrinksVM.getProduct("Cappuccino", 0.17, 70));
        System.out.println(hotdrinksVM.getProduct("Americano", 0.22, 85));
    }
}
