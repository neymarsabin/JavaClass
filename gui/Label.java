// adding items directly to the frame is not suitable, so
// need to add items to the container 

				//				lname.setLocation(10,10);
				//				jf.add(lname);
				//				jf.add(lpassword);



import java.awt.*; // abstract window toolkit 
import javax.swing.*; 

class Label {
		public static void main(String[] args) {
				JFrame jf = new JFrame();
				jf.setVisible(true);
				jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jf.setLocation(100,100);
 				// jf.setBounds(100,50,700,300);
				jf.setSize(600,600);
				jf.setLayout(null);

				
				Font f = new Font("Monaco",Font.PLAIN,20); // f is the object of the Font class with Monaco, it's plain and size is 30


				Container c = jf.getContentPane();
				// setting background color of the container
				// c.setBackground(new Color(255,123,123));
				c.setBackground(Color.GREEN);
				
				// for username label 
				JLabel lname = new JLabel("Enter Your Username: ");
				lname.setSize(150,150);
				c.add(lname);
				lname.setText("Username: "); // overides the default label name setText 
				lname.setFont(f); // setting fonts to the label username
				lname.setForeground(Color.RED); // setting text color 
				// lname.setBackground(Color.BLUE);

				// for label password
				JLabel lpassword = new JLabel("Enter Your Password: ");
				lpassword.setSize(300,300);
				lpassword.setText("Password: ");
				lpassword.setFont(f); //setting fonts to the label password 
				lpassword.setForeground(Color.RED); 
				c.add(lpassword);

				// // for images in label
				// ImageIcon icon = new ImageIcon("./solarized.");
				// JLabel limage = new JLabel(icon);
				// c.add(limage);
				// limage.setBounds(400,500,400,400);

				
				// For username and password textfields
				JTextField txtname = new JTextField();
				c.add(txtname);
				//txtname.setSize(0,100);
				txtname.setBounds(150,60,100,30);
				txtname.setFont(f);
				
				JPasswordField passname = new JPasswordField();
				c.add(passname);
				passname.setBounds(150,130,100,30);

				// Label for gender
				JLabel lgender = new JLabel("Gender:");
				c.add(lgender);
				lgender.setFont(f);
				lgender.setForeground(Color.RED);
				lgender.setBounds(20,180,100,30);

				// for radio button male 
				JRadioButton rbtmale = new JRadioButton("Male:");
				c.add(rbtmale);
				rbtmale.setBounds(150,180,100,30);
				// for radio button female 
				JRadioButton rbtfemale = new JRadioButton("Female:");
				c.add(rbtfemale);
				rbtfemale.setBounds(150,215,100,30);
				rbtmale.setSelected(true);
				rbtfemale.setEnabled(false);

				
				// By default radio buttons are kept in same group we have to separate it 
				ButtonGroup gender = new ButtonGroup();
				gender.add(rbtmale);
				gender.add(rbtfemale);
				
				// Adding a checkbox
				// Label for checkbox
				JLabel jchklabel = new JLabel("Visited Countries:");
				c.add(jchklabel);
				jchklabel.setForeground(Color.RED);
				jchklabel.setBounds(10,250,100,30);
				
				
				JCheckBox chkboxnepal = new JCheckBox("Nepal");
				c.add(chkboxnepal);
				chkboxnepal.setBounds(150,250,100,30);
				JCheckBox chkboxamerica = new JCheckBox("America");
				c.add(chkboxamerica);
				chkboxamerica.setBounds(260,250,100,30);
				JCheckBox chkboxengland = new JCheckBox("England");
				c.add(chkboxengland);
				chkboxengland.setBounds(370,250,100,30);


				// Adding a submit button
				JButton submitBtn = new JButton("Submit");
				c.add(submitBtn);
				submitBtn.setBounds(150,400,100,30);
				
		}
}
