package system.professor;

import modul.Professor;
import modul.SectionCourse;
import modul.Student;

import java.util.List;

public class ProfessorSystem {
    List<SectionCourse> sectionCourses;
    List<Student> myStudent;
    public void showMyStudent(){

    }
    public void insertScore(String id,Integer courseId,Integer score){
        List<SectionCourse> list = getSectionCourses(id);
        for (SectionCourse sectionCourse:list){
            if (sectionCourse.getId()==courseId)
                sectionCourse.setGrade(score);
            break;
        }
    }

    private List<SectionCourse> getSectionCourses(String id) {
        List<SectionCourse> list = null;
        for (Student student : myStudent){
            if (student.getId().equals(id))
                 list = student.getCourseList();
            break;
        }
        return list;
    }
    public void seeMyInformation(Professor professor){
        System.out.println(professor);
    }
    //find every thing
}