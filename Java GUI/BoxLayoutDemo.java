import javax.swing.*;
import java.awt.*;

public class BoxLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BoxLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        JPanel verticalPanel = new JPanel();
        verticalPanel.setLayout(new BoxLayout(verticalPanel, BoxLayout.Y_AXIS));
        JLabel label1 = new JLabel("Component 1");
        JLabel label2 = new JLabel("Component 2");
        JLabel label3 = new JLabel("Component 3");
        verticalPanel.add(label1);
        verticalPanel.add(label2);
        verticalPanel.add(label3);
        JPanel horizontalPanel = new JPanel();
        horizontalPanel.setLayout(new BoxLayout(horizontalPanel, BoxLayout.X_AXIS));
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        horizontalPanel.add(button1);
        horizontalPanel.add(button2);
        horizontalPanel.add(button3);
        frame.add(verticalPanel, BorderLayout.WEST);
        frame.add(horizontalPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}

