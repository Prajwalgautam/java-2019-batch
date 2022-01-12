import java.applet.Applet;
import java.awt.Graphics;
class LifeCycleApplet extends Applet{
    public void init(){
        System.out.println("Initialization of the applet here (1)");
    }
    public void start(){
        System.out.println("Starting of the applet(2)");
    }
    public void paint(Graphics graphics){
        graphics.drawString("hello there mate!(3)", 100, 300);
    }
    public void stop(){
        System.out.println("program stops here mate! (4)");
    }

    public void destory(){
        System.out.println("program destroyed! (5)");
    }
}