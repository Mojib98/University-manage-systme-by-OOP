package applecation;

import modul.Course;
import modul.Employee;
import modul.Professor;
import modul.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    List<Student> studentList = new ArrayList<>();
    List<Professor> professorList = new ArrayList<>();
    List<Course> courseList = new ArrayList<>();
    List<Employee> employeeList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    EmployeeApp employeeApp = new EmployeeApp(courseList,employeeList,professorList,studentList);
    private void employeeMenu(){
        while (true){
            showEmployeeAction();
            int select=scanner.nextInt();
            switch (select) {
                case 1:
                    employeeApp.insertEmployee();
                    break;
                case 2:

                case 3:
                    employeeApp.insertProfessor();
                    break;
                case 4:
                case 5:
                    employeeApp.insertStudent();
                    break;
                case 6:
                case 7:
                    employeeApp.insertCourse();
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:

            }
        }
    }
    private void showEmployeeAction() {
        System.out.println("for sing up modul.Employee insert 1");
        System.out.println("for remove modul.Employee insert 2");
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
}
