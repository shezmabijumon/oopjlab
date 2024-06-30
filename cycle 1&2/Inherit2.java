
class Emp{
    void display(){
        System.out.println("employee class");
    }
    void calcsal(){
        System.out.println("10000");
    }
}
class Engg extends Emp{
    void calcsal(){
        System.out.println("20000");
    }
}

public class Inherit2 {
    public static void main(String[] args){
        Engg e=new Engg();
        e.calcsal();
        e.display();
    }
    
}
