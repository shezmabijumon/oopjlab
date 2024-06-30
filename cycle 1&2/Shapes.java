import java.util.*;
import java.lang.Math;

public class Shapes {
    public static void area(int r){
        double area=3.14*r*r;
        System.out.println("area is "+area);
    }
    public static void area(int l,int b){
        int area=l*b;
        System.out.println("area is "+area);
    }
    public static void area(int a,int b,int c){
        double s=(a+b+c)/3;
        double p=s*(s-a)*(s-b)*(s-c);
        double area=Math.sqrt(p);
        System.out.println("area is "+area);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("1.circle\n2.rectangle\n3.triangle");
        System.out.print("enter choice:");
        int ch=s.nextInt();
        switch(ch){
            case 1:
            System.out.print("enter radius:");
            int r=s.nextInt();
            area(r);
            break;
            case 2:
            System.out.print("enter length and breadth:");
            int l=s.nextInt();
            int b=s.nextInt();
            area(l,b);
            break;
            case 3:
            System.out.print("enter sides of triangle:");
            int x=s.nextInt();
            int y=s.nextInt();
            int z=s.nextInt();
            area(x,y,z);
            break;
        }
    }
}
