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

	public class Person {
		private String name;
		private boolean gender;
		private int age;
		private char favoriteLetter;
		private Person friend;

		public Person(String personsName, boolean personsGender, int personsAge, char favoriteLetter) {
			this.name = personsName;
			this.gender = personsGender;
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

//		When you are overriding a method from a parent class you should usually put the word "@Override" over the method so that other programmers know you are overriding a method.
//		This is also useful because your IDE will usually tell you if you make a mistake and are not actually overriding a method if you use "@Override" above the method.
		@Override
		public String toString() {
			String string = "";
			string += this.name;
			string += " is a ";
			string += this.age + " year old " + this.gender;
			string += " whose favorite letter is " + this.favoriteLetter + ".";
			return string;
		}

		@Override
		public boolean equals(Object o) {
//			The lines I write here are necessary for comparing two objects so we can make sure they are the same class.
//			For now you just have to write it and trust me but in the next set of five lessons it will make sense why we do this.

			if (o instanceof Person) {
				Person personToCompare = (Person)o;

//				Here is where you can write code to compare the two objects using the personToCompare variable.
				boolean nameGood = this.name.equals(personToCompare.name);
				boolean genderGood = this.gender == personToCompare.gender;
				boolean ageGood = this.age == personToCompare.age;
				boolean favoriteLetterGood = this.favoriteLetter == personToCompare.favoriteLetter;

				return nameGood && genderGood && ageGood && favoriteLetterGood;
			} else {
				return false;
			}
		}
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

	public class OtherPerson {
		private String name;
		private boolean gender;
		private Month month;
		private int day;
		private int year;
		private State state;
		private OtherPerson[] friends;
		private OtherPerson[] enemies;

		public OtherPerson(String personsName, boolean personsGender, Month month, int day, int year, State state) {
			this.name = personsName;
			this.gender = personsGender;
			this.month = month;
			this.day = this.month.fixDay(day);
			this.year = year;
			this.state = state;
			this.friends = new OtherPerson[2];
			this.enemies = new OtherPerson[2];
		}

		public void addFriend(OtherPerson friend) {
			boolean added = false;

			for (int count = 0; count < this.friends.length; count++) {
				if (!added) {
					if (this.friends[count] == null) {
						this.friends[count] = friend;
						added = true;
					}
				}
			}

			if (!added) {
				OtherPerson[] tempArray = this.friends;
				this.friends = new OtherPerson[this.friends.length * 2];

				for (int count = 0; count < tempArray.length; count++) {
					this.friends[count] = tempArray[count];
				}

				this.friends[tempArray.length] = friend;
			}

			for (int count = 0; count < this.enemies.length; count++) {
				if (this.enemies[count] != null && this.enemies[count].equals(friend)) {
					this.enemies[count] = null;
				}
			}
		}

		public void addEnemy(OtherPerson enemy) {
			boolean added = false;

			for (int count = 0; count < this.enemies.length; count++) {
				if (!added) {
					if (this.enemies[count] == null) {
						this.enemies[count] = enemy;
						added = true;
					}
				}
			}

			if (!added) {
				OtherPerson[] tempArray = this.enemies;
				this.enemies = new OtherPerson[this.enemies.length * 2];

				for (int count = 0; count < tempArray.length; count++) {
					this.enemies[count] = tempArray[count];
				}

				this.enemies[tempArray.length] = enemy;
			}

			for (int count = 0; count < this.friends.length; count++) {
				if (this.friends[count] != null && this.friends[count].equals(enemy)) {
					this.friends[count] = null;
				}
			}
		}

		public void speak() {
			System.out.println(this.toString());
		}

		public void speakTo(OtherPerson person) {
			System.out.print("Hello " + person.name + "!  ");
			this.speak();

			for (int count = 0; count < this.friends.length; count++) {
				if (person.equals(this.friends[count])) {
					System.out.println("You are my friend!");
				}
			}

			for (int count = 0; count < this.enemies.length; count++) {
				if (person.equals(this.enemies[count])) {
					System.out.println("You are my enemy!");
				}
			}
		}

		@Override
		public String toString() {
			String info = "My name is " + this.name + " and I am a ";

			info += (2014 - this.year) + " year old ";

			if (gender) {
				info += "boy!";
			} else {
				info += "girl!";
			}

			return info;
		}

		@Override
		public boolean equals(Object o) {
			if (o instanceof OtherPerson) {
				OtherPerson person = (OtherPerson)o;
				boolean name = this.name.equals(person.name);
				boolean gender = this.gender == person.gender;
				boolean month = this.month == person.month;
				boolean day = this.day == person.day;
				boolean year = this.year == person.year;
				boolean state = this.state == person.state;
				return name && gender && month && day && year && state;
			} else {
				return false;
			}
		}
	}

	public enum Month {
		JANUARY(31),
		FEBRUARY(28),
		MARCH(31),
		APRIL(30),
		MAY(31),
		JUNE(30),
		JULY(31),
		AUGUST(31),
		SEPTEMBER(30),
		OCTOBER(31),
		NOVEMBER(30),
		DECEMBER(31);

		private int maxAmountOfDays;

		private Month(int maxDays) {
			this.maxAmountOfDays = maxDays;
		}

//		Notice I can use the private scope modifier since the Person class and the Month class are inside the same class.
//		private really means that it is private only within the file.
		private int fixDay(int dayToFix) {
			if (dayToFix > this.maxAmountOfDays) {
				return this.maxAmountOfDays;
			} else {
				return dayToFix;
			}
		}
	}

	public enum State {
		ALABAMA(), ALASKA(), ARIZONA(), ARKANSAS(), CALIFORNIA(), COLORADO(),
		CONNECTICUT(), DELAWARE(), FLORIDA(), GEORGIA(), HAWAII(), IDAHO(), ILLINOIS(),
		INDIANA(), IOWA(), KANSAS(), KENTUCKY(), LOUISIANA(), MAINE(), MARYLAND(),
		MASSACHUSETTS(), MICHIGAN(), MINNESOTA(), MISSISSIPPI(), MISSOURI(), MONTANA(),
		NEBRASKA(), NEVADA(), NEWHAMPSHIRE(), NEWJERSEY(), NEWMEXICO(), NEWYORK(),
		NORTHCAROLINA(), NORTHDAKOTA(), OHIO(), OKLAHOMA(), OREGON(), PENNSYLVANIA(),
		RHODEISLAND(), SOUTHCAROLINA(), SOUTHDAKOTA(), TENNESSEE(), TEXAS(), UTAH(),
		VERMONT(), VIRGINIA(), WASHINGTON(), WESTVIRGINIA(), WISCONSIN(), WYOMING();
	}
}
