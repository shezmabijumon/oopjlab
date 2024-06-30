class Shapes{
    int numberofsides(){
        return 0;
    }
}
class Rectangle extends Shapes{
    int numberofsides(){
        return 4;
    }
}
class Triangle extends Shapes{
    int numberofsides(){
        return 3;
    }
}
class Hexagon extends Shapes{
    int numberofsides(){
        return 6;
    }
}
public class Abst {
    public static void main(String[] args){
        Triangle t=new Triangle();
        Rectangle r=new Rectangle();
        Hexagon h= new Hexagon();
        System.out.println("number of sides of triangle= "+ t.numberofsides());
        System.out.println("number of sides of rectangle= "+ r.numberofsides());
        System.out.println("number of sides of hexagon= "+ h.numberofsides());
    }
    
}
