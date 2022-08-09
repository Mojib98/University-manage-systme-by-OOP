package modul;

import lombok.*;
import modul.enumeration.Faculty;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

@Setter
@Getter

public class Student extends Person {
    private String user;
    private String password;
    private Faculty faculty;
    private int units =0;
    private List<SectionCourse> courseList = new ArrayList<>();
    private Integer lastScore;


    public Student(String name, String id, Date date, String nationalCode, String user, String password, Faculty faculty) {
        super(name, id, date, nationalCode);
        this.user = user;
        this.password = password;
        this.faculty = faculty;

    }

    public void showMyInfo() {

        System.out.println("name :" + getName());
        System.out.println("national" + getNationalCode());
        System.out.println("Id: " + getId());
        System.out.println("factuly" + getFaculty());
        System.out.println("date" + getDate());


        // System.out.println("hhh");
    }

    /*
        @Override
        public String toString() {
            return "Student{" +
                    "user='" + user + '\'' +
                    ", password='" + password + '\'' +
                    ", faculty='" + faculty + '\'' +
                    ", units=" + units +
                    ", courseList=" + courseList +
                    ", lastScore=" + lastScore +
                    "} " + super.toString();
        }

        public Student(String name, String id, String date, String nationalCode,
                       String user, String password, String faculty) {
            super(name, id, date, nationalCode);
            this.user = user;
            this.password = password;
            this.faculty = faculty;

        }




    */
    public void insertCourse(SectionCourse sectionCourse) {
        var sumUnit = courseList.stream().map((c) -> c.getCourse().getUnit()).reduce(0, Integer::sum);
        if (this.lastScore >= 17) {
            if (units + sectionCourse.getCourse().getUnit() <= 24)
                courseList.add(sectionCourse);
        } else if (this.lastScore > 12) {
            if (units + sectionCourse.getCourse().getUnit() <= 20) {
                courseList.add(sectionCourse);
            }
        } else {
            if (units + sectionCourse.getCourse().getUnit() <= 14) {
                courseList.add(sectionCourse);
            }
        }
    }
    public void remove(String name) {
        SectionCourse sectionCourse = null;
//        Predicate<Course> isHere = item -> item.getName().equals(name);
        var course = courseList.stream()
                .filter(c->c.getCourse().getName().equals(name)).findAny();
//        courseList.removeIf(isHere);
        if (course.isPresent())
            courseList.remove(course.get());
        else
            throw new RuntimeException("course not find");
     /*   for (SectionCourse course : courseList) {
            if (course.getName().equals(name)) {
                sectionCourse = course;
                break;
            }
            if (sectionCourse != null) {
                units -= sectionCourse.getUnit();
                courseList.remove(sectionCourse);
            } else System.out.println("not find");

        }*/
    }
/*    public boolean find() {
        return value % 2 == 0;
    }*/
}
