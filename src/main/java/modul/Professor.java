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
    private Faculty faculty;
    private int unit = 0;

    public Professor(String name, String id, Date date, String nationalCode, Status status, String user, String password,Faculty faculty) {
        super(name, id, date, nationalCode, status, user, password);
        this.faculty=faculty;
    }




    @Override
    public int getSalary() {
        if (status.equals(Status.HALTTIME))
           return super.getSalary();
        else
            return this.unit*1000000;
    }

}


