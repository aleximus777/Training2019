package homework10.task2;

public abstract class Car {
    private String manufacturer;
    private String mark;
    private int year;
    private String colour;
    private String engineType;

    public Car() {
    }

    public Car(String manufacturer, String mark, int year, String colour, String engineType) {
        this.manufacturer = manufacturer;
        this.mark = mark;
        this.year = year;
        this.colour = colour;
        this.engineType = engineType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
