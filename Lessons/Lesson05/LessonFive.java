package Lesson05;

import logic.Lesson;
import java.util.Scanner;

public class LessonFive extends Lesson {

	*/
   @Override
   public void theLesson() {
	   Person firstPerson = new Person();
	   Person secondPerson = new Person();
	   firstPerson.sayHello();
	   secondPerson.sayHello();
   }

//	This class is so small it really doesn't need to be defined in it's own file.
   public class Person {
	   public void sayHello() {
		   System.out.println("Hello World!");
	   }
   }

	@Override
	public void theAssignment() {
		Scanner input = new Scanner(System.in);

		String monthInput;
		int monthValue = 0;
		int dayInput = 0;
		int yearInput = 0;
		boolean isInputGood;

		do {
			System.out.print("Please input the month you were born:  ");
			monthInput = input.nextLine();
			isInputGood = true;

			if (monthInput.equals("January") || monthInput.equals("Jan")) {
				monthValue = 1;
			} else if (monthInput.equals("February") || monthInput.equals("Feb")) {
				monthValue = 2;
			} else if (monthInput.equals("March") || monthInput.equals("Mar")) {
				monthValue = 3;
			} else if (monthInput.equals("April") || monthInput.equals("Apr")) {
				monthValue = 4;
			} else if (monthInput.equals("May")) {
				monthValue = 5;
			} else if (monthInput.equals("June") || monthInput.equals("Jun")) {
				monthValue = 6;
			} else if (monthInput.equals("July") || monthInput.equals("July")) {
				monthValue = 7;
			} else if (monthInput.equals("August") || monthInput.equals("Aug")) {
				monthValue = 8;
			} else if (monthInput.equals("September") || monthInput.equals("Sep")) {
				monthValue = 9;
			} else if (monthInput.equals("October") || monthInput.equals("Nov")) {
				monthValue = 10;
			} else if (monthInput.equals("November") || monthInput.equals("Nov")) {
				monthValue = 11;
			} else if (monthInput.equals("December") || monthInput.equals("Dec")) {
				monthValue = 12;
			} else {
				isInputGood = false;
				System.out.println("You input something that I was not expecting, please try again.");
			}
		} while (!isInputGood);

		do {
			System.out.print("Please input the day you were born:  ");
			dayInput = input.nextInt();
			isInputGood = true;

			if (monthValue % 2 == 1) {
				if(dayInput < 1 || dayInput > 30) {
					isInputGood = false;
					System.out.println("You input something that I was not expecting, please try again.");
				}
			} else if (monthValue == 2) {
				if (dayInput < 1 || dayInput > 29) {
					isInputGood = false;
					System.out.println("You input something that I was not expecting, please try again.");
				}
			} else {
				if (dayInput < 1 || dayInput > 31) {
					isInputGood = false;
					System.out.println("You input something that I was not expecting, please try again.");
				}
			}
		} while (!isInputGood);

		do {
			System.out.print("Please input the year you were born:  ");
			yearInput = input.nextInt();
			isInputGood = true;

			if (yearInput < 1700 || yearInput > 2010) {
				isInputGood = false;
				System.out.println("You input something that I was not expecting, please try again.");
			}
		} while (!isInputGood);

		int age = 2014 - yearInput;

		System.out.printf("You are %s year(s) old!  ", age);

		if (age == 0) {
			System.out.println("You were born in 2014 how cool!");
		} else if (age < 10) {
			System.out.println("You are a child!");
		} else if (age < 13) {
			System.out.println("Double digits!");
		} else if (age < 20) {
			System.out.println("You are in your teens!");
		} else if (age < 50) {
			System.out.println("I hope you have a job!");
		} else if (age < 100) {
			System.out.println("Maybe you should retire?");
		} else if (age == 100) {
			System.out.println("Congrats you are 100 years old!");
		} else if (age > 100) {
			System.out.println("Wow you are old!  Good for you!");
		}

		if (monthValue == 2 && dayInput == 22 && yearInput == 1996) {
			System.out.println("Bye Matt have a great day!");
		} else if (monthValue == 2 && dayInput == 22 && yearInput == 1732) {
			System.out.println("Yo GW how you doing?");
		}

		if (yearInput == 2000) {
			System.out.println("Congrats on being born in a new century!");
		} else if (yearInput < 1996) {
			System.out.println("You are older than the creator of this program!");
		}

		if (monthValue == 2 && dayInput == 29) {
			System.out.println("You were born on a leap day how lucky!");
		}

		input.close();
	}

}
