package figures;

import interfaces.EqualSidedTriangles;

public class EqualSidedTriangle extends Figure implements EqualSidedTriangles {

    private double size;

    public EqualSidedTriangle(double size) {
        super("Triangle", "EqualSidedTriangle");
        this.size = size;
    }

    @Override
    public boolean isFiguresOfOneSquare(Figure figure) {
        return (double) this.calculateSquare() == (double) figure.calculateSquare();
    }

    @Override
    public Double calculateSquare() {
        return Utility.getSquare(size);
    }

    @Override
    public String toString() {
        return "Object type: " + getType() + " " + getSubType();
    }
}
