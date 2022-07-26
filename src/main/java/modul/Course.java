package modul;

import lombok.Data;

@Data
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
