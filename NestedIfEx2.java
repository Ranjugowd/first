/*pgm to check the num is bw 0 to 10 and even*/
class NestedIfEx2{
	public static void main(String[] args) {
		int num=6;
		if(num>0)
			if(num<10)
				if(num%2==0)
					System.out.println("num is between 0 and 10 and even");
	}
}