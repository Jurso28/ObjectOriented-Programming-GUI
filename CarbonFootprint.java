
// This Program uses GUI to ask the user with buttons what they want to calculate
// the carbon footprint of. From there we get input screens for the user to input data.
// At the end you get a sum of the total carbon footprint.

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class CarbonFootprint extends JFrame{

	DecimalFormat df = new DecimalFormat (".00");// puts the decimal format to 2 decimal places.

	//constructor of CarbonFootprint
	public CarbonFootprint() {
		JButton jbtBuilding = new JButton("Building"); //creates the button object building
		setLayout(new FlowLayout());//creates the FlowLayout 
		add(jbtBuilding);//adds the Building button to the Layout

		JButton jbtCar = new JButton("Car");//creates the button object Car
		setLayout(new FlowLayout());//creates the FlowLayout
		add(jbtCar);//adds the Car button to the layout

		JButton jbtBicycle = new JButton("Bicycle");//creates the button object Bicycle
		setLayout(new FlowLayout());//creates the FlowLayout
		add(jbtBicycle);//adds the Bicycle button to the layout

		//Listener to what happens when the building button is pressed
		jbtBuilding.addActionListener(new ActionListener(){
			//initalizes variables
			String floors, heatBurned, peopleHome, electricity;
			double heatBurned1, electricity1, sum;
			int floors1, peopleHome1;

			// Action constructor
			public void actionPerformed(ActionEvent e) {
				floors=JOptionPane.showInputDialog("How many floors does the building have?:");//has user input # of floors
				heatBurned=JOptionPane.showInputDialog("How much heat was burned? (Output the Therms used):");// has user input how much heat was burned
				peopleHome=JOptionPane.showInputDialog("How many people live there?:");//has user input # of people
				electricity=JOptionPane.showInputDialog("How much elecricity was used?(Output the kWH):");//has user input how much electricity used

				floors1=Integer.parseInt(floors);//turns the string entered to an integer
				heatBurned1=Double.parseDouble(heatBurned);//turns the string entered to a double
				peopleHome1=Integer.parseInt(peopleHome);//turns the string entered to an integer
				electricity1=Double.parseDouble(electricity);//turns the string entered to a double

				sum = floors1 * heatBurned1 * peopleHome1 * electricity1;//multiplies the variables to a sum

				//Outputs the total sum of Carbon Footprint emitted from the building to a message dialog box
				JOptionPane.showMessageDialog(null, "The carbon footprint of a building is: " + df.format(sum) + " tons", "Carbon Footprint Calculator", JOptionPane.PLAIN_MESSAGE);
			}//actionPerformed(ActionEvent e)
		});//addActionListener()

		//Listener to what happens when the car button is pressed
		jbtCar.addActionListener(new ActionListener(){
			//initalizes variables
			String distance, mpg, passengers;
			double distance1, mpg1, sum;
			int passengers1;

			//Action Constructor
			public void actionPerformed(ActionEvent e) {
				distance=JOptionPane.showInputDialog("How far in miles did you travel?:");//has user input # of miles traveled
				mpg=JOptionPane.showInputDialog("What is the Miles Per Gallon?:");//has user input miles per gallon
				passengers=JOptionPane.showInputDialog("How many passengers are in the car?:");//has user enter # of passengers

				distance1=Double.parseDouble(distance);//turns the string entered to a double
				mpg1=Double.parseDouble(mpg);//turns the string entered to a double
				passengers1=Integer.parseInt(passengers);//turns the string entered to an integer

				sum = distance1 * mpg1 * passengers1;//multiplies the variables to a sum

				//Outputs the total sum of Carbon Footprint emitted from a car to a message dialog box 
				JOptionPane.showMessageDialog(null, "The carbon footprint of a car is: " + df.format(sum) + " tons", "Carbon Footprint Calculator", JOptionPane.PLAIN_MESSAGE);
			}//actionPerformed()
		});//addActionListener()

		//Listener to what happens when the Bicycle button is pressed
		jbtBicycle.addActionListener(new ActionListener(){
			
			// Action Constructor 
			public void actionPerformed(ActionEvent e) {
				//Since a bicycle leaves no carbon footprint the button will always display 0 and requires no user input
				JOptionPane.showMessageDialog(null, "The Carbon footprint of a Bicycle is 0 tons", "Carbon Footprint Calculator", JOptionPane.PLAIN_MESSAGE);
			}//actionPerformed()
		});//addActionListener()

	}//public CarbonFootprint()

	//main program
	public static void main(String[] args) {
		CarbonFootprint frame = new CarbonFootprint();//creates the frame object 
		frame.setTitle("Carbon Footprint Calculator");//creates the title of the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closes the frame when close is pressed
		frame.setSize(1000,800);//sets the size of the frame
		frame.setVisible(true);//opens the frame to make it visible

	}//main

}//class
