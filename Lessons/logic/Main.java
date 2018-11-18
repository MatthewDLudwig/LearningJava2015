package logic;
import Lesson01.LessonOne;

public class Main {
	//The name of the String array is tuna as a reference to TheNewBoston if anyone knows of Bucky.
	public static void main(String[] tuna) {
// 		The correct lesson must be imported by including the below line at the top of the file.
//		import LessonXX.LessonYYY;
// 		Where XX is 01->10 and YYY is One->Ten
		Lesson l = new LessonOne();

		System.out.println("Lesson: -->")
		l.theLesson();

		System.out.println("Assignment: -->")
		l.theAssignment();

	}
}
