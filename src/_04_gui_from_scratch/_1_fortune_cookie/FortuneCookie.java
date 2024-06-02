package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton("Fortune");
	public void showButton() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Woohoo");
		int rand = new Random().nextInt(5);
		if(rand==0) {
			JOptionPane.showMessageDialog(null, "You will be rich");
		}
		else if(rand==1) {
			JOptionPane.showMessageDialog(null, "You will have your dream come true");
		}
		else if(rand==2) {
			JOptionPane.showMessageDialog(null, "You will have a long and healthy life");
		}
		else if(rand==3) {
			JOptionPane.showMessageDialog(null, "You will have beautiful kids");
		}
		else{
			JOptionPane.showMessageDialog(null, "You will master coding one day");
		}
	}
}
