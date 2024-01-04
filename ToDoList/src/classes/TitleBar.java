package classes;
import java.awt.*;
import javax.swing.*;
public class TitleBar extends JPanel{
	//constructor
	TitleBar() {
	    this.setPreferredSize(new Dimension(400, 80)); // Taller TitleBar
	    this.setBackground(new Color(0x2C3E50)); // Darker Charcoal
	    JLabel titleText = new JLabel("To Do List");
	    titleText.setPreferredSize(new Dimension(200, 80));
	    titleText.setFont(new Font("Lucida Calligraphy", Font.BOLD, 30));
	    titleText.setHorizontalAlignment(JLabel.LEFT);
	    titleText.setForeground(Color.WHITE); // White
	    this.add(titleText);
	}

}
