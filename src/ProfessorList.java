
public class ProfessorList {
    private Professor[] list;
    private int emptyHomeIndex;

    public ProfessorList() {
        list = new Professor[20];
        emptyHomeIndex = 0;
    }

    public void add(Professor value) {
        list[emptyHomeIndex] = value;
        emptyHomeIndex++;
    }

    public Professor get1(int index) {
        return list[index];
    }

    public Professor get(String id) {
        for (Professor c: list) {
            if (id.equals(c.getId()))
                return c;
        }
        return null;
    }
    private int search(String id){
        for (int i =0;i<=emptyHomeIndex-1;i++){
            if(id.equals(list[i].getId()))
                return i;
        }
        return -1;

    }


    public void remove(String id){
        int index = search(id);
        for (int ind=index;ind<this.emptyHomeIndex-1;ind++)
            list[ind]=list[ind+1];
        list[emptyHomeIndex-1]=null;
        this.emptyHomeIndex--;
    }
    public  boolean set(String user,String passwor){
        for (int i = 0;i<=emptyHomeIndex-1;i++){
            if((list[i].getUser().equals(user)) && (list[i].getPassword().equals(passwor))){
                return true;
            }
        }
        return false;
    }
    public String idProfessor(String user){
        String ids=" ";
        for (int i = 0 ;i<=emptyHomeIndex-1;i++){
            if (list[i].getUser().equals(user)) {
                ids = list[i].getId();
            }}
            return ids;
    }
    public void show(String id){
        int index=search(id);
        list[index].showInformation();
    }
    public String faculty(String id){
        String faculty;
        int index = search(id);
      faculty = list[index].getFaculty();
      return  faculty;
    }
    public void modifyNational(String id,String national){
        int index=search(id);
        list[index].setNationalCode(national);
    }
    public String getName(String id){
        int indexs = search(id);
      return   (list[indexs].getName());
    }
    public int salary(int unit, String status, String id){
        int index = search(id);
        int salaty=0;
        if (status.equals("ft")){
            salaty=list[index].getSalary1(unit);
        }
        else
           salaty= list[index].getSalary();

        return salaty;
    }
    public String satus(String id){
        int i=search(id);
       return list[i].getStatus();
    }

}
