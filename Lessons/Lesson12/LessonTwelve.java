package newLessons.lessonTwelve;

import java.util.Random;

import newLessons.Lesson;

public class LessonTwelve extends Lesson {

	@Override
	public void theLesson() {
		MyArrayList<String> sList = new MyArrayList<>();
		MyArrayList<Integer> iList = new MyArrayList<>(2);

		sList.add("A");
		sList.add("B");
		sList.add("C");
		sList.add("D");
		sList.add("E");
		sList.add("F");
		sList.add("G");
		sList.add("H");
		sList.add("H");
		sList.add("I");
		sList.add("J");
		sList.add("J");
		sList.add("J");

		Random r = new Random();

		for (int x = 0; x < r.nextInt(45); x++) {
			iList.add(r.nextInt());
		}

		for (int x = 0; x < sList.getSize(); x++) {
			System.out.println(sList.get(x));
		}

		for (int x = 0; x < iList.getSize(); x++) {
			System.out.println(iList.get(x));
		}

//		When the things stored in the lists get printed you will see a few null values in there.
//			This is because of the fact that we expand by doubling (with an initial size of 10 [2 for the Integer list]) so there are some empty spaces.
	}

	@Override
	public void theAssignment() {
		MyLinkedList<String> list = new MyLinkedList<>();

//		Remember that our list is 0 indexed.
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth`");

		System.out.println(list.getSize());

		for (int x = 0; x < list.getSize(); x++) {
			System.out.println(list.get(x));
		}
	}
}
