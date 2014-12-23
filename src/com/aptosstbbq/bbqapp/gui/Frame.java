package com.aptosstbbq.bbqapp.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.aptosstbbq.bbqapp.menu.Ingredient;
import com.aptosstbbq.bbqapp.menu.Menu;
import com.aptosstbbq.bbqapp.menu.MenuItem;

public class Frame extends JFrame implements ActionListener {
	Scanner in = new Scanner(System.in);
	public Frame() {
		final Menu item = new Menu();
		final int WIDTH = 1000;
		final int HEIGHT = 1000;
		//basic jframe
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Aptos St ADD Menu");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(WIDTH, HEIGHT);
		frame.setLayout(new GridLayout(2, 2));
		JButton upload = new JButton("UPLOAD MENU");
        //Add action listener to button
		//uploads the menu to the file in json
        upload.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e)
            {
                item.saveMenu(); 
            }
        }); 
		frame.add(upload);
		JButton ing = new JButton("ADD INGREDIENT");
		ing.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String set = in.next();
				Ingredient add = new Ingredient(set);
				
			}
		});
		frame.add(ing);
		JButton setSoldOut = new JButton("SET SOLD OUT");
		ing.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String set = in.next();
				item.toggleSoldOut(set);
				
			}
		});
		JButton addMenuItem = new JButton("ADD MENU ITEM");
		ing.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String set = in.next();
				String price = in.next();
				MenuItem add = new MenuItem(set,price);
			}
		});
		frame.add(addMenuItem);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}