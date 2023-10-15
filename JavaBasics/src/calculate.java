/*Ha Duy Bach 20210093*/

import javax.swing.JOptionPane;

public class calculate {
	public static void main(String[] args) {
		String inp1 = JOptionPane.showInputDialog("Nhập số thực thứ 1: ");
		double num1 = Double.parseDouble(inp1);
		
		String inp2 = JOptionPane.showInputDialog("Nhập số thực thứ 2");
		double num2 = Double.parseDouble(inp2);
			
		JOptionPane.showMessageDialog(null,"Tổng: " + (num1+num2));
		
		JOptionPane.showMessageDialog(null,"Hiệu: " + (num1-num2));
		
		JOptionPane.showMessageDialog(null, (num2 != 0)? "Thương: " + (num1/num2) : "Lỗi" );
	}
}
