package LoginFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class WelcomeLoginGUI extends JFrame {
    private JLabel logoLabel, titleLabel;
    private JPanel welcomePanel, loginPanel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public WelcomeLoginGUI(){
        this.setTitle("Alligators Calculator GPA");

        // set JFrame background color
        this.getContentPane().setBackground(new Color(0xCEFFC9));

        // set up logo and title labels
        ImageIcon logo = new ImageIcon("logo.png");
        logoLabel = new JLabel(logo);
        titleLabel = new JLabel("Welcome to Alligators Calculator GPA! :D", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        titleLabel.setBackground(Color.WHITE);

        // set up welcome panel
        welcomePanel = new JPanel(new BorderLayout());
        welcomePanel.setBackground(new Color(0xCEFFC9));
        welcomePanel.add(logoLabel, BorderLayout.NORTH);
        welcomePanel.add(titleLabel, BorderLayout.CENTER);

        // set up login panel
        JLabel usernameLabel = new JLabel("Username: ");
        JLabel passwordLabel = new JLabel("Password: ");
        usernameLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        passwordLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        // loginButton.addActionListener(e -> login());
//        loginButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                login();
//            }
//        });

        loginPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        loginPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        loginPanel.setBackground(Color.white);
        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);
        loginPanel.add(new JLabel()); // filler
        loginPanel.add(loginButton);

        // set the preferred size of the text fields to match the label size
        usernameField.setPreferredSize(usernameLabel.getPreferredSize());
        passwordField.setPreferredSize(usernameLabel.getPreferredSize());

        // set up main panel
        JPanel mainPanel = new JPanel(new GridLayout(1, 2));
        mainPanel.setBackground(new Color(0xCEFFC9));
        mainPanel.add(welcomePanel);
        mainPanel.add(loginPanel);

        // add main panel to JFrame
        getContentPane().add(mainPanel);

        // set JFrame properties
        getContentPane().setBackground(new Color(0xCEFFC9));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(true);
        ImageIcon logoFrame = new ImageIcon("logo.png");
        setIconImage(logoFrame.getImage());

    }
}
