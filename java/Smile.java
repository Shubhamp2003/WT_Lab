import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Smile extends Applet {
    public void paint(Graphics g) {
        // Set the background color to white
        setBackground(Color.WHITE);

        // Draw the face circle
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 200, 200);

        // Draw the eyes
        g.setColor(Color.BLACK);
        g.fillOval(90, 100, 30, 30);
        g.fillOval(180, 100, 30, 30);

        // Draw the mouth
        g.setColor(Color.RED);
        g.fillArc(75, 150, 150, 80, 180, 180);
    }

    public static void main(String[] args) {
        Smile applet = new Smile();
        Frame frame = new Frame("Smile Face Applet");
        frame.add(applet);
        frame.setSize(300, 300);
        frame.setVisible(true);
        applet.init();
        applet.start();
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
                applet.stop();
                applet.destroy();
                System.exit(0);
            }
        });
    }
}

/*
<html>
<applet code=Smile height=500 width=500>
</applet>
</html>
 */