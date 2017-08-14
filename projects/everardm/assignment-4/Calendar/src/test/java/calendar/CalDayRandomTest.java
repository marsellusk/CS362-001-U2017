package calendar;


import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;
}
	
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
		
		 
		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 
		 System.out.println("Start testing...");
		 
		try{ 
		  for (int iteration = 0; elapsed < TestTimeout; iteration++) {
			long randomseed =System.currentTimeMillis(); //10
			//			System.out.println(" Seed:"+randomseed );
						Random random = new Random(randomseed);
						 
						GregorianCalendar test = new GregorianCalendar(2018,7,20);
						 CalDay cal = new CalDay(test);
						 
						 int startHour=ValuesGenerator.getRandomIntBetween(random, -100, 100);
						 int startMinute=ValuesGenerator.getRandomIntBetween(random, -100, 100);
						 int startDay=ValuesGenerator.getRandomIntBetween(random, -100, 100);;
						 int startMonth=ValuesGenerator.getRandomIntBetween(random, -100, 100);;
						 int startYear=ValuesGenerator.getRandomIntBetween(random, -100, 100);
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
						 
						  startHour=ValuesGenerator.getRandomIntBetween(random, -100, 100);
						  startMinute=ValuesGenerator.getRandomIntBetween(random, -100, 100);
						  startDay=ValuesGenerator.getRandomIntBetween(random, -100, 100);;
						  startMonth=ValuesGenerator.getRandomIntBetween(random, -100, 100);;
						  startYear=ValuesGenerator.getRandomIntBetween(random, -100, 100);
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
						 
						 if(!appt.getValid())continue;
						 	if(!appt2.getValid())continue;
							for (int i = 0; i < NUM_TESTS; i++) {
									String methodName = ApptRandomTest.RandomSelectMethod(random);
									   if (methodName.equals("addAppt")){
										 cal.addAppt(appt);
										 cal.addAppt(appt2);
										}
									   else if (methodName.equals("setRecurrence")){
										   int sizeArray=ValuesGenerator.getRandomIntBetween(random, 0, 8);
										   int[] recurDays=ValuesGenerator.generateRandomArray(random, sizeArray);
										   int recur=ApptRandomTest.RandomSelectRecur(random);
										   int recurIncrement = ValuesGenerator.RandInt(random);
										   int recurNumber=ApptRandomTest.RandomSelectRecurForEverNever(random);
										   appt.setRecurrence(recurDays, recur, recurIncrement, recurNumber);
										}				
								}
								
								 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
							        if((iteration%10000)==0 && iteration!=0 )
							              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
							 
							}
						}catch(NullPointerException e){
							
						}
					 
						 System.out.println("Done testing...");
		 
		 
	 }


	
}
