package OOP.Seminar7_pattern.observer_example2;

public class Program {
    public static void main(String[] args) {

        // ������ ���� �������� �� ������ ������
        Publisher jobAgency = new JobAgency();

        // ������ ��������
        Company google = new Company(jobAgency, "Google", 500);
        Company geekBrains = new Company(jobAgency, "GeekBrains", 1000);

        // ������ ����� ������������
        Student petrov = new Student("�������");
        Master ivanov = new Master("�������");
        Junior sidorov = new Junior("������");

        //
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(sidorov);

        for (int i = 0; i < 10; i++) {
            google.needEmployee();
            geekBrains.needEmployee();
        }
    }
}

