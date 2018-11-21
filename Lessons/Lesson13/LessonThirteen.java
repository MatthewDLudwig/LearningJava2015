package newLessons.lessonThirteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import newLessons.Lesson;

public class LessonThirteen extends Lesson {

	@Override
	public void theLesson() {
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();

		Random r = new Random();

		for (int x = 0; x < r.nextInt(45); x++) {
			arrayList.add(r.nextInt(50));
			linkedList.add(r.nextInt(50));
		}

		for (int i : arrayList) {
			System.out.println(i);
		}

		System.out.println("--------------");
		Iterator<Integer> it = linkedList.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("--------------");
		arrayList.clear();
		linkedList.clear();

		Collections.addAll(arrayList, 1, 6, 5, 8);
		Collections.addAll(linkedList, 1, 2, 3, 4);
		Collections.copy(linkedList, arrayList);
		System.out.println(arrayList);
		System.out.println(linkedList);

//		Remember that even though they are in List<Integer> variables I could have easily passed in ArrayList<Integer> or LinkedList<Integer>
//		variables into the printAll method as they would just be cast down as I did when I stored them in the varaible.
//		The point of storing it in the variable was just to show you good practice and the fact that ArrayList and LinkedList are just implementations.
//			They really don't add much more.

		Collections.fill(linkedList, 8);
		System.out.println(arrayList);
		System.out.println(linkedList);

		Collections.shuffle(arrayList);
		System.out.println(arrayList);
		Collections.sort(arrayList);
		System.out.println(arrayList);

		linkedList.clear();

		for (int x = 0; x < r.nextInt(45); x++) {
			linkedList.add(r.nextInt(50));
		}

//		Here I am showing you that this weird comparator follows the contract even though that is not necessary.
//		I know it follows the first part about 1 < 100 and 100 > 1 but the transitive part (x < y < z) I am not sure about (due to that whole even thing)
//			That means this may not be a proper comparator although it looks like it is fine.
		Comparator<Integer> w = new Weirdo();
		System.err.println(w.compare(1, 100));  // -
		System.err.println(w.compare(100, 1));  // +
		System.err.println(w.compare(1, 100));  // -
		System.err.println(w.compare(100, 106));// -
		System.err.println(w.compare(1, 106));  // -


//		I could have used the old one above but I usually just create my comparators on the fly unless they are needed often.
		Collections.sort(linkedList, new Weirdo());
		System.out.println(linkedList);
	}

	/*
	 * As you can see here, when implementing or extending a class with generics you have to include the generics.
	 * 	You can either explicitly state it like I do in our comparator below (at it will only be used for Integers).
	 * 	Or you can have the class take a generic type and then pass that generic type to the parent class as is done in the example.
	 * 	I usually explicitly state it for my Comparators so that way it can only be used on the type I want and will work as expected.
	 * 		Although certain cases call for different things.
	 */
	private class Weirdo implements Comparator<Integer> {

//		This comparator will put even numbers above odd numbers and then bigger numbers above smaller numbers.

		@Override
		public int compare(Integer o1, Integer o2) {
			if (o1 == o2) {
				return 0;
			}

			boolean e1 = o1 % 2 == 0;
			boolean e2 = o2 % 2 == 0;

			if (e1 && e2 || !e1 && !e2) {
				return o1 > o2 ? 1 : -1;
			} else {
				return e1 ? 1 : -1;
			}
		}
	}

	private class Example<T> implements Comparator<T> {

		@Override
		public int compare(T o1, T o2) {
			// This class is useless.
			return 0;
		}

	}

	@Override
	public void theAssignment() {
		List<Entity> l = new LinkedList<>();

		Random r = new Random();

		for (int x = 0; x < r.nextInt(20) + 8; x++) {
//			Add is O(1)
			l.add(new Entity());
		}

		System.out.println("Not done!");

		while (!l.isEmpty()) {
			Iterator<Entity> i = l.iterator();

			while (i.hasNext()) {
				Entity e = i.next();

				e.update();

				if (e.isDead) {
//					Removing through the use of an iterator is O(1) (normally removing is not for the linked list!).
					i.remove();
				}
			}
		}

		System.out.println("Done!");
	}
}
