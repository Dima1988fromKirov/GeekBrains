package OOP.Seminar7_pattern.observer_example2;

public interface Observer {
    /**
     * Ответ на предложение о работе
     * @param nameCompany Имя компании
     * @param salary Заработная плата
     */
    void receiveOffer(String nameCompany, int salary);
}
