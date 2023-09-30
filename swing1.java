import javax.swing.JButton;
import javax.swing.JFrame;

public class swing1 extends JFrame{
    swing1() {
        JButton b =new JButton("click");
        b.setBounds(130, 100, 100, 40);
        //add(b);
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new swing1();
    }
}
