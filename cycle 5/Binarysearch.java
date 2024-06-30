import java.util.*;
public class Binarysearch{
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        System.out.println("enter number of elements of array:");
        int n=s.nextInt();
        int arr[]=new int[n];
        int i,j,l,u,mid,c,t,k=0;
        l=1;
        u=n;
        mid=(u+l)/2;
        System.out.println("enter elements of array:");
        for(i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(i=1;i<=n;i++){
            for(j=0;j<n-i;j++){
                if(arr[j]>arr[j+1]){
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println("sorted array:");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        System.out.println("enter element to be searched:");
        c=s.nextInt();
        while(l<=u){
            if(arr[mid]==c){
                System.out.println("element "+c+" found at "+(mid+1));
                k=1;
                break;
            }
            else if(arr[mid]<c){
                l=mid+1;				
            }
            else if(arr[mid]>c){
                u=mid-1;				
            }
            mid=(l+u)/2;
        }
        if(k==0){
            System.out.println("Sorry! "+c+" not found.");
        }
    }
}
