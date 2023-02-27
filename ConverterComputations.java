import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ConverterComputations{

	public static void dataOperation(){

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


	}



}