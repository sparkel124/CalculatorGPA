package LoginFrame;

import javax.swing.*;
import java.awt.*;

public class WelcomeLoginGUI extends JFrame {
    private JLabel logoLabel, titleLabel;
    private JPanel welcomePanel, loginPanel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public WelcomeLoginGUI(){
        super("Welcome to Alligators' Calculator GPA");

        // set up logo and title labels
        ImageIcon logo = new ImageIcon("./assets/logo.png");
        logoLabel = new JLabel(logo);
        titleLabel = new JLabel("Welcome to Alligators' Calculator GPA");
        titleLabel.setFont(new Font("MV Boli", Font.BOLD, 24));

        // set up welcome panel
        welcomePanel = new JPanel(new BorderLayout());
        welcomePanel.add(logoLabel, BorderLayout.NORTH);
        welcomePanel.add(titleLabel, BorderLayout.CENTER);

        // set up login panel
        JLabel usernameLabel = new JLabel("Username: ");
        JLabel passwordLabel = new JLabel("Password: ");
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Login");
        // loginButton.addActionListener(e -> login());

        loginPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        loginPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);
        loginPanel.add(new JLabel()); // filler
        loginPanel.add(loginButton);

        // set up main panel
        JPanel mainPanel = new JPanel(new GridLayout(1, 2));
        mainPanel.add(welcomePanel);
        mainPanel.add(loginPanel);

        // add main panel to JFrame
        getContentPane().add(mainPanel);

        // set JFrame properties
        getContentPane().setBackground(new Color(0xCEFFC9));
        setTitle("Alligators Program Calculator GPA");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1440, 810);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(true);
        ImageIcon logoFrame = new ImageIcon("/assets/logo.png");
        setIconImage(logoFrame.getImage());


    }
}
