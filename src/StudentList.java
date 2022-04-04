import modul.Course;
import modul.Student;
import system.UserNotFindeException;

public class StudentList {
    private Student[] list;
    private int emptyHomeIndex;

    public StudentList() {
        list = new Student[20];
        emptyHomeIndex = 0;
    }

    public void add(Student value) {
        try {

        list[emptyHomeIndex] = value;
        emptyHomeIndex++;
    }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getStackTrace());
        }}

    public Student get(String id) {
        for (Student c : list) {
            if (c.getId().equals(id))
                return c;
        }
        return null;
    }


    private int search(String id) {
        for (int i = 0; i < emptyHomeIndex ; i++) {
            String temp = list[i].getId();
            if (id.equals(temp)) {
                return i;
            }
        }
        return -1;
    }

    public void remove(String id) {
        try{
        int sigh = search(id);
        if (sigh == -1){
           throw new UserNotFindeException();
        }
        for (int ind = sigh; ind < this.emptyHomeIndex - 1; ind++)
            list[ind] = list[ind + 1];
        list[emptyHomeIndex - 1] = null;
        this.emptyHomeIndex--;
    }catch (Exception e){
            System.out.println("some things can't work currently "+e.getStackTrace());
        }
    }

    public void change(String id, String name) {
        try{
        int index = search(id);
        if (index == -1){
           throw new UserNotFindeException();
        }
        list[index].setName(name);

    }catch (Exception e){
            System.out.println("some things can't work currently "+e.getStackTrace());
        }}

    public void fac(String fc) {
        for (int i = 0 ;i<=emptyHomeIndex-1;i++){
            if (list[i].getFactuly().equals(fc))
                list[i].showMyInfo();
        }
    }

    public void insertScore(int score, String id,int idCourse) {
        try{
        int index = search(id);
        if (index == -1){
            throw  new UserNotFindeException();
        }
        else
        list[index].setScore(score,idCourse);
    }catch (Exception e){
            System.out.println("some things can't work currently " + e.getStackTrace());
        }}
    public boolean set(String user, String passwor) {
        for (Student c : list) {
            if (c.getUser().equals(user))
                if (c.getPassword().equals(passwor)) {
                    return true;
                }
        }
        return false;
    }

    public String getId(String user) {
        try {
        for (Student c : list) {
            if ((c.getUser().equals(user))) {
                return c.getId();
            }
        }}
        catch (Exception e){
                System.out.println(e.getStackTrace());
            }
        return null;
    }

    public void showcorse(String id) {
        int in = search(id);
        list[in].showCourse();
    }

    public void showInfo(String id) {
            try{
        int n = search(id);
        if (n==-1){
            throw new UserNotFindeException();
        }
        list[n].showMyInfo();
    }catch (Exception e){
                System.out.println("some things can't work currently "+e.getStackTrace());
            }}

    public String faculty(String id) {
        int index = search(id);
        String f = list[index].getFactuly();
        return f;

    }

    public void insertCourse(String ids, Course c) {
        int index = search(ids);
        list[index].selectCourse(c);
    }

    public void changeModify(String id, String date) {
        int index = search(id);
        list[index].setDate(date);
    }
   /* public void showByProfessor(String name){
        for (modul.Student student:list){
            student.get
        }
    }*/


}

