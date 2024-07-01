package OOP.Seminar7_pattern.adapter;

public interface Database {
    public void insert(); // вставка
    public void update(); // изменение
    public void select(); // чтение
    public void remove(); // удаление
}
