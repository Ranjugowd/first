class Calculator{
	public static boolean isEven(int num) {
		if(num%2==0)
			return true;
		else
			return false;	
	}
	public static int add(int num1,int num2) {
		int sum=num1+num2;
		return sum;	
	}
	public static boolean isPrime(int num){
		if(num==1)
			return false;
		for(int i=2;i<=num/2;i++){
			if(num%i==0)
				return false;	
		}
		return true;		
	}
	public static String generateEvenNums(int from,int to){
		String evenNumbers="";
		for(int i=from;i<=to;i++){
			if(isEven(i)){
				evenNumbers=evenNumbers+" "+i;	
			}
		}
		return evenNumbers;
	}

}