package leap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import leap.LeapYear;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LeapYearTest {

	@Test
    public void testTrue(){
		LeapYear leapYear=new LeapYear();
		assertEquals(leapYear.leapYear1(2000), true);
		
    }
	@Test
    public void testFalse(){
		LeapYear leapYear=new LeapYear();
		assertEquals(leapYear.leapYear1(1700), false);
		
    }
	

}
