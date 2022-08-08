package applecation;

import exception.UserInputExcention;
import modul.*;
import modul.enumeration.Faculty;
import modul.enumeration.Status;
import system.Employee.EmployeeSystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class EmployeeApp {
    private final List<Course> courseList;
    private final List<Employee> emplyeeList;
    private final List<Professor> professorList;
    private final List<Student> studentList;
    private String name, date, nationalCode, user, password;
    private Date date1;
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
        this.user = scanner.nextLine();
        System.out.println("please insert password");
        this.password = scanner.nextLine();
        System.out.println("please insert name");
        this.name = scanner.nextLine();
        this.date1 = getDate();
        System.out.println("please insert national code");
        this.nationalCode = scanner.nextLine();
    }

    public void insertProfessor() {
        try {
            giving();
            Status status = selectStatus();
            Faculty faculty = selectFaculty();
            employeeSystem.insertProfessor(this.user, this.password, this.name, this.date1, this.nationalCode, status, faculty);
        } catch (
                Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    public void insertStudent() {
        try {
            giving();
            Faculty faculty = selectFaculty();
            employeeSystem.insertStudent(this.user, this.password, this.name, new Date(), this.nationalCode, faculty);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    public void insertEmployee() {
        try {
            giving();
            employeeSystem.insertEmployee(this.user, this.password, this.name, this.date1, this.nationalCode);
            System.out.println("your employee add");
        } catch (NullPointerException e) {
            System.err.println("your employee add");
            System.out.println(e.getStackTrace());
        }
    }

    public void insertCourse() {
        try {
            System.out.println("\t\tplease  insert course name");
            this.name = scanner.next();
            System.out.println("\t\tplease insert unit insert integer");
            int unit = scanner.nextInt();
            Professor professor = findProfessor();
            employeeSystem.insertCourse(this.name, unit, professor);
        } catch (InputMismatchException e) {
            System.out.println("your unit course is not true");
            scanner.reset();
        }
    }

    private Professor findProfessor() {
        while (true) {
            try {
                System.out.println("\t\t insert professor name ");
                String name = scanner.nextLine();
                return professorList.stream().filter(p -> p.getName().equals(name)).findFirst().orElseThrow();
            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }
        }
    }


    public void deleteStudent() {
        try {
            System.out.println("insert Student name");
            String name = scanner.nextLine();
            Student student = studentList.stream().filter(p -> p.getName().equals(name)).findFirst().orElse(null);
            employeeSystem.removeStudent(student);
/*

            var list2 = studentList.iterator();
            while (list2.hasNext()) {
                if (list2.next().getName().equals(name)) ;
                System.out.println(list2 + " is delete");
                list2.remove();
                break;
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteProfessor() {
        try {
            Professor professor = findProfessor();
            employeeSystem.removeProfessor(professor);

        /*    var list2 = professorList.iterator();
            while (list2.hasNext()) {
                if (list2.next().getName().equals(name)) ;
                System.out.println(list2.next() + " is delete");
                list2.remove();
                break;
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void deleteCourse() {
        try {
            System.out.println("insert Course name");
            String name = scanner.next();
            Course course = courseList.stream().filter(p -> p.getName().equals(name)).findFirst().orElse(null);
            employeeSystem.removeCourse(course);
         /*   var list2 = courseList.iterator();
            while (list2.hasNext()) {
                if (list2.next().getName().equals(name)) ;
                System.out.println(list2.next() + " is delete");
                list2.remove();
                break;
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteEmployee() {
        try {
            System.out.println("insert employee name");
            String name = scanner.next();
            Employee employee = emplyeeList.stream().filter(p -> p.getName().equals(name)).findFirst().orElseThrow();
            employeeSystem.removeEmplyee(employee);
         /*   for (Employee e : emplyeeList) {
                if (e.getName().equals(name)) {
                    System.out.println(e);
                    emplyeeList.remove(e);
                    break;
                }
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void modifyProfessor() {
        giving();
        Status status = selectStatus();
        Faculty faculty = selectFaculty();
        Professor professor = findProfessor();
        professor.setFaculty(faculty);
        professor.setStatus(status);
        Integer index = professorList.indexOf(professor);
        employeeSystem.modifyProfessor(professor, index);
    }

    public void modifyStudent() {
        giving();
        Faculty faculty = selectFaculty();
        try {
            Student student = studentList.stream().filter(p -> p.getName().equals(this.name)).findFirst()
                    .orElseThrow(() -> new RuntimeException("your student not find"));
            Integer index = studentList.indexOf(student);
            assert student != null;
            student.setFaculty(faculty);
            employeeSystem.modifyStudent(student, index);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void modifyEmployee() {
        giving();
        try {
            Employee employee = emplyeeList.stream().filter(p -> p.getName().equals(this.name)).findFirst()
                    .orElseThrow(() -> new RuntimeException("yor employee not find"));
            Integer index = emplyeeList.indexOf(employee);
            employeeSystem.modifyEmplyee(employee, index);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void modifyCourse() {
        giving();
        Status status = selectStatus();
        Faculty faculty = selectFaculty();
        try {
            Course course = courseList.stream().filter(p -> p.getName().equals(this.name)).findFirst()
                    .orElseThrow(() -> new RuntimeException("yor course not find"));
            Professor professor = findProfessor();
            Integer index = courseList.indexOf(course);
            employeeSystem.modifyCourse(index, course);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
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

    private Status selectStatus() {
        while (true) {
            System.out.println("\t\tplease select between status\n\t\t'FULLTIME'," +
                    "\n\t\t'HALTTIME',\n\t\t'ACTIVE' ");
            String select = scanner.nextLine().toUpperCase(Locale.ROOT);
            switch (select) {
                case ("FULLTIME"):
                    return Status.FULLTIME;
                case ("HALTTIME"):
                    return Status.HALTTIME;
                case ("ACTIVE"):
                    return Status.ACTIVE;
                default:
                    continue;
            }
        }

    }

    private Date getDate() {
        while (true) {
            try {
                System.out.println("please insert date dd/MM/yyyy ");
                String date = scanner.nextLine();
                return new SimpleDateFormat("dd/MM/yyyy").parse(date);
            } catch (ParseException e) {
                System.out.println("insert like pattern");
                continue;

            }
        }

    }
}


