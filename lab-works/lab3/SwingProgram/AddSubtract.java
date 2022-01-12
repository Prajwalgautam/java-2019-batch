import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
class AddSubtract extends JFrame{
		public JButton addition = new JButton("Add");
		public JButton subtract = new JButton("Subtract");
		public JLabel num1 = new JLabel();
		public JTextField num1Text = new JTextField();
		public JLabel num2 = new JLabel();
		public JTextField num2Text = new JTextField();
		public JLabel result = new JLabel();
		public JTextField resultText = new JTextField();
	public AddSubtract(){
		num1.setText("Number 1 :");
		num1.setBounds(10,50,80,25);
		num1Text.setBounds(100,50,165,25);
		num2.setText("Number 2:");
		num2.setBounds(10,100,80,25);
		num2Text.setBounds(100,100,165,25);
		result.setText("Result:");
		result.setBounds(10,150,80,25);
		resultText.setBounds(100,150,165,25);
		addition.setBounds(10,250,75,25);
		subtract.setBounds(80,250,165,25);
		add(num1);
		add(num1Text);
		add(num2);
		add(num2Text);
		add(addition);
		add(subtract);
		add(result);
		add(resultText);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		addition.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e){
				 double number1 = Double.parseDouble(num1Text.getText());
				 double number2 = Double.parseDouble(num2Text.getText());
 
				 	resultText.setText(String.valueOf(number1+number2));
 
			}});
		subtract.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e){
				 double number1 = Double.parseDouble(num1Text.getText());
				 double number2 = Double.parseDouble(num2Text.getText());
				 resultText.setText(String.valueOf(number1-number2));
 
			}});
	}
	public static void main(String[] args){
		new AddSubtract();
	}
}