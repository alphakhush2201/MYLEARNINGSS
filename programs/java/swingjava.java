import javax.swing.*; //by inheritence 
public class swingjava extends JFrame {
    JFrame f;
    swingjava (){
        JButton b = new JButton("Click");
        b.setBounds(180,100,100,140);
        add(b);
        setSize(400,500);
        setVisible(true);
}
    public static void main(String[] args) {
        new swingjava();
    }}

