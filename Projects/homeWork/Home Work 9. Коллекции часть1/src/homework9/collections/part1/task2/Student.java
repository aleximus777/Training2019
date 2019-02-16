package homework9.collections.part1.task2;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double averageMark;

    public Student(String firstName, String lastName, int age, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.averageMark = averageMark;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public String getCredentials() {
        return firstName + " " + lastName;
    }

    public int getAge() {
        return this.age;
    }
}