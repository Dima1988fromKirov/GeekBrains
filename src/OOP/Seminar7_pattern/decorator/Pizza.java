package OOP.Seminar7_pattern.decorator;

/**
 * Component
 */
public interface Pizza {
    /**
     * Цена
     * @return метод возвращает цену пицы
     */
    public int getCost();
    /**
     * Описание
     * @return метод возвращает описание пицы
     */
    public String getDescription();
}
