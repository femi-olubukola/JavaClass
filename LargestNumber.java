import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		
		int num; 
		int counter = 1;
		int largestNum = 0;
		int secondLargestNum = 0;
				
				while (counter <= 7) {
					System.out.println("Enter number: ");
					Scanner input = new Scanner(System.in);
					num = input.nextInt();
					
					if (num > largestNum) {
						secondLargestNum = largestNum;
						largestNum = num;
					}
					else
						if (num > secondLargestNum)
							secondLargestNum = num;
							
					
					counter++;	
				}
		
				System.out.println("The Largest Number in the Sequence: " + largestNum);
				System.out.println("The Second Largest Number in the Sequence: " + secondLargestNum);
	}

}
