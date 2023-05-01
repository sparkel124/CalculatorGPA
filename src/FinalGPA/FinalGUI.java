package FinalGPA;

import ChooseSubject.SubjectGUI;
import Program.Account;
import Program.Calculate;
import Program.Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FinalGUI extends JFrame implements ActionListener {
    private JLabel titleLabel, nameLabel, NIMlabel;
    private JLabel calLabel, cbLabel, dsLabel, hciLabel, oopLabel, scLabel;
    private JLabel calScoreLabel, cbScoreLabel, dsScoreLabel, hciScoreLabel, oopScoreLabel, scScoreLabel;
    private JLabel gpaLabel, gpaScoreLabel;
    private JButton backButton;
    private String name, nim;
    private double calScore, cbScore, dsScore, hciScore, oopScore, scScore, gpaScore;

    private Account accounts;
    private int indexs;
    private Calculator calculators;


    public FinalGUI(Account account, int index, Calculator calculator)
    {
        Calculate calculate = new Calculate(account, index, calculator);
        name = calculator.getStudents().get(index).getUsername();
        nim = calculator.getStudents().get(index).getPassword();

        calScore = calculate.getTotalCal();
        cbScore = calculate.getTotalCB();
        dsScore = calculate.getTotalDS();
        hciScore = calculate.getTotalHCI();
        oopScore = calculate.getTotalOOP();
        scScore = calculate.getTotalSC();
        gpaScore = calculate.getGPA();

        titleLabel = new JLabel("Your Final Report");
        titleLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        nameLabel = new JLabel("Name: " + name);
        nameLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        nameLabel.setHorizontalAlignment(SwingConstants.CENTER);

        NIMlabel = new JLabel("NIM: " + nim);
        NIMlabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        NIMlabel.setHorizontalAlignment(SwingConstants.CENTER);

        calLabel = new JLabel("Calculus: " + " : " + String.valueOf(calScore));
        calLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        calLabel.setHorizontalAlignment(SwingConstants.CENTER);

        cbLabel = new JLabel("Character Building: " + " : " + String.valueOf(cbScore));
        cbLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        cbLabel.setHorizontalAlignment(SwingConstants.CENTER);

        dsLabel = new JLabel("Data Structure: " + " : " + String.valueOf(dsScore));
        dsLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        dsLabel.setHorizontalAlignment(SwingConstants.CENTER);

        hciLabel = new JLabel("Human and Computer Interaction: " + " : " + String.valueOf(hciScore));
        hciLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        hciLabel.setHorizontalAlignment(SwingConstants.CENTER);

        oopLabel = new JLabel("Object Oriented Programming: " + " : " + String.valueOf(oopScore));
        oopLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        oopLabel.setHorizontalAlignment(SwingConstants.CENTER);

        scLabel = new JLabel("Scientific Computing: " + " : " + String.valueOf(scScore));
        scLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        scLabel.setHorizontalAlignment(SwingConstants.CENTER);

        gpaLabel = new JLabel("Final GPA" + " : " + String.valueOf(gpaScore));
        gpaLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        gpaLabel.setHorizontalAlignment(SwingConstants.CENTER);

        backButton = new JButton("Back");
        backButton.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        backButton.setHorizontalAlignment(SwingConstants.CENTER);
        backButton.setPreferredSize(new Dimension(100, 40));

        JPanel Header = new JPanel(new FlowLayout(FlowLayout.CENTER));
        Header.add(titleLabel);
        Header.add(nameLabel);
        Header.add(NIMlabel);
        Header.setLayout(new GridLayout(0,1));
        Header.setBorder(BorderFactory.createEmptyBorder(20,0,20,0));
        add(Header, BorderLayout.NORTH);

        JPanel body = new JPanel(new GridLayout(3,2,-70,30));
        body.setLayout(new GridLayout(0,1));
        body.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10)); // add margin
        body.add(calLabel);
        body.add(cbLabel);
        body.add(dsLabel);
        body.add(hciLabel);
        body.add(oopLabel);
        body.add(scLabel);
        add(body, BorderLayout.CENTER);

        JPanel footer = new JPanel(new FlowLayout(FlowLayout.CENTER));
        footer.setLayout(new GridLayout(0,1));
        footer.setBorder(BorderFactory.createEmptyBorder(10, 300, 20, 300)); // add margin
        footer.add(gpaLabel);
        footer.add(backButton);
        add(footer, BorderLayout.SOUTH);

        ImageIcon logoFrame = new ImageIcon(getClass().getResource("logo.png"));
        Image img = logoFrame.getImage();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null); //position center
        setResizable(false);
        setIconImage(img);
        Color bgColor = new Color(0xCEFFC9);
        footer.setBackground(bgColor);
        body.setBackground(bgColor);
        Header.setBackground(bgColor);

        setVisible(true);

        accounts=account;
        indexs=index;
        calculators=calculator;

        backButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        new SubjectGUI(accounts,indexs, calculators);
    }
}
