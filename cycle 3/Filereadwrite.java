import java.util.*;
import java.io.*;

public class Filereadwrite{
    public static void main(String[] args) throws IOException{
        FileWriter fw= new FileWriter("myfile.txt");
        Scanner s=new Scanner(System.in);
        System.out.println("enter contents of the file:");
        String str=s.nextLine();
        fw.write(str);
        fw.close();
        FileReader fr=new FileReader("myfile.txt");
        int i;
        System.out.println("contents of file are:");
        while((i=fr.read())!=-1){
            System.out.print((char)i);
        }
        System.out.println();
        fr.close();
    }
}