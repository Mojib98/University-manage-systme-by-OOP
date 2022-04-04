package modul;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SectionCourse {
    private int id;
    private String name;
    private int unit;
    private String professorName;
    private String faculty;
    private int grade;
}
