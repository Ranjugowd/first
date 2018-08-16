class Tricky{
	public static void main(String[] args) {
		Clock c1=new Clock();
		Clock c2=new Clock(0,0,0);
		Clock c3=new Clock(30);
		}
	}
}

class Clock{
	int hours=0;
	int minutes=0;
	int seconds=0;

	Clock()
	{
		hours=12;
		minutes=0;
		seconds=0;
	}
	Clock(hr,min,sec)
	{
		hours=hr;
		minutes=min;
		seconds=sec;
	}
	Clock(secsincemidnight)
	{

	}
	setClock(sec)
	{

	}
	getMethod()
	{

	}
	setMethod()
	{
		setHours()
	}
}
