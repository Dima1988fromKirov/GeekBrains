package OOP.HomeWork.Seminar6_SOLID;

import OOP.HomeWork.Seminar6_SOLID.controller.Controller;

public class Program {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.createStudents("�������");
        controller.createStudents("�������");
        controller.createStudents("��������");
        controller.createStudents("��������");
        controller.createTeacher("��������");
        controller.createTeacher("�����");
        controller.showListTeacher();
        controller.showListStudents();
        controller.sort();
        controller.showListStudents();

    }
}
