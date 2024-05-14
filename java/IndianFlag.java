import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class IndianFlag extends Applet {
    public void paint(Graphics g) {
        // Set the background color to white
        setBackground(Color.WHITE);

        // Draw the green rectangle
        g.setColor(new Color(30, 136, 24));
        g.fillRect(50, 50, 300, 66);

        // Draw the white rectangle
        g.setColor(Color.WHITE);
        g.fillRect(50, 116, 300, 66);

        // Draw the orange rectangle
        g.setColor(new Color(255, 153, 51));
        g.fillRect(50, 182, 300, 66);

        // Draw the Dharma Chakra spokes
        g.setColor(Color.BLUE);
        int xCenter = 200;
        int yCenter = 149;
        int radius = 33;
        for (int i = 0; i < 24; i++) {
            double angle = Math.PI / 12 * i;
            int x = (int) (xCenter + radius * Math.cos(angle));
            int y = (int) (yCenter + radius * Math.sin(angle));
            g.drawLine(xCenter, yCenter, x, y);
        }
        g.setColor(Color.BLUE);
        int xCircle = 200 - radius;
        int yCircle = 149 - radius;
        int diameter = radius * 2;
        g.drawOval(xCircle, yCircle, diameter, diameter);
    }

    public static void main(String[] args) {
        IndianFlag applet = new IndianFlag();
        Frame frame = new Frame("Indian Flag Applet");
        frame.add(applet);
        frame.setSize(400, 400);
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
<applet code=IndianFlag height=500 width=500>
</applet>
</html>
 */