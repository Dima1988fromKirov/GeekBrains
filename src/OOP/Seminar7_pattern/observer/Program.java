package OOP.Seminar7_pattern.observer;

public class Program  {
    public static void main(String[] args) {
        // ������ ����
        JobSite jobSite = new JobSite();

        // ��������� ��������
        jobSite.addVacancy("��������");
        jobSite.addVacancy("�����������");

        // ������ �����������
        Observer firstSubscriber = new Subscriber("�������");
        Observer secondSubscriber = new Subscriber("������");

        // ��������� ����������� �� ����
        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("�����������");

        jobSite.removeVacancy("��������");


    }
}
