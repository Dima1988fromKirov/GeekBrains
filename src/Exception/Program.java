package Exception;

import java.util.Arrays;

/**
 * Напишите приложение,
 * которое будет запрашивать у пользователя следующие данные в произвольном порядке,
 * разделенные пробелом:
 * <p>
 * input:
 * String (Фамилия / Имя / Отчество )
 * date - dd.mm.yyyy (датарождения)
 * целое беззнаковое число без форматирования - (номертелефона)
 * символ латиницей f или m. - (пол)
 * <p>
 * Приложение должно проверить введенные данные по количеству.
 * Если количество не совпадает с требуемым, вернуть код ошибки,
 * обработать его и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.
 * <p>
 * Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры.
 * Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы.
 * Можно использовать встроенные типы java и создать свои.
 * Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.
 * <p>
 * Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии,
 * в него в одну строку должны записаться полученные данные, вида
 * <p>
 * <Фамилия> <Имя> <Отчество> <датарождения> <номертелефона><пол>
 * <p>
 * - Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
 * <p>
 * - Не забудьте закрыть соединение с файлом.
 * <p>
 * При возникновении проблемы с чтением-записью в файл,
 * исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.
 */
public class Program {
    public static void main(String[] args) {
        String fio = "Алексеев Дмит6рий Валерьевич";
        try {
            task(fio);
        } catch (DataNameException e) {
            System.out.printf("Исключение: имя  не должно быть путым или меньше 3х символов а у вас [%s]", e.getName());
        } catch (DataSecondNameException e) {
            System.out.printf("Исключение: фамилия не должно быть путым или меньше 3х символов а у вас [%s]", e.getName());
        } catch (DataLastNameException e) {
            System.out.printf("Исключение: отчество не должно быть путым или меньше 3х символов а у вас [%s]", e.getName());
        } catch (DataCharException e) {
            System.out.println("Исключение: ФИО должно содержать только прописные буквы");
        }


    }

    static void task(String s) throws DataNameException, DataSecondNameException, DataLastNameException, DataCharException {
        String[] str = s.split(" ");
        String[] invalid = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "/", "*", "-", "+", "<", ">", "?", "|", "[", "]"};


        String firstName = str[1];
        String secondName = str[0];
        String lastName = str[2];


        if (firstName == null || firstName.length() < 3)
            throw new DataNameException("Некоректное имя", firstName);
        if (secondName == null || secondName.length() < 3)
            throw new DataSecondNameException("Некоректная фамилия", secondName);
        if (lastName == null || lastName.length() < 3)
            throw new DataSecondNameException("Некоректное отчество", lastName);
        for (String st : invalid) {
            if (secondName.contains(st) || firstName.contains(st) || lastName.contains(st))
                throw new DataCharException("Неккоректные символы");
        }

        System.out.printf("Имя - %s\nФамилия - %s\nОтчество - %s", str[0], str[1], str[2]);

    }
}


