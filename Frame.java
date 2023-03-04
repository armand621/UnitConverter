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


	JLabel mainTitle, forBackground, frTxt, toTxt, frBoxVal, toBoxVal;
	static JComboBox mainPicker, unit1, unit2;
	static JTextField fromValue, toValue;
	static JButton button,clearButton;
	static ImageIcon background, logo;

	//This section is for array contents

	static String mainDropContents[] = {"Data", "Length", "Area", "Volume", "Temperature", "Time", "Mass"};
	
	static String dataComp[] = {"Byte (B)", "Kilobyte (KB)", "Megabyte (MB)", "Gigabyte (GB)", "Terabyte (TB)", "Petabyte (PB)"};
	static String lengthComp[] = {"Kilometer (km)", "Meter (m)", "Decimeter (dm)", "Centimeter (cm)", "Millimeter (mm)", "Micrometer", "Nanometer (nm)", "Picometer (pm)", "Nautical Mile (nmi)", "Mile (mi)", "Yard (yd)", "Foot (ft)", "Inch (in)"};
	static String areaComp[] = {"Square kilometer", "Hectare (ha)", "Are (a)", "Square meter", "Square yard", "Square foot"};
	static String volumeComp[] = {"Milliliter (ml)", "Centiliter (cl)", "Deciliter (dl)", "Liter (l)", "Hectoliter (hl)"};
	static String tempComp[] = {"Celcius", "Fahrenheit", "Kelvin"};
	static String timeComp[] = {"Year", "Week", "Day", "Hour", "Minute", "Second", "Millisecond"};
	static String massComp[] = {"Tonne (t)", "Kilogram (kg)", "Gram (g)", "Milligram (mg)", "Microgram", "Pound (lb)", "Ounce (oz)", "Carat (ct)"};



	//This section is for the main frame
	Frame(){

		mainTitle = new JLabel();
		forBackground = new JLabel();
		frTxt = new JLabel();
		toTxt = new JLabel();
		frBoxVal = new JLabel();
		toBoxVal = new JLabel();

		mainPicker = new JComboBox();
		unit1 = new JComboBox();
		unit2 = new JComboBox();
		fromValue = new JTextField();
		toValue = new JTextField();

		button = new JButton();
		clearButton = new JButton();

		background = new ImageIcon("background.png");
		logo = new ImageIcon("logo.png");

		//toolkits 
		Toolkit toolkit = this.getToolkit();
		Dimension size = toolkit.getScreenSize();
		

		this.setSize(800,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setIconImage(logo.getImage());
		this.setLocation((size.width/2 - (this.getWidth()/2)), (size.height/2 - (this.getHeight()/2)));
		this.setLayout(null);
		
		
		//for maintitle
		mainTitle.setText("Select Conversion:");
		mainTitle.setBounds(400,48,300,30);
		mainTitle.setForeground(new Color(0x125488));
		mainTitle.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		mainTitle.setHorizontalAlignment(JLabel.CENTER);
		
		
		//for mainpicker
		mainPicker.setBounds(450,100,190,35);
		mainPicker.setFont(new Font("Arial", Font.BOLD, 18));
		mainPicker.setForeground(new Color(0x02C041C));
		mainPicker.setFocusable(false);
		mainPicker.addActionListener(this);
		mainPicker.setOpaque(true);
		mainPicker.setBackground(new Color(0xCDEFF5));
		Frame.mainDropAdd();


		//for the background
		forBackground.setBounds(0, 0, 800, 500);
		forBackground.setOpaque(true);
		forBackground.setIcon(background);


		//for FROM text
		frTxt.setText("From:");
		frTxt.setBounds(353,150,300,30);
		frTxt.setForeground(new Color(0x630436));
		frTxt.setFont(new Font("Comic Sans MS",Font.BOLD,16));
		
		//for TO text
		toTxt.setText("To:");
		toTxt.setBounds(570,150,300,30);
		toTxt.setForeground(new Color(0x630436));
		toTxt.setFont(new Font("Comic Sans MS",Font.BOLD,16));
		

		
		

		//for the unit1
		unit1.setBounds(353,180,180,40);
		unit1.setFocusable(false);
		unit1.setFont(new Font("Arial",Font.BOLD,15));
		unit1.setForeground(new Color(0x02C041C));
		unit1.setFocusable(false);
		unit1.setOpaque(true);
		unit1.setBackground(new Color(0xCDEFF5));

		//for the unit2
		unit2.setBounds(570,180,180,40);
		unit2.setFocusable(false);
		unit2.setFont(new Font("Arial",Font.BOLD,15));
		unit2.setForeground(new Color(0x02C041C));

		unit2.setOpaque(true);
		unit2.setBackground(new Color(0xCDEFF5));
		


		//for FROM box text
		frBoxVal.setText("From:");
		frBoxVal.setBounds(353,242,300,30);
		frBoxVal.setForeground(new Color(0x630436));
		frBoxVal.setFont(new Font("Comic Sans MS",Font.BOLD,16));
		
		//for TO boxtext
		toBoxVal.setText("To:");
		toBoxVal.setBounds(570,242,300,30);
		toBoxVal.setForeground(new Color(0x630436));
		toBoxVal.setFont(new Font("Comic Sans MS",Font.BOLD,16));
		

		//for fromvalue
		fromValue.setBounds(353,270,180,40);
		fromValue.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		fromValue.setForeground(new Color(0x02C041C));
		fromValue.setBackground(new Color(0xCDEFF5));
		fromValue.setOpaque(true);
		fromValue.setBorder(BorderFactory.createMatteBorder(0,0,4,0,new Color(0x2A93D5)));
		

		//for tovalue
		toValue.setBounds(570,270,180,40);
		toValue.setEditable(false);
		toValue.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		toValue.setForeground(new Color(0x02C041C));
		toValue.setOpaque(true);
		toValue.setBackground(new Color(0xCDEFF5));
		toValue.setBorder(BorderFactory.createMatteBorder(0,0,4,0,new Color(0x2A93D5)));
	
		
		//for the compute button
		button.setBounds(353,350,180,40);
		button.addActionListener(this);
		button.setText("Compute");
		button.setFocusable(false);
		button.setOpaque(true);
		button.setFont(new Font("Arial",Font.BOLD,18));
		button.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));
		button.setBackground(new Color(0x125488));
		button.setForeground(Color.WHITE);

		//for the clear button
		clearButton.setBounds(570,350,180,40);
		clearButton.addActionListener(this);
		clearButton.setText("Clear");
		clearButton.setFocusable(false);
		clearButton.setOpaque(true);
		clearButton.setFont(new Font("Arial",Font.BOLD,18));
		clearButton.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));
		clearButton.setBackground(new Color(0x125488));
		clearButton.setForeground(Color.WHITE);


		//for adding methods to the jframe
		this.add(mainTitle);
		this.add(mainPicker);
		this.add(frTxt);
		this.add(toTxt);
		this.add(frBoxVal);
		this.add(toBoxVal);

		this.add(unit1);
		this.add(unit2);
		this.add(fromValue);
		this.add(toValue);
		this.add(button);
		this.add(clearButton);
		this.add(forBackground);
		this.setVisible(true);

	}



	//initializing static methods 

	//first method
	public static void mainDropAdd(){

		for(int num=0; num<mainDropContents.length;num++){
			mainPicker.addItem(mainDropContents[num]);
		}
	}


	//second method
	public static void deleteElements(){
		unit1.removeAllItems();
		unit2.removeAllItems();

	}


	//third method
	public static void dataElements(){
		for(int num=0; num<dataComp.length;num++){
			unit1.addItem(dataComp[num]);
			unit2.addItem(dataComp[num]);


		}
	}

	//fourth method
	public static void lengthElements(){
		for(int num=0; num<lengthComp.length;num++){
			unit1.addItem(lengthComp[num]);
			unit2.addItem(lengthComp[num]);


		}
	}

	//fifth method
	public static void areaElements(){
		for(int num=0; num<areaComp.length;num++){
			unit1.addItem(areaComp[num]);
			unit2.addItem(areaComp[num]);


		}
	}


	//sixth method
	public static void volumeElements(){
		for(int num=0; num<volumeComp.length;num++){
			unit1.addItem(volumeComp[num]);
			unit2.addItem(volumeComp[num]);


		}
	}


	//seventh method
	public static void tempElements(){
		for(int num=0; num<tempComp.length;num++){
			unit1.addItem(tempComp[num]);
			unit2.addItem(tempComp[num]);


		}
	}


	//eighth method
	public static void timeElements(){
		for(int num=0; num<timeComp.length;num++){
			unit1.addItem(timeComp[num]);
			unit2.addItem(timeComp[num]);


		}
	}



	//ninth method
	public static void massElements(){
		for(int num=0; num<massComp.length;num++){
			unit1.addItem(massComp[num]);
			unit2.addItem(massComp[num]);


		}
	}



	//tenth method
	public static void clearButton(){
		toValue.setText("");
		fromValue.setText("");

	}





	//This section is for the action listener
	@Override
	public void actionPerformed(ActionEvent e){

		//this section is for the main jcombobox 
		if(e.getSource()== mainPicker){
			

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


	
		//this section is for the button
		else if (e.getSource() == button){

	
		ConverterComputations.dataOperation();
	
		}
		
		//this section is for the clear button
		else{
			Frame.clearButton();
		}

	}

}




