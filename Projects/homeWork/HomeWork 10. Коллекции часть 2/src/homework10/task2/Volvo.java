package homework10.task2;

public class Volvo extends Car {

    public Volvo(String mark, int year, String colour, String engineType) {
        super("Volvo", mark, year, colour, engineType);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Volvo volvo = (Volvo) o;
        return getManufacturer().equals(volvo.getManufacturer()) &&
                getColour().equals(volvo.getColour()) &&
                getEngineType().equals(volvo.getEngineType()) &&
                getMark().equals(volvo.getMark()) &&
                getYear() == volvo.getYear();
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