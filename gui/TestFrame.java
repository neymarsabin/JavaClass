import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class MyFrame1 extends JFrame implements ActionListener {
		//  Contructor 
		JButton btn1;JButton btn2;JButton btn3;
		Container cntr;
		
		MyFrame1() {
				cntr = this.getContentPane();
				cntr.setLayout(null);

				
				btn1 = new JButton("Orange");
				btn1.setBounds(60,10,100,30);

				btn2 = new JButton("Red");
				btn2.setBounds(120,10,100,30);

				btn3 = new JButton("Blue");
				btn3.setBounds(10,10,100,30);

				

				btn1.addActionListener(this);
				btn2.addActionListener(this);
				btn3.addActionListener(this);

				cntr.add(btn1);
				cntr.add(btn2);
				cntr.add(btn3);

		}

		public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btn1 ) {
						cntr.setBackground(Color.RED);
				}
				if (e.getSource() == btn2 ) {
						cntr.setBackground(Color.ORANGE);
				}
				if (e.getSource() == btn3 ) {
						cntr.setBackground(Color.BLUE);
				}

				JFrame f1 = new JFrame();
				f1.setVisible(true);
				f1.setBounds(200,200,500,300);
				f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		}
		
}


class TestFrame {
		public static void main(String[] args) {
				MyFrame1 f = new MyFrame1();
				f.setVisible(true);
				f.setBounds(50,50,700,700);
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}
				
