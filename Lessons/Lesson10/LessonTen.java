package Lesson10;

import logic.Lesson;

public class LessonTen {
	public void theLesson() {
//		Here we create the 5 objects we are going to work with.
		Person jack = new Person("Jack", true, 15, 'l');
		Person tom = new Person("Tom", true, 15, 'l');
		Person carly = new Person("Carly", false, 7, 'q');
		Person carlysBrother = new Person("Carly", true, 9, 'q');
		Person tomsClone = new Person("Tom", true, 15, 'l');

//		Here we test to see whether they equal each other with ==.
		System.out.println(jack == tom);
		System.out.println(jack == carly);
		System.out.println(carly == carlysBrother);
		System.out.println(tom == tom);
		System.out.println(tom == tomsClone);

//		Here we test to see how our .equals() method is working.
		System.out.println(jack.equals(tom));
		System.out.println(jack.equals(carly));
		System.out.println(carly.equals(carlysBrother));
		System.out.println(tom.equals(tom));
		System.out.println(tom.equals(tomsClone));
	}

	public void theAssignment() {
		OtherPerson matt = new OtherPerson("Matt", true, Month.FEBRUARY, 22, 1996, State.FLORIDA);
		OtherPerson mattsBadClone = new OtherPerson("Matt", false, Month.FEBRUARY, 22, 1996, State.FLORIDA);
		OtherPerson john = new OtherPerson("John", true, Month.SEPTEMBER, 40, 2012, State.CONNECTICUT);
		OtherPerson carly = new OtherPerson("Carly", false, Month.JULY, 18, 1253, State.ARKANSAS);
		OtherPerson tom = new OtherPerson("Thomas", true, Month.DECEMBER, 31, 1983, State.CONNECTICUT);

		matt.addEnemy(john);
		matt.addEnemy(mattsBadClone);
		matt.addFriend(john);
		carly.addFriend(tom);
		carly.addFriend(john);
		carly.addFriend(mattsBadClone);

		matt.speak();
		mattsBadClone.speakTo(matt);
		carly.speakTo(mattsBadClone);
		mattsBadClone.speakTo(carly);
		matt.speakTo(john);
	}
}
