package ChooseSubject;
import Program.Account;
import Program.Calculator;

import javax.swing.*;
import java.awt.*;

public class SubjectGUI extends JFrame {
    private JPanel subjectPanel, titlePanel, buttonPanel;
    private JLabel titleLabel;
    private JLayeredPane subjectLayer;
    private JButton oopButton, cbButton, calcButton, hciButton, scButton, dsButton;

    public SubjectGUI(Account account, Calculator calculator) {
        // create the main frame
        JFrame frame = new JFrame();
        frame.setTitle("Alligators Calculator GPA");
        frame.getContentPane().setBackground(new Color(0xCEFFC9));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setResizable(false);

        ImageIcon logoFrame = new ImageIcon(getClass().getResource("logo.png"));
        frame.setIconImage(logoFrame.getImage());

        subjectPanel = new JPanel(new GridLayout(2, 1));
        subjectPanel.setBackground(new Color(0xCEFFC9));
//        subjectPanel.setLayout(new BoxLayout(subjectPanel, BoxLayout.Y_AXIS));
        subjectPanel.setBorder(BorderFactory.createEmptyBorder(80, 100, 200, 100));

        // set  a title
        titlePanel = new JPanel();
        titlePanel.setBackground(new Color(0xCEFFC9));
        titleLabel = new JLabel("Select a subject...");
        titlePanel.setBorder(BorderFactory.createEmptyBorder(100, 0, 0, 0));
        titleLabel.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
        titlePanel.add(titleLabel);

        buttonPanel = new JPanel(new GridLayout(6, 1));
        buttonPanel.setBackground(new Color(0xCEFFC9));

//        subjectLayer = new JLayeredPane();
//        subjectLayer.setBounds(18, 95, 700,500);
//        subjectLayer.setOpaque(true);
//        subjectLayer.setBackground(new Color(0xCEFFC9));

//        panel = new JPanel();
//        panel.setBackground(new Color(0xCEFFC9));
//        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//        panel.setBorder(BorderFactory.createEmptyBorder(100, 0, 100, 0));

        // button panel
//        JPanel buttonPanel = new JPanel();
//        buttonPanel.setBackground(new Color(0xCEFFC9));
//        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));

        // set button
        oopButton = new JButton("Object Oriented Programming");
        oopButton.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
//        oopButton.setBounds(50, 40, 300, 30);
        buttonPanel.add(oopButton);
//        subjectLayer.add(oopButton);

        cbButton = new JButton("Character Building");
        cbButton.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
//        cbButton.setBounds(50, 80, 300, 30);
        buttonPanel.add(cbButton);
//        subjectLayer.add(cbButton);

        calcButton = new JButton("Calculus");
        calcButton.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
//        calcButton.setBounds(50, 120, 300, 30);
        buttonPanel.add(calcButton);
//        subjectLayer.add(calcButton);

        hciButton = new JButton("Human Computer Interaction");
        hciButton.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
//        hciButton.setBounds(50, 160, 300, 30);
        buttonPanel.add(hciButton);
//        subjectLayer.add(hciButton);

        scButton = new JButton("Scientific Computing");
        scButton.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
//        scButton.setBounds(50, 200, 300, 30);
        buttonPanel.add(scButton);
//        subjectLayer.add(scButton);

        dsButton = new JButton("Data Structures");
        dsButton.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
//        dsButton.setBounds(50, 240, 300, 30);
        buttonPanel.add(dsButton);
//        subjectLayer.add(dsButton);

        subjectPanel.add(titlePanel);
        subjectPanel.add(buttonPanel);
        frame.add(subjectPanel);
        frame.getContentPane().setBackground(Color.white);
        frame.setVisible(true);
    }

}
