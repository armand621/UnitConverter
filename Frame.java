/*-------------------------------------------------------
|                    UNIT CONVERTER GUI                 |
|                                                       |
|         Programmer: Armand Robin I. Tangonan          |
|                        BSIT 1A                        |
|                                                       |
|  Note: Do not remove\modify the static method for     |
|        JTextField and JLabel for the program to       |
|        run properly without any error(s)/problem(s)   |
|                                                       |
|                                                       |
-------------------------------------------------------*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class Frame extends JFrame implements ActionListener{

	Frame(){

		//toolkits 
		Toolkit toolkit = this.getToolkit();
		Dimension size = toolkit.getScreenSize();
		

		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocation((size.width/2 - (this.getWidth()/2)), (size.height/2 - (this.getHeight()/2)));
		this.setLayout(null);
		//this.getContentPane().setBackground(new Color(0xFFFFFF));

		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e){

	}



}