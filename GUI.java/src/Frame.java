import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame implements ActionListener{

    JButton button;
    JLabel label;

    Frame() {

        ImageIcon icon = new ImageIcon("C:\\Users\\raisen\\Desktop\\VSC.PROJS\\vsc.java\\GUI.java\\src\\button.png");
        ImageIcon icon2 = new ImageIcon("C:\\Users\\raisen\\Desktop\\VSC.PROJS\\vsc.java\\GUI.java\\src\\charac.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(200, 100, 220, 100);
        button.addActionListener(this);
        button.setText("i'm a fukcing button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.TOP);
        button.setFont(new Font(Font.SANS_SERIF, Font.BOLD,15));
        button.setIconTextGap(15);
        button.setForeground(Color.CYAN);
        button.setBackground(Color.BLACK);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false); // disables button

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            //System.out.println("tf u want bruhh");
            //button.setEnabled(false); // button will be disabled after clicking once
            label.setVisible(true);
        }


    }
    
}
