package Program;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public Frame(){
        this.setTitle("Alligators Program Calculator GPA");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(1440, 810);
        this.setVisible(true);

        ImageIcon logo = new ImageIcon(getClass().getResource("assets/logo.png"));
        this.setIconImage(logo.getImage());
        this.getContentPane().setBackground(new Color(0xCEFFC9));
    }
}
