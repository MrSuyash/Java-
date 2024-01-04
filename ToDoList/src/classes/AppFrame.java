package classes;
import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AppFrame extends JFrame {
	private TitleBar title;
    private List list;
    private ButtonPannel btnPannel;
    
    
    private JButton addTask;
    private JButton clear;
  //constructor
    AppFrame(){
        this.setSize(600,800);
        this.getContentPane().setBackground(new Color(0x2C3E50)); // Dark Charcoal
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        title=new TitleBar();
        list=new List();
        btnPannel=new ButtonPannel();
        this.add(title,BorderLayout.NORTH);
        this.add(btnPannel,BorderLayout.SOUTH);
        this.add(list,BorderLayout.CENTER );
        
        addTask=btnPannel.getAddTask();
        clear=btnPannel.getClear();
        
        addListeners();
    }
    
    public void addListeners() {
    	addTask.addMouseListener(new MouseAdapter() {
    		public void mousePressed(MouseEvent e) {
    			final Task task=new Task();
    			list.add(task);
    			list.updateNumber();
    			
    			task.getDone().addMouseListener(new MouseAdapter() {
    				
    				public void mousePressed(MouseEvent e) {
    					task.changeState();
    					revalidate();
    				}
    			});
    			revalidate();
    			repaint();
    		}
    	});
    	clear.addMouseListener(new MouseAdapter() {
    		public void mousePressed(MouseEvent e) {
    			list.removeCompletedTasks();
    			repaint();
    		}
    	});
    }
}
