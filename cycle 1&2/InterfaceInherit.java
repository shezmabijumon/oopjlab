interface Dog{
    void bark();
}
interface Cat{
    void meow();
}
class Animals implements Dog,Cat{
    public void bark(){
        System.out.println("dog is barking");
    }
    public void meow(){
        System.out.println("cat is meowing");
    }
}

public class InterfaceInherit {
    public static void main(String[] args){
        Animals a=new Animals();
        a.bark();
        a.meow();
    }
}
