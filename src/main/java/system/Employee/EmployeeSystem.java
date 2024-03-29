package system.Employee;

import exception.UserInputExcention;
import modul.Course;
import modul.Employee;
import modul.Professor;
import modul.Student;
import modul.enumeration.Faculty;
import modul.enumeration.Status;

import java.util.Date;
import java.util.List;
import java.util.Random;

public class EmployeeSystem {
    private final List<Course> courseList;
    private final List<Employee> emplyeeList;
    private final Random rand;
    private final List<Professor> professorList;
    private final List<Student> studentList;

    public EmployeeSystem(List<Course> courseList, List<Employee> emplyeeList, List<Professor> professorList, List<Student> studentList) {
        this.courseList = courseList;
        this.emplyeeList = emplyeeList;
        this.professorList = professorList;
        this.studentList = studentList;
        this.rand = new Random();

    }

    public void insertCourse(String name, Integer unit, Professor professor) {
        Integer id = (rand.nextInt(1000));
        checker(id);
        checker(name);
        checker(unit);
        checker(professor);
        try {
            Course course = new Course(id, name, unit, professor, professor.getFaculty());
            courseList.add(course);
        } catch (Exception e) {
            throw e;
        }
    }

    public void removeCourse(Course course) {
        try {
            courseList.remove(course);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());

        }
    }

    public void modifyCourse(Integer index, Course course) {
        courseList.set(index, course);
    }

    public void insertEmployee(String user, String password, String name, Date date, String national) {
        try {
            String id = "E";
            id = id + (rand.nextInt(1000));
            checker(user);
            checker(password);
            checker(id);
            checker(date);
            checker(national);
            Employee employee = new Employee(name, id, date, national, Status.ACTIVE, user, password);
            emplyeeList.add(employee);
            System.out.println("\t\tyour employee added is index in system is:" + emplyeeList.indexOf(employee));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("your employee not insert");
        }
    }

    public void removeEmplyee(Employee employee) {
        try {
            emplyeeList.remove(employee);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());

        }
    }

    public void modifyEmplyee(Employee employee, Integer index) {
        try {
            emplyeeList.set(index, employee);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());

        }
    }

    public void insertProfessor(String user, String password, String name, Date date,
                                String nationaCode, Status status, Faculty faculty) {
        String id = "P";
        id = id + (rand.nextInt(2000));
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

    public void modifyProfessor(Professor professor, Integer index) {
        try {
            professorList.set(index, professor);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());

        }
    }

    public void removeProfessor(Professor professor) {
        professorList.remove(professor);
    }

    public void insertStudent(String user, String password, String name, Date date, String nationaCode, Faculty faculty) {
        String id = "S";
        id = id + (rand.nextInt(3000));
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

    public void modifyStudent(Student student, Integer index) {
            studentList.set(index, student);


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
