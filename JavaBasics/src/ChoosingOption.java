/*Ha Duy Bách 20210093*/

import javax.swing.JOptionPane;

public class ChoosingOption {
	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null, "Bạn có muốn chọn YES không :)))");
		
		JOptionPane.showMessageDialog(null, "Bạn đã chọn: " + (option==JOptionPane.YES_OPTION?
				"YES" : "NO"));
	}
}
