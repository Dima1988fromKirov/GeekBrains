package OOP.Seminar7_pattern.observer;

public class Program  {
    public static void main(String[] args) {
        // Создаём сайт
        JobSite jobSite = new JobSite();

        // Добавляем вакансии
        jobSite.addVacancy("сисадмин");
        jobSite.addVacancy("тестировщик");

        // Создаём подписчиков
        Observer firstSubscriber = new Subscriber("Дмитрий");
        Observer secondSubscriber = new Subscriber("Андрей");

        // Добавляем подписчиков на сайт
        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("разработчик");

        jobSite.removeVacancy("сисадмин");


    }
}
