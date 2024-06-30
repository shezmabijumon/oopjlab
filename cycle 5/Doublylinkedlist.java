import java.util.*;

class Node{
    int data;
    Node prev;
    Node next;
    public Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
class DLL{
    Node head;
    public void display(){
        if (head==null){
            System.out.println("Empty list");
            return;
        }
        Node current=head;
        while (current!=null){
            System.out.print(current.data + "  ");
            current=current.next;
        }
        System.out.println();
    }
    public void insert(int data){
        Node newnode=new Node(data);
        if (head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }
    public void delete(int key){
        if (head==null){
            System.out.println("Empty list");
            return;
        }
        Node current=head;
        while(current!=null){
            if(current.data==key){
                if(current.prev!=null){
                    current.prev.next=current.next;
                }
                else{
                    head=current.next;
                }
                if(current.next!=null){
                    current.next.prev=current.prev;
                }
                break;
            }
            current=current.next;
        }
    }
}
public class Doublylinkedlist{
    public static void main(String[] args){
        DLL l=new DLL();
        Scanner sc= new Scanner(System.in);
        int c=0;
        while(c!=4){
            System.out.println("MENU");
            System.out.println("1.INSERT");
            System.out.println("2.DELETE");
            System.out.println("3.DISPLAY");
            System.out.println("4.EXIT");
            System.out.println("enter choice");
            c=sc.nextInt();
            switch(c){
                case 1:
                System.out.println("enter element");
                int d=sc.nextInt();
                l.insert(d);
                break;
                case 2:
                System.out.println("enter key");
                int k=sc.nextInt();
                l.delete(k);
                break;
                case 3:
                l.display();
                break;
                case 4:
                System.out.println("exiting");
                break;
                default:
                System.out.println("wrong input");
            }
        }
    }
}