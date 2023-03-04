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

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ConverterComputations{

	
	public static void dataOperation(){

		//This section is for catching invalid or empty inputs
		
		int forExample = 1;
		int forBuff = 2;

		if(forExample < forBuff){

			String value = Frame.fromValue.getText();
			Pattern pattern = Pattern.compile("[A-Z, a-z, ^&$()*@!#%]");
			Matcher errorMatcher = pattern.matcher(Frame.fromValue.getText());

			if(value.equals("")){
				JOptionPane.showMessageDialog(null, "It seems like you did not enter any number in the input field. \nPlease try again and enter a number.", "No Input", JOptionPane.ERROR_MESSAGE);

			}

			else if(errorMatcher.find()){
			JOptionPane.showMessageDialog(null, "It seems like you have entered an invalid input. \nPlease try again and enter numbers only.", "Invalid Input", JOptionPane.ERROR_MESSAGE);

			}
		}
		


		//This section is for conversion process

		if(Frame.mainPicker.getSelectedItem().toString().equals("Data")){


			if(Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==0){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Byte"));
			}

			else if (Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==1){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /1024;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Kilobyte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==2){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /Math.pow(1024,2);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Megabyte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==3){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /Math.pow(1024,3);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Gigabyte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==4){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /Math.pow(1024,4);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Terabyte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==5){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /Math.pow(1024,5);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Petabyte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==0){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a *1024;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Byte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==1){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Kilobyte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==2){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /(1024);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Megabyte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==3){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /Math.pow(1024,2);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Gigabyte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==4){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /Math.pow(1024,3);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Terabyte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==5){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /Math.pow(1024,4);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Petabyte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==0){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a *Math.pow(1024,2);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Byte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==1){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a *1024;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Kilobyte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==2){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Megabyte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==3){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /1024;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Gigabyte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==4){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /Math.pow(1024,2);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Terabyte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==5){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /Math.pow(1024,3);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Petabyte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==0){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a *Math.pow(1024,3);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Byte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==1){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a *Math.pow(1024,2);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Kilobyte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==2){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a *1024;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Megabyte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==3){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Gigabyte"));

			}


			else if (Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==4){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /1024;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Terabyte"));

			}


			else if (Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==5){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /Math.pow(1024,2);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Petabyte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==0){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a *Math.pow(1024,4);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Byte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==1){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a *Math.pow(1024,3);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Kilobyte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==2){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a *Math.pow(1024,2);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Megabyte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==3){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a *1024;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Gigabyte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==4){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Terabyte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==5){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /1024;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Petabyte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 5 &&Frame.unit2.getSelectedIndex()==0){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a *Math.pow(1024,5);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Byte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==1){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a *Math.pow(1024,4);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Kilobyte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==2){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a *Math.pow(1024,3);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Megabyte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==3){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a *Math.pow(1024,2);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Gigabyte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==4){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a *1024;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Terabyte"));

			}

			else if (Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==5){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Petabyte"));

			}


		}



		else if (Frame.mainPicker.getSelectedItem().toString().equals("Length")){

			if (Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==0){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Kilometer"));

			}

			else if (Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==1){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a *1000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Meter"));
			}

			else if (Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==2){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a *Math.pow(10,4);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Decimeter"));
			}

			else if (Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==3){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a *Math.pow(10,5);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Centimeter"));
			}

			else if (Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==4){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a *Math.pow(10,6);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Millimeter"));
			}

			else if (Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==5){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a *Math.pow(10,9);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Micrometer"));
			}

			else if (Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==6){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a *Math.pow(10,12);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Nanometer"));
			}

			else if (Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==7){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a *Math.pow(10,15);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Picometer"));
			}

			else if (Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==8){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1.852;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Nautical Mile"));
			}

			else if (Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==9){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1.609344;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Mile"));
			}

			else if (Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==10){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.0009144;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Yard"));
			}

			else if (Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==11){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.0003048;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Foot"));
			}

			else if (Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==12){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.0000254;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Inch"));
			}


			//second

			else if (Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==0){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /1000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Kilometer"));

			}

			else if (Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==1){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Meter"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==2){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.1;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Decimeter"));
			}

			else if (Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==3){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /0.01;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Centimeter"));
			}

			else if (Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==4){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /0.001;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Millimeter"));
			}

			else if (Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==5){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.000001;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Micrometer"));
			}

			else if (Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==6){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.000000001;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Nanometer"));
			}

			else if (Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==7){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.000000000001;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Picometer"));
			}

			else if (Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==8){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1852;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Nautical Mile"));
			}

			else if (Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==9){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1609.344;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Mile"));
			}

			else if (Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==10){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.9144;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Yard"));
			}

			else if (Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==11){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.3048;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Foot"));
			}

			else if (Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==12){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.0254;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Inch"));
			}

			//For third

			else if (Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==0){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /Math.pow(10,4);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Kilometer"));

			}

			else if (Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==1){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/10;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Meter"));
				
				
			}

			else if (Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==2){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Decimeter"));
			}

			else if (Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==3){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /0.1;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Centimeter"));
			}

			else if (Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==4){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /0.01;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Millimeter"));
			}

			else if (Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==5){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.00001;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Micrometer"));
			}

			else if (Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==6){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.00000001;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Nanometer"));
			}

			else if (Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==7){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.00000000001;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Picometer"));
			}

			else if (Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==8){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/18520;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Nautical Mile"));
			}

			else if (Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==9){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/16093.44;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Mile"));
			}

			else if (Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==10){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/9.144;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Yard"));
			}

			else if (Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==11){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/3.048;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Foot"));
			}

			else if (Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==12){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.254;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Inch"));
			}



			//fourth


			else if (Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==0){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /Math.pow(10,5);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Kilometer"));

			}

			else if (Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==1){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/100;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Meter"));
				
				
			}

			else if (Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==2){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /10;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Decimeter"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==3){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Centimeter"));
			}

			else if (Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==4){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /0.1;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Millimeter"));
			}

			else if (Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==5){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.0001;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Micrometer"));
			}

			else if (Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==6){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.0000001;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Nanometer"));
			}

			else if (Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==7){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.0000000001;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Picometer"));
			}

			else if (Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==8){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/185200;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Nautical Mile"));
			}

			else if (Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==9){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/160934.4;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Mile"));
			}

			else if (Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==10){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/91.44;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Yard"));
			}

			else if (Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==11){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/30.48;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Foot"));
			}

			else if (Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==12){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/2.54;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Inch"));
			}

			//fifth

			else if (Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==0){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /Math.pow(10,6);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Kilometer"));

			}

			else if (Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==1){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Meter"));
				
				
			}

			else if (Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==2){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /100;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Decimeter"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==3){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /10;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Centimeter"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==4){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Millimeter"));
			}

			else if (Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==5){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.001;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Micrometer"));
			}

			else if (Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==6){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.000001;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Nanometer"));
			}

			else if (Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==7){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.000000001;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Picometer"));
			}

			else if (Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==8){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1852000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Nautical Mile"));
			}

			else if (Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==9){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1609344;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Mile"));
			}

			else if (Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==10){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/914.4;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Yard"));
			}

			else if (Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==11){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/304.8;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Foot"));
			}

			else if (Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==12){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/25.4;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Inch"));
			}

			//sixth

			else if (Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==0){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /Math.pow(10,9);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Kilometer"));

			}

			else if (Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==1){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/Math.pow(10,6);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Meter"));
				
				
			}

			else if (Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==2){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /100000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Decimeter"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==3){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /10000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Centimeter"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==4){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Millimeter"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==5){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Micrometer"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==6){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.000001;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Nanometer"));
			}

			else if (Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==7){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.000001;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Picometer"));
			}

			else if (Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==8){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1852000000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Nautical Mile"));
			}

			else if (Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==9){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1609344000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Mile"));
			}

			else if (Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==10){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/914400;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Yard"));
			}

			else if (Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==11){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/304800;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Foot"));
			}

			else if (Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==12){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/25400;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Inch"));
			}

			//seventh

			else if (Frame.unit1.getSelectedIndex() == 6 && Frame.unit2.getSelectedIndex()==0){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /Math.pow(10,12);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Kilometer"));

			}

			else if (Frame.unit1.getSelectedIndex() == 6 && Frame.unit2.getSelectedIndex()==1){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/Math.pow(10,9);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Meter"));
				
				
			}

			else if (Frame.unit1.getSelectedIndex() == 6 && Frame.unit2.getSelectedIndex()==2){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /100000000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Decimeter"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 6 && Frame.unit2.getSelectedIndex()==3){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /10000000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Centimeter"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 6 && Frame.unit2.getSelectedIndex()==4){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1000000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Millimeter"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 6 && Frame.unit2.getSelectedIndex()==5){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Micrometer"));
				
				
			}

			else if (Frame.unit1.getSelectedIndex() == 6 && Frame.unit2.getSelectedIndex()==6){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Nanometer"));
			}

			else if (Frame.unit1.getSelectedIndex() == 6 && Frame.unit2.getSelectedIndex()==7){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.001;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Picometer"));
			}

			else if (Frame.unit1.getSelectedIndex() == 6 && Frame.unit2.getSelectedIndex()==8){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(Math.pow(16.856371,10));
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Nautical Mile"));
			}

			else if (Frame.unit1.getSelectedIndex() == 6 && Frame.unit2.getSelectedIndex()==9){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/Math.pow(16.6212961,10);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Mile"));
			}

			else if (Frame.unit1.getSelectedIndex() == 6 && Frame.unit2.getSelectedIndex()==10){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/914400000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Yard"));
			}

			else if (Frame.unit1.getSelectedIndex() == 6 && Frame.unit2.getSelectedIndex()==11){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/304800000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Foot"));
			}

			else if (Frame.unit1.getSelectedIndex() == 6 && Frame.unit2.getSelectedIndex()==12){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/25400000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Inch"));
			}

			//eight

			else if (Frame.unit1.getSelectedIndex() == 7 && Frame.unit2.getSelectedIndex()==0){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /Math.pow(10,15);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Kilometer"));

			}

			else if (Frame.unit1.getSelectedIndex() == 7 && Frame.unit2.getSelectedIndex()==1){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/Math.pow(10,12);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Meter"));
				
				
			}

			else if (Frame.unit1.getSelectedIndex() == 7 && Frame.unit2.getSelectedIndex()==2){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /Math.pow(10,11);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Decimeter"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 7 && Frame.unit2.getSelectedIndex()==3){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /Math.pow(10,10);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Centimeter"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 7 && Frame.unit2.getSelectedIndex()==4){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/Math.pow(10,9);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Millimeter"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 7 && Frame.unit2.getSelectedIndex()==5){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1000000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Micrometer"));
				
				
			}

			else if (Frame.unit1.getSelectedIndex() == 7 && Frame.unit2.getSelectedIndex()==6){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Nanometer"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 7 && Frame.unit2.getSelectedIndex()==7){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Picometer"));
			}

			else if (Frame.unit1.getSelectedIndex() == 7 && Frame.unit2.getSelectedIndex()==8){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/Math.pow(33.6328831,10);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Nautical Mile"));
			}

			else if (Frame.unit1.getSelectedIndex() == 7 && Frame.unit2.getSelectedIndex()==9){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/Math.pow(33.163846,10);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Mile"));
			}

			else if (Frame.unit1.getSelectedIndex() == 7 && Frame.unit2.getSelectedIndex()==10){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/Math.pow(15.707737,10);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Yard"));
			}

			else if (Frame.unit1.getSelectedIndex() == 7 && Frame.unit2.getSelectedIndex()==11){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/Math.pow(14.07348,10);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Foot"));
			}

			else if (Frame.unit1.getSelectedIndex() == 7 && Frame.unit2.getSelectedIndex()==12){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/Math.pow(10.977,10);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Inch"));
			}


			//ninth

			else if (Frame.unit1.getSelectedIndex() == 8 && Frame.unit2.getSelectedIndex()==0){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /0.539956803;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Kilometer"));

			}

			else if (Frame.unit1.getSelectedIndex() == 8 && Frame.unit2.getSelectedIndex()==1){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.000539956803;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Meter"));
				
				
			}

			else if (Frame.unit1.getSelectedIndex() == 8 && Frame.unit2.getSelectedIndex()==2){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /0.0000539956804;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Decimeter"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 8 && Frame.unit2.getSelectedIndex()==3){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /(0.0000539956804/10);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Centimeter"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 8 && Frame.unit2.getSelectedIndex()==4){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(0.0000539956804/100);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Millimeter"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 8 && Frame.unit2.getSelectedIndex()==5){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(0.0000539956804/100000);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Micrometer"));
				
				
			}

			else if (Frame.unit1.getSelectedIndex() == 8 && Frame.unit2.getSelectedIndex()==6){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(0.0000539956804/Math.pow(10,8));
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Nanometer"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 8 && Frame.unit2.getSelectedIndex()==7){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(0.0000539956804/Math.pow(10,11));
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Picometer"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 8 && Frame.unit2.getSelectedIndex()==8){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Nautical Mile"));
			}

			else if (Frame.unit1.getSelectedIndex() == 8 && Frame.unit2.getSelectedIndex()==9){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.868976242;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Mile"));
			}

			else if (Frame.unit1.getSelectedIndex() == 8 && Frame.unit2.getSelectedIndex()==10){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.000493736501;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Yard"));
			}

			else if (Frame.unit1.getSelectedIndex() == 8 && Frame.unit2.getSelectedIndex()==11){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.000164578834;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Foot"));
			}

			else if (Frame.unit1.getSelectedIndex() == 8 && Frame.unit2.getSelectedIndex()==12){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(1.37149028/Math.pow(10,5));
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Inch"));
			}

			//tenth

			else if (Frame.unit1.getSelectedIndex() == 9 && Frame.unit2.getSelectedIndex()==0){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /0.621371192;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Kilometer"));

			}

			else if (Frame.unit1.getSelectedIndex() == 9 && Frame.unit2.getSelectedIndex()==1){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(6.21371192/Math.pow(10,4));
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Meter"));
				
				
			}

			else if (Frame.unit1.getSelectedIndex() == 9 && Frame.unit2.getSelectedIndex()==2){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /(0.621371192/Math.pow(10,4));
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Decimeter"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 9 && Frame.unit2.getSelectedIndex()==3){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /(0.621371192/Math.pow(10,5));
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Centimeter"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 9 && Frame.unit2.getSelectedIndex()==4){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(0.621371192/Math.pow(10,6));
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Millimeter"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 9 && Frame.unit2.getSelectedIndex()==5){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(0.621371192/Math.pow(10,9));
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Micrometer"));
				
				
			}

			else if (Frame.unit1.getSelectedIndex() == 9 && Frame.unit2.getSelectedIndex()==6){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(0.621371192/Math.pow(10,12));
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Nanometer"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 9 && Frame.unit2.getSelectedIndex()==7){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(0.621371192/Math.pow(10,15));
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Picometer"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 9 && Frame.unit2.getSelectedIndex()==8){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1.15077945;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Nautical Mile"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 9 && Frame.unit2.getSelectedIndex()==9){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Mile"));
			}

			else if (Frame.unit1.getSelectedIndex() == 9 && Frame.unit2.getSelectedIndex()==10){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(0.568181818/Math.pow(10,3));
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Yard"));
			}

			else if (Frame.unit1.getSelectedIndex() == 9 && Frame.unit2.getSelectedIndex()==11){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(0.189393939/Math.pow(10,3));
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Foot"));
			}

			else if (Frame.unit1.getSelectedIndex() == 9 && Frame.unit2.getSelectedIndex()==12){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(0.157828283/Math.pow(10,4));
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Inch"));
			}

			//elventh

			else if (Frame.unit1.getSelectedIndex() == 10 && Frame.unit2.getSelectedIndex()==0){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /1093.6133;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Kilometer"));

			}

			else if (Frame.unit1.getSelectedIndex() == 10 && Frame.unit2.getSelectedIndex()==1){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1.0936133;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Meter"));
				
				
			}

			else if (Frame.unit1.getSelectedIndex() == 10 && Frame.unit2.getSelectedIndex()==2){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /0.10936133;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Decimeter"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 10 && Frame.unit2.getSelectedIndex()==3){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /(0.10936133/10);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Centimeter"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 10 && Frame.unit2.getSelectedIndex()==4){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(0.10936133/Math.pow(10,2));
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Millimeter"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 10 && Frame.unit2.getSelectedIndex()==5){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(0.10936133/Math.pow(10,5));
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Micrometer"));
				
				
			}

			else if (Frame.unit1.getSelectedIndex() == 10 && Frame.unit2.getSelectedIndex()==6){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(0.10936133/Math.pow(10,8));
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Nanometer"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 10 && Frame.unit2.getSelectedIndex()==7){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(0.10936133/Math.pow(10,11));
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Picometer"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 10 && Frame.unit2.getSelectedIndex()==8){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/2025.37183;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Nautical Mile"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 10 && Frame.unit2.getSelectedIndex()==9){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1760;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Mile"));
			}

			else if (Frame.unit1.getSelectedIndex() == 10 && Frame.unit2.getSelectedIndex()==10){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Yard"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 10 && Frame.unit2.getSelectedIndex()==11){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.333333333;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Foot"));
			}

			else if (Frame.unit1.getSelectedIndex() == 10 && Frame.unit2.getSelectedIndex()==12){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.0277777778;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Inch"));
			}

			//twelveth

			else if (Frame.unit1.getSelectedIndex() == 11 && Frame.unit2.getSelectedIndex()==0){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /3280.8399;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Kilometer"));

			}

			else if (Frame.unit1.getSelectedIndex() == 11 && Frame.unit2.getSelectedIndex()==1){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/3.2808399;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Meter"));
				
				
			}

			else if (Frame.unit1.getSelectedIndex() == 11 && Frame.unit2.getSelectedIndex()==2){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /(3.2808399/10);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Decimeter"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 11 && Frame.unit2.getSelectedIndex()==3){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /(3.2808399/Math.pow(10,2));
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Centimeter"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 11 && Frame.unit2.getSelectedIndex()==4){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(3.2808399/Math.pow(10,3));
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Millimeter"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 11 && Frame.unit2.getSelectedIndex()==5){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(3.2808399/Math.pow(10,6));
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Micrometer"));
				
				
			}

			else if (Frame.unit1.getSelectedIndex() == 11 && Frame.unit2.getSelectedIndex()==6){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(3.2808399/Math.pow(10,9));
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Nanometer"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 11 && Frame.unit2.getSelectedIndex()==7){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(3.2808399/Math.pow(10,12));
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Picometer"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 11 && Frame.unit2.getSelectedIndex()==8){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/6076.11549;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Nautical Mile"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 11 && Frame.unit2.getSelectedIndex()==9){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/660;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Mile"));
			}

			else if (Frame.unit1.getSelectedIndex() == 11 && Frame.unit2.getSelectedIndex()==10){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/3;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Yard"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 11 && Frame.unit2.getSelectedIndex()==11){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Foot"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 11 && Frame.unit2.getSelectedIndex()==12){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.0833333333;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Inch"));
			}

			//thirteenth

			else if (Frame.unit1.getSelectedIndex() == 12 && Frame.unit2.getSelectedIndex()==0){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /39370.0787;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Kilometer"));

			}

			else if (Frame.unit1.getSelectedIndex() == 12 && Frame.unit2.getSelectedIndex()==1){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/39.3700787;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Meter"));
				
				
			}

			else if (Frame.unit1.getSelectedIndex() == 12 && Frame.unit2.getSelectedIndex()==2){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /3.93700787;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Decimeter"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 12 && Frame.unit2.getSelectedIndex()==3){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a /(3.93700787/Math.pow(10,1));
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Centimeter"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 12 && Frame.unit2.getSelectedIndex()==4){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(3.93700787/Math.pow(10,2));
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Millimeter"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 12 && Frame.unit2.getSelectedIndex()==5){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(3.93700787/Math.pow(10,5));
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Micrometer"));
				
				
			}

			else if (Frame.unit1.getSelectedIndex() == 12 && Frame.unit2.getSelectedIndex()==6){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(3.93700787/Math.pow(10,8));
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Nanometer"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 12 && Frame.unit2.getSelectedIndex()==7){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(3.93700787/Math.pow(10,11));
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Picometer"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 12 && Frame.unit2.getSelectedIndex()==8){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/72913.3858;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Nautical Mile"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 12 && Frame.unit2.getSelectedIndex()==9){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/63360;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Mile"));
			}

			else if (Frame.unit1.getSelectedIndex() == 12 && Frame.unit2.getSelectedIndex()==10){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/36;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Yard"));
				
			}

			else if (Frame.unit1.getSelectedIndex() == 12 && Frame.unit2.getSelectedIndex()==11){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/12;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Foot"));
			}

			else if (Frame.unit1.getSelectedIndex() == 12 && Frame.unit2.getSelectedIndex()==12){
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Inch"));
				
			}


























		}

		else if (Frame.mainPicker.getSelectedItem().toString().equals("Area")) {
			
			if(Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==0) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Square Kilometer"));
				}
			
			else if(Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==1) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.01;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Hectare"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==2) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.0001;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Are"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==3) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.000001;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Square meter"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==4) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/Math.pow(0.246733,10);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Square yard"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==5) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/Math.pow(0.198062836,10);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Square foot"));

				}
			
			//second computation
			
			if(Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==0) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/100;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Square Kilometer"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==1) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Hectare"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==2) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.01;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Are"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==3) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.0001;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Square meter"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==4) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.000083612736;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Square yard"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==5) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.000009290304;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Square foot"));

				}
			
			//third
			
			else if(Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==0) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/10000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Square Kilometer"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==1) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/100;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Hectare"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==2) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Are"));
				}
			
			else if(Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==3) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.01;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Square meter"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==4) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.0083612736;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Square yard"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==5) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.0009290304;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Square foot"));

				}
			
			
			//fourth
			else if(Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==0) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1000000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Square Kilometer"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==1) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/10000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Hectare"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==2) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/100;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Are"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==3) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Square Meter"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==4) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.83612736;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Square yard"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==5) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.09290304;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Square foot"));

				}
			
			
			
			//fifth
			else if(Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==0) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1195990.05;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Square Kilometer"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==1) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/11959.9005;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Hectare"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==2) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/119.599005;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Are"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==3) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1.19599005;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Square Meter"));
				

				}
			
			else if(Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==4) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Square Yard"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==5) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.111111111;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Square foot"));

				}
			
			
			//sixth
			
			else if(Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==0) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/10763910.4;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Square Kilometer"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==1) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/107639.104;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Hectare"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==2) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1076.39104;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Are"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==3) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/10.7639104;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Square Meter"));
				

				}
			
			else if(Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==4) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/9;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Square Yard"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==5) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Square Foot"));
				

				}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		//another condition
		
		else if (Frame.mainPicker.getSelectedItem().toString().equals("Volume")) {
			if(Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==0) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Milliliter"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==1) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/10;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Centiliter"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==2) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/100;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Deciliter"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==3) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Liter"));
				

				}
			
			else if(Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==4) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/100000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Hectoliter"));

				}
			
			
			//second
			if(Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==0) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.1;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Milliliter"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==1) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Centiliter"));


				}
			
			else if(Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==2) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/10;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Deciliter"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==3) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/100;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Liter"));
				

				}
			
			else if(Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==4) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/10000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Hectoliter"));

				}
			
			//third
			if(Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==0) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.01;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Milliliter"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==1) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.1;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Centiliter"));
				

				}
			
			else if(Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==2) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Deciliter"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==3) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/10;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Liter"));
				

				}
			
			else if(Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==4) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Hectoliter"));

				}
			
			//fourth
			if(Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==0) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.001;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Milliliter"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==1) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.01;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Centiliter"));
				

				}
			
			else if(Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==2) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.1;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Deciliter"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==3) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Liter"));
				

				}
			
			else if(Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==4) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/100;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Hectoliter"));

				}
			
			//fifth
			if(Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==0) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.00001;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Milliliter"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==1) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.0001;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Centiliter"));
				

				}
			
			else if(Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==2) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.001;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Deciliter"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==3) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.01;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Liter"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==4) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Hectoliter"));

				}
			
			
		
			
		}
		
		
		
		
		
		
			//another condition

		else if (Frame.mainPicker.getSelectedItem().toString().equals("Temperature")) {
			
			
			if(Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==0) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Celsius"));
			}
			
			else if(Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==1) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a*(1.8)+32;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Farenheit"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==2) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a+273.15;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Kelvin"));

				}
			
			//second
			
			else if(Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==0) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = (a-32)*0.5556;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Celsius"));

				
			}
			
			else if(Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==1) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Farenheit"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==2) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = ((a-32)*5)/9+273.15;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Kelvin"));

				}
			
			//third
			
			else if(Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==0) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a-273.15;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Celsius"));

				
			}
			
			else if(Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==1) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = 1.8*(a-273) + 32;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Farenheit"));

				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==2) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Kelvin"));


				}
			
			
		}
		
		
		//another condition
		
		else if (Frame.mainPicker.getSelectedItem().toString().equals("Time")) {

			if(Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==0) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Year"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==1) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.0191780822;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Week"));
				

				}
			
			else if(Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==2) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(1/365.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum) +" Day"));
				
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==3) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(1/8760.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Hour"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==4) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(1/525600.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Minute"));

				}

			else if(Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==5) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(1/31536000.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Second"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==6) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(1/31536000000.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Millisecond"));

				}

			//second condition with undone computations
			else if(Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==0) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/52.1428571;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Year"));
				
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==1) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Week"));
				

				}
			
			else if(Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==2) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(1/7.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum) +" Day"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==3) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(1/168.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Hour"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==4) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(1/10080.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Minute"));

				}

			else if(Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==5) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(1/604800.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Second"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==6) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(1/604800000.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Millisecond"));

				}

			//third

			else if(Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==0) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/365.0;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Year"));
				
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==1) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/7;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum) +" Week"));
				

				}
			
			else if(Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==2) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Day"));
				
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==3) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(1/24.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Hour"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==4) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(1/1440.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Minute"));

				}

			else if(Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==5) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(1/86400.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Second"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==6) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(1/86400000.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Millisecond"));

				}

			//fourth

			else if(Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==0) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/8760;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Year"));
				
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==1) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/168;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum) +" Week"));
				

				}
			
			else if(Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==2) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/24;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Day"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==3) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Hour"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==4) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(1/60.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Minute"));

				}

			else if(Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==5) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(1/3600.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Second"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==6) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(1/3600000.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Millisecond"));

				}

			//fifth


			else if(Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==0) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/525600;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Year"));
				
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==1) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/10080;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum) +" Week"));
				

				}
			
			else if(Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==2) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1440;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Day"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==3) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/60;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Hour"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==4) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Minute"));

				}

			else if(Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==5) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(1/60.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Second"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==6) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(1/60000.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Millisecond"));

				}

			//sixth

			else if(Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==0) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/31536000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Year"));
				
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==1) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/604800;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum) +" Week"));
				

				}
			
			else if(Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==2) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/86400;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Day"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==3) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/3600;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Hour"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==4) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/60;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Minute"));
				
				}

			else if(Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==5) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Second"));
				}
			
			else if(Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==6) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.001;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Millisecond"));

				}

			//seventh
			else if(Frame.unit1.getSelectedIndex() == 6 && Frame.unit2.getSelectedIndex()==0) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(1576800/0.00005);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Year"));
				
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 6 && Frame.unit2.getSelectedIndex()==1) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/604800000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum) +" Week"));
				

				}
			
			else if(Frame.unit1.getSelectedIndex() == 6 && Frame.unit2.getSelectedIndex()==2) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/86400000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Day"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 6 && Frame.unit2.getSelectedIndex()==3) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/3600000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Hour"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 6 && Frame.unit2.getSelectedIndex()==4) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/60000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Minute"));
				
				}

			else if(Frame.unit1.getSelectedIndex() == 6 && Frame.unit2.getSelectedIndex()==5) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Second"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 6 && Frame.unit2.getSelectedIndex()==6) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Millisecond"));

				}

		}

		//Another Condition

		else if (Frame.mainPicker.getSelectedItem().toString().equals("Mass")){

			//first

			if(Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==0) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Tonne"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==1) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.001;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum) +" Kilogram"));
				

				}
			
			else if(Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==2) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(1/1000000.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Gram"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==3) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(0.005/5000000.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Milligram"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==4) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(0.000005/5000000.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Microgram"));
				
				}

			else if(Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==5) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(0.005/11.0231131);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Pound"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==6) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(0.005/176.36981);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Ounce"));

				}

			else if(Frame.unit1.getSelectedIndex() == 0 && Frame.unit2.getSelectedIndex()==7) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(0.005/25000.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Carat"));
				}

			//second

			else if(Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==0) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum) +" Tonne"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==1) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Kilogram"));
				}
			
			else if(Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==2) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.001;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Gram"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==3) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(1/1000000.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Milligram"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==4) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(0.000005/5000.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Microgram"));
				
				}

			else if(Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==5) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.45359237;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Pound"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==6) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.0283495231;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Ounce"));

				}

			else if(Frame.unit1.getSelectedIndex() == 1 && Frame.unit2.getSelectedIndex()==7) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.0002;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Carat"));
				}

			//third
			else if(Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==0) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1000000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum) +" Tonne"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==1) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Kilogram"));
				}
			
			else if(Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==2) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Gram"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==3) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.001;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Milligram"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==4) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.000001;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Microgram"));
				
				}

			else if(Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==5) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/453.59237;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Pound"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==6) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/28.3495231;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Ounce"));

				}

			else if(Frame.unit1.getSelectedIndex() == 2 && Frame.unit2.getSelectedIndex()==7) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.2;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Carat"));
				}

			//fourth
			else if(Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==0) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1000000000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum) +" Tonne"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==1) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1000000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Kilogram"));
				}
			
			else if(Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==2) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Gram"));
				

				}
			
			else if(Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==3) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Milligram"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==4) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.001;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Microgram"));
				
				}

			else if(Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==5) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/453592.37;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Pound"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==6) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/28349.5231;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Ounce"));

				}

			else if(Frame.unit1.getSelectedIndex() == 3 && Frame.unit2.getSelectedIndex()==7) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/200;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Carat"));
				}

		//fifth condition 

			else if(Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==0) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/Math.pow(10,12);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum) +" Tonne"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==1) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(100000.0/0.0001);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Kilogram"));
				}
			
			else if(Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==2) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(100.0/0.0001);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Gram"));
				

				}
			
			else if(Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==3) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/1000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Milligram"));
				

				}
			
			else if(Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==4) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Microgram"));
				
				}

			else if(Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==5) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/453592370;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Pound"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==6) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(28.3495231/0.000001);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Ounce"));

				}

			else if(Frame.unit1.getSelectedIndex() == 4 && Frame.unit2.getSelectedIndex()==7) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/200000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Carat"));
				}

			//sixth condition
			else if(Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==0) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/2204.62262;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum) +" Tonne"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==1) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/2.20462262;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Kilogram"));
				}
			
			else if(Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==2) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.00220462262;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Gram"));
				

				}
			
			else if(Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==3) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(2.20462262/1000000.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Milligram"));
				

				}
			
			else if(Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==4) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(0.198416036/90000000.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Pound"));
				
				}

			else if(Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==5) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Microgram"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==6) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(0.0625);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Ounce"));

				}

			else if(Frame.unit1.getSelectedIndex() == 5 && Frame.unit2.getSelectedIndex()==7) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(4.40924524/10000);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Carat"));
				}


			//seventh condition

			else if(Frame.unit1.getSelectedIndex() == 6 && Frame.unit2.getSelectedIndex()==0) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/35273.9619;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum) +" Tonne"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 6 && Frame.unit2.getSelectedIndex()==1) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/35.2739619;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Kilogram"));
				}
			
			else if(Frame.unit1.getSelectedIndex() == 6 && Frame.unit2.getSelectedIndex()==2) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(3.52739619/100.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Gram"));
				

				}
			
			else if(Frame.unit1.getSelectedIndex() == 6 && Frame.unit2.getSelectedIndex()==3) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(3.52739619/100000.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Milligram"));
				

				}
			
			else if(Frame.unit1.getSelectedIndex() == 6 && Frame.unit2.getSelectedIndex()==4) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(3.52739619/100000000.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Microgram"));
				
				
				}

			else if(Frame.unit1.getSelectedIndex() == 6 && Frame.unit2.getSelectedIndex()==5) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/16;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Pound"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 6 && Frame.unit2.getSelectedIndex()==6) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Ounce"));

				

				}

			else if(Frame.unit1.getSelectedIndex() == 6 && Frame.unit2.getSelectedIndex()==7) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(70.5479239/10000.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Carat"));
				}


			//eight condition
			else if(Frame.unit1.getSelectedIndex() == 7 && Frame.unit2.getSelectedIndex()==0) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/5000000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum) +" Tonne"));
				
				}
			
			else if(Frame.unit1.getSelectedIndex() == 7 && Frame.unit2.getSelectedIndex()==1) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/5000;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Kilogram"));
				}
			
			else if(Frame.unit1.getSelectedIndex() == 7 && Frame.unit2.getSelectedIndex()==2) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/5;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Gram"));
				

				}
			
			else if(Frame.unit1.getSelectedIndex() == 7 && Frame.unit2.getSelectedIndex()==3) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/0.005;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Milligram"));
				

				}
			
			else if(Frame.unit1.getSelectedIndex() == 7 && Frame.unit2.getSelectedIndex()==4) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/(.05/10000.0);
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Microgram"));
				
				
				}

			else if(Frame.unit1.getSelectedIndex() == 7 && Frame.unit2.getSelectedIndex()==5) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/2267.96185;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Pound"));

				}
			
			else if(Frame.unit1.getSelectedIndex() == 7 && Frame.unit2.getSelectedIndex()==6) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Double sum = a/141.747616;
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",sum)+" Ounce"));

				}

			else if(Frame.unit1.getSelectedIndex() == 7 && Frame.unit2.getSelectedIndex()==7) {
				Double a = Double.parseDouble(Frame.fromValue.getText());
				Frame.toValue.setText(String.valueOf(String.format("%,.8f",a)+" Carat"));

				}






		}

//End of computation



//do not delete the two lines below

	}



}