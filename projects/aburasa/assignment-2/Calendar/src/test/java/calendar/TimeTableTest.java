package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
		
		 LinkedList<Appt> appts= new LinkedList<Appt>();	 
		 
		 int[] array1= {5};
		 
		 int startHour=12;
		 int startMinute=30;
		 int startDay=20;
		 int startMonth=7;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt1 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 appt1.setRecurrence(array1, appt1.RECUR_BY_YEARLY, 2, appt1.RECUR_NUMBER_FOREVER);
		 appts.add(appt1);
		 
		  startHour=12;
		  startMinute=30;
		  startDay=20;
		  startMonth=3;
		  startYear=2018;
		  title="Dad's Birthday Party";
		  description="This is my Dad's birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt2 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 appt2.setRecurrence(array1, appt2.RECUR_BY_YEARLY, 2, appt2.RECUR_NUMBER_FOREVER);
		 appts.add(appt2);
		 
		  startHour=12;
		  startMinute=30;
		  startDay=20;
		  startMonth=10;
		  startYear=2018;
		  title="Friend's Birthday Party";
		  description="This is my friend's birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt3 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 appt3.setRecurrence(array1, appt3.RECUR_BY_YEARLY, 2, appt3.RECUR_NUMBER_FOREVER);
		 appts.add(appt3);
		 
		 GregorianCalendar day1 = new GregorianCalendar(2018,2,20);
		 GregorianCalendar day2 = new GregorianCalendar(2018,11,20);
		 
		 TimeTable t1= new TimeTable();
		 
		 t1.getApptRange(appts,day1,day2);
		 
		 t1.deleteAppt(appts,appt3);
		 
		 int array2[] = {0,1};
		 t1.permute(appts,array2);
	 }
	 @Test
	  public void test02()  throws Throwable  {
		 
 LinkedList<Appt> appts= new LinkedList<Appt>();	 
		 
		 int[] array1= {5};
		 
		 int startHour=12;
		 int startMinute=30;
		 int startDay=20;
		 int startMonth=7;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt1 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 appt1.setRecurrence(array1, appt1.RECUR_BY_YEARLY, 2, appt1.RECUR_NUMBER_FOREVER);
		 appts.add(appt1);
		 
		  startHour=12;
		  startMinute=30;
		  startDay=20;
		  startMonth=3;
		  startYear=2018;
		  title="Dad's Birthday Party";
		  description="This is my Dad's birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt2 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 appt2.setRecurrence(array1, appt2.RECUR_BY_YEARLY, 2, appt2.RECUR_NUMBER_FOREVER);
		 appts.add(appt2);
		 
		  startHour=12;
		  startMinute=30;
		  startDay=20;
		  startMonth=10;
		  startYear=2018;
		  title="Friend's Birthday Party";
		  description="This is my friend's birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt3 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 appt3.setRecurrence(array1, appt3.RECUR_BY_YEARLY, 2, appt3.RECUR_NUMBER_FOREVER);
		 appts.add(appt3);
		 
		 GregorianCalendar day1 = new GregorianCalendar(2018,2,20);
		 GregorianCalendar day2 = new GregorianCalendar(2018,11,20);
		 
		 TimeTable t1= new TimeTable();
		 
		 t1.getApptRange(appts,day1,day2);
		 
		 LinkedList<Appt> appts2= new LinkedList<Appt>();
		 appts2 = null;
		 t1.deleteAppt(appts2,appt3);
		 appt3 = null;
		 t1.deleteAppt(appts,appt3);
		 
		 int array2[] = {0,1};
		 t1.permute(appts,array2);
		 
	 }
//add more unit tests as you needed
}
