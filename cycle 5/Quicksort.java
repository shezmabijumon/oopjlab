import java.util.*;
class Quicksort {
    static void quicksort(String arr[], int l, int h) {
        if (l < h) {
            int pi = Partition(arr, l, h);
            quicksort(arr, l, pi - 1);
            quicksort(arr, pi + 1, h);
        }
    }
    static int Partition(String arr[], int l, int h) {
        int i, j;
        String tmp1, tmp2;
        String top = arr[h];
        i = l - 1;
        j = l;
        while (j <= h) {
            if (arr[j].compareTo(top) < 0) {
                i = i + 1;
                tmp1 = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp1;
            }
            j = j + 1;
        }
        tmp2 = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = tmp2;

        return i + 1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] names = new String[50];
        int low, high, n, i;
        System.out.print("Enter the number of names : ");
        n = s.nextInt();
        System.out.println("enter the names : ");
        for (i = 0; i <= n; i++) {
            names[i] = s.nextLine();
            names[i]=names[i].toLowerCase();
        }
        low = 0;
        high = n ;
        quicksort(names, low, high);
        System.out.println("The names after sorting :- ");
        for (i = 0; i <= n; i++) {
            System.out.println(names[i] + " ");
        }
    }
}
