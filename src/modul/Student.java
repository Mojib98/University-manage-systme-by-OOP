package modul;

import modul.Course;
import modul.Person;

public class Student extends Person {
    String user;
    String password;
    private Course course;
    private String factuly;
    private int score;
    private
    int index = 0;
    private int units;
    public Student(String user,String password,String name, String id, String date, String nationalCode,String factuly) {
        super(name, id, date, nationalCode);
        this.factuly = factuly;
        this.user= user;
        this.password = password;
        //this.course = new modul.Course[10];
        courseList = new CourseList();
        this.units=0;
    }

    public String getFactuly() {
        return this.factuly;
    }
    public void showMyInfo(){

        System.out.println("name :"+getName());
        System.out.println("Id: "+getId());
        System.out.println("factuly"+getFactuly());
        System.out.println("date"+getDate());
        System.out.println("national"+getNationalCode());


       // System.out.println("hhh");
    }

    public void Score() {
        this.score = courseList.score();
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
    public void insertCourse(Course value){

    }
    public void showCourse(){
        courseList.showCourse();
    }
    public void selectCourse(Course v){
        setUnits();
        courseList.add(v);
            System.out.println("you cant");

    }
    private boolean check(){
        if (this.units < 20){
            return true;
        }
        else if (units == 20)
         return false;
        else return false;
    }
    public void setUnits(){
        this.units=courseList.allunit();
    }
    public void setScore(int score,int id){
        courseList.setGrade(id,score);
    }

}
