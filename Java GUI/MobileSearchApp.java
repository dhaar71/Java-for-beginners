import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MobileSearchApp {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Mobile Search");

        // Create components
        JLabel idLabel = new JLabel("Enter ID:");
        JTextField idField = new JTextField(10);
        JButton searchButton = new JButton("Search");
        JTextArea resultArea = new JTextArea(5, 20);
        resultArea.setEditable(false);

        // Create a panel with a GridLayout
        JPanel panel = new JPanel(new GridLayout(2, 2));

        // Add components to the panel
        panel.add(idLabel);
        panel.add(idField);
        panel.add(searchButton);

        // Add the panel and result area to the frame
        frame.add(panel, BorderLayout.NORTH);
        frame.add(new JScrollPane(resultArea), BorderLayout.CENTER);

        // Set frame properties
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Add ActionListener to the Search button
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Read the entered ID
                String enteredId = idField.getText();

                // Search for mobile details
                String details = searchMobileDetails(enteredId);

                // Display the details in the result area
                resultArea.setText(details);
            }
        });
    }

    private static String searchMobileDetails(String id) {
        String filePath = "Device.txt";
        String line;
        String details = "Mobile details not found.";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                String[] mobileData = line.split(",");
                if (mobileData.length == 4 && mobileData[0].equals(id)) {
                    details = "Model No: " + mobileData[1] +
                              "\nPrice: " + mobileData[2] +
                              "\nBrand: " + mobileData[3];
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return details;
    }
}

