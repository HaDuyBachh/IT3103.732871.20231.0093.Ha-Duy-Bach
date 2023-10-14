import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		String result;
		result = JOptionPane.showInputDialog("Please Enter Your Name: ");
		JOptionPane.showMessageDialog(null,"Hi " + result + "!");
	}
}
