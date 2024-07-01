package OOP.Seminar7_pattern.fabricMethod_example2;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactoryBySpecialty("Python");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();

    }

    static DeveloperFactory createDeveloperFactoryBySpecialty(String specialty){
        if (specialty.equalsIgnoreCase("Java")){
            return new JavaDeveloperFactory();
        }
        else if (specialty.equalsIgnoreCase("Python")){
            return new PythonDeveloperFactory();
        }
        throw new RuntimeException(specialty + " Не найдена");

    }
}
