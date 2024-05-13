public class emp {
    int id;
    String name;
    double sal;
    emp(){
        id=001;
        name="ravi";
        sal=29000;
    }
    void display(){
        System.out.println("Id:"+id);
        System.out.println("name:"+name);
        System.out.println("salary"+sal);
    }
    public static void main(String[] args) {
        emp e1=new emp();
        e1.display();
        eng e2=new eng(20000.0, 5);
        e2.calculate();
    }
}
