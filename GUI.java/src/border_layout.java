import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class border_layout {
    
    public static void main(String[] args) {

        // Layout Manager = Defines the natural layout for components within a container
        
        // 3 common managers

        // BorderLayout = A BorderLayout components in five areas: NORTH, SOUTH, WEST, EATS, and CENTER
        //                All extra space is placed in the center area

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout(10, 10));
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.cyan);
        panel2.setBackground(Color.white);
        panel3.setBackground(Color.black);
        panel4.setBackground(Color.black);
        panel5.setBackground(Color.cyan);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        // -------- --------------sub panels -------------------------

        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.black);
        panel7.setBackground(Color.lightGray);
        panel8.setBackground(Color.red);
        panel9.setBackground(Color.gray);
        panel10.setBackground(Color.red);

        panel2.setLayout(new BorderLayout());

        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));
        panel10.setPreferredSize(new Dimension(50,50));

        panel2.add(panel6,BorderLayout.CENTER);
        panel2.add(panel7,BorderLayout.EAST);
        panel2.add(panel8,BorderLayout.NORTH);
        panel2.add(panel9,BorderLayout.WEST);
        panel2.add(panel10,BorderLayout.SOUTH);


        // -------- --------------sub panels -------------------------


        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.CENTER);
        frame.add(panel3,BorderLayout.EAST);
        frame.add(panel4,BorderLayout.WEST);
        frame.add(panel5,BorderLayout.SOUTH);

    }
}
