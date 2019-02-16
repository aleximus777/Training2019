package figures;

public class Rectangle extends Figure implements interfaces.Rectangles {
    private double width;
    private double height;

    public Rectangle(String type, String subType, double width, double height) {
        super(type, subType);
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean isFiguresOfOneSquare(Figure figure) {
        return (double) this.calculateSquare() == (double) figure.calculateSquare();
    }

    @Override
    public Double calculateSquare() {
        return Utility.getSquare(width, height);
    }

    @Override
    public String toString() {
        return "Object type: " + getType() + " " + getSubType();
    }
}
