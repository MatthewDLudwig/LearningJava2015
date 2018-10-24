import java.util.Scanner;
import newLessons.Lesson;

public class LessonFour extends Lesson {

	@Override
	public void theLesson() {
		Scanner input = new Scanner(System.in);
		int total = 0, numInput = 0;

		System.out.println("We are now adding numbers starting at 0:");

		while (numInput != -1) {
			total += numInput;
			numInput = input.nextInt();
		}

		System.out.printf("Your total is:  %d", total);

		System.out.println("/n We are now subtacting numbers starting at your total:");

		for (numInput = 0; numInput != -1; numInput = input.nextInt()) {
			total -= numInput;
		}

		int i = 0;

		while (i < 6) {
			//This is where you would do stuff!
			i++;
		}

		//We could have also reused i in this for loop but I wanted to show you that you can also create variables within it.
//		for (i = 0; i < 6; i++) is how you could reuse your variable.

		for (int j = 0; j < 6; j++) {
			//This is where you would do stuff!
		}

		input.close();
	}


	@Override
	public void theAssignment() {

	}

}
