class WeekDays{
	public static void main(String[] args) {
		int dayNumber=3;
		String day="";
		switch(dayNumber){
			case 1:
			   day="Monday";
			break;
			case 2:
			   day="Tuesay";
			break;
			case 3:
			   day="Wednesday";
			break;
			case 4:
			   day="Thursday";
			break;
			case 5:
			   day="Friday";
			break;
			case 6:
			   day="Saturday";
			break;
			case 7:
			   day="Sunday";
			break;
			default:
			   System.out.println("invalid option");
		}
			System.out.println(day);
	}
}