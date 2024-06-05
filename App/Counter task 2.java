//Practical assignment 1
//Shared counter object
//Student Number: u19304308 
//Student Name: Kieran Woodrow

class Counter {

	private int value;

	public Counter(int c) {
		value = c;
	}

	synchronized public int getAndIncrement() {
		return value++;
	}
}