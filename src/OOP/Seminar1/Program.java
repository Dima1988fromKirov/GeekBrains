package OOP.Seminar1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new BottleOfWater("BonAqua1",100,1));
        products.add(new BottleOfWater("BonAqua2",100,1));
        products.add(new HotOfWater("Меркурий",100,1,80));
        products.add(new HotOfWater("BonAqua4",300,2,30));



        HotOfWatterVendingMachine hotOfWatterVendingMachine = new HotOfWatterVendingMachine(products);

        System.out.println(hotOfWatterVendingMachine.getProduct("Меркурий",1,80));


    }
}
