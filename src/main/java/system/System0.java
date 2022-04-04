package system;

import modul.*;

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
    public void insertScore(int score,String id,int idcourse){
       try {
           studentList.insertScore(score,id,idcourse);
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
    public void showCoures(){
     try {
         courseList.showCourse();
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

    catch (NullPointerException e){
        System.out.println(e.getStackTrace());
        return null;
    }
    }
    public void selecrCourse(int id,String ids){
    try {
        Course course1=courseList.get(id);

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
        return null;
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
       return s;
        }
    catch (NullPointerException e){
        System.out.println(e.getStackTrace());
        return null;
    }
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
