import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ConverterComputations{


	public static void dataOperation(){

		try{
			Double handler = Double.parseDouble(Frame.fromValue.getText());
			
			
			

		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "Incorrect");

		}
		

		

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





//do not delete the two lines below

	}



}