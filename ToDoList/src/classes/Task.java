package classes;
import javax.swing.*;
import java.awt.*;
public class Task extends JPanel {
	private JLabel index;
	private JTextField taskName;
	private JButton done; 
	private boolean checked;
	//constructor
	Task(){
		this.setPreferredSize(new Dimension(400,60));
		this.setBackground(new Color(0x2C3E50)); // Dark Charcoal
		this.setLayout(new BorderLayout());
		
		checked=false;
		
		index=new JLabel("");
		index.setPreferredSize(new Dimension(20,20));
		index.setHorizontalAlignment(JLabel.CENTER);
		index.setForeground(Color.WHITE); // White
		this.add(index,BorderLayout.WEST);
		
		taskName=new JTextField("Your Task Here");
		taskName.setBorder(BorderFactory.createEmptyBorder());
		taskName.setBackground(new Color(0x333333)); // Even Darker Charcoal
		
		this.add(taskName,BorderLayout.CENTER);
		
		done=new JButton("Done");
		done.setPreferredSize(new Dimension(40,20));
		done.setBorder(BorderFactory.createEmptyBorder());
		this.add(done,BorderLayout.EAST);
	}
	public JButton getDone() {
		return done;
	}
	public void changeIndex(int num) {
		this.index.setText((num)+".");
		this.revalidate();
		this.repaint();
	}
	public void changeState() {
		this.setBackground(Color.green);
		taskName.setBackground(Color.green);
		checked=true;
	
	}
	public boolean isChecked() {
        return checked;
    }
}
