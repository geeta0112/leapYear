package leap;

public class LeapYear {
	public boolean leapYear1(int year) {
		boolean leap=false;
		if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                // year is divisible by 400, hence the year is a leap year
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        
   
		return leap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeapYear leapYear=new LeapYear();
		System.out.println(leapYear.leapYear1(2000));
	}

}
