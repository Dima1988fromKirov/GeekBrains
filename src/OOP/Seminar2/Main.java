package OOP.Seminar2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Dima");
        Human human2 = new Human("Andrey");
        Human human3 = new Human("Karl");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.update();
    }
}
