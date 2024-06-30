import javax.swing.*;
import java.awt.event.*;

public class Tempconv implements ActionListener{
    JFrame f;
    JTextField t1,t2;
    JLabel l1,l2;
    JButton bfc,bcf;

    static double x=0,y=0;

    Tempconv(){
        f= new JFrame("Temperature Converter");
        l1= new JLabel("Fahrenheit");
        t1= new JTextField(20);
        l2= new JLabel("Celcius");
        t2= new JTextField(20);
        bfc= new JButton("F to C");
        bcf= new JButton("C to F");

        l1.setBounds(20, 20, 150, 20);
        t1.setBounds(100, 20, 150, 20);
        l2.setBounds(20, 50, 150, 20); // Corrected from l1 to l2
        t2.setBounds(100, 50, 150, 20); // Corrected from t1 to t2
        bfc.setBounds(20, 80, 120, 20);
        bcf.setBounds(180, 80, 120, 20);

        f.add(l1);
        f.add(t1);
        f.add(l2); // Corrected from l1 to l2
        f.add(t2); // Corrected from t1 to t2
        f.add(bfc);
        f.add(bcf);

        f.setLayout(null);
        f.setSize(600, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        bfc.addActionListener(this);
        bcf.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == bfc){ 
            x = Double.parseDouble(t1.getText());
            y = ((x - 32) * 5.0 / 9);
            t2.setText(Double.toString(y));
        }
        if (e.getSource() == bcf){ 
            y = Double.parseDouble(t2.getText());
            x = ((9.0/5)*y + 32);
            t1.setText(Double.toString(x));
        }
    }

    public static void main(String[] args){
        new Tempconv();
    }   
}
