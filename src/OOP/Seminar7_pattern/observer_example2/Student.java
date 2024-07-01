package OOP.Seminar7_pattern.observer_example2;

public class Student implements Observer{
    String name;
    int salary;

    public Student(String name) {
        this.name = name;
        salary = 0;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary < salary) {
            System.out.printf("Студент %s: Мне нужна эта работа! (Компания, зарплата) = %s, %d%n", name, nameCompany, salary);
            this.salary = salary;
        }
        else{
            System.out.printf("Студент %s: У меня есть работа получше! (Компания, зарплата) = %s, %d%n", name, nameCompany, salary);
        }
    }

}
