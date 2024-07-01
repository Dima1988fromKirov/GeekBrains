package OOP.Seminar7_pattern.fabricMethod_example2;

public class PythonDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }
}
