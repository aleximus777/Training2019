package figures;

public class FourSquare extends Figure implements interfaces.FourSquares {
    private double width;

    public FourSquare(String type, String subType, double width) {
        super(type, subType);
        this.width = width;
    }

    @Override
    public boolean isFiguresOfOneSquare(Figure figure) {
        return (double) this.calculateSquare() == (double) figure.calculateSquare();
    }

    @Override
    public Double calculateSquare() {
        return Utility.getSquare(this.width);
    }

    @Override
    public String toString() {
        return "Object type: " + getType() + " " + getSubType();
    }
}

