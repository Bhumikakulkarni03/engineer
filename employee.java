public class employee extends devops_eng{
    int id;
    String name;
    int salary;
    void read(){
        // System.out.println("Enter id name and salary of employee");
        // Scanner s=new Scanner(System.in);
        // id=s.nextInt();
        // name=s.next();
        // salary=s.nextInt();
        id=001;
        name="ramesh";
        salary=10000;
    }
    void display(){
        System.out.println("Id: "+id+"\nName: "+name+"\nSalary: "+salary);
    }
    public static void main(String[] args) {
        employee e1=new employee();
        e1.read();
        e1.display();
        devops_eng d1 =new devops_eng();
        d1.readbonus();
        System.out.println(d1.calculate());
    }
}