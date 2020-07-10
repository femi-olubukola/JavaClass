import java.util.Scanner;
public class DiamondPattern {

	public static void main(String[] args) {
		
		int num = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of pattern rows: ");
		int numOfRows = input.nextInt();
		
		int midpoint = numOfRows / 2;
		int numOfSpaces = numOfRows / 2;
		for (int i = 1; i <= numOfRows; i++) {
			for (int j = 1; j <= numOfSpaces; j++) {
				System.out.print(" ");
			}
			for (int x = 1; x <= num; x++) {
				System.out.print("*");
			}
			System.out.println();
			if(i < midpoint) {
				num += 2;
				--numOfSpaces;
			}
			else {
				num -= 2;
				++numOfSpaces;
			}
		}

	}

}
