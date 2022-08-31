package code;

// importing Java AWT class
import java.awt.*;
import java.util.logging.Formatter;

// extending Frame class to our class Example1
public class Example1 extends Frame {
    // initializing using constructor
    Example()
    {
        // creating a button 
        Button b = new Button("Click Me!!");
        // setting button position on screen 
        b.setBounds(30,100,80,30);
        // adding button into frame 
        add(b);
        // frame size 300 width and 300 height 
        setSize(300,300);
        // setting the title of the frame
        setTitle("This is our basic AWT example");
        // no layout manager 
        setLayout(null);
        // now frame will be visible, by default it is not visible
        setVisible(true);
    }

}

    // main method
public static void main(String args[])
{
    Example1 f = new Example1 ();
}
