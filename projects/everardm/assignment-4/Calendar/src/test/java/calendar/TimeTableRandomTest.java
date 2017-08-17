package calendar;

import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;
import org.junit.Test;
import java.util.LinkedList;

import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	
    /**
     * Generate Random Tests that tests TimeTable Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
		 
		 System.out.println("Start testing...");
		 for(int i=0; i<1000; i++) {
		 				long randomseed =System.currentTimeMillis();
						Random random = new Random(randomseed);
						 
						int rDays=ValuesGenerator.getRandomIntBetween(random, 1, 7);
						int[] array1= {rDays};
						int rBy=ValuesGenerator.getRandomIntBetween(random, 0, 4); 
						 
						 int startHour=ValuesGenerator.getRandomIntBetween(random, 0, 40);
						 int startMinute=ValuesGenerator.getRandomIntBetween(random, 0, 80);
						 int startDay=ValuesGenerator.getRandomIntBetween(random, 0, 50);
						 int startMonth=ValuesGenerator.getRandomIntBetween(random, 0, 30);
						 int startYear=ValuesGenerator.getRandomIntBetween(random, 0, 2000);
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
						 appt.setRecurrence(array1, rBy, 2, appt.RECUR_NUMBER_FOREVER);
						 
						// cal.addAppt(appt);
						     rDays=ValuesGenerator.getRandomIntBetween(random, 1, 7);
							 int[] array2= {rDays};
							 rBy=ValuesGenerator.getRandomIntBetween(random, 0, 4);
						 
						  startHour=ValuesGenerator.getRandomIntBetween(random, 0, 40);
						  startMinute=ValuesGenerator.getRandomIntBetween(random, 0, 80);
						  startDay=ValuesGenerator.getRandomIntBetween(random, 0, 50);
						  startMonth=ValuesGenerator.getRandomIntBetween(random, 0, 30);
						  startYear=ValuesGenerator.getRandomIntBetween(random, 0, 2000);
						  title="Birthday Party";
						  description="This is my brother's birthday party.";
						 //Construct a new Appointment object with the initial data	 
						 Appt appt2 = new Appt(startHour,
						          startMinute ,
						          startDay ,
						          startMonth ,
						          startYear ,
						          title,
						         description);
						 appt2.setRecurrence(array2, rBy, 2, appt2.RECUR_NUMBER_FOREVER);
						 
						 rDays=ValuesGenerator.getRandomIntBetween(random, 1, 7);
						 int[] array3= {rDays};
						 rBy=ValuesGenerator.getRandomIntBetween(random, 0, 4);
					 
						  startHour=ValuesGenerator.getRandomIntBetween(random, 0, 40);
						  startMinute=ValuesGenerator.getRandomIntBetween(random, 0, 80);
						  startDay=ValuesGenerator.getRandomIntBetween(random, 0, 50);
						  startMonth=ValuesGenerator.getRandomIntBetween(random, 0, 30);
						  startYear=ValuesGenerator.getRandomIntBetween(random, 0, 2000);
						  title="Birthday Party";
						  description="This is my brother's birthday party.";
						 //Construct a new Appointment object with the initial data	 
						 Appt appt3 = new Appt(startHour,
						          startMinute ,
						          startDay ,
						          startMonth ,
						          startYear ,
						          title,
						         description);
						 appt3.setRecurrence(array3, rBy, 2, appt3.RECUR_NUMBER_FOREVER);
						
						 LinkedList<Appt> appts= new LinkedList<Appt>(); 
					
							appts.add(appt);
						    appts.add(appt2);
						    appts.add(appt3);
						    
						    GregorianCalendar day1 = new GregorianCalendar(2018,2,20);
							 GregorianCalendar day2 = new GregorianCalendar(2018,11,20);
							 
							 TimeTable t1= new TimeTable();
							 
							 t1.getApptRange(appts,day1,day2);
							 //t1.getApptRange(appts,day2,day1);
							 
							 Appt appt4 = null;
							 
							 appts.add(appt4);
							 int testNumber = ValuesGenerator.getRandomIntBetween(random, 0, 3);
							 
							 t1.deleteAppt(appts,appts.get(testNumber)); //get a random appt and delete it
							 
							 
							 startHour=ValuesGenerator.getRandomIntBetween(random, 0, 40);
							  startMinute=ValuesGenerator.getRandomIntBetween(random, 0, 80);
							  startDay=ValuesGenerator.getRandomIntBetween(random, 0, 50);
							  startMonth=ValuesGenerator.getRandomIntBetween(random, 0, 30);
							  startYear=ValuesGenerator.getRandomIntBetween(random, 0, 2000);
							  title="Birthday Party";
							  description="This is my brother's birthday party.";
							 //Construct a new Appointment object with the initial data	 
							 Appt appt5 = new Appt(startHour,
							          startMinute ,
							          startDay ,
							          startMonth ,
							          startYear ,
							          title,
							         description);
							 
							 LinkedList<Appt> appts2= new LinkedList<Appt>();
							    
							    t1.deleteAppt(appts,appt5);
				 				t1.deleteAppt(null,appt3);
				 				t1.deleteAppt(appts2,appt3);
				 				t1.deleteAppt(null,null);
				 				//t1.getApptRange(appts,day2,day1);
						 
		 }
		 			
						 System.out.println("Done testing...");
		 
		 
		 
	 }


	
}
