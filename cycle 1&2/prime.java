import java.util.*;

public class prime{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int i,n,d=0;
        System.out.print("enter number:");
        n=s.nextInt();
        for(i=1;i<=n;i++){
            if(n%i==0){
                d=d+1;
            }
        }
        if(d==2){
            System.out.println(n +" is a prime number");
        }
        else if(d==1){
            System.out.println(n +" is neither prime nor composite number");
        }
        else{
            System.out.println(n +" is a composite number");
        }
    }
}
