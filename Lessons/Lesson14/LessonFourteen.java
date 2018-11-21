package newLessons.lessonFourteen;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import newLessons.Lesson;

public class LessonFourteen extends Lesson {

	@Override
	public void theLesson() {
		arrayStuff();
		System.out.println("|------------------------|");
		stringStuff();
	}

	private void arrayStuff(Integer... vars) {
//		Be careful with using int[] or any primitive array for asList.
//			The list returned will be of type <primitive[]> not <primitive> which is probably not what you expect.
		System.out.println(Arrays.asList(vars));

		List<String> l = new LinkedList<>();
		l.add("My mom!");
		l.add("Your mom!");
		l.add("Twelve");
		l.add("The mom!");
		String[] s = l.toArray(new String[0]);

		System.out.println(l);
		System.out.println(s); //Incorrect representation of an array!
		System.out.println(Arrays.toString(s));

		s[2] = "Six";
		System.out.println(l);
		System.out.println(Arrays.toString(s));

		l.set(1, "Whose mom?");
		System.out.println(l);
		System.out.println(Arrays.toString(s));
	}

	public void stringStuff() {
		String s = "Stressed";

		System.out.println(s);
		System.out.println(s.charAt(4));
		System.out.println(s.contains("esse"));
		System.out.println(s.indexOf("se"));
		System.out.println(s.endsWith("sed"));
		System.out.println(s.lastIndexOf("se"));
		System.out.println(Arrays.toString(s.getBytes()));

		StringBuilder b = new StringBuilder(s);
		s = b.append(" live").reverse().toString();

		System.out.println(s);
		System.out.println(s.charAt(4));
		System.out.println(s.contains("esse"));
		System.out.println(s.indexOf("se"));
		System.out.println(s.endsWith("sed"));
		System.out.println(s.lastIndexOf("se"));
		System.out.println(Arrays.toString(s.getBytes()));
	}

	@Override
	public void theAssignment() {
//		You could do multiple tests but I choose only to do one.
		theMethod("dsfsdf", "fieouot", "auoqwe", "ihorivu", "dslfiuvyb", "wefiuofiu", "erliguoiwqy");
	}

	public void theMethod(String... strings) {
		int vCount = 0, cCount = 0;

		for (String s : strings) {
			if (s.startsWith("a") ||
					s.startsWith("e") ||
					s.startsWith("i") ||
					s.startsWith("o") ||
					s.startsWith("u")) {
				vCount++;
			} else {
				cCount++;
			}
		}

		System.out.println(String.format("The list contains %d strings that start with vowels and %d that start with consonants.", vCount, cCount));

		List<String> l = new LinkedList<>(Arrays.asList(strings));
		Iterator<String> i = l.iterator();

		while (i.hasNext()) {
			String s = i.next();

			if (s.length() > 3) {
//				Remember that I want the fourth character which should be the 3rd index.
				switch (s.charAt(3)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					break;
				default:
					i.remove();
					break;
				}
			}
		}

		System.out.println(Arrays.toString(l.toArray()));
	}
}
