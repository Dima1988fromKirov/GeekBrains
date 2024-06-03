package Test.LSP;

/**
 * Калссы наследники доложны без проблем заменять класс родителя (при переопределении методов родителя, мы не должны менять смысл
 * этих методов)
 * В данном примере у нас площадь ищеться разными способами но суть метода не меняеться
 */
public class Program {
    public static void main(String[] args) {
        Quadrangle quadrangle1 = new Rectangle(5,3);
        System.out.println(quadrangle1.are());

        Quadrangle quadrangle2 = new Square(9);
        System.out.println(quadrangle2.are());

        printArea(quadrangle1);
    }

    /**
     * В метод можем передовать как квадрат так и прямоугольник, так как они у нас объеденены одним абстрактным классом
     */
    static void printArea(Quadrangle quadrangle){
        System.out.println(quadrangle.are());
    }
}
