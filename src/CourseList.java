public class CourseList {
    private Course[] list;
    private int emptyHomeIndex;

    public CourseList() {
        list = new Course[20];
        emptyHomeIndex = 0;
    }

    public void add(Course value) {
        list[emptyHomeIndex] = value;
        emptyHomeIndex++;
    }

    public Course get1(int index) {
        return list[index];
    }

    public Course get(int id) {
        for (Course c: list) {
            if (id==c.getId())
                return c;
        }
        return null;
    }
    private int search(int id){
        for (int i =0;i<emptyHomeIndex-1;i++){
            if(id == list[i].getId())
                return i;
        }
        return -1;

    }


    public void remove(int id){
        int index = search(id);
        for (int ind=index;ind<this.emptyHomeIndex-1;ind++)
            list[ind]=list[ind+1];
        list[emptyHomeIndex-1]=null;
        this.emptyHomeIndex--;
    }
    public Course factulyId(String facul){
        for (Course c: list) {
            if (facul.equals(c.getFactuly()))
                return c;
        }
        return null;
    }

    public Course[] getList() {
        return list;
    }
    public String fc(int i){
        return list[i].getFactuly();
    }
    public void showCourse(){
      for (int i = 0;i<=emptyHomeIndex;i++){
          System.out.println("name: "+list[i].getName());
          System.out.println("faculty: "+list[i].getFactuly());
          System.out.println("id: "+list[i].getId());
          System.out.println("unit: "+list[i].getUnit());
      }
    }
    public Course getc(int id){
        int ind=search(id);
        return list[ind];
    }
    public void changeProfessor(int id,String professor){
        int index=search(id);
        list[index].setProfessorName(professor);
    }
    public int allunit(String name){
        int unit =0;
        for (Course v:list
             ) {
            if(v.getName().equals(name))
                unit +=v.getUnit();
        }
        return unit;
    }
}
