///Ha Duy Bach 20210093
package hust.soict.dsai.swing;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicButtonListener;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class NumberGrid extends JFrame {
	private JButton[] btnNumbers = new JButton[10];
	private JButton btnDelete, btnReset;
	private JTextField tfDisplay;
	
	public NumberGrid()
	{
		tfDisplay = new JTextField();
		tfDisplay.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		JPanel panelButtons = new JPanel(new GridLayout(4,3));
		addButtons(panelButtons);
		
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(tfDisplay, BorderLayout.NORTH);
		cp.add(panelButtons, BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ha Duy Bach 20210093- NumberGrid");
		setSize(200, 200);
		setVisible(true);
		
	}
	
	void addButtons(JPanel panelButtons)
	{
		ButtonListener btnListener = new ButtonListener();
		for (int i = 1; i<=9 ; i++)
		{
			btnNumbers[i] = new JButton("" + i);
			panelButtons.add(btnNumbers[i]);
			btnNumbers[i].addActionListener(btnListener);
		}
	}
	
	private class ButtonListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String button = e.getActionCommand();
			if (button.charAt(0) >= '0' && button.charAt(0) <= '9')
			{
				tfDisplay.setText(tfDisplay.getText() + button);
			}
			else if (button.equals("DEL"))
			{
				int number = Integer.parseInt(tfDisplay.getText());
				number = number/10;
				tfDisplay.setText(Integer.toString(number));
			}
			else
			{
				tfDisplay.setText("");
			}
		}
	};
	
	public static void main(String[] args) {
		new NumberGrid();
	}
	
	
}
