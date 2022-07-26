package modul;

import lombok.Data;

@Data
public class Course {
    private int id;
    private String name;
    private int unit;
    private Professor professorName;
    private String faculty;

}
