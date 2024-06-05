//Practical assignment 1
//Shared counter object
//Student Number: u19304308
//Student Name: Kieran Woodrow

class Counter {

	private int value;

	public Counter(int c) {
		value = c;
	}

	public int getAndIncrement() {
		 lock.lock();
        try {
            return value++;
        }
        finally{
            lock.unlock();
        }

    }
    private ReentrantLock lock  = new ReentrantLock();
}