package ChooseSubject;
import javax.swing.*;
import java.awt.*;

public class SubjectGUI extends JFrame {
    private JPanel panel;
    private JLabel label;
    private JButton oopButton, charButton, calcButton, hciButton, sciCompButton, dsButton;

    public SubjectGUI() {
        // create the main frame
        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(Color.white);
        frame.setTitle("Alligators Calculator GPA");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setResizable(true);

        ImageIcon logoFrame = new ImageIcon(getClass().getResource("logo.png"));
        frame.setIconImage(logoFrame.getImage());

        // frame.setLayout(new GridLayout(2, 1));

        // set up subject panel
        panel = new JPanel();
        panel.setBounds(100, 50, 300, 200);
        panel.setBackground(new Color(0xCEFFC9));
        panel.setLayout(null);
        frame.add(panel);
        frame.setLayout(new GridLayout(2, 1));

        // set  a title
        label = new JLabel("Select a subject:");
        label.setBounds(0, 0, 300, 30);
        label.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        label.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label);

        // set button
        oopButton = new JButton("Object Oriented Programming");
        oopButton.setBounds(50, 40, 200, 30);
        oopButton.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        panel.add(oopButton);

        charButton = new JButton("Character Building");
        charButton.setBounds(50, 80, 200, 30);
        charButton.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        panel.add(charButton);

        calcButton = new JButton("Calculus");
        calcButton.setBounds(50, 120, 200, 30);
        calcButton.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        panel.add(calcButton);

        hciButton = new JButton("Human Computer Interaction");
        hciButton.setBounds(50, 160, 200, 30);
        hciButton.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        panel.add(hciButton);

        sciCompButton = new JButton("Scientific Computing");
        sciCompButton.setBounds(50, 200, 200, 30);
        sciCompButton.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        panel.add(sciCompButton);

        dsButton = new JButton("Data Structures");
        dsButton.setBounds(50, 240, 200, 30);
        dsButton.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        panel.add(dsButton);

        frame.setVisible(true);
    }

}
