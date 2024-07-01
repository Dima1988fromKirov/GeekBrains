package OOP.Seminar7_pattern.observer;

import java.util.List;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Дорогой " + name +
        "\nУ нас появились изменения в вакансиях\n" + vacancies +
        "\n=====================================\n");

    }
}
