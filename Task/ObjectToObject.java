package Task;
class Organization{
    String empName;
    public Organization(String name) {
        this.empName=name;
    }
    public void details() {
        System.out.println(empName);
    }
}
public class ObjectToObject {
    public static void main(String[] args) {
        Organization o1 = new Organization("kiruthika");
        o1.details();
        Organization o1 = new Organization("harshini");
        o1.details();
    }
}
