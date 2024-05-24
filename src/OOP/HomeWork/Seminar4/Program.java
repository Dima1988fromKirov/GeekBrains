package OOP.HomeWork.Seminar4;

import java.util.ArrayList;
import java.util.List;

/**
 * — Создать класс УчительСервис и реализовать аналогично проделанному на семинаре;
 * — Создать класс УчительВью и реализовать аналогично проделанному на семинаре;
 * — Создать класс УчительКонтроллер и реализовать возможность создания, редактирования
 * конкретного учителя и отображения списка учителей, имеющихся в системе.
 */
public class Program {

    public static void main(String[] args) {
        TeacherController teacherController = new TeacherController();
        teacherController.create("Алексеев", "Дмитрий", "Валерьевич");
        teacherController.create("Эксюзян", "Сурен", "Арутович");
        teacherController.create("Демидов", "Виталий", "Витальевич");
        teacherController.create("Демидов", "Антон", "Григорьевич");
        teacherController.create("Носков", "Виталий", "Владимирович");
        teacherController.create("Атаносян", "Сурен", "Арутович");

        teacherController.printTeachersList();

        teacherController.EditFirstName(0,"Смертин");
        teacherController.EditSecondName(0,"Александр");

        System.out.println();

        teacherController.sort();

        System.out.println();








    }
}
