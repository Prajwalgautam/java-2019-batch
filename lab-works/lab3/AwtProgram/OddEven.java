import java.awt.Frame;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextField;
import java.awt.Label;
class OddEven extends Frame{
		public Button button = new Button("check");
		public Label label1 = new Label();
		public TextField label1Text = new TextField();
		public Label label2 = new Label();
		public TextField label2Text = new TextField();
	public OddEven(){
		label1.setText("Value here:");
		label1.setBounds(10,50,80,25);
		label1Text.setBounds(100,50,165,25);
		label2.setText("Result:");
		label2.setBounds(10,100,80,25);
		label2Text.setBounds(100,100,165,25);
		button.setBounds(100,150,165,25);
		add(label1);
		add(label1Text);
		add(label2);
		add(label2Text);
		add(button);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		button.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e){
				 double number1 = Double.parseDouble(label1Text.getText());
				 if (number1%2 == 0){
				 	label2Text.setText("Even");
				 }
				 else{
				 	label2Text.setText("Odd");
				 }
				}
			});
	}
	public static void main(String[] args) {
		new OddEven();
	}
}