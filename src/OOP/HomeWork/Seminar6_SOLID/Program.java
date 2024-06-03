package OOP.HomeWork.Seminar6_SOLID;

import OOP.HomeWork.Seminar6_SOLID.controller.Controller;

public class Program {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.createStudents("Дмитрий");
        controller.createStudents("Виталий");
        controller.createStudents("Алекандр");
        controller.createStudents("Владимир");
        controller.createTeacher("Григорий");
        controller.createTeacher("Артур");
        controller.showListTeacher();
        controller.showListStudents();
        controller.sort();
        controller.showListStudents();

    }
}
