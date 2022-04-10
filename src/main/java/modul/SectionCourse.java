package modul;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SectionCourse extends Course {
    public SectionCourse(int id, String name, int unit, String professorName, String factuly, int grade) {
        super(id, name, unit, professorName, factuly);
        this.grade = grade;
    }
    private int grade;

    @Override
    public String toString() {
        return "SectionCourse{" +
                "grade=" + grade +
                "} " + super.toString();
    }
}
