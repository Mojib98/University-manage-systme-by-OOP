package modul;

import lombok.AllArgsConstructor;
import lombok.Data;
import modul.enumeration.Faculty;

@Data
@AllArgsConstructor
public class Course {
    private int id;
    private String name;
    private int unit;
    private Professor professorName;
    private Faculty faculty;


}
