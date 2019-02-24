package homework10.task2;

public class Vw extends Car {

    public Vw(String mark, int year, String colour, String engineType) {
        super("VW", mark, year, colour, engineType);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Vw vw = (Vw) o;
        return getManufacturer().equals(vw.getManufacturer()) &&
                getColour().equals(vw.getColour()) &&
                getEngineType().equals(vw.getEngineType()) &&
                getMark().equals(vw.getMark()) &&
                getYear() == vw.getYear();
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + getManufacturer().hashCode();
        result = 31 * result + getYear();
        result = 31 * result + getMark().hashCode();
        result = 31 * result + getEngineType().hashCode();
        result = 31 * result + getColour().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return getManufacturer() + " " + getColour() + " " + getEngineType() + " " + getMark() + " " + getYear();
    }
}
