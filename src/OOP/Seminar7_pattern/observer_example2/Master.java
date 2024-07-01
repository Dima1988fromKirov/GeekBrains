package OOP.Seminar7_pattern.observer_example2;

public class Master implements Observer{
    String name;

    public Master(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (salary < 80){
            System.out.print(String.format("Специалист %s: Мне нужна эта работа! (Компания, зарплата) = %s, %d%n", name, nameCompany, salary));
        }
        else{
            System.out.print(String.format("Специалист %s: У меня есть работа получше! (Компания, зарплата) = %s, %d%n", name, nameCompany, salary));
        }
    }
}
