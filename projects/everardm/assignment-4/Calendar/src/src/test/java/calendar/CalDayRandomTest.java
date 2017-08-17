package calendar;


import org.junit.Test;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	
	 public static String RandomSelectMethod(Random random){
	        String[] methodArray = new String[] {"addAppt","setDay","setMonth","setYear"};// The list of the of methods to be tested in the Appt class

	    	int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)
	    	            
	        return methodArray[n] ; // return the method name 
	        }
		/**
		 * Return a randomly selected appointments to recur Weekly,Monthly, or Yearly !.
		 */
	//    public static int RandomSelectRecur(Random random){
	//        int[] RecurArray = new int[] {Appt.RECUR_BY_WEEKLY,Appt.RECUR_BY_MONTHLY,Appt.RECUR_BY_YEARLY};// The list of the of setting appointments to recur Weekly,Monthly, or Yearly

	  //  	int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
	 //       return RecurArray[n] ; // return the value of the  appointments to recur 
	 //       }	
		/**
		 * Return a randomly selected appointments to recur forever or Never recur  !.
		 */
	 //   public static int RandomSelectRecurForEverNever(Random random){
	 //       int[] RecurArray = new int[] {Appt.RECUR_NUMBER_FOREVER,Appt.RECUR_NUMBER_NEVER};// The list of the of setting appointments to recur RECUR_NUMBER_FOREVER, or RECUR_NUMBER_NEVER

	 //   	int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
	//        return RecurArray[n] ; // return appointments to recur forever or Never recur 
	 //       }
	
    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
		
		 
		

		 
		 System.out.println("Start testing...");
		 for(int i=0; i<1000; i++) {
		 				long randomseed =System.currentTimeMillis();
						Random random = new Random(randomseed);
						 
						GregorianCalendar test = new GregorianCalendar(2018,7,20);
						 CalDay cal = new CalDay(test);
						 
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
						 
						// cal.addAppt(appt);
						 
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
						 
						// cal.addAppt(appt2);
						 
						// if(!appt.getValid()) {
						 	//if(!appt2.getValid()) {
							
							cal.addAppt(appt);
						    cal.addAppt(appt2);
						 	//}
										
						 //}
		 }
						 System.out.println("Done testing...");
		 
		 
	 }


	
}
