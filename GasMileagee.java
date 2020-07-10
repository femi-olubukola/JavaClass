/*Drivers are concerned with the mileage their automobiles get. One driver has kept track of
several tankfuls of gasoline by recording the miles driven and gallons used for each tankful. Develop
a Java application that will input the miles driven and gallons used (both as integers) for each tankful. The program should calculate and display the miles per gallon obtained for each tankful and
print the combined miles per gallon obtained for all tankfuls up to this point. All averaging calculations should produce floating-point results. Use class Scanner and sentinel-controlled repetition
to obtain the data from the user. */


import java.util.Scanner;
public class GasMileagee {

	public static void main(String[] args) {
		
		int trip = 0;
		int milesdriven;
		int gallonsused = 0;
		int totalmilesdriven = 0; 
		int totalgallonsused = 0;
		double milespergallon;
		double totalmilespergallon = 0; 
		
		System.out.println("Enter Miles Driven: ");
		Scanner input = new Scanner(System.in);
		milesdriven = input.nextInt();
		
		while (milesdriven != -1) {
			System.out.println("Enter Gallons Used: ");
			gallonsused = input.nextInt();
			milespergallon = (double) milesdriven/gallonsused;
			System.out.println("Average: " + milespergallon); 
		
			System.out.println("Enter Next Mile Driven: ");
			milesdriven = input.nextInt();
			
			totalmilesdriven = totalmilesdriven + milesdriven;
			totalgallonsused = totalgallonsused + gallonsused;
			
			trip++;
		
		}
		
		totalmilespergallon = (double) totalmilesdriven/totalgallonsused;
		System.out.println("The total miles per gallon is: " + totalmilespergallon);
		
		
		
		
		

	}

}
