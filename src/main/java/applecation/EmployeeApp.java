package applecation;

import modul.Course;
import modul.Employee;
import modul.Professor;
import modul.Student;
import system.Employee.EmployeeSystem;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EmployeeApp {
    List<Course> courseList;
    Course course;
    Employee employee;
    List<Employee> emplyeeList;
    List<Professor> professorList;
    Professor professor;
    Student student;
    List<Student> studentList;
    private String name, date, nationalCode, user, password;
    private Random rand;
    private Scanner scanner;
    private String id;
    EmployeeSystem employeeSystem = new EmployeeSystem(courseList, emplyeeList, professorList, studentList);

    public EmployeeApp(List<Course> courseList, List<Employee> emplyeeList, List<Professor> professorList, List<Student> studentList) {
        this.courseList = courseList;
        this.emplyeeList = emplyeeList;
        this.professorList = professorList;
        this.studentList = studentList;
        rand = new Random();
        scanner = new Scanner(System.in);
    }

    private void giving() {
        System.out.println("please insert user");
        this.user = scanner.next();
        System.out.println("please insert password");
        this.password = scanner.next();
        System.out.println("please insert name");
        this.name = scanner.next();
        System.out.println("please insert date");
        this.date = scanner.next();
        System.out.println("please insert national code");
        this.nationalCode = scanner.next();
    }

    public void insertProfessor() {
        try {
            giving();
            System.out.println("please insert Status full-timd --> 'ft' or half-time-->'ht'");
            String status = scanner.next();
            System.out.println("please insert faculty between 'math' and 'computer'");
            String faculty = scanner.next();
            id = "P";
            id = id + (rand.nextInt(2000));
            employeeSystem.insertProfessor(this.user, this.password, this.name, id, this.date, this.nationalCode, status, faculty);
        } catch (
                Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
    public void insertStudent(){
        try {
            giving();
            id = "S";
            id = id + (rand.nextInt(3000));
            System.out.println("insert faculty between 'computer' or 'math'");
            String fac = scanner.next();
            employeeSystem.insertStudent(this.user, this.password, this.name, id, this.date, this.nationalCode, fac);
            }
        catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }
    public void insertEmployee(){
        try {
            giving();
            id = "E";
            id = id + (rand.nextInt(1000));
            employeeSystem.insertEmployee(this.user, this.password, this.name, id, this.date, this.nationalCode);
            System.out.println("your employee add");
        }
        catch (NullPointerException e){
            System.out.println(e.getStackTrace());
        }
    }
    public void insertCourse(){
        try {
            System.out.println("plese insert course name");
            this.name = scanner.next();
            System.out.println("please insert unit insert integer");
            int unit = scanner.nextInt();
            System.out.println("please insert professor");
            String pro = scanner.next();
            Professor professor = findProfessor(pro);
            if (professor!=null){
                professor.setUnit(unit);
            }else{
                System.out.println("professor not find");
                return;
            }
            System.out.println("please insert your faculty between 'math' or 'computer'");
            String fc = scanner.next();
            int ids = (rand.nextInt(1000));
            employeeSystem.insertCourse(ids, this.name, unit, pro, fc);
        } catch (InputMismatchException e) {
            System.out.println("your unit course is not true");
        }
    }
    private Professor findProfessor(String name){
        for (Professor p : professorList){
            if (p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }

}