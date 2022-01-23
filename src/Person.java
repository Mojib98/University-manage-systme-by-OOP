abstract public class Person {
    private String name;
    private String id;
    private String date;
    private String nationalCode;

    public Person(String name, String id, String date, String nationalCode) {
        this.name = name;
        this.id = id;
        this.date = date;
        this.nationalCode = nationalCode;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

   public void setDate(String date) {this.date = date;}

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }
}
