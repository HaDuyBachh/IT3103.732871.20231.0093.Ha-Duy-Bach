/* Ha Duy Bach 20210093 */

import javax.swing.JOptionPane;
public class PhuongTrinhBac1 {
	public static void main(String[] args) {
		String inpa = JOptionPane.showInputDialog("Nhập hệ số a: ");
		String inpb = JOptionPane.showInputDialog("Nhập hệ số b: ");
		
		double a = Double.parseDouble(inpa);
		double b = Double.parseDouble(inpb);
		
		JOptionPane.showMessageDialog(null, (a != 0) ? "Nghiệm của pt: " + (-b/a) : 
														"Phương trình vô nghiệm hoặc vô số nghiệm");
		
	}
}
