import java.awt.*;
import java.awt.event.*;

public class AEvent2 extends Frame {
    public static void main(String[] args) {
        new AEvent2();
    }

    TextField tf;
    AEvent2() {
        tf = new TextField();
        tf.setBounds(60,50,170,20);
        Button b = new Button("Click!");
        b.setBounds(100,120,80,20);

        Outer o = new Outer(this);
        b.addActionListener(o);
        add(b);add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
}

