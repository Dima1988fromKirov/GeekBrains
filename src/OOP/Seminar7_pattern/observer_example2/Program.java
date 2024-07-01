package OOP.Seminar7_pattern.observer_example2;

public class Program {
    public static void main(String[] args) {

        // создаём наше агенство по поиску работы
        Publisher jobAgency = new JobAgency();

        // создаём компании
        Company google = new Company(jobAgency, "Google", 500);
        Company geekBrains = new Company(jobAgency, "GeekBrains", 1000);

        // создаём наших наблюдателей
        Student petrov = new Student("Дмитрий");
        Master ivanov = new Master("Виталик");
        Junior sidorov = new Junior("Андрей");

        //
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(sidorov);

        for (int i = 0; i < 10; i++) {
            google.needEmployee();
            geekBrains.needEmployee();
        }
    }
}

