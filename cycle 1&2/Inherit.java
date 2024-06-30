
class Emp{
    public String name;
    int age;
    String phn;
    String addr;
    int sal;
    public void printsal(){
        System.out.println(sal);
    }
}
class Officer extends Emp{
    String specl;
}
class Manager extends Emp{
    String dept;
}

public class Inherit {
    public static void main(String[] args){
        Officer o=new Officer();
        Manager m= new Manager();
        o.name="soorya";
        o.age=19;
        o.phn="8089489084";
        o.addr="MH";
        o.specl="asgd";
        o.sal=15000;
        System.out.println(o.name);
        System.out.println(o.age);
        System.out.println(o.phn);
        System.out.println(o.addr);
        System.out.println(o.specl);
        o.printsal();
        m.name="shezma";
        m.age=19;
        m.phn="9400301678";
        m.addr="vanitha mithram";
        m.dept="asgd";
        m.sal=25000;
        System.out.println(m.name);
        System.out.println(m.age);
        System.out.println(m.phn);
        System.out.println(m.addr);
        System.out.println(m.dept);
        m.printsal();
    }
}
