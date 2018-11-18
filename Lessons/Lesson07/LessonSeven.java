package Lesson07;

import logic.Lesson;

public class LessonSeven {
	public void theLesson() {
//		Here we create a bunch of Person objects.
        Person carl = new Person("Carl", 5, 'c');
        Person jack = new Person("Jack", 15, '9');
        Person sam = new Person("Sam", 12, 'c');
        Person carly = new Person("Carly", 6, '9');
        Person mike = new Person("Mike", 33, 'c');
        Person sarah = new Person("Sarah", 115, '9');
        Person jill = new Person("Jill", 75, 'c');
        Person matt = new Person("Matt", 96, '9');
        Person tony = new Person("Tony", 12, 'c');
        Person mark = new Person("Mark", 5, '9');

//      Here we assign a bunch of Person objects some friends.
        carl.setFriend(sam);
        sarah.setFriend(mike);
        tony.setFriend(jack);
        matt.setFriend(tony);
        jill.setFriend(carly);
        mark.setFriend(sarah);

//      Here we have a bunch of Person objects speak and speak to some other objects.
        carl.speak();
        sarah.speakTo(jack);
        matt.speakTo(tony);
        tony.speakTo(matt);
        sarah.speakTo(mike);
        mark.speakTo(sarah);
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

		public String getName() {
			return this.name;
		}

		public void setFriend(Person newFriend) {
			this.friend = newFriend;
		}

		public void speak() {
	        System.out.printf("Hi, my name is %s!  I am %d years old and my favorite letter is:  %s\n", this.name, this.age, this.favoriteLetter);
		}

		public void speakTo(Person person) {
			if (this.friend != null && this.friend.equals(person)) {
		        System.out.printf("Hello %s!  You are my friend and my name is %s!  I am %d years old and my favorite letter is:  %s\n", person.getName(), this.name, this.age, this.favoriteLetter);
			} else {
		        System.out.printf("Hello %s, my name is %s!  I am %d years old and my favorite letter is:  %s\n", person.getName(), this.name, this.age, this.favoriteLetter);
			}
		}
	}
}
