package alarm.clock;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Alarmtest extends Alarm{

   Alarm almclk;
   
   @BeforeMethod
   public void setup() throws Exception
   {
	   Alarm.initialization();
   
   }
	  @Test(priority = 1)
		public void add() throws Exception
		{ 
		  Alarm.Addalarm();
		  
		}
	  
	  @Test(priority = 2)
		public void add1() throws Exception
		{ 
		  Alarm.Addalarm1();
		  
		}
	
		@AfterMethod
		public void teardown()
		{
			AlarmClockSession.quit();
			
		} 
}
