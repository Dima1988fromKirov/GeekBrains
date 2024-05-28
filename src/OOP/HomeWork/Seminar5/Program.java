package OOP.HomeWork.Seminar5;

import OOP.HomeWork.Seminar5.controler.Controller;
import OOP.HomeWork.Seminar5.model.Student;
import OOP.HomeWork.Seminar5.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.createStudent("Алексеев", "Дмитрий", "Валерьевич", "11/11/1988");
        controller.createStudent("Кузнецов", "Артём", "Артёмович", "12/08/2012");
        controller.createStudent("Кузнецов", "Артём", "Артёмович", "12/08/2012");

        controller.createStudyGroup("Эксюзян", "Агоп", "Суренович", "12/08/212");
        controller.printStudyGroup();


    }


}
