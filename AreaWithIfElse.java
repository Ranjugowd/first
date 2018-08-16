class AreaWithIfElse{
	public static void main(String[] args) {
		final double PI=3.142;
		double radius=-123.123;
		if(radius>0)
		{
			double area=radius*radius*PI;
			System.out.print(area);
		}
		else
		{
			System.out.print("radius should be greater than zero");
		}
	}
}