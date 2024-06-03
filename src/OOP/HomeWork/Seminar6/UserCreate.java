package OOP.HomeWork.Seminar6;

/**
 * (Принцип разделения интерфейсов) разделяем интерфейсы по сфере их ответственности, в данном случаи
 * интерфейс содержит метод create для реализации в классах
 * @param <T>
 */
public interface UserCreate <T extends User>{
    Teacher create(String firstName, String secondName, String lastName,TeacherGroup teachers);
}
