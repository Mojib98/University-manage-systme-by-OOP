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
    private Employee employee;
    private List<Employee> emplyeeList;
    private List<Professor> professorList;
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
            Course course = new Course(id, name, unit, professor, factuly);
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

    public void modifyCourse(Integer index, Course course) {
        courseList.set(index, course);
    }

    public void insertEmployee(String user, String password, String name, String id, Date date, String national) {
        checker(user);
        checker(password);
        checker(id);
        checker(date);
        checker(national);


        Employee employee = new Employee(name, id, date, national, Status.ACTIVE, user, password);
        emplyeeList.add(employee);
        System.out.println("\t\tyour employee added is index in system is:" + emplyeeList.indexOf(employee));
    }

    public void removeEmplyee(Employee employee) {
        try {
            emplyeeList.remove(employee);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());

        }
    }

    public void insertProfessor(String user, String password, String name, String id, Date date,
                                String nationaCode, Status status, Faculty faculty) {
        checker(user);
        checker(password);
        checker(name);
        checker(id);
        checker(date);
        checker(status);
        checker(name);
        checker(faculty);
        Professor professor = new Professor(name, id, date, nationaCode, status, user, password, faculty);
        professorList.add(professor);
    }

    public void removeProfessor(Professor professor) {
        professorList.remove(professor);
    }

    public void insertStudent(String user, String password, String name, String id, Date date, String nationaCode, Faculty faculty) {
        checker(user);
        checker(password);
        checker(date);
        checker(name);
        checker(faculty);
        checker(nationaCode);

        Student student = new Student(name, id, date, nationaCode, user, password, faculty);
        studentList.add(student);
    }

    public void removeStudent(Student student) {
        checker(student);
        studentList.remove(student);
    }

    public void showALLCourse(String id) {
        for (Course c : courseList)
            System.out.println(c);
    }


    public void checker(Object object) {
        if (object == null)
            throw new IllegalStateException("some thing wrong please try again");
    }
}
