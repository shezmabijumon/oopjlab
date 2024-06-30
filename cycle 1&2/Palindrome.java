import java.util.*;

public class Palindrome{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("enter string:");
        String str=s.nextLine();
        String rev="";
        int l=str.length();
        int flag=0;
        /*for(int i=l-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        for(int i=0;i<l;i++){
            if(str.charAt(i)!=rev.charAt(i)){
                flag++;
                break;
            }
        }*/
        for(int i=0;i<l;i++){
                    if(str.charAt(i)!=str.charAt(l-i-1)){
                        flag++;
                        break;
                    }
                }
        if (flag==0){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not Palindrome");
        }
    }
}