package Lesson02;

import logic.Lesson;
import java.util.Scanner;

public class LessonTwo extends Lesson {

	@Override
	public void theLesson() {
		String name;
		int age;
		char favoriteLetter;

		Scanner input = new Scanner(System.in);

		System.out.println("Please tell me your name, age, and favorite letter.");
		System.out.print("Name:  ");
		name = input.nextLine();
		System.out.print("Age:  ");
		age = input.nextInt();
		System.out.print("Letter:  ");
		favoriteLetter = input.next().charAt(0);

		input.close();

		System.out.printf("Your name is %s, you are %d years old and your favorite letter is %s. \n", name, age, favoriteLetter);
	}

	@Override
	public void theAssignment() {

	}

}
