package code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonExample2 {
    // creating instances of frame class and button class
    Frame fObj;
    Button button1, button2, button3;

    // instantiating using the constructor
    ButtonExample2() {
        fObj = new Frame("Frame to display Buttons");
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        button3.setLabel("Button 3");
        fObj.add(button1);
        fObj.add(button2);
        fObj.add(button3);
        fObj.setLayout(new FlowLayout());
        fObj.setSize(300, 400);
        fObj.setVisible(true);

    }
}
// main class
