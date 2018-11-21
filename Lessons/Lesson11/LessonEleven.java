package newLessons.lessonEleven;

import newLessons.Lesson;

public class LessonEleven extends Lesson {

	@Override
	public void theLesson() {
		House theHouse = new House();
		Person[] people = new Person[5];
		Thread[] threads = new Thread[5];

		people[0] = new Person("Tom", theHouse);
		people[1] = new Person("jack", theHouse);
		people[2] = new Person("Larry", theHouse);
		people[3] = new Person("Maria", theHouse);
		people[4] = new Person("Sophie", theHouse);

		int count = 0;

		for (Person p : people) {
			threads[count] = new Thread(p);
			threads[count++].start();
		}

		for (Thread t : threads) {
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		if (theHouse.isFrontDoorOpen.get()) {
			System.out.println("I hate when people leave the door open!");
		}
	}

	@Override
	public void theAssignment() {
//		int[] input = new int[] {6, 21, 9, 44, 156, 7, 18, 9, 6, 45, 11, 55, 6, 7, 77, 5, 2, 120, 9};
//		int[] input = new int[] {262, 719, 339, 473, 276, 429, 350, 167, 555, 677, 268, 622, 153, 128, 478, 343, 697, 574, 689, 52, 748, 778};
		int[] input = new int[] {618, 165, 910, 420, 868, 272, 196, 531, 530, 886, 980, 525, 787, 353, 55, 112, 360, 26, 594, 296, 75, 535};
//		int[] input = new int[] {965, 869, 687, 794, 49, 355, 592, 986, 797, 781, 940, 626, 605, 181, 18, 978, 837, 397, 324, 206, 773, 496};
//		int[] input = new int[] {801, 843, 124, 909, 512, 239, 964, 328, 393, 516, 590, 12, 529, 703, 924, 193, 913, 551, 744, 847, 93, 29};

		SleepSorter sorter = new SleepSorter(input);
		sorter.sort();
	}
}
