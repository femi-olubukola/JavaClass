import java.util.Random;
public class DiceRolling {

	public static void main(String[] args) {
		
		int [] counter = new int [11];
		Random rand = new Random();
		for (int i = 1; i <= 36000000; i++) {
			int dice1 = rand.nextInt(6) + 1;
			int dice2 = rand.nextInt(6) + 1;
			int sum = dice1 + dice2;
			
			if (sum == 2) 
				counter [0]++;
			else if (sum == 3) 
				counter [1]++;
			else if (sum == 4) 
				counter [2]++;
			else if (sum == 5) 
				counter [3]++;
			else if (sum == 6) 
				counter [4]++;
			else if (sum == 7) 
				counter [5]++;
			else if (sum == 8) 
				counter [6]++;
			else if (sum == 9) 
				counter [7]++;
			else if (sum == 10) 
				counter [8]++;
			else if (sum == 11) 
				counter [9]++;
			else if(sum == 12) 
				counter [10]++;			
		}	
		int count = 2;
		for (int i: counter) {
			System.out.println("The sum of " + count + " on both dice rolled was shown in total " + i + " times.");
			count++;
		}	

	}

}
