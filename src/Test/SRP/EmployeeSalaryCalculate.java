package Test.SRP;

/**
 * Single Responsibility (Принцип единственной ответственности)
 * Выделяем метод подчета зарплаты в отдельный класс а не создаём  его в классе Employee
 */
public class EmployeeSalaryCalculate {
    private int baseSalary;

    public EmployeeSalaryCalculate(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double salaryCalculate() {
        return this.baseSalary * 1.5;
    }

}
