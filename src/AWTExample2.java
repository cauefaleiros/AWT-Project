import java.awt.*;

public class AWTExample2 {
    public static void main(String[] args) {
        AWTExample2 awtExample2 = new AWTExample2();
    }

    AWTExample2() {
        Frame f = new Frame();
        Label l = new Label("Employee ID: ");
        Button b = new Button("Submit: ");
        TextField t = new TextField();

        l.setBounds(20,80,80,30);
        t.setBounds(20,100,80,30);
        b.setBounds(100,100,80,30);

        f.add(b);
        f.add(l);
        f.add(t);

        f.setSize(400,300);
        f.setTitle("Employee Info");
        f.setLayout(null);
        f.setVisible(true);
    }
}
