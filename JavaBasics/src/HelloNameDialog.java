import javax.swing.JOptionPane;
public class HelloNameDialog {
	public static void main(String[] args) {
		String result;
		result = JOptionPane.showInputDialog("Nhập tên của bạn");
		JOptionPane.showMessageDialog(null,"Xin chào " + result + "!");
		System.exit(0);
	}
}