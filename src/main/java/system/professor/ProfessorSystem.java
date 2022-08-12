package system.professor;

import modul.Professor;
import modul.SectionCourse;
import modul.Student;

import java.util.List;
import java.util.stream.Collectors;

public class ProfessorSystem {
    private List<SectionCourse> sectionCourses;
    private List<Student> myStudent;
    private Professor professor;

    public void showMyStudent() {
        var myStudents = myStudent.stream()
                .filter(student -> student.getCourseList().stream()
                        .anyMatch(sectionCourse -> sectionCourse.getCourse().getProfessorName()
                                .equals(this.professor)))
                .collect(Collectors.toList());
    }

    public void insertScore(String id, Integer courseId, Integer score) {
        List<SectionCourse> list = getSectionCourses(id);
        for (SectionCourse sectionCourse : list) {
            if (sectionCourse.getCourse().getId() == courseId)
                sectionCourse.setGrade(score);
            break;
        }
    }

    private List<SectionCourse> getSectionCourses(String id) {
        List<SectionCourse> list = null;
        for (Student student : myStudent) {
            if (student.getId().equals(id))
                list = student.getCourseList();
            break;
        }
        return list;
    }

    public void seeMyInformation(Professor professor) {
        System.out.println(professor);
    }
    //find every thing
}
