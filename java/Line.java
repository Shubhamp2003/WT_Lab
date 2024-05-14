import java.applet.*;
import java.awt.*;

public class Line extends Applet {

    public void paint(Graphics g) {
        // Set the color of the Line to red
        g.setColor(Color.BLACK);

        // Draw the Line using lines
        g.drawLine(50, 50, 250, 50);
        g.drawLine(50, 50, 50, 150);
        g.drawLine(50, 150, 250, 150);
        g.drawLine(250, 50, 250, 150);
    }

    public static void main(String[] args) {
        // Create the applet object
        Line applet = new Line();

        
        // Create the frame to hold the applet
        Frame frame = new Frame("Line Applet");

        // Add the applet to the frame
        frame.add(applet);

        // Set the size of the frame
        frame.setSize(300, 200);

        // Show the frame
        frame.setVisible(true);
    }
}

/*
<html>
<applet code=Line height=500 width=500>
</applet>
</html>
 */