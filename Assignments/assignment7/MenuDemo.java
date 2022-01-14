import java.awt.event.*;
import javax.swing.*;
public class MenuDemo{
    public JMenuBar menuDemo;
    public JMenu file, fileNew, view, edit;
    public JMenuItem  open, file1, file2, file3, fileNew1, fileNew2, view1, view2;
    public JFrame frame;
    public JPopupMenu popupmenu;
    public MenuDemo()
    {
        
        frame = new JFrame("Menu Bar Demo");
        menuDemo = new JMenuBar();
        file = new JMenu("File");
        fileNew = new JMenu("New");
        view = new JMenu("View");
        edit = new JMenu("Edit");
        popupmenu = new JPopupMenu("PopUp");
        open = new JMenuItem("Open");
        file1 = new JMenuItem("Save");
        file2 = new JMenuItem("Close");
        fileNew1 = new JMenuItem("Text");
        fileNew2 = new JMenuItem("Folder");
        view1 = new JMenuItem("Window");
        view2 = new JMenuItem("Panel");
        fileNew.add(fileNew1);
        fileNew.add(fileNew2);
        popupmenu.add(file);
        popupmenu.add(edit);
        popupmenu.add(view);
        popupmenu.add(open);
        file.add(fileNew);  
        file.add(file1);
        file.add(file2);
        view.add(view1);
        view.add(view2);
        menuDemo.add(file); 
        menuDemo.add(view);
        menuDemo.add(edit);
        menuDemo.add(open);
        frame.setJMenuBar(menuDemo);
        frame.add(popupmenu); 
        frame.add(popupmenu);
        frame.setSize(500, 500);
        frame.setVisible(true);
        open.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                if( e.getSource() == open )
                {
                    JDialog dialog = new JDialog(frame, "Dialog Box Demo");
                    JLabel label = new JLabel("This is a Warning Message");
                    dialog.add(label);

                    dialog.setBounds(150,150,200,200);
                    dialog.setVisible(true);
                }
            }
        });
      
        frame.addMouseListener(new MouseAdapter() {  
            public void mouseClicked(MouseEvent e) {
           	popupmenu.show(frame , e.getX(), e.getY());  
            }                 
        });  
          
        
    }
    
    
    public static void main(String[] args)
    {
        new MenuDemo();
    }
}