package system.Employee;

import modul.Course;
import modul.Employee;
import modul.Professor;
import modul.Student;
import modul.enumeration.Faculty;
import modul.enumeration.Status;

import java.util.Date;
import java.util.List;

public class EmployeeSystem {
    private List<Course> courseList;
    private Course course;
    private Employee employee;
    private List<Employee> emplyeeList;
    private List<Professor> professorList;
    private Professor professor;
    private Student student;
    private List<Student> studentList;

    public EmployeeSystem(List<Course> courseList, List<Employee> emplyeeList, List<Professor> professorList, List<Student> studentList) {
        this.courseList = courseList;
        this.emplyeeList = emplyeeList;
        this.professorList = professorList;
        this.studentList = studentList;
    }

    public void insertCourse(Integer id, String name, Integer unit, Professor professor, Faculty factuly) {
        checker(id);
        checker(name);
        checker(unit);
        checker(professor);
        checker(factuly);
        try {
            course = new Course(id,name,unit,professor,factuly);
            courseList.add(course);
        } catch (Exception e) {
            throw e;
        }
    }

    public void removeCourse(int id) {
        try {
            courseList.remove(id);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());

        }
    }
    public void modifyCourse(Integer index,Course course){
        courseList.set(index,course);
    }

    public void insertEmployee(String user, String password, String name, String id, Date date, String national) {
            checker(user);
            checker(password);
            checker(id);
            checker(date);
            checker(national);
        try {
            employee = new Employee(name,id,date,national, Status.ACTIVE,user,password);
            emplyeeList.add(employee);
        }catch (Exception e){
            throw e;
        }
        System.out.println("\t\tyour employee added is index in system is:"+emplyeeList.indexOf(employee));
    }

    public void removeEmplyee(Employee employee) {
        try {
            emplyeeList.remove(employee);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());

        }
    }

    public void insertProfessor(String user, String pass, String name, String id, String date, String nationaCode, String status, String faculty) {
//
//        professor = new Professor(name,id,date,nationaCode,status,user,pass,status,faculty);
//        professorList.add(professor);
    }

    public void removeProfessor(String id) {
        professorList.remove(id);
    }

    public void insertStudent(String user, String password, String name, String id, String date, String nationaCode, String fac) {

//        student = new Student(name,id,date,nationaCode,user,password,fac);
//        studentList.add(student);
    }

    public void removeStudent(String id) {
        try {
            studentList.remove(id);
        } catch (NullPointerException e) {
            System.out.println(e.getStackTrace());

        }
    }

    public void showCourse(String id) {
        for (Course c : courseList)
            System.out.println(c);
    }
    public void checker(Object object){
        if (object==null)
            throw new IllegalStateException("some thing wrong please try again");
    }
}
