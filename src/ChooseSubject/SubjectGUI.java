package ChooseSubject;
import FinalGPA.FinalGUI;
import InputScore.*;
import Program.Account;
import Program.Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubjectGUI extends JFrame {
    private JPanel subjectPanel, titlePanel, buttonPanel;
    private JLabel titleLabel;
    private JLayeredPane subjectLayer;
    private JButton oopButton, cbButton, calcButton, hciButton, scButton, dsButton, gpaButton;


    public SubjectGUI(Account account, int index, Calculator calculator) {
        // create the main frame
        JFrame frame = new JFrame();
        frame.setTitle("Alligators Calculator GPA");
        frame.getContentPane().setBackground(new Color(0xCEFFC9));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null); //position center

        ImageIcon logoFrame = new ImageIcon(getClass().getResource("logo.png"));
        frame.setIconImage(logoFrame.getImage());

//        subjectPanel = new JPanel(new GridLayout(3, 1));
        subjectPanel = new JPanel();
        subjectPanel.setLayout(new BoxLayout(subjectPanel, BoxLayout.Y_AXIS));
//        subjectPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        subjectPanel.setBackground(new Color(0xCEFFC9));
        subjectPanel.setBorder(BorderFactory.createEmptyBorder(50, 100, 200, 100));

        // set  a title
        titlePanel = new JPanel();
        titlePanel.setBackground(new Color(0xCEFFC9));
//        titlePanel.setBackground(Color.RED);
        titleLabel = new JLabel("Select a subject...");
        titlePanel.setBorder(BorderFactory.createEmptyBorder(60, 0, 0, 0));
        titleLabel.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
        titlePanel.add(titleLabel);

        buttonPanel = new JPanel(new GridLayout(4, 1));
        buttonPanel.setBackground(new Color(0xCEFFC9));

        // set button
        // OOP
        oopButton = new JButton("Object Oriented Programming");
        oopButton.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
        buttonPanel.add(oopButton);
        oopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new InputScoreOOP(account, index, calculator);
                frame.dispose();
            }
        });
        // CB
        cbButton = new JButton("Character Building");
        cbButton.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
        buttonPanel.add(cbButton);
        cbButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new InputScoreCB(account, index, calculator);
                frame.dispose();
            }
        });
        // CALCULUS
        calcButton = new JButton("Calculus");
        calcButton.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
        buttonPanel.add(calcButton);
        calcButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new InputScoreCalculus(account, index, calculator);
                frame.dispose();
            }
        });
        // HCI
        hciButton = new JButton("Human Computer Interaction");
        hciButton.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
        buttonPanel.add(hciButton);
        hciButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new InputScoreHCI(account, index, calculator);
                frame.dispose();
            }
        });
        // SC
        scButton = new JButton("Scientific Computing");
        scButton.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
        buttonPanel.add(scButton);
        scButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new InputScoreSC(account, index, calculator);
                frame.dispose();
            }
        });
        // DS
        dsButton = new JButton("Data Structures");
        dsButton.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
        buttonPanel.add(dsButton);
        dsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new InputScoreDS(account, index, calculator);
                frame.dispose();
            }
        });

        // FINAL GPA
        gpaButton = new JButton("Calculate Final GPA");
        gpaButton.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
//        gpaButton.setBounds(100, 100, 300, 30);
//        gpaButton.setHorizontalAlignment(SwingConstants.CENTER);
        gpaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new FinalGUI(account, index, calculator);
                frame.dispose();
            }
        });

        subjectPanel.add(titlePanel);
        subjectPanel.add(buttonPanel);
        subjectPanel.add(gpaButton);
        frame.add(subjectPanel);
        frame.getContentPane().setBackground(Color.white);
        frame.setVisible(true);
    }
}

// TRIAL ERROR
//    public SubjectGUI(Account account, Calculator calculator) {
//        // create the main frame
//        JFrame frame = new JFrame();
//        frame.setTitle("Alligators Calculator GPA");
//        frame.getContentPane().setBackground(new Color(0xCEFFC9));
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(800, 600);
//        frame.setResizable(false);
//        frame.setLocationRelativeTo(null); //position center
//
//        ImageIcon logoFrame = new ImageIcon(getClass().getResource("logo.png"));
//        frame.setIconImage(logoFrame.getImage());
//
//        subjectPanel = new JPanel(new GridLayout(2, 1));
//        subjectPanel.setBackground(new Color(0xCEFFC9));
//    //        subjectPanel.setLayout(new BoxLayout(subjectPanel, BoxLayout.Y_AXIS));
//        subjectPanel.setBorder(BorderFactory.createEmptyBorder(80, 100, 200, 100));
//
//        // set  a title
//        titlePanel = new JPanel();
//        titlePanel.setBackground(new Color(0xCEFFC9));
//        titleLabel = new JLabel("Select a subject...");
//        titlePanel.setBorder(BorderFactory.createEmptyBorder(100, 0, 0, 0));
//        titleLabel.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
//        titlePanel.add(titleLabel);
//
//        buttonPanel = new JPanel(new GridLayout(6, 1));
//        buttonPanel.setBackground(new Color(0xCEFFC9));
//
//    //        subjectLayer = new JLayeredPane();
//    //        subjectLayer.setBounds(18, 95, 700,500);
//    //        subjectLayer.setOpaque(true);
//    //        subjectLayer.setBackground(new Color(0xCEFFC9));
//
//    //        panel = new JPanel();
//    //        panel.setBackground(new Color(0xCEFFC9));
//    //        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//    //        panel.setBorder(BorderFactory.createEmptyBorder(100, 0, 100, 0));
//
//        // button panel
//    //        JPanel buttonPanel = new JPanel();
//    //        buttonPanel.setBackground(new Color(0xCEFFC9));
//    //        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
//
//        // set button
//        oopButton = new JButton("Object Oriented Programming");
//        oopButton.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
//    //        oopButton.setBounds(50, 40, 300, 30);
//        buttonPanel.add(oopButton);
//    //        subjectLayer.add(oopButton);
//        oopButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                InputScoreOOP inputScoreOOP = new InputScoreOOP();
//                frame.dispose();
//    //                inputScoreOOP.setVisible(true);
//            }
//        });
//
//        cbButton = new JButton("Character Building");
//        cbButton.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
//    //        cbButton.setBounds(50, 80, 300, 30);
//        buttonPanel.add(cbButton);
//    //        subjectLayer.add(cbButton);
//        cbButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                InputScoreCB inputScoreCB = new InputScoreCB();
//                frame.dispose();
//    //                inputScoreCB.setVisible(true);
//            }
//        });
//
//        calcButton = new JButton("Calculus");
//        calcButton.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
//    //        calcButton.setBounds(50, 120, 300, 30);
//        buttonPanel.add(calcButton);
//    //        subjectLayer.add(calcButton);
//        calcButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                InputScoreCalculus inputScoreCalculus = new InputScoreCalculus();
//                frame.dispose();
//    //                inputScoreCalculus.setVisible(true);
//            }
//        });
//
//        hciButton = new JButton("Human Computer Interaction");
//        hciButton.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
//    //        hciButton.setBounds(50, 160, 300, 30);
//        buttonPanel.add(hciButton);
//    //        subjectLayer.add(hciButton);
//        hciButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                InputScoreHCI inputScoreHCI = new InputScoreHCI();
//                frame.dispose();
//    //                inputScoreHCI.setVisible(true);
//            }
//        });
//
//        scButton = new JButton("Scientific Computing");
//        scButton.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
//    //        scButton.setBounds(50, 200, 300, 30);
//        buttonPanel.add(scButton);
//    //        subjectLayer.add(scButton);
//        scButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                InputScoreSC inputScoreSC = new InputScoreSC();
//                frame.dispose();
//    //                inputScoreSC.setVisible(true);
//            }
//        });
//
//        dsButton = new JButton("Data Structures");
//        dsButton.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
//    //        dsButton.setBounds(50, 240, 300, 30);
//        buttonPanel.add(dsButton);
//    //        subjectLayer.add(dsButton);
//        dsButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                InputScoreDS inputScoreDS = new InputScoreDS();
//                frame.dispose();
//    //                inputScoreDS.setVisible(true);
//            }
//        });
//
//        subjectPanel.add(titlePanel);
//        subjectPanel.add(buttonPanel);
//        frame.add(subjectPanel);
//        frame.getContentPane().setBackground(Color.white);
//        frame.setVisible(true);
//    }
