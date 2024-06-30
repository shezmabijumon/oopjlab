class Person{
    String name;
    int age;
    void printname(){
        System.out.println("name is "+name);
    }
    void iseligible(){
        if(age>=18){
            System.out.println("is eligible");
        }
        else{
            System.out.println("not eligible");
        }
    }
}

public class Garbagecollector {
    public static void main(String[] args){
        Person p=new Person();
        Person q=new Person();
        p.name="shezma";
        p.age=15;
        p.printname();
        p.iseligible();
        q=null;
        System.gc();
    }
}
