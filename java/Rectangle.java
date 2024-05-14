import java.applet.*;
import java.awt.*;
import java.awt.event.*;;

public class Rectangle extends Applet {
    public void paint(Graphics g) {
        // Set the outer rectangle's coordinates and dimensions
        int outerX = 50;
        int outerY = 50;
        int outerWidth = 200;
        int outerHeight = 100;

        // Draw the outer rectangle
        g.setColor(Color.BLACK);
        g.drawRect(outerX, outerY, outerWidth, outerHeight);

        // Set the inner rectangle's coordinates and dimensions
        int innerX = outerX + 25;
        int innerY = outerY + 25;
        int innerWidth = outerWidth - 50;
        int innerHeight = outerHeight - 50;

        // Draw the inner rectangle
        g.drawRect(innerX, innerY, innerWidth, innerHeight);

        // Set the font and color for the text
        g.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        g.setColor(Color.BLACK);

        // Get the dimensions of the text
        String text = "Shubham S Pant";
        int textWidth = g.getFontMetrics().stringWidth(text);
        int textHeight = g.getFontMetrics().getHeight();

        // Calculate the coordinates to center the text
        int textX = innerX + (innerWidth - textWidth) / 2;
        int textY = innerY + (innerHeight + textHeight) / 2;

        // Draw the text centered within the inner rectangle
        g.drawString(text, textX, textY);
    }

    public static void main(String[] args) {
        Rectangle applet = new Rectangle();
        Frame frame = new Frame("Rectangle Drawing Applet");
        frame.add(applet);
        frame.setSize(300, 200);
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
<applet code=Rectangle height=500 width=500>
</applet>
</html>
 */