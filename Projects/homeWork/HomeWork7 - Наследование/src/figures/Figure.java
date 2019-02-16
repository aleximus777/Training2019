package figures;

public class Figure extends Point {
    private String type;
    private String subType;

    public Figure() {
        this.type = "Null";
        this.subType = "Null";
    }

    public Figure(String type, String subType) {
        this.type = type;
        this.subType = subType;
    }

    public boolean isFiguresOfOneSquare(Figure figure) {
        return false;
    }

    public Double calculateSquare() {
        return 0.0;
    }

    public String getType() {
        return this.type;
    }

    public String getSubType() {
        return this.subType;
    }
}
