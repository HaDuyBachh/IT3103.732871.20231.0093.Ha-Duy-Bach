import javax.swing.JOptionPane;
public class ShowTwoNumbers {
	public static void main(String[] args) {
		String strNum1, strNum2;
		String strNotification = "Bạn vừa nhập: ";
		
		strNum1 = JOptionPane.showInputDialog(null,
					"Hãy nhập số thứ nhất : ","Bách hãy nhập số thứ nhất",
					JOptionPane.INFORMATION_MESSAGE);
		
		strNotification += strNum1 + " và ";
		
		strNum2 = JOptionPane.showInputDialog(null,
				"Hãy nhập số thứ hai : ","Bách hãy số thứ hai",
				JOptionPane.INFORMATION_MESSAGE);
		
		strNotification += strNum2;
		
		JOptionPane.showMessageDialog(null, strNotification,
				"Hiện hai số", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);		
	}

}
