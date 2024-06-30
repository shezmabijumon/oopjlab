import java.util.*;

public class MatrixAdd {
    public static void main(String[] args){
        Matrix obj=new Matrix();
        Ex ob=new Ex(obj);
        int m, n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows in matrix:");
        m = s.nextInt();
        System.out.print("Enter number of columns in matrix:");
        n = s.nextInt();      
        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        int c[][] = new int[m][n];
        System.out.println("Enter all the elements of first matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter all the elements of second matrix:");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) 
            {
                b[i][j] = s.nextInt();
            }
        }
        //obj.addmatrix(a, b, m, n);
    }    
}
class Matrix{
    void addmatrix(int[][] a, int[][] b, int m, int n){
        int c[][]= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
class Ex extends Matrix{
    Matrix x;
    Ex(Matrix k){
        x=k;
    }
    public void run(){
        k.addmatrix(a,b,m,n);
    }
}
