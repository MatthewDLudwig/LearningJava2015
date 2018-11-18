package Lesson06;

import logic.Lesson;
import java.util.Scanner;

public class LessonSix {
	public void theLesson() {
//		Here we declare our 10 people.
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

//      Here we have our ten people speak and this is not done in the exact same order as they were declared.
//      The final person uses the speakTo method I created so that you can see how that one works.
        carl.speak();
        jack.speak();
        sam.speak();
        mike.speak();
        sarah.speak();
        carly.speak();
        mark.speak();
        jill.speak();
        matt.speak();
        tony.speakTo(matt.name);
	}

	public class Person {
		public String name;
		public int age;
		public char favoriteLetter;

//		Here we have created a constructor that accepts the person's name, age, and favorite letter.
		public Person(String personsName, int personsAge, char favoriteLetter) {
//			Here we set the object's variable "name" to the passed in variable "personsName".
			name = personsName;
//			Here we do the same as above except with age and using the "this" keyword.  It does nothing differently.
			this.age = personsAge;
//			Here you should see a warning within most IDEs (I assume you know what those are but ask if you don't)
//				The reason we are seeing this warning is because we are assigning the variable that was passed in to itself.
//				The IDE is ignoring the variable named "favoriteLetter" within our class/object because there is one within the method.
//				It is a warning and not an error because this will not break our program it is just useless.
//					It is also a sign that you may think something should happen but it won't happen as you expected.
			favoriteLetter = favoriteLetter;
//			Here we correctly set the variable "favoriteLetter" within our object to the one passed in through the use of "this".
			this.favoriteLetter = favoriteLetter;

//			Here we have the object print to the console saying that it has been created.
			System.out.println("Hello World!");
		}

//		This is a method that will make our person print out it's information to the command line as we did in the first and second tutorial.
//			It is not exactly the same as we are much better programmers and so I have cleaned up all of the code into one neat line.
		public void speak() {
	        System.out.printf("Hi, my name is %s!  I am %d years old and my favorite letter is:  %s\n", this.name, this.age, this.favoriteLetter);
		}

//		This is a method that allows our Person object to speak to a specific name.
		public void speakTo(String name) {
//			Notice how I have to use name and this.name in the printf statement
//				This is in order to differentiate between the variable within the method and the one in the object.
//			Since you have your own copy of this code feel free to change name to this.name and this.name to name.
//				Experiment to learn and you will see exactly what is going on in the code.
//			In a real program I probably should have named the variable that is passed in something like "nameToSpeakTo".

	        System.out.printf("Hello %s, my name is %s!  I am %d years old and my favorite letter is:  %s\n", name, this.name, this.age, this.favoriteLetter);
		}
	}

	public void theAssignment() {
		Scanner input = new Scanner(System.in);
//		The OtherPerson object I make below is useless, just there to initialize the variable.
		OtherPerson lastPerson = new OtherPerson("Jim", true, 5, 'c');
		boolean shouldSpeakTo = false;
		String name = "";
		boolean gender;
		int age;
		char favoriteLetter;

		System.out.println("Please enter a name, a gender (M or F), an age, and a favoriteLetter!");
		System.out.println("Enter STOP as the name and the program will stop.");

//		I hope you remembered to use .equals() and not ==!
		while (!name.equals("STOP")) {
			name = input.nextLine();

			if (input.nextLine().equals("M")) {
				gender = true;
			} else {
				gender = false;
			}
//			This if statement could much more neatly be done with:
//				gender = input.next().equals("M");

			age = Integer.valueOf(input.nextLine());
			favoriteLetter = input.nextLine().charAt(0);

			OtherPerson person = new OtherPerson(name, gender, age, favoriteLetter);

//			This is the part of my code that has a possibility to run and is the reason I must initialize lastPerson at the start of my program.
//			While I as the programmer know it could never happen as I start with shouldSpeakTo as false, the code thinks that shouldSpeakTo could be set to true.
			if (shouldSpeakTo) {
				person.speakTo(lastPerson);
				shouldSpeakTo = false;
			} else {
				person.speak();
				shouldSpeakTo = true;
			}

			lastPerson = person;
		}

		input.close();
	}

	public class OtherPerson {
		public String name;
		public boolean gender;
		public int age;
		public char favoriteLetter;

		public OtherPerson(String personsName, boolean personsGender, int personsAge, char personsFL) {
			this.name = personsName;
			this.gender = personsGender;
			this.age = personsAge;
			this.favoriteLetter = personsFL;
		}

		public void speak() {
//			Remember that an if statement looks for a boolean so you don't need to have something like this.gender == true since this.gender itself is a boolean.
//				This only applies if you made gender a boolean so if you didn't that is fine.
			if (this.gender) {
		        System.out.printf("Yo dude, my name is %s!  I am %d years old and my favorite letter is:  %s\n", this.name, this.age, this.favoriteLetter);
			} else {
		        System.out.printf("Hi, my name is %s!  I am %d years old and my favorite letter is:  %s\n", this.name, this.age, this.favoriteLetter);
			}
		}

		public void speakTo(OtherPerson person) {
	        System.out.printf("Hello %s, my name is %s!  I am %d years old and my favorite letter is:  %s\n", person.name, this.name, this.age, this.favoriteLetter);
		}
	}
}
