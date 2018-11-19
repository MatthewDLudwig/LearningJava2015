package newLessons.lessonEleven;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class House {
	public Lock bathroom;
	public Lock bedroomOne;
	public Lock bedroomTwo;
	
	public AtomicBoolean isFrontDoorOpen;
	
	public House() {
		this.bathroom = new ReentrantLock();
		this.bedroomOne = new ReentrantLock();
		this.bedroomTwo = new ReentrantLock();
		
		this.isFrontDoorOpen = new AtomicBoolean(false);
	}
}
