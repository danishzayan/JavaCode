import java.applet.Applet;
import java.awt.*;

public class LifeCycleApplet extends Applet {
    public void init() {
        // Initialization code
        System.out.println("Initializing the applet...");
    }

    public void start() {
        // Code to start or resume the applet
        System.out.println("Starting the applet...");
    }

    public void paint(Graphics g) {
        // Code to draw graphics on the applet
        g.drawString("Applet Life Cycle", 50, 50);
    }

    public void stop() {
        // Code to stop or suspend the applet
        System.out.println("Stopping the applet...");
    }

    public void destroy() {
        // Code to clean up resources used by the applet
        System.out.println("Destroying the applet...");
    }
}
