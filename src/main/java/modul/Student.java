package modul;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Student extends Person {
    private String user;
    private String password;
    private String faculty;
    private int units;
    private List<SectionCourse> courseList = new ArrayList<>();
    private Integer lastScore;

    public void showMyInfo() {

        System.out.println("name :" + getName());
        System.out.println("national" + getNationalCode());
        System.out.println("Id: " + getId());
        System.out.println("factuly" + getFaculty());
        System.out.println("date" + getDate());


        // System.out.println("hhh");
    }

    public Student(String name, String id, String date, String nationalCode,
                   String user, String password, String faculty,
                   int units, Integer lastScore) {
        super(name, id, date, nationalCode);
        this.user = user;
        this.password = password;
        this.faculty = faculty;
        this.units = units;
        this.lastScore = lastScore;
    }


    public void insertCourse(SectionCourse sectionCourse) {
        if (this.lastScore >= 17) {
            if (units + sectionCourse.getUnit() <= 24)
                courseList.add(sectionCourse);
        } else if (this.lastScore < 17 & this.lastScore > 14) {
            if (units + sectionCourse.getUnit() <= 20) {
                courseList.add(sectionCourse);
            }
        }

    }

    public void remove(String name) {
        SectionCourse sectionCourse = null;
        for (SectionCourse course : courseList) {
            if (course.getName().equals(name)) {
                sectionCourse = course;
                break;
            }
            if (sectionCourse != null) {
                units -= sectionCourse.getUnit();
                courseList.remove(sectionCourse);
            } else System.out.println("not find");

        }
    }
}