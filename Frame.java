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

	JLabel mainTitle;
	static JComboBox mainPicker, unit1, unit2;
	static JTextField fromValue, toValue;
	static JButton button;

	static String mainDropContents[] = {"Data", "Length", "Area", "Volume", "Temperature", "Time", "Mass"};
	
	static String dataComp[] = {"Byte (B)", "Kilobyte (KB)", "Megabyte (MB)", "Gigabyte (GB)", "Terabyte (TB)", "Petabyte (PB)"};
	static String lengthComp[] = {"Kilometer (km)", "Meter (m)", "Decimeter (dm)", "Centimeter (cm)", "Millimeter (mm)", "Micrometer", "Nanometer (nm)", "Picometer (pm)", "Nautical Mile (nmi)", "Mile (mi)", "Yard (yd)", "Foot (ft)", "Inch (in)"};
	static String areaComp[] = {"Square kilometer", "Hectare (ha)", "Are (a)", "Square meter", "Square yard", "Square foot"};
	static String volumeComp[] = {"Milliliter (ml)", "Centiliter (cl)", "Deciliter (dl)", "Liter (l)", "Hectoliter (hl)"};
	static String tempComp[] = {"Celcius", "Fahrenheit", "Kelvin"};
	static String timeComp[] = {"Year", "Week", "Day", "Hour", "Minute", "Second", "Millisecond"};
	static String massComp[] = {"Tonne (t)", "Kilogram (kg)", "Gram (g)", "Milligram (mg)", "Microgram", "Pound (lb)", "Ounce (oz)", "Carat (ct)"};








	




	Frame(){

		mainTitle = new JLabel();
		mainPicker = new JComboBox();
		unit1 = new JComboBox();
		unit2 = new JComboBox();
		fromValue = new JTextField();
		toValue = new JTextField();

		button = new JButton();

		//toolkits 
		Toolkit toolkit = this.getToolkit();
		Dimension size = toolkit.getScreenSize();
		

		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocation((size.width/2 - (this.getWidth()/2)), (size.height/2 - (this.getHeight()/2)));
		this.setLayout(null);
		//this.getContentPane().setBackground(new Color(0xFFFFFF));

		mainTitle.setText("UNIT CONVERTER");
		mainTitle.setBounds(10,10,200,30);
		mainTitle.setForeground(Color.WHITE);
		mainTitle.setBounds(0,0,500,40);
		mainTitle.setFont(new Font("Calibri", Font.BOLD,30));
		mainTitle.setHorizontalAlignment(JLabel.CENTER);
		mainTitle.setBackground(new Color(0x3C3CC4));
		mainTitle.setOpaque(true);

		mainPicker.setBounds(200,70,150,35);
		mainPicker.setFocusable(false);
		mainPicker.addActionListener(this);
	

		Frame.mainDropAdd();

		
		

		
		unit1.setBounds(10,130,150,35);
		unit1.setFocusable(false);

		unit2.setBounds(200,130,150,35);
		unit2.setFocusable(false);

		System.out.println(mainPicker.getSelectedItem());


		fromValue.setBounds(100,250,150,35);
		toValue.setBounds(300,250,150,35);
		toValue.setEditable(false);

		button.setBounds(100,300,150,35);
		button.addActionListener(this);


		this.add(mainTitle);
		this.add(mainPicker);
		this.add(unit1);
		this.add(unit2);
		this.add(fromValue);
		this.add(toValue);
		this.add(button);
		this.setVisible(true);

	}



	/*public static void removeTxtFldVal(){

		fromValue.setText("");
		toValue.setText("");

	}
	*/

	public static void mainDropAdd(){

		for(int num=0; num<mainDropContents.length;num++){
			mainPicker.addItem(mainDropContents[num]);
		}
	}

	public static void deleteElements(){
		unit1.removeAllItems();
		unit2.removeAllItems();

	}

	public static void dataElements(){
		for(int num=0; num<dataComp.length;num++){
			unit1.addItem(dataComp[num]);
			unit2.addItem(dataComp[num]);


		}
	}

	public static void lengthElements(){
		for(int num=0; num<lengthComp.length;num++){
			unit1.addItem(lengthComp[num]);
			unit2.addItem(lengthComp[num]);


		}
	}

	public static void areaElements(){
		for(int num=0; num<areaComp.length;num++){
			unit1.addItem(areaComp[num]);
			unit2.addItem(areaComp[num]);


		}
	}


	public static void volumeElements(){
		for(int num=0; num<volumeComp.length;num++){
			unit1.addItem(volumeComp[num]);
			unit2.addItem(volumeComp[num]);


		}
	}

	public static void tempElements(){
		for(int num=0; num<tempComp.length;num++){
			unit1.addItem(tempComp[num]);
			unit2.addItem(tempComp[num]);


		}
	}

	public static void timeElements(){
		for(int num=0; num<timeComp.length;num++){
			unit1.addItem(timeComp[num]);
			unit2.addItem(timeComp[num]);


		}
	}


	public static void massElements(){
		for(int num=0; num<massComp.length;num++){
			unit1.addItem(massComp[num]);
			unit2.addItem(massComp[num]);


		}
	}



	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()== mainPicker){
			System.out.println(mainPicker.getSelectedItem());

			switch (mainPicker.getSelectedItem().toString()){
				
				case "Data":
					Frame.deleteElements();
					Frame.dataElements();
					break;



				case "Length":
					Frame.deleteElements();
					Frame.lengthElements();
					break;

				case "Area":
					Frame.deleteElements();
					Frame.areaElements();
					break;

				case "Volume":
					Frame.deleteElements();
					Frame.volumeElements();
					break;

				case "Temperature":
					Frame.deleteElements();
					Frame.tempElements();
					break;


				case "Time":
					Frame.deleteElements();
					Frame.timeElements();
					break;



				case "Mass":
					Frame.deleteElements();
					Frame.massElements();
					break;



			}

			
			
		}

		/*else if (e.getSource() == unit1.getSelectedItem() || e.getSource() == unit2.getSelectedItem()){
			Frame.removeTxtFldVal();
		}

		*/

		else if (e.getSource() == button){

			ConverterComputations.dataOperation();
			System.out.println(unit1.getSelectedIndex());
		}

	}





}
