import java.awt.*;

public class AWTExample1 extends Frame {
    public static void main(String[] args) {
        AWTExample1 demoApplet = new AWTExample1();
    }

    AWTExample1() {
        Button b = new Button("Click on me!");
        b.setBounds(110,150,80,30);
        add(b);

        setSize(1200,800);
        setTitle("Basic AWT example!");
        setLayout(null);
        setVisible(true);

    }
}