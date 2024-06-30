import java.util.*;
import java.io.*;

public class Fileline {
    public static void main(String[] args) throws IOException{
        int c=1;
        String r;
        FileReader fr=new FileReader("myfile.txt");
        BufferedReader br=new BufferedReader(fr);
        while((r=br.readLine())!=null){
            System.out.println(c+" - "+r);
            c++;
        }
    }
}
