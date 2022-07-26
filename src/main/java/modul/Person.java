package modul;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
 public abstract class Person {
    private String name;
    private String id;
    private Date date;
    private String nationalCode;

    public Person(String name, String id, Date date, String nationalCode) {
        this.name = name;
        this.id = id;
        this.date = date;
        this.nationalCode = nationalCode;
    }
}
