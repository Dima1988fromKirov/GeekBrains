package OOP.HomeWork.Seminar6;

/**

 *  (Принцип подстановки Барбары Лисков) Класс выполняет те же функции что и родитель, например выводит
 *  информацию о учителе.
 */
public class Teacher extends User {
    private final int id;

    public Teacher(int id, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("Учитель - %d [%s]", id, super.toString());
    }

    public int getTeacherId() {
        return id;
    }
}
