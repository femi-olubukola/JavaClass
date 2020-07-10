
public class myClass {
public static void main(String[]args) {
int count = 1;	
for(int i = 1; i <= 100; i++) {
	if(i%5 == 0) {
		System.out.println("The first eleven multiples of 5 are: ");
		System.out.println(i);
		count++ ;
	}
	if(count == 11) {
		break; 
	}
}
}

}
