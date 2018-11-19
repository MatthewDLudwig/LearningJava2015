package newLessons.lessonEleven;

import java.util.Random;

public class Person implements Runnable {
	private static final Random r = (new Random());
	private static final int SLEEPTIME = 5000;
	private static final int BATHROOMTIME = 1500;
	
	private String name;
	private boolean bedroomPreference;
	private House theHouse;
	
	public Person(String name, House theHouse) {
		this.name = name;
		this.bedroomPreference = r.nextBoolean();
		this.theHouse = theHouse;
	}
	
	@Override
	public void run() {
		for (int runCount = 0; runCount < 15; runCount++) {
			if (runCount == 0) {
				theHouse.isFrontDoorOpen.set(true);
			} else if (runCount == 1) {
				theHouse.isFrontDoorOpen.set(false);
			} else {
				if (r.nextBoolean()) {
//					Here you can see that the person will try both rooms and if neither is open it will wait for it's preference.
//					Once obtaining a room they sleep (literally) for a random amount of time and then unlock the room.
					if (theHouse.bedroomOne.tryLock()) {
						try {
							System.out.println(name + " is going to sleep!");
							Thread.sleep(r.nextInt(SLEEPTIME));
						} catch (InterruptedException e) {
							e.printStackTrace();
						} finally {
							System.out.println(name + " is awake!");
							theHouse.bedroomOne.unlock();
						}
					} else {
						if (theHouse.bedroomTwo.tryLock()) {
							try {
								System.out.println(name + " is going to sleep!");
								Thread.sleep(r.nextInt(SLEEPTIME));
							} catch (InterruptedException e) {
								e.printStackTrace();
							} finally {
								System.out.println(name + " is awake!");
								theHouse.bedroomTwo.unlock();
							}
						} else {
							if (bedroomPreference) {
								theHouse.bedroomOne.lock();
								
								try {
									System.out.println(name + " is going to sleep!");
									Thread.sleep(r.nextInt(SLEEPTIME));
								} catch (InterruptedException e) {
									e.printStackTrace();
								} finally {
									System.out.println(name + " is awake!");
									theHouse.bedroomOne.unlock();
								}
							} else {
								theHouse.bedroomTwo.lock();
								
								try {
									System.out.println(name + " is going to sleep!");
									Thread.sleep(r.nextInt(SLEEPTIME));
								} catch (InterruptedException e) {
									e.printStackTrace();
								} finally {
									System.out.println(name + " is awake!");
									theHouse.bedroomTwo.unlock();
								}
							}
						}
					}
				} else {
//					The bathroom is much simpler just involving a simple lock and then release after a random amount of time.
					theHouse.bathroom.lock();
					
					try {
						System.out.println(name + " is going to the bathroom!");
						Thread.sleep(r.nextInt(BATHROOMTIME));
					} catch (InterruptedException e) {
						e.printStackTrace();
					} finally {
						System.out.println(name + " is done in the bathroom!");
						theHouse.bathroom.unlock();
					}
				}
			}
		}
	}

}
