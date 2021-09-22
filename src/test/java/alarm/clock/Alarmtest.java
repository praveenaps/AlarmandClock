package alarm.clock;


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
	
	  
}
