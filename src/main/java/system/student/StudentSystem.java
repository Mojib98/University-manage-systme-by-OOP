package system.student;

import modul.Course;
import modul.SectionCourse;
import modul.Student;

public class StudentSystem {
    Student student;


    public void selectCourse(Course course) {
        SectionCourse sectionCourse = new SectionCourse(course);
        student.insertCourse(sectionCourse);
    }
    public void myInfo(){
        System.out.println(student);
    }
    //delete Course after Added
    public void removeCourse(){

    }


    public void setStudent(Student student) {
        this.student = student;
    }
}
