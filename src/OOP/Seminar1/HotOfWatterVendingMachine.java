package OOP.Seminar1;

import java.util.List;

public class HotOfWatterVendingMachine implements VendingMachine{
    private final List<Product> products;

    public HotOfWatterVendingMachine(List<Product> products) {
        this.products = products;
    }

    public Product getProduct(String name){
        for (Product products: products){
            if (products.getName().equals(name)){
                return products;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }


    public HotOfWater getProduct(String name, int volume, int temperature){
        for (Product product: products){
            if (product instanceof HotOfWater){
                if(product.getName().equals(name) && ((HotOfWater) product).getVolume() == volume
                        && ((HotOfWater) product).getTemperature() == temperature) {
                    return (HotOfWater)product;
                }
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием \"%s\" объемом %d и температурой %d не найден.", name, volume, temperature ));
    }
}
