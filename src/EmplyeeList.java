import java.util.Objects;

public class EmplyeeList {
    private Employee[] list;
    private int emptyHomeIndex;

    public EmplyeeList() {
        list = new Employee[20];
        emptyHomeIndex = 0;
    }

    public void add(Employee value) {
        list[emptyHomeIndex] = value;
        emptyHomeIndex++;
    }

    public Employee get1(int index) {
        return list[index];
    }

    public Employee get(String id) {
        for (Employee c: list) {
            if (id.equals(c.getId()))
                return c;
        }
        return null;
    }
    public int search(String id){
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
        for (Employee c :list){
            if((c.getUser().equals(user)) && (c.getPassword().equals(passwor))){
                return true;
            }
        }
        return false;
    }
    public void changeName(String id,String name){
        int index=search(id);
        list[index].setName(name);
    }
    public int searchuser(String user){
        int s=0;
        for (int i =0;i<=emptyHomeIndex-1;i++){
            if(list[i].getUser().equals(user))
                s=i;
        }
        return s;

    }
    public void seeInformation(String user){
        int index=searchuser(user);
        list[index].showMyInfo();
    }
    public void salary(String user){
        int index=searchuser(user);
        System.out.println(list[index].getSalary());
    }

}
