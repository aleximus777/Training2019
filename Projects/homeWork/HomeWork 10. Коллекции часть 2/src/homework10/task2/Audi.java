package homework10.task2;

public class Audi extends Car {

    public Audi(String mark, int year, String colour, String engineType) {
        super("Audi", mark, year, colour, engineType);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Audi audi = (Audi) o;
        return getManufacturer().equals(audi.getManufacturer()) &&
                getColour().equals(audi.getColour()) &&
                getEngineType().equals(audi.getEngineType()) &&
                getMark().equals(audi.getMark()) &&
                getYear() == audi.getYear();
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
