public class Throwexc extends Exception {
    Throwexc(String str){
        super(str);
    }
    public static void main(String[] args){
        Throwexc m=new Throwexc("The exception has been thrown");
        try{
            throw m;
        }
        catch(Exception f){
            System.out.println("custom exception encountered\n"+f);
        }
        finally{
            System.out.println("the code has finally ended");
        }
    }
}
