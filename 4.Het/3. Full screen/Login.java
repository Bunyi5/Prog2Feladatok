import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login {
	
	public static void main(String[] args) {
		
		//Create, set buttons
		
		//Login button
		JButton login = new JButton("Login");
		login.setBounds(50, 300, 275, 50);
		
		//Exit button
		JButton exit = new JButton("Exit");
		exit.setBounds(375, 300, 275, 50);
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		//Create, set labels
		
		//User name label
		JLabel username = new JLabel("Username:");
		username.setBounds(50, 50, 200, 75);
		username.setFont(new Font("Arial", Font.PLAIN, 40));
		
		//Password label
		JLabel password = new JLabel("Password:");
		password.setBounds(50, 150, 200, 75);
		password.setFont(new Font("Arial", Font.PLAIN, 40));
		
		//Create, set text fields
		
		//User text field
		JTextField userText = new JTextField();
		userText.setBounds(275, 55, 375, 60);
		
		//Pass text field
		JTextField passText = new JTextField();
		passText.setBounds(275, 155, 375, 60);
		
		//Create, set panel
		JPanel panel = new JPanel();
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

		//Set panel
		int width = 700;
		int height = 400;
		panel.setBounds((dim.width-width)/2, (dim.height-height)/2, width, height);
		panel.setLayout(null);
		
		//Add buttons,labels,text fields to panel
		panel.add(login);
		panel.add(exit);
		panel.add(username);
		panel.add(password);
		panel.add(userText);
		panel.add(passText);
		
		//Create, set frame
		JFrame frame = new JFrame();
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit with x
		frame.setExtendedState(Frame.MAXIMIZED_BOTH); //set width, height full
		frame.setUndecorated(true); // disable decorations on frame
		frame.getContentPane().setBackground(new Color(87, 147, 77));
		frame.setVisible(true); //show window
		frame.setLayout(null);
		
		//Add panel to frame
		frame.add(panel);
	}

}
