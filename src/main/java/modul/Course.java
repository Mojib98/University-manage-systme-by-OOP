package modul;

import lombok.Data;
import modul.enumeration.Faculty;

@Data
public class Course {
    private int id;
    private String name;
    private int unit;
    private Professor professorName;
    private Faculty faculty;

}
