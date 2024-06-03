package Test.LSP;

public class Rectangle extends Quadrangle{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int are() {
        return this.width * this.height;
    }
}
