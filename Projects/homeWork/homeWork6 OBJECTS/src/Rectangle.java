public class Rectangle {
    private Point p1;
    private Point p2;

    Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double getSquare() {
        double answer;
        answer = getWidth() * getHeight();
        return answer;
    }

    public double getDiag() {
        double answer;
        answer = this.p1.distance(this.p2);
        return answer;
    }

    public double getWidth() {
        double answer;
        double[] coords = new double[2];
        coords[0] = this.p1.getCoords()[0];
        coords[1] = this.p2.getCoords()[0];
        answer = Math.abs(coords[0] - coords[1]);
        return answer;
    }

    public double getHeight() {
        double answer;
        double[] coords = new double[2];
        coords[0] = this.p1.getCoords()[1];
        coords[1] = this.p2.getCoords()[1];
        answer = Math.abs(coords[0] - coords[1]);
        return answer;
    }
}
