import java.util.*;
public class Course {
    private int id;
    private String name;
    private int unit;
    private String professorName;
    private String factuly;

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

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }
}
