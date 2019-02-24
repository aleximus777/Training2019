package homework10.task2;

public class Toyota extends Car {

    public Toyota(String mark, int year, String colour, String engineType) {
        super("Toyota", mark, year, colour, engineType);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Toyota toyota = (Toyota) o;
        return getManufacturer().equals(toyota.getManufacturer()) &&
                getColour().equals(toyota.getColour()) &&
                getEngineType().equals(toyota.getEngineType()) &&
                getMark().equals(toyota.getMark()) &&
                getYear() == toyota.getYear();
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