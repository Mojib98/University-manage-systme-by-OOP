package system.student;

import modul.Course;
import modul.SectionCourse;
import modul.Student;

import java.util.Optional;

public class StudentSystem {
    private Student student;


    public void selectCourse(Course course) {
        SectionCourse sectionCourse = new SectionCourse(course);
        if (isUniqCourse(sectionCourse))
            throw new RuntimeException("this course is pass");
        else
            student.insertCourse(sectionCourse);
    }

    public void myInfo() {
        System.out.println(student);
    }

    //delete Course after Added
    public void removeCourse(Course course) {
        SectionCourse sectionCourse = new SectionCourse(course);
        student.remove(course.getName());

    }

    private Boolean isUniqCourse(SectionCourse sectionCourse) {
        Optional<SectionCourse> sectionCourse1 = student.findCourse(sectionCourse);
        return sectionCourse1.isPresent();
    }


    public void setStudent(Student student) {
        this.student = student;
    }
}
