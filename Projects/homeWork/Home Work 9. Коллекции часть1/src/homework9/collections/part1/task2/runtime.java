package homework9.collections.part1.task2;

import java.util.*;

public class runtime {

    public static void main(String[] args) {
        ArrayList<Student> studentRegistry = new ArrayList<Student>(Arrays.asList(new Student("John", "Seed", 20, 7.6),
                new Student("Piter", "Pen", 18, 7.9),
                new Student("Jacob", "Rex", 19, 8.5),
                new Student("Faith", "Moore", 19, 7.8),
                new Student("Rupert", "Merdock", 18, 6.0),
                new Student("Mark", "Twain", 19, 9.5)
        ));

        System.out.println("Student with Highest Mark is : " + getStudentNameWithHighestMark(studentRegistry));
        sortByName(studentRegistry);
        System.out.println("---------------------------------");
        sortByAge(studentRegistry);
        System.out.println("---------------------------------");
        sortByMark(studentRegistry);
    }

    public static String getStudentNameWithHighestMark(ArrayList<Student> lst) {
        Iterator<Student> itr = lst.iterator();
        double curMaxVal = 0.0;
        String curCredentials = "";

        while (itr.hasNext()) {
            Student curStudent = itr.next();
            if (curStudent.getAverageMark() > curMaxVal) {
                curMaxVal = curStudent.getAverageMark();
                curCredentials = curStudent.getCredentials();
            }
        }
        return curCredentials;
    }

    public static void sortByName(List<Student> lst) {
        Comparator<Student> compByName = Comparator.comparing(Student::getCredentials);
        System.out.println("Sort by name:");
        Collections.sort(lst, compByName);
        for (Student st : lst) {
            System.out.println(st.getCredentials() + " " + st.getAge() + " " + st.getAverageMark());
        }
    }

    public static void sortByAge(List<Student> lst) {
        Comparator<Student> compByAge = Comparator.comparing(Student::getAge);
        System.out.println("Sort by age:");
        Collections.sort(lst, compByAge);
        for (Student st : lst) {
            System.out.println(st.getCredentials() + " " + st.getAge() + " " + st.getAverageMark());
        }
    }

    public static void sortByMark(List<Student> lst) {
        Comparator<Student> compByMark = Comparator.comparing(Student::getAverageMark);
        System.out.println("Sort by Mark:");
        Collections.sort(lst, compByMark);
        for (Student st : lst) {
            System.out.println(st.getCredentials() + " " + st.getAge() + " " + st.getAverageMark());
        }
    }
}
