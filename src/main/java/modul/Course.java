package modul;

import java.util.*;
public class Course {
    private int id;
    private String name;
    private int unit;
    private String professorName;
    private String factuly;
    private int grade;

    public Course(int id, String name, int unit, String professorName, String factuly) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.professorName = professorName;
        this.factuly = factuly;
    }

    public void  myCourseInfo(){
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.unit);
        System.out.println(this.professorName);
        System.out.println(this.factuly);
    }

    public String getFactuly() {
        return factuly;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getUnit() {
        return unit;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setFactuly(String factuly) {
        this.factuly = factuly;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;

    }

    @Override
    public String toString() {
        return "modul.Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", unit=" + unit +
                ", professorName='" + professorName + '\'' +
                ", factuly='" + factuly + '\'' +
                '}';
    }



}
