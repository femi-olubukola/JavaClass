int j = 0;
for(int i = 1; i <= 100; i++) {
	if(i%5 == 0) {
		System.out.println(i);
		
		j++ ;
	}
	if(j==11) {
		break;
		
	}
}