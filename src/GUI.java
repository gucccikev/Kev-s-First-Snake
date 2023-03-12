import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI {
    public static void main(String[] args) throws Exception {
         new GUI();
    }

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    public GUI() {
        frame = new JFrame();

        label = new JLabel("Num of clicks: 0");     

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 10, 100));
        panel.setLayout(new GridLayout(0, 1));

        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("MY GUI");
        frame.pack();
        frame.setVisible(true);

    }

}
