package LoginFrame;

import Program.Account;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame implements ActionListener {

    // Declare variable for GUI components
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JPanel inputPanel, buttonPanel;

    // Constructor method to initialize the GUI
    public LoginGUI() {
        setTitle("Program.Student Program.Account Login");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));

        // Create input panel
        inputPanel = new JPanel(new GridLayout(2, 2));
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        inputPanel.add(new JLabel("Email:"));
        inputPanel.add(usernameField);
        inputPanel.add(new JLabel("Password:"));
        inputPanel.add(passwordField);
        add(inputPanel);

        // Create button panel
        buttonPanel = new JPanel(new FlowLayout());
        loginButton = new JButton("Login");
        buttonPanel.add(loginButton);
        add(buttonPanel);

        // Add action listeners to button and text fields
        loginButton.addActionListener(this);
        usernameField.addActionListener(this);
        passwordField.addActionListener(this);

        // Make window visible
        setVisible(true);
    }

    // ActionPerformed method to handle button clicks
    @Override
    public void actionPerformed(ActionEvent e) {
        // Get input values from text field
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        // Create StudentAccount object and check login credentials
        Account account = new Account(username, password);
        if(account.checkLogin()){
            // Display success message in message dialog
            JOptionPane.showMessageDialog(this, "Login successful!");
        }
        else{
            // Display error message in message dialog
            JOptionPane.showMessageDialog(this,"Incorrect username or password. Please try again!");
        }
    }
}
