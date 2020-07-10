import java.util.Scanner;
public class AirplaneReservationsSystem {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean [] seats = new boolean [10];
		int firstClass = 1;
		int economyClass = 6;
		int passengerOption;
		
		while (true) {
            System.out.print("Please enter 1 for First Class or enter 2 for Economy or 0 to quit: ");
            passengerOption = input.nextInt();

            if (passengerOption == 0) {
            	System.out.println("Next Flight leaves in 3 hours");
            	break;
            }

            if (passengerOption == 1) {
                for (int i = 0; i < 5; i++ ) {
                    if (seats[i] == false) {
                        seats[i] = true;
                        firstClass++;
                        System.out.println("Your seat number in First Class is: " + i + 1);
                        break;
                    }
                    if (firstClass > 5) {
                        System.out.println("FIRST-CLASS section is full. Enter 2 to be placed in ECONOMY section");
                        break;
                    }
                }
            }
            else if (passengerOption == 2) {
                for (int i = 5; i < 10; i++) {
                    if (seats[i] == false) {
                        seats[i] = true;
                        economyClass++;
                        System.out.println("Your seat number in Economy is: " + i + 1);
                        break;
                    }
                    if (economyClass > 5) {
                        System.out.println("Economy section is full. Enter 1 to be placed in First Class section");
                        break;
                    }
                }
            }

            if (economyClass > 5 && firstClass > 5) {
                System.out.println("Both sections are full");
                break;
            }
        }
		

	}

}
