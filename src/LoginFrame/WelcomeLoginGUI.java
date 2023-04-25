package LoginFrame;

import ChooseSubject.SubjectGUI;
import Program.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;



public class WelcomeLoginGUI extends JFrame implements ActionListener {
    private JPanel welcomePanel, loginPanel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    Main main;

    public WelcomeLoginGUI(){
        // create the main frame
        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(new Color(0xCEFFC9));
        frame.setTitle("Alligators Calculator GPA");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setResizable(false);

        ImageIcon logoFrame = new ImageIcon(getClass().getResource("logo.png"));
        frame.setIconImage(logoFrame.getImage());

        frame.setLayout(new GridLayout(1, 2));

        // set up welcome panel
        welcomePanel = new JPanel(new BorderLayout());
        welcomePanel.setBackground(new Color(0xCEFFC9));
        welcomePanel.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 50));

        ImageIcon icon = new ImageIcon(getClass().getResource("Welcome.png"));
        Image image = icon.getImage();
        Image newing = image.getScaledInstance(300, 500, Image.SCALE_SMOOTH);
        icon = new ImageIcon(newing);
        JLabel welcomeLabel = new JLabel();
        welcomeLabel.setIcon(icon);

        welcomePanel.add(welcomeLabel);


        // set up login panel
        loginPanel = new JPanel(new GridLayout(4, 1));
        loginPanel.setBackground(Color.white);
        loginPanel.setBorder(BorderFactory.createEmptyBorder(200, 0, 200, 0));

        // set up login title panel
        JPanel loginTitlePanel = new JPanel();
        loginTitlePanel.setBackground(Color.white);
        JLabel loginLabel = new JLabel("Login using your Account");
        loginLabel.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
        loginLabel.setBackground(new Color(0xCEFFC9));
        loginTitlePanel.add(loginLabel);
        loginPanel.add(loginTitlePanel);

        // set up username panel
        JPanel usernamePanel = new JPanel();
        usernamePanel.setBackground(Color.white);
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        usernameField = new JTextField(10);
        usernamePanel.add(usernameLabel);
        usernamePanel.add(usernameField);
        loginPanel.add(usernamePanel);

        // set up password panel
        JPanel passwordPanel = new JPanel();
        passwordPanel.setBackground(Color.white);
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        passwordField = new JPasswordField(10);
        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordField);
        loginPanel.add(passwordPanel);

        // set up button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.white);
        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        buttonPanel.add(loginButton);
        loginPanel.add(buttonPanel);

        // set the preferred size of the text fields to match the label size
        usernameField.setPreferredSize(usernameLabel.getPreferredSize());
        passwordField.setPreferredSize(new Dimension(passwordField.getPreferredSize().width, usernameField.getPreferredSize().height));

        // add the panels to the main frame
        frame.add(welcomePanel);
        frame.add(loginPanel);

        frame.setVisible(true);
    }

    String username, password;
    @Override
    public void actionPerformed(ActionEvent e) {
        username = usernameField.getText();
        password = new String(passwordField.getPassword());

        if(e.getSource() == loginButton){

        }
    }
}

// TRIAL ERROR
        // set up logo and title labels
//        ImageIcon logo = new ImageIcon(getClass().getResource("logo.png"));
//        logoLabel = new JLabel(logo);
//        titleLabel = new JLabel("Welcome to Alligators Calculator GPA! :D", SwingConstants.CENTER);
//        titleLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
//        titleLabel.setBackground(Color.WHITE);

        // set up welcome panel
//        welcomePanel = new JPanel(new BorderLayout());
//        welcomePanel.setBackground(new Color(0xCEFFC9));
//        JLabel imageLabel = new JLabel(new ImageIcon(getClass().getResource("Welcome.png")));
//        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
//        welcomePanel.add(imageLabel, BorderLayout.CENTER);

//        try{
//            BufferedImage originalImage = ImageIO.read(new File("Welcome.png"));
//            if(originalImage != null){
//                Image scaledImage = originalImage.getScaledInstance(300, 500, Image.SCALE_SMOOTH);
//                JLabel imageLabel = new JLabel(new ImageIcon(scaledImage));
//                imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
//                welcomePanel.add(imageLabel, BorderLayout.CENTER);
//            }
//            else{
//                System.out.println("Error: Image could not be loaded.");
//            }
//        } catch (IOException e){
//            System.out.println("Error: " + e.getMessage());
//        }

        // set up login panel
//        JLabel loginLabel = new JLabel("Login", SwingConstants.CENTER);
//        loginLabel.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
//        JPanel loginTitlePanel = new JPanel(new BorderLayout());
//        loginTitlePanel.add(loginLabel, BorderLayout.CENTER);
//        JLabel usernameLabel = new JLabel("Username: ");
//        JLabel passwordLabel = new JLabel("Password: ");
//        usernameLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
//        passwordLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
//        usernameField = new JTextField(20);
//        passwordField = new JPasswordField(20);
//        loginButton = new JButton("Login");
//        loginButton.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
//        loginButton.addActionListener(e -> login());
//
//        loginPanel = new JPanel(new GridLayout(4, 1, 5, 5));
//        loginPanel.setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
//        loginPanel.setBackground(Color.white);
//        loginPanel.add(loginTitlePanel);
//        loginPanel.add(new JLabel());
//        loginPanel.add(usernameLabel);
//        loginPanel.add(usernameField);
//        loginPanel.add(passwordLabel);
//        loginPanel.add(passwordField);
//        loginPanel.add(new JLabel()); // filler
//        loginPanel.add(loginButton);
//
//        // set the preferred size of the text fields to match the label size
//        usernameField.setPreferredSize(usernameLabel.getPreferredSize());
//        passwordField.setPreferredSize(new Dimension(passwordField.getPreferredSize().width, usernameField.getPreferredSize().height));
//
//        // set up main panel
//        JPanel mainPanel = new JPanel(new GridLayout(1, 2));
//        mainPanel.setBackground(new Color(0xCEFFC9));
//        mainPanel.add(welcomePanel);
//        mainPanel.add(loginPanel);
//
//        // add main panel to JFrame
//        getContentPane().add(mainPanel);

//        // set up login panel
//        loginPanel = new JPanel(new GridLayout(3, 2, 5, 5));
//        loginPanel.setBackground(new Color(0xCEFFC9));
//
//        JLabel loginLabel = new JLabel("Login");
//        loginLabel.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
//        loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
//        JLabel usernameLabel = new JLabel("Username:");
//        usernameLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
//        usernameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
//        JLabel passwordLabel = new JLabel("Password:");
//        passwordLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
//        passwordLabel.setHorizontalAlignment(SwingConstants.RIGHT);
//
//        usernameField = new JTextField(10);
//        passwordField = new JPasswordField(10);
//        loginButton = new JButton("Login");
//        loginButton.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
//        loginButton.addActionListener(e -> login());
//
//        loginPanel.add(loginLabel);
//        loginPanel.add(new JLabel());
//        loginPanel.add(usernameLabel);
//        loginPanel.add(usernameField);
//        loginPanel.add(passwordLabel);
//        loginPanel.add(passwordField);
//
//        // add panels to frame
//        add(welcomePanel, BorderLayout.WEST);
//        add(loginPanel, BorderLayout.EAST);

