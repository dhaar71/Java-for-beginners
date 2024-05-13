import javax.swing.*;
public class DialogBoxDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dialog Box Demo");
        JButton showMessageDialogButton = new JButton("Show Message Dialog");
        JButton showInputDialogButton = new JButton("Show Input Dialog");
        JButton showConfirmDialogButton = new JButton("Show Confirm Dialog");
        frame.setLayout(new java.awt.FlowLayout());
        frame.add(showMessageDialogButton);
        frame.add(showInputDialogButton);
        frame.add(showConfirmDialogButton);
        showMessageDialogButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "This is a Message Dialog", "Message", JOptionPane.INFORMATION_MESSAGE);});
        showInputDialogButton.addActionListener(e -> {
            String input = JOptionPane.showInputDialog(frame, "Enter something:", "Input Dialog", JOptionPane.QUESTION_MESSAGE);
            if (input != null) {
                JOptionPane.showMessageDialog(frame, "You entered: " + input, "Message", JOptionPane.INFORMATION_MESSAGE);}});
        showConfirmDialogButton.addActionListener(e -> {
            int option = JOptionPane.showConfirmDialog(frame, "Do you want to continue?", "Confirm Dialog", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(frame, "You chose to continue.", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame, "You chose to cancel.", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}

