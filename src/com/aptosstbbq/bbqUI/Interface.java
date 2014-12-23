package com.aptosstbbq.bbqUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.aptosstbbq.bbqapp.menu.Menu;

public class Interface extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	static Menu bleh = new Menu();
	Scanner in = new Scanner(System.in);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		bleh = Menu.fromFile("menu.json");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 568);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAposStUser = new JLabel("APTOS STREET BARBEQUE USER INTERFACE");
		contentPane.add(lblAposStUser, "2, 2");
		
		JButton btnNewButton = new JButton("SET SOLD OUT");
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				SOFRAME sO = new SOFRAME();
				sO.setVisible(true);
			}
		});
		contentPane.add(btnNewButton, "2, 6");
		
		JButton btnNewButton_1 = new JButton("UPLOAD MENU");
		btnNewButton_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				bleh.saveMenu();
			}
		});
		contentPane.add(btnNewButton_1, "2, 8");
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
			}
		});
		contentPane.add(btnNewButton_2, "2, 10");
		
		JButton btnNewButton_3 = new JButton("New button");
		contentPane.add(btnNewButton_3, "2, 12");
		
		JButton btnNewButton_4 = new JButton("New button");
		contentPane.add(btnNewButton_4, "2, 14");
		
		textField = new JTextField();
		contentPane.add(textField, "2, 20, fill, default");
		textField.setColumns(10);
	
	}

}