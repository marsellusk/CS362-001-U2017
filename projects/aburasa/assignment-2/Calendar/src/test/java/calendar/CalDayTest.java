package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
		 
		 GregorianCalendar test = new GregorianCalendar(2018,7,20);
		 CalDay cal = new CalDay(test);
		 
		 int startHour=12;
		 int startMinute=25;
		 int startDay=20;
		 int startMonth=7;
		 int startYear=2018;
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

		 cal.addAppt(appt);
		 
		 assertTrue(cal.isValid());
		 assertNotNull(cal.iterator());
		 assertNotNull(cal.getSizeAppts());
		 assertEquals(20, cal.getDay());
		 assertEquals(7, cal.getMonth());
		 assertEquals(2018, cal.getYear());
	 }
	 @Test
	  public void test02()  throws Throwable  {
		 CalDay cal = new CalDay();
		 
		 assertFalse(cal.isValid());
		 
		 GregorianCalendar test = new GregorianCalendar(2018,7,20);
		 cal = new CalDay(test);
		 
		 //invalid appt
		 int startHour=120;
		 int startMinute=250;
		 int startDay=200;
		 int startMonth=90;
		 int startYear=2018;
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

		 cal.addAppt(appt);
		 assertNull(cal.getAppts());
		 
		 
		  startHour=18;
		  startMinute=30;
		  startDay=20;
		  startMonth=7;
		  startYear=2018;
		  title="Birthday Dinner";
		  description="This is my birthday Dinner.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt1 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

		 cal.addAppt(appt1);
		 
		 
		 
		  startHour=20;
		  startMinute=30;
		  startDay=20;
		  startMonth=7;
		  startYear=2018;
		  title="Birthday Party";
		  description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt2 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

		 cal.addAppt(appt2);
		 
		 
		  startHour=9;
		  startMinute=30;
		  startDay=20;
		  startMonth=7;
		  startYear=2018;
		  title="Birthday breakfast";
		  description="This is my birthday breakfast.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt3 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

		 cal.addAppt(appt3);
		 
		 assertTrue(cal.isValid());
	 }
//add more unit tests as you needed	
}
