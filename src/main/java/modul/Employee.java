package modul;

import lombok.*;

import java.util.Date;

@Setter
@Getter

public class Employee extends Person {
    private String status;
    private String user;
    private String password;

    public Employee(String name, String id, Date date, String nationalCode, String status, String user, String password) {
        super(name, id, date, nationalCode);
        this.status = status;
        this.user = user;
        this.password = password;
    }

    public int getSalary(){
        return  1000000;

  }


}
