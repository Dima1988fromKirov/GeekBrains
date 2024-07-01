package OOP.Seminar7_pattern.adapter_example2;

public class SimpleAmericanSocket implements AmericanSocket{
    @Override
    public void getPower() {
        System.out.println("Розетка получает 110 вольт ");
    }
}
