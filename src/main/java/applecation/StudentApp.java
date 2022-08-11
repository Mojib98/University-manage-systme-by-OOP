package applecation;

import modul.Course;
import modul.Student;
import system.student.StudentSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentApp {
    private final List<Course> list;
    private Student student;
    private final StudentSystem studentSystem;
    private final Scanner scanner;
    private List<Course> myFacultyCourse;

    public StudentApp(List<Course> list) {
        this.list = list;
        this.studentSystem = new StudentSystem();
        this.scanner = new Scanner(System.in);
    }

    public void selectCourse() {
        var listMyfaculty = list.stream().filter((c) -> c.getFaculty()
                .equals(this.student.getFaculty())).collect(Collectors.toList());
        listMyfaculty.forEach(System.out::println);
        studentSystem.setStudent(student);
        System.out.println("please insert name");
        String name = scanner.next();
        Course course = listMyfaculty.stream().filter(course1 -> course1.getName().equals(name))
                .findFirst().orElseThrow(() -> new RuntimeException("course not find"));
        if (course != null) {
            studentSystem.selectCourse(course);
        }
    }

    private boolean controlCourse(Course course) {
        if (course.getFaculty().equals(student.getFaculty()))
            return true;
        else return false;

    }

    private Course findCorse(String name) {
        for (Course c : list) {
            if (c.getName().equals(name) & c.getFaculty().equals(student.getFaculty()))
                return c;
        }
        return null;
    }

    public void setStudent(Student student) {
        this.student = student;
        this.studentSystem.setStudent(student);
        this.myFacultyCourse =list.stream().filter((c) -> c.getFaculty()
                .equals(this.student.getFaculty())).collect(Collectors.toList());
    }

    public void removeCourse() {
        var listMyfaculty = list.stream().filter((c) -> c.getFaculty()
                .equals(this.student.getFaculty())).collect(Collectors.toList());
        listMyfaculty.forEach(System.out::println);
        studentSystem.setStudent(student);
        System.out.println("please insert name");
        String name = scanner.next();
        Course course = listMyfaculty.stream().filter(course1 -> course1.getName().equals(name))
                .findFirst().orElseThrow(() -> new RuntimeException("course not find"));
        if (course != null) {
            studentSystem.removeCourse(course);
        }
    }
}
