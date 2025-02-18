import javax.swing.*;

public class swingjava2{
public static void main(String[] args) {
    JFrame f = new JFrame();
    JButton b = new JButton("click");
    b.setBounds(180, 100,100,140);
    f.add(b);
    b.setSize(400,500);
    b.setLayout(null);
    b.setVisible(true);
}
}

