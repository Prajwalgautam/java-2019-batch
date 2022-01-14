
import java.awt.*;    
import javax.swing.*;   
import java.awt.event.*;    
  
public class CardLayoutDemo  extends JFrame
{    
	CardLayout card;    
	JButton btn1, btn2, btn3; 
	Container container;    
  
	CardLayoutDemo()  
	{   
		card = new CardLayout();    
		container = new Container();
		btn1 = new JButton("Avicii");  		  
		btn2 = new JButton("David Guetta");    
		btn3 = new JButton("Don Diablo");  
		container.add("a",btn1);   
		container.add("b",btn2); 
		container.add("c",btn3);  
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)   
			{    
				card.next(container);    
			}  
		});    
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)   
			{    
				card.next(container);    
			}  
		});;    
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)   
			{    
				card.next(container);    
			}  
		});
		add(container);
		setSize(500,500);
		setVisible(true); 
	}    
	  
	public static void main(String args[])   
	{     
		new CardLayoutDemo();            
		
	}    
}    