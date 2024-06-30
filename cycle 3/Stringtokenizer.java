import java.util.Scanner;
import java.util.StringTokenizer;

public class Stringtokenizer {
    public static void main(String[] args){
        String str;
        int n,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter integers with one space gap");
        str=s.nextLine();
        StringTokenizer st=new StringTokenizer(str," ");
        while(st.hasMoreTokens()){
            String temp=st.nextToken();
            n=Integer.parseInt(temp);
            System.out.print(n+" ");
            sum=sum+n;
        }
        System.out.println("sum is "+sum);
    }
    
}
