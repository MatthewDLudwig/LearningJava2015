package Lesson03;

import logic.Lesson;
import java.util.Scanner;

public class LessonThree extends Lesson {

	@Override
	public void theLesson() {
Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        String operation;
        int answer;

        System.out.print("Give me your first number:  ");
        num1 = input.nextInt();
        System.out.print("Give me your second number:  ");
        num2 = input.nextInt();

        System.out.print("What should I do to these numbers?  ");
        operation = input.next();

        if (operation.equals("+")) {
            answer = num1 + num2;
        } else if (operation.equals("-")) {
            answer = num1 - num2;
        } else if (operation.equals("*")) {
            answer = num1 * num2;
        } else if (operation.equals("/")) {
            answer = num1 / num2;
        } else {
            answer = 0;
        }

        System.out.printf("The answer is %d", answer);

        input.close();
	}

	@Override
	public void theAssignment() {

	}

}
