package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			System.out.println("Sundays are better than mondays!");
			break;
		case "Monday":
			System.out.println("Mondays are bad :(");
			break;
		case "Tuesday":
			System.out.println("Tuesdays are cool and better than mondays");
		case "Wednesday":
			System.out.println("Hump day!!!");
		case "Thursday":
			System.out.println("Friday is in a day!!!");
		case "Friday":
			System.out.println("The weekend is in a day!!!");
		case "Saturday":
			System.out.println("Best day WW <3");
		default:
			System.out.println("Wrong thing?");
		}
	}
}
