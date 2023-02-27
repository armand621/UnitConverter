import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ConverterComputations{


	public static void dataOperation(){

		try{
			Double handler = Double.parseDouble(Frame.fromValue.getText());
			System.out.println(Frame.fromValue.getText());
			
			

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












		}





//do not delete the two lines below

	}



}