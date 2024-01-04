package classes;
import java.awt.*;
import javax.swing.*;

import javax.swing.*;
public class List extends JPanel{
	List(){
		GridLayout layout = new GridLayout(0, 1); 
		layout.setVgap(10);
		this.setLayout(layout);
		this.setBackground(new Color(0x2C2C2C)); // Slightly Darker Midnight Blue

		
	}
	public void updateNumber() {
		Component[] listItems=this.getComponents();
		for(int i=0;i<listItems.length;i++) {
			if(listItems[i] instanceof Task) {
				((Task)listItems[i]).changeIndex(i+1);
			}
		}
	}
	public void removeCompletedTasks() {
        Component[] listItems = this.getComponents();
        for (Component listItem : listItems) {
            if (listItem instanceof Task) {
                if (((Task) listItem).isChecked()) {
                    this.remove(listItem);
                }
            }
        }
        updateNumber();
        revalidate();
    }
}
