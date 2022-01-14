
import java.awt.*;
import javax.swing.*;

public class GridBagLayoutDemo extends JFrame {

    GridBagLayoutDemo()
    {

        setTitle("GridBagLayoutDemo");
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.insets = new Insets(2, 2, 2, 2);
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.ipadx = 10;
        constraints.ipady = 50;

        panel.add(new JButton("Java Swing"), constraints);
        constraints.gridx = 1;
        constraints.ipadx = 50;
        constraints.ipady = 50;
        panel.add(new JButton("Layout"), constraints);
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.ipadx = 10;
        constraints.ipady = 100;
        panel.add(new JButton("Manager"), constraints);
        constraints.ipadx = 50;
        constraints.gridx = 100;
        panel.add(new JButton("Demo"), constraints);
        getContentPane().add(panel);
        setSize(600, 400);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new GridBagLayoutDemo();
    }
}
