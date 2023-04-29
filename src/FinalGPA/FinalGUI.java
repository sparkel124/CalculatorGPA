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
        titleLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 32));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        nameLabel = new JLabel("Name: " + name);
        nameLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 32));
        nameLabel.setHorizontalAlignment(SwingConstants.CENTER);

        NIMlabel = new JLabel("NIM: " + nim);
        NIMlabel.setFont(new Font("Comic Sans MS", Font.BOLD, 32));
        NIMlabel.setHorizontalAlignment(SwingConstants.CENTER);

        calLabel = new JLabel("Calculus: ");
        calLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        calLabel.setHorizontalAlignment(SwingConstants.CENTER);

        calScoreLabel = new JLabel(String.valueOf(calScore));
        calScoreLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        calScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);

        cbLabel = new JLabel("Character Building: ");
        cbLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        cbLabel.setHorizontalAlignment(SwingConstants.CENTER);

        cbScoreLabel = new JLabel(String.valueOf(cbScore));
        cbScoreLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        cbScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);

        dsLabel = new JLabel("Data Structure: ");
        dsLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        dsLabel.setHorizontalAlignment(SwingConstants.CENTER);

        dsScoreLabel = new JLabel(String.valueOf(dsScore));
        dsScoreLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        dsScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);

        hciLabel = new JLabel("Human and Computer Interaction: ");
        hciLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        hciLabel.setHorizontalAlignment(SwingConstants.CENTER);

        hciScoreLabel = new JLabel(String.valueOf(hciScore));
        hciScoreLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        hciScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);

        oopLabel = new JLabel("Object Oriented Programming: ");
        oopLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        oopLabel.setHorizontalAlignment(SwingConstants.CENTER);

        oopScoreLabel = new JLabel(String.valueOf(oopScore));
        oopScoreLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        oopScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);

        scLabel = new JLabel("Scientific Computing: ");
        scLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        scLabel.setHorizontalAlignment(SwingConstants.CENTER);

        scScoreLabel = new JLabel(String.valueOf(scScore));
        scScoreLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        scScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);

        gpaLabel = new JLabel("Final GPA");
        gpaLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 32));
        gpaLabel.setHorizontalAlignment(SwingConstants.CENTER);

        gpaScoreLabel = new JLabel(String.valueOf(gpaScore));
        gpaScoreLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 32));
        gpaScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);

        backButton = new JButton("Back");
        backButton.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        backButton.setHorizontalAlignment(SwingConstants.CENTER);
        backButton.setPreferredSize(new Dimension(150, 40));

        JPanel Header = new JPanel(new FlowLayout(FlowLayout.CENTER));
        Header.setBorder(BorderFactory.createEmptyBorder(10, 10, 50, 90));
        Header.add(nameLabel);
        Header.add(NIMlabel);
        Header.setBorder(BorderFactory.createEmptyBorder(40,0,20,0));
        add(Header, BorderLayout.NORTH);

        JPanel body = new JPanel(new GridLayout(3,2,-70,30));
        body.setBorder(BorderFactory.createEmptyBorder(60, 10, 120, 90)); // add margin
        body.add(calLabel);
        body.add(calScoreLabel);
        body.add(cbLabel);
        body.add(cbScoreLabel);
        body.add(dsLabel);
        body.add(dsScoreLabel);
        body.add(hciLabel);
        body.add(hciScoreLabel);
        body.add(oopLabel);
        body.add(oopLabel);
        body.add(scLabel);
        body.add(scLabel);
        add(body, BorderLayout.CENTER);

        JPanel footer = new JPanel(new FlowLayout(FlowLayout.CENTER));
        footer.setBorder(BorderFactory.createEmptyBorder(10, 10, 20, 10)); // add margin
        footer.add(gpaLabel);
        footer.add(gpaScoreLabel);
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
