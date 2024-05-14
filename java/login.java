// write a applet program to create a login page having username, password, login button.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class login extends Applet{
    Label u;
    Label p;
    TextArea t1, t2;
    Button b;
    public void init(){
        u= new Label("USERNAME");
        t1= new TextArea(1,10);
        p= new Label("PASSWORD");
        t2= new TextArea(1,10);
        b= new Button("Login");
        add(u);
        add(t1);
        add(p);
        add(t2);
        add(b);
    }
}

/*
<html>
<applet code=login height=500 width=500>
</applet>
</html>
 */