import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AEvent extends Frame implements ActionListener {
    TextField tf;
    AEvent() {
        tf = new TextField();
        tf.setBounds(60,50,170,20);
        Button b= new Button("Click on me!");
        b.setBounds(100,120,80,20);

        b.addActionListener(this);

        add(b);add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome");
    }

    public static void main(String[] args) {
        new AEvent();
    }

}
