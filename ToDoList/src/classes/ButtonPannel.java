package classes;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;
public class ButtonPannel extends JPanel {
	private JButton addTask;
	private JButton clear;
	Border emptyBorder=BorderFactory.createEmptyBorder();
	
	//constructor
	ButtonPannel(){
		this.setPreferredSize(new Dimension(600, 80));
		this.setBackground(new Color(0x2C3E50)); // Dark Charcoal
		addTask=new JButton("Add Task");
		addTask.setBorder(emptyBorder);
		addTask.setFont(new Font("Sans-serif",Font.PLAIN,20));
		this.add(addTask);
		this.add(Box.createHorizontalStrut(80));
		clear=new JButton("Clear Completed Task");
		clear.setBorder(emptyBorder);
		clear.setFont(new Font("Sans-serif",Font.PLAIN,20));
		this.add(clear);
	}
	public JButton getAddTask() {
		return addTask;
	}
	public JButton getClear(){
		return clear;
	}

}
