package OOP.HomeWork.Seminar6;

/**
 * Ч —оздать класс ”читель—ервис и реализовать аналогично проделанному на семинаре;
 * Ч —оздать класс ”читель¬ью и реализовать аналогично проделанному на семинаре;
 * Ч —оздать класс ”читель онтроллер и реализовать возможность создани€, редактировани€
 * конкретного учител€ и отображени€ списка учителей, имеющихс€ в системе.
 */
public class Program {

    public static void main(String[] args) {
        TeacherController teacherController = new TeacherController();
        teacherController.create("јлексеев", "ƒмитрий", "¬алерьевич");
        teacherController.create("1","2","3");
        teacherController.create("1e","2e","3e");
        teacherController.create("1rr","2rr","3rr");
        teacherController.editFirstName(2,"¬италик");
        teacherController.editSecondName(2,"¬италик2");
        teacherController.printTeachersList();



//        teacherController.printTeachersList();
//
//        teacherController.EditFirstName(0,"—мертин");
//        teacherController.EditSecondName(0,"јлександр");
//
//        System.out.println();
//
//        teacherController.sort();

        System.out.println();








    }
}
