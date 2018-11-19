package newLessons.lessonEleven;

public class SleepThread implements Runnable {
	private int num;
	private SleepSorter parent;
	
	public SleepThread(int number, SleepSorter creator) {
		num = number;
		parent = creator;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(num);
			parent.addNumber(num);
		} catch (InterruptedException e) {
			// NOTODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
