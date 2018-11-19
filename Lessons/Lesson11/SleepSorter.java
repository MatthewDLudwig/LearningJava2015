package newLessons.lessonEleven;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class SleepSorter {
	private Thread[] threads;
	
//	THis could also be done with a normal array and a lock and if you want I can show you that too.
//	But since there is an atomic version I chose to use it.
	private AtomicIntegerArray array;
	private AtomicInteger currentIndex;
	
	public SleepSorter(int[] initialArray) {
		threads = new Thread[initialArray.length];
		array = new AtomicIntegerArray(initialArray.length);
		currentIndex = new AtomicInteger(0);
		
		for (int x = 0; x < initialArray.length; x++) {
			threads[x] = new Thread(new SleepThread(initialArray[x], this));
		}
	}
	
	public void sort() {
		for (Thread t : threads) {
			t.start();
		}
		
		for (Thread t : threads) {
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(array);
	}
	
	public void addNumber(int num) {
//		Keep in mind this weird fact I learned writing this program:
//			Two atomic actions in a row cannot be considered one atomic action.
//		Moral of the story:  Threads are weird.
		
//		This is why I use one method for both incrementing and getting (sort of like x++ or ++x) rather than two.
		array.set(currentIndex.getAndIncrement(), num);
	}
}
