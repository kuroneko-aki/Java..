import java.awt.FlowLayout;
import java.swing.JButton;
import javax.swing.JFrame;

public class flowLayout {
    
    public  static void main(String[] args) {

        // Layout Manager = Defines the natural layout for components within a container

        // FlowLayout = places components in a row, sized at their preferred size.
        //              If the horizontal space in the container is too small
        //              the FlowLayout class uses the next available row.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new flowLayout());
        frame.setVisible(true);

        JButton button1 = new JButton();


    }
}
