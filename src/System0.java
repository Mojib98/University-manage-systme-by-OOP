import java.io.PrintStream;
import java.util.*;
public class System0 {
   // public static PrintStream out;
   // public static String in;
    //  public static PrintStream out;
   CourseList courseList ;
    EmplyeeList emplyeeList ;
    ProfessorList professorList;
    StudentList studentList;

    Student student ;
    Course course;
    Employee employee;
    Professor professor;


    public System0() {

        this.courseList = new CourseList();
        this.emplyeeList = new EmplyeeList();
       this.professorList =new ProfessorList();
       this.studentList = new StudentList();
    }
    public void insertCourse(int id,String name,int unit,String professor,String factuly){
        course = new Course(id,name,unit,professor,factuly);
        courseList.add(course);
    }
    public void removeCourse(int id){
        courseList.remove(id);
    }
    public void insertEmployee(String user,String pas,String name,String id,String date,String national){
        employee = new Employee(user,pas,name,id,date,national);
        emplyeeList.add(employee);
        System.out.printf("your employee added");
    }
    public void removeEmplyee(String id){
        emplyeeList.remove(id);
    }
    public void modifyEmplyee(String id,String name){
        emplyeeList.changeName(id,name);
    }
    public void insertProfessor(String user,String pass,String name,String id,String date,String nationaCode,String status,String faculty){
        professor = new Professor(user,pass,name,id,date,nationaCode,status,faculty);
        professorList.add(professor);
    }
    public void removeProfessor(String id){
        professorList.remove(id);
    }

    public void insertStudent(String user,String password,String name,String id,String date,String nationaCode,String fac){
        student = new Student(user,password,name,id,date,nationaCode,fac);
        studentList.add(student);
    }
    public void removeStudent(String id){
        studentList.remove(id);
    }
    public void modifyDateStudent(String id,String date){
        studentList.changeModify(id,date);
    }
    public boolean isCheckEmployee(String user,String password){
        if (emplyeeList.set(user,password))
            return true;
        else
            return false;
    }
    public void showMyStudent(String fac){
        studentList.fac(fac);
    }
    public void insertScore(double score,String id){
        studentList.insertScore(score,id);
    }
    public boolean isCheckerStudent(String user,String password){
        if (studentList.set(user,password))
            return true;
        else
            return false;
    }
    public String idStudent(String user){
        String ids = studentList.getId(user);
        return ids;
    }
    public void showCourse(String id){
        studentList.showcorse(id);
    }
    public void showInfoStuden(String id){
        studentList.showInfo(id);
    }
    public boolean isCheckProfessor(String user,String password){
        return (professorList.set(user,password));
    }
    public void myFacultyCourse(String faculty){
        System.out.println(courseList.factulyId(faculty));
    }
    public String myFaculty(String id){
        String fa = " ";
        fa = studentList.faculty(id);
        return fa;
    }
    public void selecrCourse(int id,String ids){
        Course course1=courseList.get1(id);
        studentList.insertCourse(ids,course1);
    }
    public String idProfessor(String user){
        String idp =" ";
      idp = professorList.idProfessor(user);
      return idp;
    }
    public void showInformationProfessor(String id){
        professorList.show(id);
    }
    public String facultyProfessor(String id){
       String s= professorList.faculty(id);
       return s;
    }
    public void changeNatianalCodeProfessor(String id ,String natinal){
        professorList.modifyNational(id,natinal);
        System.out.printf("accept");
    }
    public void changeProfessorCourse(int id,String name){
        courseList.changeProfessor(id,name);
    }
    public void informationEmployee(String user){
        emplyeeList.seeInformation(user);
    }
    public void salary(String user){
        emplyeeList.salary(user);
    }
    public void salaryProfessor(String user){
        int unit = 1;
        String ids=idProfessor(user);
        String name=professorList.getName(ids);
        unit = courseList.allunit(name);
        String satus=professorList.satus(ids);
        int salary = professorList.salary(unit,satus,ids);
        System.out.println(salary);

    }



}
