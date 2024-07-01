package OOP.Seminar7_pattern.fabricMethod_example2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProgramTest2 {
    public static void main(String[] args) {

        List<DeveloperFactory> developers = new ArrayList<>();
        developers.add(new PythonDeveloperFactory());
        developers.add(new PythonDeveloperFactory());
        developers.add(new JavaDeveloperFactory());
        developers.add(new JavaDeveloperFactory());
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            Developer developer = developers.get(random.nextInt(4)).createDeveloper();
            developer.writeCode();
        }

    }
}
