import javax.swing.*;


class maintest {
		public static void main(String[] args) {
				JOptionPane.showMessageDialog(null,"hello world","title",JOptionPane.ERROR_MESSAGE);
				JOptionPane.showConfirmDialog(null,"Do you want to exit?","Alert",JOptionPane.YES_NO_OPTION);
				String num1 = JOptionPane.showInputDialog(null,"Please input a number");
				String num2 = JOptionPane.showInputDialog(null,"Please input another number");
				int a = Integer.parseInt(num1);
				int b = Integer.parseInt(num2);
				JOptionPane.showMessageDialog(null,a+b,"sum",JOptionPane.PLAIN_MESSAGE);
		}
}
		
