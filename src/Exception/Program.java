package Exception;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Ввод данных - 1\nЗавершение работы - 0");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1 -> {
                    program();
                    System.out.println("Данные успешно добавлены");
                }
                case 0 -> {
                    System.out.println("Завершение работы");
                    return;

                }
            }


        }
    }

    static void program() {
        try {
            task();
        } catch (DataNameException e) {
            System.out.printf("Исключение: имя  не должно быть путым или меньше 3х символов а у вас [%s]", e.getName());
        } catch (DataSecondNameException e) {
            System.out.printf("Исключение: фамилия не должно быть путым или меньше 3х символов а у вас [%s]", e.getName());
        } catch (DataLastNameException e) {
            System.out.printf("Исключение: отчество не должно быть путым или меньше 3х символов а у вас [%s]", e.getName());
        } catch (DataCharException e) {
            System.out.println("Исключение: ФИО должно содержать только прописные буквы");
        } catch (ParseException e) {
            System.out.println("Исключение: Неверно введена дата");
        } catch (NumberFormatException e) {
            System.out.println("Исключение: Неверный номер телефона");
        } catch (DataGenderException e) {
            System.out.println("Исключение: Неверно указан пол");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Исключение: Заполнены не все поля");
        } catch (DataExtraException e) {
            System.out.println("Присутствуют лишние данные");
        }
    }



    static void task() throws DataNameException, DataSecondNameException, DataLastNameException,
            DataCharException, ParseException, NumberFormatException, DataGenderException, DataExtraException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данныее");
        String s = scanner.nextLine();

        String[] str = s.split(" ");
        String[] invalid = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "/", "*", "-", "+", "<", ">", "?", "|", "[", "]"};
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");


        String firstName = str[1];
        String secondName = str[0];
        String lastName = str[2];
        Date date = format.parse(str[3]);
        Long number = Long.parseLong(str[4]);
        Character gender = str[5].charAt(0);


        if (firstName == null || firstName.length() < 3)
            throw new DataNameException("Некоректное имя", firstName);
        if (secondName == null || secondName.length() < 3)
            throw new DataSecondNameException("Некоректная фамилия", secondName);
        if (lastName == null || lastName.length() < 3)
            throw new DataSecondNameException("Некоректное отчество", lastName);
        for (String st : invalid) {
            if (secondName.contains(st) || firstName.contains(st) || lastName.contains(st))
                throw new DataCharException("Неккоректные символы в ФИО");
        }
        if (!str[5].equals("m") && !str[5].equals("f"))
            throw new DataGenderException("Неккоректные символы в ФИО");

        if (str.length > 6)
            throw new DataExtraException("Есть лишние данные");

        try (FileWriter writer = new FileWriter(secondName + ".txt", true)) {
            writer.write("<ФИО> " + secondName + " ");
            writer.write(firstName + " ");
            writer.write(lastName + " ");
            writer.write("<Дата рождения> " + date);
            writer.write(" <Номер телефона> " + number + " ");
            writer.write("<Пол> " + gender + "\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }
}


