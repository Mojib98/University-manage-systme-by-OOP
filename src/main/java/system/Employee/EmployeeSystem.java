package system.Employee;

import modul.Course;
import modul.Employee;
import modul.Professor;
import modul.Student;

import java.util.Date;
import java.util.List;

public class EmployeeSystem {
    List<Course> courseList;
    Course course;
    Employee employee;
    List<Employee> emplyeeList;
    List<Professor> professorList;
    Professor professor;
    Student student;
    List<Student> studentList;

    public EmployeeSystem(List<Course> courseList, List<Employee> emplyeeList, List<Professor> professorList, List<Student> studentList) {
        this.courseList = courseList;
        this.emplyeeList = emplyeeList;
        this.professorList = professorList;
        this.studentList = studentList;
    }

    public void insertCourse(int id, String name, int unit, String professor, String factuly){
        try {
//            course = new Course(id,name,unit,professor,factuly);
//            courseList.add(course);
        }catch (NullPointerException e){
            System.out.println(e.getStackTrace());

        }
    }
    public void removeCourse(int id){
        try {
            courseList.remove(id);
        }catch (NullPointerException e){
            System.out.println(e.getStackTrace());

        }}
    public void insertEmployee(String user,String pas,String name,String id,String date,String national){
//        employee = new Employee(name,id,name,new Date(11,1,1),national,"ACTIVE",user,pas);
//        emplyeeList.add(employee);
        System.out.printf("your employee added");
    }
    public void removeEmplyee(String id){
        try {
            emplyeeList.remove(id);
        }catch (NullPointerException e){
            System.out.println(e.getStackTrace());

        }}
    public void insertProfessor(String user,String pass,String name,String id,String date,String nationaCode,String status,String faculty){
//
//        professor = new Professor(name,id,date,nationaCode,status,user,pass,status,faculty);
//        professorList.add(professor);
    }
    public void removeProfessor(String id){
        professorList.remove(id);
    }
    public void insertStudent(String user,String password,String name,String id,String date,String nationaCode,String fac){

        student = new Student(name,id,date,nationaCode,user,password,fac);
        studentList.add(student);
    }
    public void removeStudent(String id){
        try {
            studentList.remove(id);
        }catch (NullPointerException e){
            System.out.println(e.getStackTrace());

        }}
    public void showCourse(String id){
       for (Course c:courseList)
           System.out.println(c);
    }
}
