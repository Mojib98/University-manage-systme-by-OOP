package modul;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import modul.enumeration.Faculty;
import modul.enumeration.Status;

import java.util.Date;
@Setter
@Getter

public class Professor extends  Employee {
    private Status status;
    private Faculty faculty;
    private int unit = 0;

    public Professor(String name, String id, Date date, String nationalCode, String status, String user, String password) {
        super(name, id, date, nationalCode, status, user, password);
    }




    @Override
    public int getSalary() {
        if (status.equals(Status.HALTTIME))
           return super.getSalary();
        else
            return this.unit*1000000;
    }

}


