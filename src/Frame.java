import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    Frame(){
        this.setTitle("Alligators Calculator GPA");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(500, 500);
        this.setVisible(true);

        ImageIcon logo = new ImageIcon(this.getClass().getResource("assets/logo.png"));
        this.setIconImage(logo.getImage());
        this.getContentPane().setBackground(new Color(0xCEFFC9));
    }
}
