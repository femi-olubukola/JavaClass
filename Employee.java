// Write a program that prints out the first eleven multiples of 5 starting from 1 to 100
// j = counter 


public class Employee{
public static void main(String[] args) {
int j = 0;
for(int i = 1; i <= 100; i++) {
	if(i%5 == 0) {
		System.out.println(i);
		
		j++ ;
	}
	if(j==11) {
		break;
		
	}
}}}