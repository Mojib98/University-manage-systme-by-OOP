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
        try {
        course = new Course(id,name,unit,professor,factuly);
        courseList.add(course);
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
        employee = new Employee(user,pas,name,id,date,national);
        emplyeeList.add(employee);
        System.out.printf("your employee added");
    }
    public void removeEmplyee(String id){
        try {
        emplyeeList.remove(id);
    }catch (NullPointerException e){
            System.out.println(e.getStackTrace());

        }}
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
        try {
        studentList.remove(id);
    }catch (NullPointerException e){
            System.out.println(e.getStackTrace());

        }}
    public void modifyDateStudent(String id,String date){
        try {
            studentList.changeModify(id,date);
        }catch (NullPointerException e){
            System.out.println(e.getStackTrace());

        }}
    public void showCourse(String id){
        studentList.showcorse(id);
    }
    public boolean isCheckEmployee(String user,String password){
        try {if (emplyeeList.set(user,password))
            return true;
        else
            return false;
    }catch (NullPointerException e){
            System.out.println(e.getStackTrace());
            return false;

        }}
    public void showMyStudent(String fac){
      try {
          studentList.fac(fac);
      }catch (NullPointerException e){
          System.out.println(e.getStackTrace());

      }
    }
    public void insertScore(double score,String id){
       try {
           studentList.insertScore(score,id);
       }catch (NullPointerException e){
           System.out.println(e.getStackTrace());

       }
    }
    public boolean isCheckerStudent(String user,String password){
     try {
         if (studentList.set(user,password))
             return true;
         else
             return false;
     }catch (NullPointerException e){
         System.out.println(e.getStackTrace());
         return false;

     }
    }
    public String idStudent(String user){
       try {
           String ids = studentList.getId(user);
           return ids;
       }  catch (NullPointerException e){
           System.out.println(e.getStackTrace());
           return null;

       }   }
    public void showInfoStuden(String id){
    try {
        studentList.showInfo(id);
    }catch (NullPointerException e){
        System.out.println(e.getStackTrace());

    }
    }
    public boolean isCheckProfessor(String user,String password){
        try {

        return (professorList.set(user,password));
    }catch (NullPointerException e){
            System.out.println(e.getStackTrace());

        }
        return false;
    }
    public void myFacultyCourse(String faculty){
     try {
         System.out.println(courseList.factulyId(faculty));
     }
     catch (NullPointerException e){
         System.out.println(e.getStackTrace());
     }
    }
    public String myFaculty(String id){
       try {
           String fa = " ";
           fa = studentList.faculty(id);
           return fa;
       }

    } catch (NullPointerException e){
        System.out.println(e.getStackTrace());
    }
    public void selecrCourse(int id,String ids){
    try {
        Course course1=courseList.get1(id);

        studentList.insertCourse(ids,course1);
    }catch (NullPointerException e){
        System.out.println(e.getStackTrace());
    }}
    public String idProfessor(String user){
    try {
        String idp =" ";
      idp = professorList.idProfessor(user);
      return idp;
    }catch (NullPointerException e){
        System.out.println(e.getStackTrace());
    }}
    public void showInformationProfessor(String id){
      try {
          professorList.show(id);
      }catch (NullPointerException e){
          System.out.println(e.getStackTrace());
      }
    }
    public String facultyProfessor(String id) {
        try {

       String s= professorList.faculty(id);
       return s;}
    }catch (NullPointerException e){
        System.out.println(e.getStackTrace());
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
      try {
          int unit = 1;

        String ids=idProfessor(user);
        String name=professorList.getName(ids);
        unit = courseList.allunit(name);
        String satus=professorList.satus(ids);
        int salary = professorList.salary(unit,satus,ids);
        System.out.println(salary);

    }catch (NullPointerException e){
          System.out.println(e.getStackTrace());

      }}

}
