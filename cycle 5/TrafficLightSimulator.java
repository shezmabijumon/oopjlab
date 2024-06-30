import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLightSimulator extends JFrame implements ActionListener {
    JRadioButton redButton, yellowButton, greenButton;
    JPanel lightPanel;

    TrafficLightSimulator() {
        setTitle("Traffic Light Simulator");
        setSize(200, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create radio buttons
        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");

        // Group the radio buttons so that only one can be selected at a time
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(redButton);
        buttonGroup.add(yellowButton);
        buttonGroup.add(greenButton);

        // Add action listener to each radio button
        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);

        // Add radio buttons to a panel
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new BoxLayout(radioPanel, BoxLayout.Y_AXIS));
        radioPanel.add(redButton);
        radioPanel.add(yellowButton);
        radioPanel.add(greenButton);

        // Create panel for traffic light display
        lightPanel = new JPanel();
        lightPanel.setBackground(Color.gray);
        lightPanel.setPreferredSize(new Dimension(100, 300));

        // Add components to the frame
        add(radioPanel, BorderLayout.WEST);
        add(lightPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            lightPanel.setBackground(Color.RED);
        } else if (e.getSource() == yellowButton) {
            lightPanel.setBackground(Color.YELLOW);
        } else if (e.getSource() == greenButton) {
            lightPanel.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new TrafficLightSimulator();
    }
}
 
