import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {//Student class
    private int id;
    private String name;
    private int age;

    public Student() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {

        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class StudentSorter implements Comparator {//student sorter class
    StudentSorter() {
    }

    public int compare(Object o1, Object o2) {//compares and sort
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        if (s1.getAge() > s2.getAge()) {
            return -1;
        } else if (s1.getAge() == s2.getAge()) {
            if (s1.getName().compareTo(s2.getName()) == 1) {
                return 1;
            } else if (s1.getName().compareTo(s2.getName()) == 0) {
                return s1.getId() > s2.getId() ? -1 : 1;
            } else {
                return -1;
            }
        } else {
            return 1;
        }
    }
}
class MainTest {
    public List<Student> sorting(List<Student> stu) {
        StudentSorter studentsorter = new StudentSorter();
        Collections.sort(stu, studentsorter);
        return stu;
    }
}


