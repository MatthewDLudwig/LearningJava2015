package newLessons.lessonFifteen;

import java.util.ArrayList;
import java.util.List;

public class Boss {
//	The Runnable interface used with threads can also be used with lambdas (think about it, it works doesn't it?).
//		It's a functional interface that accepts no parameters and returns nothing as well.
	private static List<Runnable> jobs = new ArrayList<Runnable>();
	
//	This is a static initializer block.  These are like a constructor for static things in your class.
//	It is called only once and on the first time the class is accessed statically.
//		Remember that accessing a class statically is done by Name.Whatever.
//		Creating a new instance of this class also counts as accessing statically as if you were writing Name.new().
	static {
		jobs.add(() -> {System.out.println("Job 1");});
		jobs.add(() -> {System.out.println("Job 2");});
		jobs.add(() -> {System.out.println("Job 3");});
		jobs.add(() -> {System.out.println(2 * 2);});
		jobs.add(() -> {System.out.println(3 + 2);});
		jobs.add(() -> {System.out.println(Math.floor(6.925f));});
		jobs.add(() -> {System.out.println(Math.sqrt(49));});
	}
	
	public static Runnable getJob() {
//		Math.random() returns a decimal between 0 and 1 and is useful when you don't want a Random object floating around.
		return jobs.get((int)(Math.random() * jobs.size()));
	}
}