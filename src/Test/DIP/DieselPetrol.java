package Test.DIP;

public class DieselPetrol implements Engine{
    @Override
    public void start() {
        System.out.println("Запускаем дизельный двигатель");
    }
}
