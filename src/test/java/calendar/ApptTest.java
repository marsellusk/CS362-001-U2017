package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

	 @Test
	  public void test02()  throws Throwable  { //testing the recur feature
		
			 int startHour=13;
			 int startMinute=30;
			 int startDay=10;
			 int startMonth=4;
			 int startYear=2017;
			 String title="Birthday Party";
			 String description="This is my birthday party.";
			 //Construct a new Appointment object with the initial data	 
			 Appt appt = new Appt(startHour,
			          startMinute ,
			          startDay ,
			          startMonth ,
			          startYear ,
			          title,
			         description);
			 int[] array1= {5};
			 appt.setRecurrence(array1, appt.RECUR_BY_WEEKLY, 2, appt.RECUR_NUMBER_FOREVER);
			 
		//	 appt.setRecurBy(appt.RECUR_BY_WEEKLY);
		//	 appt.setRecurIncrement(3);
		//	 appt.setRecurNumber(-1);
			 assertTrue(appt.isRecurring());
			 assertEquals(2, appt.getRecurIncrement());
			 assertEquals(appt.RECUR_NUMBER_FOREVER, appt.getRecurNumber());
			 assertEquals(appt.RECUR_BY_WEEKLY, appt.getRecurBy());
		     assertEquals(array1, appt.getRecurDays());
	 }
	 
	 @Test
	  public void test03()  throws Throwable  { //more invalid tests
		 int startHour=-4;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title=null;
		 String description=null;
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertFalse(appt.getValid());
		
		 appt.setStartHour(4);
		 appt.setStartMinute(-30);
		 assertFalse(appt.getValid()); 
		 
		 appt.setStartMinute(30);
		  appt.setStartDay(-10);
		 assertFalse(appt.getValid());
		 
		 appt.setStartDay(10);
		 appt.setStartMonth(-4);
		 assertFalse(appt.getValid());
		         		
		// Appt appt2 = new Appt();
				 appt.toString();
	 }
	 
	 @Test
	  public void test04()  throws Throwable  { //setting in valid variables as a test
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
		 appt.setStartHour(12);
		 appt.setStartMinute(25);
		 appt.setStartDay(20);
		 appt.setStartMonth(7);
		 appt.setStartYear(2018);
		 appt.setTitle("Birthday Dinner");
		 appt.setDescription("This is my birthday dinner.");
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(12, appt.getStartHour());
		 assertEquals(25, appt.getStartMinute());
		 assertEquals(20, appt.getStartDay());
		 assertEquals(7, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday Dinner", appt.getTitle());
		 assertEquals("This is my birthday dinner.", appt.getDescription());
		 
		 appt.setStartHour(25);
		 assertFalse(appt.getValid());
		 appt.setStartHour(12);
		 
		 appt.setStartMinute(70);
		 assertFalse(appt.getValid());
		 appt.setStartMinute(25);
		 
		 appt.setStartDay(40);
		 assertFalse(appt.getValid());
		 appt.setStartDay(20);
		 
		 appt.setStartMonth(200);
		 assertFalse(appt.getValid());
		 appt.setStartMonth(7);
		 
		 String test= appt.toString();
		 assertEquals("7/20/2018 at 12:25pm ,Birthday Dinner, This is my birthday dinner.", test);
	 }
	 
	 
//add more unit tests as you needed
	
}
