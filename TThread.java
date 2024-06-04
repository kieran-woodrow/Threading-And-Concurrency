//Practical assignment 1
//Thread created by extending the Thread class
//Student Number: u19304308
//Student Name: Kieran Woodrow
class TThread extends Thread {

	
    public Counter x; // CREATE A COUNTER VARIABLE

	public TThread(Counter C){ //CONSTRUCTOR FOR THE TTHREAD WITH A COUNTER PARAMETER

		x=C; // MAKE THEM EQUAL
		
	}

	public void run() { //EVERYTHING HAPPENS IN THIS FUNCTION
		
		for(int i=0; i < 6; i++)
		{
			try 
			{
    			sleep(550); // DON'T NEED TO SAY TTHREAD.SLEEP BECAUSE IN THE TTHREAD CLASS ALREADY
			} 
				catch(InterruptedException e) //TRY AND CATCH FOR SLEEP FUNCTION
				{

				}

			int countOfThread = x.getAndIncrement(); // PART OF THE COUNTER CLASS
			String nameOfThread = getName(); //PART OF TTHREAD CLASS
			long idOfThread = getId(); // PART OF TTHREAD CLASS

			System.out.println(nameOfThread+" " +countOfThread + " " + " "+ idOfThread); //PRINT OUT NAME, COUNT AND ID OF THREAD
		}
	}
}