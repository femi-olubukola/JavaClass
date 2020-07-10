
public class Palindrome {

	public static void main(String[] args) {
		int num = 12321;
		int reversedInteger = 0;
		int remainder;
		int originalInteger;
	
		originalInteger = num;
		
		while (num != 0) {
			remainder = num % 10;
			reversedInteger = reversedInteger * 10 + remainder;
			num /= 10;
			
		}
		
		if (originalInteger == reversedInteger)
			System.out.println(originalInteger + " is a Palindrome");	
		else 
			System.out.println(originalInteger + " is not a Palindrome");
		
		
		
	}

}
