public class Point {
    private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double[] getCoords() {
        double[] answer = new double[2];
        answer[0] = this.x;
        answer[1] = this.y;
        return answer;
    }

    public void setCoords(double[] args) {
        this.x = args[0];
        this.y = args[1];
    }

    public double distance(Point p) {
        double x;
        double y;
        double answer;
        x = p.getCoords()[0];
        y = p.getCoords()[1];
        answer = Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
        return answer;
    }
}
