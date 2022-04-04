package system;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;


public class System1 {
    // EmplyeeList emplyeeList = new EmplyeeList();
    //ProfessorList professorList =new ProfessorList();
    //  StudentList studentList = new StudentList();
    // Scanner scanner;
    private String name;
    private String date;
    private String nationalCode;
    private String user;
    private String password;
    private Random rand;
    private Scanner scanner;
    private String id;
    private String user1;
    private String password1;
    private System0 system0;

    public System1() {
        rand = new Random();
        scanner = new Scanner(System.in);
        system0 = new System0();
        system0.insertEmployee("admin", "admin", "majid", "admin", "admin", "admon");
        system0.insertStudent("m", "m", "mojib", "Sm", "m", "m", "m");
        system0.insertCourse(1, "reyazi", 3, "ahmad", "m");
        system0.insertCourse(2, "reyazi2", 3, "ahmadi", "m");
        system0.insertProfessor("ahamd", "ahmad", "ahmad", "q", "q", "q,", "ht", "m");
        system0.insertProfessor("f", "f", "q", "q", "q", "f", "ft", "m");
        system0.insertStudent("w", "w", "m", "Sm", "m", "m", "m");

    }

    //_____***********************************____________
    public void doIt() {
        while (true) {
            System.out.println("please insert user");
            user = scanner.next();
            System.out.println("please inser password");
            password = scanner.next();
            System.out.println();
            System.out.println("plese insert your type 'e','p','s");
            if (user.equals("admin") && password.equals("admin"))
                empolyee(user, password);
            char type = scanner.next().charAt(0);
            if (search(user, password, type)) {
                if (type == 'e' || user.equals("admin")) {
                    empolyee(user, password);
                } else if (type == 's') {
                    student(user);
                } else if (type == 'p') {
                    professor(user);

                } else
                    continue;
            }
        }
    }

    public void empolyee(String user, String password) {
        boolean isTrue = true;
        while (isTrue) {

            int i=0;
            try {
                showEmployeeAction();
                i = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("worng input");
            }
            switch (i) {
                case 1:
                    try {
                    giving();
                    id = "E";
                    id = id + (rand.nextInt(1000));
                    system0.insertEmployee(this.user, this.password, this.name, id, this.date, this.nationalCode);
                    System.out.println("your employee add");
                    break;
                    }
                    catch (NullPointerException e){
                        System.out.println(e.getStackTrace());
                        break;
                    }

                case 2:
                    try {
                    System.out.println("plese insert id");
                    String idn = scanner.next();
                    system0.removeEmplyee(idn);
                    System.out.println("your modul.Employee remove");
                    break;}
                    catch (NullPointerException e){
                        System.out.println(e.getStackTrace());

                    }
                case 3:
                    try {
                        giving();
                    System.out.println("please insert Status full-timd --> 'ft' or half-time-->'ht'");
                    String status = scanner.next();
                    System.out.println("please insert faculty between 'math' and 'computer'");
                    String faculty = scanner.next();
                    id = "P";
                    id = id + (rand.nextInt(1000));
                    system0.insertProfessor(this.user, this.password, this.name, id, this.date, this.nationalCode, status, faculty);
                    break;}
                    catch (Exception e){
                        System.out.println(e.getStackTrace());
                        break;
                    }
                case 4:
                    try {
                    System.out.println("please insert id");
                    String id = scanner.next();
                    system0.removeProfessor(id);
                    break;}
                    catch (Exception e){
                        System.out.println(e.getStackTrace());
                        break;
                    }
                case 5:
                    try {
                        giving();
                    id = "S";
                    id = id + (rand.nextInt(1000));
                    System.out.println("insert faculty between 'computer' or 'math'");
                    String fac = scanner.next();
                    system0.insertStudent(this.user, this.password, this.name, id, this.date, this.nationalCode, fac);
                    break;}
                    catch (Exception e){
                        System.out.println(e.getStackTrace());
                        break;
                    }
                case 6:
                    try{
                    System.out.println("insert id");
                    id = scanner.next();
                    system0.removeStudent(id);
                    break;}
                    catch (Exception e){
                        System.out.println(e.getStackTrace());
                        break;

                    }

                case 7:
                    try {
                        System.out.println("plese insert course name");
                        this.name = scanner.next();
                        System.out.println("please insert unit insert integer");
                        int unit = scanner.nextInt();
                        System.out.println("please insert professor");
                        String pro = scanner.next();
                        System.out.println("please insert your faculty between 'math' or 'computer'");
                        String fc = scanner.next();
                        int ids = (rand.nextInt(1000));
                        system0.insertCourse(ids, this.name, unit, pro, fc);
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("your unit course is not true");
                    }

                case 8:
                    try {
                        System.out.println("insert id course");
                        int ide = scanner.nextInt();
                        system0.removeCourse(ide);
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("your id course is not true");
                    }
                    catch (NullPointerException e){
                        System.out.println(e.toString());
                    }

                case 9:
                    try{
                    System.out.printf("please insert id");
                    String nowId = scanner.next();
                    System.out.printf("please insert new name");
                    this.name = scanner.next();
                    system0.modifyEmplyee(nowId, name);
                    break;}
                    catch (Exception e){
                        System.out.println(e.getStackTrace());
                        break;
                    }
                case 10:
                    try{
                    System.out.printf("please insert id");
                    String idi = scanner.next();
                    System.out.printf("insert new date");
                    this.date = scanner.next();
                    system0.modifyDateStudent(idi, date);
                    break;}
                    catch (Exception e){
                        System.out.println(e.getStackTrace());
                        break;
                    }
                case 11:
                    try{
                    System.out.printf("plaese insert new nationalCode ");
                    this.nationalCode = scanner.next();
                    System.out.printf("please insert professot id");
                    this.id = scanner.next();
                    system0.changeNatianalCodeProfessor(this.id, this.nationalCode);
                    break;}
                    catch (Exception e){
                        System.out.println(e.getStackTrace());
                        break;

                    }
                case 12:
                    try {

                        System.out.printf("please insert id course");
                        int d = scanner.nextInt();
                        System.out.printf("please insert new professor");
                        String p = scanner.next();
                        system0.changeProfessorCourse(d, p);
                    } catch (InputMismatchException e) {
                        System.out.println("your id course is not true");
                    }

                case 13:try {

                    system0.informationEmployee(user);
                    system0.salary(user);}
                catch (NullPointerException e){
                    System.out.println(e.getStackTrace());
                    break;
                }
                case 14:
                    isTrue = false;
            }
        }

    }

    public void student(String user) {
        String ids=null;
        int select;
        String faculty = null;
        boolean isRun = true;
        try{
        ids = system0.idStudent(user);
        System.out.println(ids);
        faculty = system0.myFaculty(ids);
        }
        catch (Exception e){
            System.out.println(e.getStackTrace());
        }
        while (isRun) {
            try {

                System.out.println("for see your information insert 1");
                System.out.println("for select course insert 2");
                System.out.println("for see your course insert 3");
                System.out.println("please insert number ");
                select = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("your insert is not true");
                break;
            }

            switch (select) {
                case 1:
                    try {
                        system0.showInfoStuden(ids);
                        break;
                    }
                    catch (NullPointerException e) {
                        System.out.println(e.getLocalizedMessage());
                        break;
                    }

                case 2:
                    try {
                        system0.showCoures();
                        int d = scanner.nextInt();
                        system0.selecrCourse(d, ids);
                    } catch (InputMismatchException e) {
                        System.out.println("your id faculty is not true");
                    }
                    catch (NullPointerException e) {
                        System.out.println("s "+e.getMessage());
                        break;
                    }
                case 3:

                    try {
                        system0.showCourse(ids);
                    break;}
                    catch (NullPointerException e) {
                        System.out.println(e.getMessage());
                        break;
                    }
            }
        }

    }


    public void professor(String user) {
        boolean isused = true;
        String id=null;
        String fc=null;
        String select1;
        int score;
        int selection;
        try {
            id = system0.idProfessor(user);
             fc = system0.facultyProfessor(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        while (isused) {
            try {
                System.out.println("for see your info insert 1");
                System.out.println("for insert Score insert 2");
                System.out.println("for see your salary insert 3");
                System.out.println("for exit insert 4");
                selection = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("your insert is not true");
                break;
            }
            switch (selection) {
                case 1:
                    try{
                    system0.showInformationProfessor(id);
                    break;
                    }
                    catch (NullPointerException e){
                        System.out.println(e.getStackTrace());
                        break;
                    }
                case 2:
                    try {
                        system0.showMyStudent(fc);
                        System.out.println("insert id of student");
                        select1 = scanner.next();
                        System.out.println();
                        System.out.println("please insert your idCourser");
                        int idc=scanner.nextInt();
                        System.out.println("please insert Score");
                        score = scanner.nextInt();
                        system0.insertScore(score, select1,idc);
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("your grade is not true");
                    }

                case 3:
                    try{
                    system0.salary(this.user);
                    break;}
                    catch (NullPointerException e){
                        System.out.println(e.getStackTrace());
                        break;
                    }
                case 4:
                    isused = false;


            }
        }


    }

    public boolean search(String user, String password, char e) {
        if (e == 'e')
            if (system0.isCheckEmployee(user, password))
                return true;
            else
                return false;
        else if (e == 's')
            if (system0.isCheckerStudent(user, password))
                return true;
            else
                return false;
        else if (e == 'p')
            return system0.isCheckProfessor(user, password);

        return false;

    }

    public void showEmployeeAction() {
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

    public void giving() {
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


}
