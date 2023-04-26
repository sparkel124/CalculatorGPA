package InputScore;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.text.NumberFormat;
public class InputScoreSC extends JFrame implements ActionListener{
    private JLabel asgLabel, midLabel, finalLabel, TitleLabel, midlabLabel, finallabLabel;
    private JFormattedTextField asgField, midField, finalField, midlabField, finallabField;
    private JButton submitBtn;

    public InputScoreSC()
    {
        setTitle("Alligators Calculator GPA");

        //input just 2 decimal digit
        NumberFormat scoreFormat = NumberFormat.getNumberInstance();
        scoreFormat.setMaximumFractionDigits(2);

        TitleLabel = new JLabel("Scientific Computing");
        TitleLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 32));
        TitleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        asgLabel = new JLabel("Assignment Lecture Score:");
        asgLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        asgLabel.setHorizontalAlignment(SwingConstants.CENTER);

        midLabel = new JLabel("Mid Test Lecture Score:");
        midLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        midLabel.setHorizontalAlignment(SwingConstants.CENTER);

        finalLabel = new JLabel("Final Lecture Score:");
        finalLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        finalLabel.setHorizontalAlignment(SwingConstants.CENTER);

        midlabLabel = new JLabel("Mid Test Lab Score:");
        midlabLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        midlabLabel.setHorizontalAlignment(SwingConstants.CENTER);

        finallabLabel = new JLabel("Final Lab Score:");
        finallabLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        finallabLabel.setHorizontalAlignment(SwingConstants.CENTER);

//        finallabLabel = new JLabel("Final Lab Score:");
//        finalLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
//        finalLabel.setHorizontalAlignment(SwingConstants.CENTER);

        asgField = new JFormattedTextField(scoreFormat);
        asgField.setPreferredSize(new Dimension(150, 30)); // set dimensi awal
//        asgField.setColumns(10);
//        asgField.setMinimumSize(new Dimension(150, 30)); // set ukuran minimum
//        asgField.setMaximumSize(new Dimension(200, 30)); // set ukuran maksimum

        midField = new JFormattedTextField(scoreFormat);
        midField.setPreferredSize(new Dimension(150, 10)); // set dimensi awal
//        midField.setColumns(10); //width of the field
//        midField.setMinimumSize(new Dimension(150, 30)); // set ukuran minimum
//        midField.setMaximumSize(new Dimension(200, 30)); // set ukuran maksimum

        finalField = new JFormattedTextField(scoreFormat);
        finalField.setPreferredSize(new Dimension(150, 20)); // set dimensi awal
//        finalField.setColumns(10); //width of the field
//        finalField.setMinimumSize(new Dimension(150, 30)); // set ukuran minimum
//        finalField.setMaximumSize(new Dimension(200, 30)); // set ukuran maksimum

        midlabField = new JFormattedTextField(scoreFormat);
        midlabField.setPreferredSize(new Dimension(150, 10)); // set dimensi awal
//        midField.setColumns(10); //width of the field
//        midField.setMinimumSize(new Dimension(150, 30)); // set ukuran minimum
//        midField.setMaximumSize(new Dimension(200, 30)); // set ukuran maksimum

        finallabField = new JFormattedTextField(scoreFormat);
        finallabField.setPreferredSize(new Dimension(150, 20)); // set dimensi awal
//        finalField.setColumns(10); //width of the field
//        finalField.setMinimumSize(new Dimension(150, 30)); // set ukuran minimum
//        finalField.setMaximumSize(new Dimension(200, 30)); // set ukuran maksimum

        submitBtn = new JButton("Submit");
        submitBtn.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        submitBtn.setHorizontalAlignment(SwingConstants.CENTER);
        submitBtn.setPreferredSize(new Dimension(150, 40));

        // Add components to the JFrame
        JPanel Header = new JPanel(new FlowLayout(FlowLayout.CENTER));
        Header.add(TitleLabel, BorderLayout.NORTH);
        Header.setBorder(BorderFactory.createEmptyBorder(40,0,20,0));
        add(Header, BorderLayout.NORTH);

        JPanel body = new JPanel(new GridLayout(5,2,-40,15));
        body.setBorder(BorderFactory.createEmptyBorder(30, 10, 80, 90)); // add margin
        body.add(asgLabel);
        body.add(asgField);
        body.add(midLabel);
        body.add(midField);
        body.add(finalLabel);
        body.add(finalField);
        body.add(midlabLabel);
        body.add(midlabField);
        body.add(finallabLabel);
        body.add(finallabField);
        add(body, BorderLayout.CENTER);

        JPanel footer = new JPanel(new FlowLayout(FlowLayout.CENTER));
        footer.setBorder(BorderFactory.createEmptyBorder(10, 10, 50, 10)); // add margin
        footer.add(submitBtn);
        add(footer, BorderLayout.SOUTH);

        ImageIcon logoFrame = new ImageIcon("logo.png");
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


        submitBtn.addActionListener(this);
//        asgField.addActionListener(this);
//        midField.addActionListener(this);
//        finalField.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double asgScore = ((Number) asgField.getValue()).doubleValue(); //change to double value
            double midScore = ((Number) midField.getValue()).doubleValue();
            double midlabScore = ((Number) midlabField.getValue()).doubleValue();
            double finalScore = ((Number) finalField.getValue()).doubleValue();
            double finallabScore = ((Number) finallabField.getValue()).doubleValue();

        }catch (NullPointerException ex)
        {
            JOptionPane.showMessageDialog(this, "Please enter a score for all assignments");
        }
    }
}
