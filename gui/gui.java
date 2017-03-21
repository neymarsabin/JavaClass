import java.awt.*;
import javax.swing.*;
class gui {
		public static void main(String[] args) {
				JFrame jf = new JFrame();
				jf.setVisible(true);
				jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // (JFrame.DO_NOTHING_ON_CLOSE) // (JFrame.HIDE_ON_CLOSE) //(JFrame.DISPOSE_ON_CLOSE) //
				jf.setSize(800,500); // set the size of the frame
				jf.setLocation(100,100); // from left and top position to display
				jf.setBounds(100,50,700,300); // position left,top and size 
				jf.setTitle("My first java gui application"); // setting the title of the gui
				ImageIcon icon = new ImageIcon("./path/of/the/icon"); // icon should be of 16px 
				jf.setIconImage(icon.getImage());

				Container c = jf.getContentPane(); // container holds the contents of the frame 
				// Color cl = new Color(255,0,0); (R,G,B) values 
				// c.setBackground(cl);
				c.setBackground(Color.RED);
				// c.setBackground(new Color(255,0,0)); // this is also an alternative way
				// jf.setResizable(false);
				
		}
}
