package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons implements ActionListener {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");

	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		addNumbers.addActionListener((event) -> {
			String input1 = JOptionPane.showInputDialog(window, "Enter a number");
			String input2 = JOptionPane.showInputDialog(window, "Enter another number");
			int input1int = Integer.parseInt(input1);
			int input2int = Integer.parseInt(input2);
			JOptionPane.showMessageDialog(window, input1 + " + " + input2 + " = " + (input1int + input2int));
		});
		randNumber.addActionListener((event) -> {
			Random rand = new Random();
			int x = rand.nextInt(101);
			JOptionPane.showMessageDialog(window, "Random number between 1 and 100 is " + x);
		});
		tellAJoke.addActionListener((event) -> {
			JOptionPane.showMessageDialog(window, "Why do fathers take an extra pair of socks when they go golfing? \nIn case they get a hole in one!");
		});

		// 1. Call the addActionListener methods for each button. Use lambdas
		// to define to functionality of the buttons.

		window.setVisible(true);
		window.pack();
	}

	public static void main(String[] args) {
		new LambdaButtons();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
