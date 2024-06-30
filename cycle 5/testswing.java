import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class testswing extends JFrame{
    testswing(){
        JButton bt1= new JButton("yes");
        JButton bt2=new JButton("no");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout( new FlowLayout());
        setSize(400, 400);
        add(bt1);
        add(bt2);
        setVisible(true);
    }
    public static void main(String[] args){
        new testswing();
    }
}