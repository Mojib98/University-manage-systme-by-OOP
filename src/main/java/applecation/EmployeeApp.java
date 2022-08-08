package applecation;

import modul.*;
import modul.enumeration.Faculty;
import modul.enumeration.Status;
import system.Employee.EmployeeSystem;

import java.util.*;

public class EmployeeApp {
    private final List<Course> courseList;
    private final List<Employee> emplyeeList;
    private final List<Professor> professorList;
    private final List<Student> studentList;
    private String name, date, nationalCode, user, password;
    private final Scanner scanner;
    private final EmployeeSystem employeeSystem;

    public EmployeeApp(List<Course> courseList, List<Employee> emplyeeList, List<Professor> professorList, List<Student> studentList) {
        this.courseList = courseList;
        this.emplyeeList = emplyeeList;
        this.professorList = professorList;
        this.studentList = studentList;
        this.scanner = new Scanner(System.in);
        this.employeeSystem = new EmployeeSystem(this.courseList, this.emplyeeList, this.professorList, this.studentList);
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
        Date date1 = new Date(date);
        System.out.println("please insert national code");
        this.nationalCode = scanner.next();
    }

    public void insertProfessor() {
        try {
            giving();
            System.out.println("please insert Status full-timd --> 'ft' or half-time-->'ht'");
            String status = scanner.next().toUpperCase(Locale.ROOT);
            System.out.println("please insert faculty between 'math' and 'computer'");
            String faculty = scanner.next().toUpperCase(Locale.ROOT);
            employeeSystem.insertProfessor(this.user, this.password, this.name, new Date(), this.nationalCode, Status.valueOf(status), Faculty.valueOf(faculty));
        } catch (
                Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    public void insertStudent() {
        try {
            giving();
            System.out.println("insert faculty between 'computer' or 'math'");
            String fac = scanner.next();
            employeeSystem.insertStudent(this.user, this.password, this.name, new Date(), this.nationalCode, Faculty.valueOf(fac));
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    public void insertEmployee() {
        try {
            giving();

            employeeSystem.insertEmployee(this.user, this.password, this.name, new Date(), this.nationalCode);
            System.out.println("your employee add");
        } catch (NullPointerException e) {
            System.err.println("your employee add");
            System.out.println(e.getStackTrace());
        }
    }

    public void insertCourse() {
        try {
            System.out.println("plese insert course name");
            this.name = scanner.next();
            System.out.println("please insert unit insert integer");
            int unit = scanner.nextInt();
            System.out.println("please insert professor");
            String pro = scanner.next();
            Professor professor = findProfessor(pro);
            if (professor != null) {
                professor.setUnit(unit);
            } else {
                System.out.println("professor not find");
                return;
            }
            System.out.println("please insert your faculty between 'math' or 'computer'");
            String fc = scanner.next();
//            employeeSystem.insertCourse(ids, this.name, unit, pro, fc);
        } catch (InputMismatchException e) {
            System.out.println("your unit course is not true");
            scanner.reset();
        }
    }

    private Professor findProfessor(String name) {
        return professorList.stream().filter(p -> p.getName().equals(name)).findFirst().orElse(null);
    }

    public void deleteStudent() {
        try {
            System.out.println("insert Student name");
            String name = scanner.next();
            var list2 = studentList.iterator();
            while (list2.hasNext()) {
                if (list2.next().getName().equals(name)) ;
                System.out.println(list2 + " is delete");
                list2.remove();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteProfessor() {
        try {
            System.out.println("insert professor name");
            String name = scanner.next();
            var list2 = professorList.iterator();
            while (list2.hasNext()) {
                if (list2.next().getName().equals(name)) ;
                System.out.println(list2.next() + " is delete");
                list2.remove();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void deleteCourse() {
        try {
            System.out.println("insert Course name");
            String name = scanner.next();
            var list2 = courseList.iterator();
            while (list2.hasNext()) {
                if (list2.next().getName().equals(name)) ;
                System.out.println(list2.next() + " is delete");
                list2.remove();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteEmployee() {
        try {
            System.out.println("insert employee name");
            String name = scanner.next();
            for (Employee e : emplyeeList) {
                if (e.getName().equals(name)) {
                    System.out.println(e);
                    emplyeeList.remove(e);
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void modifyProfessor() {
    }

    public void modifyStudent() {
    }

    public void modifyEmployee() {
    }

    public void modifyCourse() {
    }

    public void myInformation(String name) {
        var emL = emplyeeList.iterator();
        while (emL.hasNext()) {
            if (emL.next().getName().equals(name))
                System.out.println(emL.next());
            break;
        }
    }

    private Faculty selectFaculty() {
        while (true) {
            System.out.println("\t\tplease select between faculty\n\t\t'MATH'," +
                    "\n\t\t'COMPUTER',\n\t\t'HUMANITIES',\n\t\t'ART',\n\t\t'ENGINEERING' ");
            String select = scanner.nextLine().toUpperCase(Locale.ROOT);
            switch (select) {
                case ("MATH"):
                    return Faculty.MATH;
                case ("COMPUTER"):
                    return Faculty.COMPUTER;
                case ("HUMANITIES"):
                    return Faculty.HUMANITIES;
                case ("ENGINEERING"):
                    return Faculty.ENGINEERING;
                case ("ART"):
                    return Faculty.ART;
                default:
                    continue;
            }
        }

    }
}

