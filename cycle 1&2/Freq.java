import java.util.*;

public class Freq {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("enter string:");
        String str =s.nextLine();
        System.out.print("enter key:");
        char key = s.next().charAt(0);
        int i,c=0;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)==key){
                c=c+1;
            }
        }
        System.out.println("count of "+key+" in "+str+" is "+c);
    }   
}
