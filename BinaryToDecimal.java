import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		int decimalNumber = 0;
		int power = 0;
		
		while (true) {
			System.out.println("Enter binary number to convert to decimal: ");
			Scanner input = new Scanner(System.in);
			int binaryNumber = input.nextInt();
			if(binaryNumber >= 0) {
				
				while(binaryNumber != 0) {
					int modulus = binaryNumber % 10;
					decimalNumber = decimalNumber + modulus * (int)Math.pow(2, power);
					binaryNumber = binaryNumber / 10;
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
