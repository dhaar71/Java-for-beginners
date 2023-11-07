package GUI;
import javax.swing.*;
import java.awt.event.*;

public class KeyEventMouseEventDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("KeyEvent and MouseEvent Demo");
        JLabel eventLabel = new JLabel("Event: ");
        JPanel panel = new JPanel();
        panel.add(eventLabel);
        frame.add(panel);
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                eventLabel.setText("Key Typed: " + keyChar);
            }
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                eventLabel.setText("Key Pressed: " + KeyEvent.getKeyText(keyCode));
            }
            @Override
            public void keyReleased(KeyEvent e) {
                int keyCode = e.getKeyCode();
                eventLabel.setText("Key Released: " + KeyEvent.getKeyText(keyCode));
            }
        });
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                eventLabel.setText("Mouse Clicked: X=" + e.getX() + ", Y=" + e.getY());}
            @Override
            public void mouseEntered(MouseEvent e) {
                eventLabel.setText("Mouse Entered: X=" + e.getX() + ", Y=" + e.getY());}            @Override
            public void mouseExited(MouseEvent e) {
                eventLabel.setText("Mouse Exited");}});
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setFocusable(true);
        frame.requestFocus();
    }
}
