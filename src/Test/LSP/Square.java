package Test.LSP;

public class Square extends  Quadrangle{
    private int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public int are() {
        return this.length * this.length;
    }
}
