/* Ha Duy Bách 20210093 */

import javax.swing.JOptionPane;
public class HePhuongTrinhBac1 {
	public static void main(String[] args) {
		double a1 = Double.parseDouble(JOptionPane.showInputDialog("nhập hệ số a1: "));
		double b1 = Double.parseDouble(JOptionPane.showInputDialog("nhập hệ số b1: "));
		double c1 = Double.parseDouble(JOptionPane.showInputDialog("nhập hệ số c1: "));

		double a2 = Double.parseDouble(JOptionPane.showInputDialog("nhập hệ số a2: "));
		double b2 = Double.parseDouble(JOptionPane.showInputDialog("nhập hệ số b2: "));
		double c2 = Double.parseDouble(JOptionPane.showInputDialog("nhập hệ số c2: "));

		double det = a1*b2 - a2*b1;
		
		if (det != 0)
		{
			double x = (c1*b2 - c2*b1) / det;
			double y = (a1*c2 - c2*c1) / det;
			
			JOptionPane.showMessageDialog(null, "Nghiệm x = " + x + "\nNghiệm y = " + y);
		}
		else
		{
			if (a1/a2 == b1/b2 && b1/b2 == c1/c2)
			{
				JOptionPane.showMessageDialog(null, "Hệ Vô Số Nghiệm");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Hệ Vô Nghiệm");
			}
		}
	}
}
