import java.util.Scanner;

public class BinToDecimal {

	public static void main(String[] args) {
		
		int decimalNumber = 0; //stores the final value of the decimal number.
		int power = 0;        //the power to which base two is raised.
		
		outerloop:           //label for outer while loop, allows break or continue statement to reference this loop.
			while(true) {
				System.out.println("Enter binary number to convert to decimal");
				Scanner input = new Scanner(System.in);
				int binaryNumber = input.nextInt();
				int binaryCheck = binaryNumber;
				int binaryA = 0;
				int binaryB = 0;
				
				while(binaryCheck > 0) {
					System.out.println("Check Passed");
					if (binaryCheck%10 == 0 || binaryCheck%10 == 1) {
						binaryA++;
						binaryB++;
						binaryCheck = binaryCheck/10;
						System.out.println("Modulus Check Passed");
						System.out.println(binaryA);
						System.out.println(binaryB);
					}
					else {
						System.out.println("Check Not Passed");
						continue outerloop;
					}
				}
				if (binaryA == binaryB) {
					while(binaryNumber != 0) {
						int modulus = binaryNumber % 10;
						decimalNumber = decimalNumber + modulus * (int)Math.pow(2,power);
						binaryNumber = binaryNumber/10;
						power++;
					}
					break;
				}
				else {
					continue;
				}
			}
		System.out.println(decimalNumber);

	}

}
