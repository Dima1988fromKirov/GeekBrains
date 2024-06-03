package Test.OSP;

public class Program {
    public static void main(String[] args) {
        Vehicle car = new Car(120);
        Vehicle bus = new Bus(120);

        System.out.println(car.calculateAllowedSpeed());
        System.out.println(bus.calculateAllowedSpeed());

    }
}
