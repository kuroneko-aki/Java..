import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class GUI {

	public static void main(String[] args) {

		
		// JLabel = a GUI display area for a string of text, an image, or both

		ImageIcon image2 = new ImageIcon("C:\\Users\\raisen\\Desktop\\VSC.PROJS\\vsc.java\\GUI.java\\src\\logo 2 (1).png");
		Border border = BorderFactory.createLineBorder(Color.red,3);

		JLabel label = new JLabel(); // create a label
		label.setText("This is a logo"); // set text for label
		label.setIcon(image2);
		label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of ImageIcon
		label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM of Image Icon
		label.setForeground(Color.WHITE); // set font color of text
		label.setFont(new Font(Font.SANS_SERIF, Font.BOLD,30)); // set font of text
		label.setIconTextGap(-80); // set gap of text to image
		label.setBackground(Color.BLACK); // set background color
		label.setOpaque(true); // display background color
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text within label
		//label.setBounds(50, 50, 350, 350); // set x,y poaition within frame as well as dimensions

		// JFrame = a GUI window to add components to
		
		JFrame frame = new JFrame(); // creates a frame
		frame.setTitle("Fuck Java ./."); // sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		frame.setResizable(true); // prevents frame from being resized
		//frame.setSize(500,500); // sets the x-dimension, and y-dimension of frame
		//frame.setLayout(null);
		frame.setVisible(true); // make frame visible 
		frame.add(label);
		frame.pack();

		ImageIcon image1 = new ImageIcon("C:\\Users\\raisen\\Desktop\\VSC.PROJS\\vsc.java\\GUI.java\\src\\logo 2 (1).png");
		frame.setIconImage(image1.getImage()); // change icon of frame


	}

}
