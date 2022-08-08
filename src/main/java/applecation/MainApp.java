package applecation;

import modul.Course;
import modul.Employee;
import modul.Professor;
import modul.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    String name;
    private List<Student> studentList;
    private List<Professor> professorList;
    private List<Course> courseList;
    private List<Employee> employeeList;
    private Scanner scanner;
    private EmployeeApp employeeApp;

    public MainApp() {
        this.studentList = new ArrayList<>();
        this.professorList = new ArrayList<>();
        this.courseList = new ArrayList<>();
        this.employeeList = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        employeeApp = new EmployeeApp(courseList, employeeList, professorList, studentList);

    }

//    StudentApp studentApp = new StudentApp(courseList);

    public void employeeMenu() {
        boolean isRunner = true;
        while (isRunner) {
            showEmployeeAction();
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    employeeApp.insertEmployee();
                    break;
                case 2:
                    employeeApp.deleteEmployee();
                    break;
                case 3:
                    employeeApp.insertProfessor();
                    break;
                case 4:
                    employeeApp.deleteProfessor();
                    break;
                case 5:
                    employeeApp.insertStudent();
                    break;
                case 6:
                    employeeApp.deleteStudent();
                    break;
                case 7:
                    employeeApp.insertCourse();
                    break;
                case 8:
                    employeeApp.deleteCourse();
                    break;
                case 9:
                    employeeApp.modifyEmployee();
                    break;
                case 10:
                    employeeApp.modifyStudent();
                    break;
                case 11:
                    employeeApp.modifyProfessor();
                    break;
                case 12:
                    employeeApp.modifyCourse();
                    break;
                case 13:
                    employeeApp.myInformation(this.name);
                    break;
                case 14:
                    isRunner = false;

            }
        }
    }

    private void showEmployeeAction() {
        System.out.println("for sing up Employee insert 1");
        System.out.println("for remove Employee insert 2");
        System.out.println("for sing up professor insert 3");
        System.out.println("for remove professor insert 4");
        System.out.println("for sing up modul.Student insert 5");
        System.out.println("for remove modul.Student insert 6");
        System.out.println("for add course insert 7");
        System.out.println("for remove course insert 8");
        System.out.println("for modify employee insert 9");
        System.out.println("for modify student insert 10");
        System.out.println("for modify professor insert 11");
        System.out.println("for modify course insert 12");
        System.out.println("for see your information insert 13");
        System.out.println("exit 14");
        System.out.println("plese insert number");
    }

    public void StudentMenu() {
        boolean isRunner = true;
        while (isRunner) {
            System.out.println("\tfor select Course insert 1" +
                    "\n\tfor delete insert 2" +
                    "\n\tfor see your information insert 3");

        }
    }

}
