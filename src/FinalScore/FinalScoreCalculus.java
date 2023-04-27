package FinalScore;

import javax.swing.*;
import java.awt.*;

public class FinalScoreCalculus extends JFrame {
    private JLabel titleLabel;

    public FinalScoreCalculus()
    {
        //Final score calculus
        JLabel titleLabel = new JLabel("Your Calculus Final Score");
        titleLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));

        JTextField scoreField = new JTextField(20);
        JButton backButton = new JButton("Back");
        backButton.setPreferredSize(new Dimension(10,40));
        backButton.setFont(new Font("Comic Sans MS", Font.BOLD, 15));

        JPanel finalCalcPanel = new JPanel(new BorderLayout());
        finalCalcPanel.setBackground(new Color(0xCEFFC9));
        finalCalcPanel.add(titleLabel, BorderLayout.NORTH);
        finalCalcPanel.add(scoreField, BorderLayout.CENTER);
        finalCalcPanel.add(backButton, BorderLayout.SOUTH);

        getContentPane().add(finalCalcPanel);

        //template frame
        setTitle("Alligators Calculator GPA");
        getContentPane().setBackground(new Color(0xCEFFC9));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(true);
        ImageIcon logoFrame = new ImageIcon("logo.png");
        setIconImage(logoFrame.getImage());
    }

    public static void main(String[] args) {
        new FinalScoreCalculus();
    }

}
