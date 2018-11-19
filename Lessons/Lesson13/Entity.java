package newLessons.lessonThirteen;

import java.util.Random;

public class Entity {
	private static final Random r = new Random();
	
	public boolean isDead;
	private int timesTillDead;
	
	public Entity() {
		isDead = false;
		timesTillDead = r.nextInt(5000000) + 10000000;
	}
	
	public void update() {
		isDead = (timesTillDead-- == 0);
	}
}
