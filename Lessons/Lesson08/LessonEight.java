package Lesson08;

import logic.Lesson;

public class LessonEight {
	public void theLesson() {
//		Creating an array full of all of the names and filling it one by one.
		String[] names = new String[5];
		names[0] = "Carl";
		names[1] = "Jack";
		names[2] = "Sam";
		names[3] = "Carly";
		names[4] = "Mike";

//		Creating an array full of all of the ages and filling it immediately.
		int[] ages = new int[]{5, 15, 12, 6, 33};
//		Creating an array full of all of the favorite letters and filling it immediately.  It is declared the second way.
//		You do not need new TYPE[] when initializing an array but this only applies to initialization not if you are passing in an array to a method.
		char favoriteLetters[] = {'a', '9', 'd', 'c', 'q'};

		Person[] people = new Person[5];

//		You can use access the length variable of an array in order to be sure that you go through every element.
//		It is the same number that you use for the size of an array so make sure count never actually equals it.
		for (int count = 0; count < people.length; count++) {
			people[count] = new Person(names[count], ages[count], favoriteLetters[count]);

			switch (favoriteLetters[count]) {
				case 'a':
				case 'b':
				case 'c':
					System.out.println("The person I just created likes a letter!");
					break;
				case '9':
					System.out.println("The person I just created likes a number!");
					break;
				default:
					System.out.println("I didn't expect the person I just created to like this character");
					break;
			}
		}
	}

	public class Person {
		private String name;
		private int age;
		private char favoriteLetter;
		private Person friend;

		public Person(String personsName, int personsAge, char favoriteLetter) {
			name = personsName;
			this.age = personsAge;
			this.favoriteLetter = favoriteLetter;
		}

		public void setFriend(Person newFriend) {
			this.friend = newFriend;
		}

		public void speak() {
	        System.out.printf("Hi, my name is %s!  I am %d years old and my favorite letter is:  %s\n", this.name, this.age, this.favoriteLetter);
		}

		public void speakTo(Person person) {
			if (this.friend != null && this.friend.equals(person)) {
		        System.out.printf("Hello %s!  You are my friend and my name is %s!  I am %d years old and my favorite letter is:  %s\n", name, this.name, this.age, this.favoriteLetter);
			} else {
		        System.out.printf("Hello %s, my name is %s!  I am %d years old and my favorite letter is:  %s\n", name, this.name, this.age, this.favoriteLetter);
			}
		}
	}
}
