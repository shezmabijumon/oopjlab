import java.util.*;

public class SecSmallest {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("enter number of elements:");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++){
                if(arr[j]>arr[j+1]){
                    int d=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=d;
                }
            }
        }
        System.out.print("second smallest element is "+arr[1]);
    }
}
