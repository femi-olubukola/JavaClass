







import java.util.Scanner ;

public class TestResults {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int passed = 0;
		int failed = 0;
		int counter = 1; 
		int result;  
		
		while (counter <= 10) {
			System.out.println("Enter result (1 or 2):  ");
		    
			result = input.nextInt();
		    
		    if (result == 1)
		    	passed ++;
		    
		    else 
		    	failed++;
		    
		    counter++;
		}
		System.out.println("Number of passed =  " + passed);
		System.out.println("Number of failed =  " + failed); 
		
		if (passed >= 8)
			System.out.println("Bonus to Instructor!");
		

		
		
		
		
		
		
	}

}
