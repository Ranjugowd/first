class WhileEx2{
	public static void main(String[] args) {
		int from=10;
		int to=20;
		int loopControl=from;
		while(loopControl<=to){
			if(loopControl%2==0)
				System.out.println(loopControl);
			loopControl++;
		}
	}
}