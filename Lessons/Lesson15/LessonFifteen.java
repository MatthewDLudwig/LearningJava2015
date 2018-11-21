package newLessons.lessonFifteen;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

import newLessons.Lesson;

public class LessonFifteen extends Lesson {

	@Override
	public void theLesson() {
		Function<Object, String> f = LessonFifteen::stringify;
//		By saving the method stringify as a lambda of type function the lambda is now the same method as the apply method.

		List<String> l = new LinkedList<>();
		l.add("You");
		l.add("Jack");
		l.add("Tewne");
		l.add("Lole");
		l.add("Menies");
		System.out.println(f.apply(l));
		System.out.println(f.apply(new String[]{"32", "sdf", "sdffr"}));

		Function<String, Integer> function = (s) -> {
			return s.chars().sum(); //String.chars returns a stream although I don't do any functional things to it.
		};

		System.out.println(function.apply("Your mom!"));
	}

	/**
	 * A method that will automatically call the correct method for obtaining a string representation of the Object.
	 *
	 * @param o The object that will be stringified.
	 * @return A string representation of the object passed in.
	 */
	private static String stringify(Object o) {
//		TODO  Make sure that the string return by toString makes sense (for arrays may have to use Arrays class).
		return o.toString();
	}

	@Override
	public void theAssignment() {
		Worker w = new Worker();
		w.start();
	}
}
