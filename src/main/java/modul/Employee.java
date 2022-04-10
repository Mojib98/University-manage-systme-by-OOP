package modul;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import modul.Person;

@Setter
@Getter
public class Employee extends Person {
    private String status;
    private String user;
    private String password;

    public Employee(String name, String id, String date, String nationalCode, String status, String user, String password) {
        super(name, id, date, nationalCode);
        this.status = status;
        this.user = user;
        this.password = password;
    }

    public void showMyInfo(){
      System.out.print(getName()+" ");
      System.out.print(getId());
      System.out.println(getDate());
      System.out.println(getNationalCode());
  }
  public int getSalary(){
        return  1000000;

  }

    @Override
    public String toString() {
        return "Employee{" +
                "status='" + status + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                "} " + super.toString();
    }
}
