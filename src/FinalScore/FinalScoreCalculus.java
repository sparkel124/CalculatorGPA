package FinalScore;

import InputScore.InputScoreCalculus;
import Program.Calculate;

import javax.swing.*;
import java.awt.*;

public class FinalScoreCalculus extends JFrame {
    Calculate calculate;
    private JLabel titleLabel, finalScore;
    private JButton backButton;
    double scoreCalDouble = calculate.getTotalCal();
    Integer scoreCal= (int) scoreCalDouble;
    public FinalScoreCalculus()
    {
        System.out.println(scoreCalDouble);
        System.out.println(scoreCal);
        //create components
        titleLabel = new JLabel("Your Calculus Final Score");
        titleLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 32));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        finalScore = new JLabel(String.valueOf(scoreCal));
        finalScore.setFont(new Font("Comic Sans MS", Font.BOLD, 32));
        finalScore.setHorizontalAlignment(SwingConstants.CENTER);

        backButton = new JButton("Back");
        backButton.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        backButton.setHorizontalAlignment(SwingConstants.CENTER);
        backButton.setPreferredSize(new Dimension(150, 40));

        //create panels and add components into panel
        JPanel TitlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        TitlePanel.add(titleLabel, BorderLayout.NORTH);
        TitlePanel.setBorder(BorderFactory.createEmptyBorder(40,0,20,0));

        JPanel scorePanel = new JPanel(new GridLayout(3,2,-70,30));
        scorePanel.setBorder(BorderFactory.createEmptyBorder(60, 10, 120, 90)); // add margin
        scorePanel.add(finalScore);

        JPanel footerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        footerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 50, 10)); // add margin
        footerPanel.add(backButton);

        //add panel into frame
        add(TitlePanel, BorderLayout.NORTH);
        add(scorePanel, BorderLayout.CENTER);
        add(footerPanel, BorderLayout.SOUTH);

        //setting frame
        setTitle("Alligators Calculator GPA");
        ImageIcon logoFrame = new ImageIcon(getClass().getResource("logo.png"));
        Image img = logoFrame.getImage();

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null); //position center
        setResizable(false);
        setIconImage(img);
        Color bgColor = new Color(0xCEFFC9);
        TitlePanel.setBackground(bgColor);
        scorePanel.setBackground(bgColor);
        footerPanel.setBackground(bgColor);
    }

    public static void main(String[] args) {
        new FinalScoreCalculus();
    }
}
