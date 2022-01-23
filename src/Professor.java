
public class Professor extends Employee {
    private String status;
    private String faculty;

    public String getFaculty() {
        return faculty;
    }

    public Professor(String user, String pas, String name, String id, String date, String nationalCode, String status, String faculty) {
        super(user,pas,name, id, date, nationalCode);
        this.status = status;
        this.faculty = faculty;
    }

 /*   @Override
    public int getSalary() {
        return super.getSalary();
    }*/
    public void showInformation(){
        System.out.println("name : "+this.getName());
        System.out.println("id: " + this.getId());
        System.out.println("national code "+this.getNationalCode());
        System.out.println("status : "+this.getStatus());
        System.out.println("faculty: "+getFaculty());
    }

    @Override
    public String getStatus() {
        return status;
    }

    public int getSalary1(int unit) {
        return unit*1000000;
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }
}


