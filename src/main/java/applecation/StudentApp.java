package applecation;

import modul.Course;
import modul.Student;
import system.student.StudentSystem;

import java.util.List;
import java.util.Scanner;

public class StudentApp {
    List<Course> list;
    Student student;
    StudentSystem studentSystem = new StudentSystem();
    Scanner scanner = new Scanner(System.in);

    public void selectCourse() {
        studentSystem.setStudent(student);
        System.out.println("please insert name");
        String name = scanner.next();
        Course course = findCorse(name)
        if (course !=null){
            studentSystem.selectCourse(course);
        }
    }

    private boolean controlCourse(Course course) {
    /*    if (course.getFactuly().equals(student.getFaculty()))
            return true;
        else return false;*/
        return course.getFactuly().equals(student.getFaculty());
    }
    private Course findCorse(String name){
        for (Course c:list){
            if (c.getName().equals(name) & c.getFactuly().equals(student.getFaculty()))
                return c;
        }
        return null;
    }
}