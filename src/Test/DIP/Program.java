package Test.DIP;

/**
 * Наш главный класс не должен напрямую быть связвн с инструментами, а должен это делать через абстракцию
 * Engine - это интерфейс объединяющий сами реализации
 */
public class Program {

    public static void main(String[] args) {
        Car car = new Car(new PetrolEngine());
        car.start();

        car = new Car(new DieselPetrol());
        car.start();

    }
}
