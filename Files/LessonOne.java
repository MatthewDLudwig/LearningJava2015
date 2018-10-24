package newLessons.firstFive;

import newLessons.Lesson;

public class LessonOne extends Lesson {

	/*
	 * In this lesson you can see the basics of Java at work:
	 * 	Variables:
	 * 		Variables can be set equal to either literals, objects, or other variables.
	 * 			String name = "Hi";
	 * 			String name = new String();
	 * 			String name = otherString; (Other string is a variable that we are pretending exists)
	 * 		As you can see, variables are created (declared) by stating the type (String in this case) and then the name (name).
	 * 			Other types include int, long, char, boolean, double, and float.
	 * 				These are called the primitive types.
	 * 				You can also use Classes as types but we will deal with that later just don't be surprised when you see it.
	 * 			You then set variables using a single = sign and then on the right you put what you are setting it to.
	 * 				Setting is also called initialization if you are doing it to a variable for the first time.
	 *		Examples of variables in this lesson include name, age, and favoriteLetter.
	 * 	Literals:
	 * 		Literals are things that are hard coded into your java code and computer.
	 * 		Literals come in pretty much every form for all of the primitives as well as for Strings.
	 * 			Primitives = int, long, char, boolean, double, float
	 * 				All primitives are colored purple in Java.
	 * 					Keywords and other things are also colored purple so make sure not to get confused.
	 * 			Literal Forms of primitives = int literal (1), char literal ('c'), boolean literal (true), etc.
	 * 			String literals ("hi") also exist but String is not a primitive.
	 * 					You may notice how String is not purple in our code.  It's not a primitive but a class which we'll talk about later.
	 * 		Examples of literals in this lesson include "Carl", 5, and 'c'.
	 * 	Objects:
	 * 		Objects are things that we will talk about later but for now you just need to know that they are instances of classes.
	 * 		There are no concrete examples of objects in this lesson.
	 * 	System.out:
	 * 		System is a class that contains a variable named out.
	 * 		The variable out holds an object that has many functions but the three that we care about are:
	 * 			print(String x) - Let's you print simple text to the console.
	 * 				In order to print a new line you should use "\n".
	 * 			println(String x) - Let's you print simple text to the console and then move to the next line.
	 * 			printf(String x, String y, String z, ...) - Let's you print formatted text to the console.
	 * 				The ... is me saying that there can be an unlimited amount of Strings passed into the method.
	 * 					We will talk about methods in more depth later so don't worry about it this too much just know how to do it.
	 * 					Also keep in mind that you can pass in primitives to this method as they will be treated as Strings.
	 * 				Inside your first string (x) you have to use %s or %d to denote where your other strings should be put.
	 * 					%s is for Strings
	 * 					%d is for numbers although %s will still work for primitive numbers since they are treated like strings.
	 * 		The + Math operator can be used to combine two strings or a string and a primitive so you can emulate how printf works.
	 * 	The Program:
	 * 		In the program we assign create three variables (name, age, and favoriteLetter) and assign them to the appropriate literals.
	 * 		We then mess around with printing some text to the console including through the use of these variables.
	 */

	@Override
	public void theLesson() {
        String name = "Carl";
        int age = 5;
        char favoriteLetter = 'c';

        System.out.println("Hello World!");
        System.out.print("Hi");
        System.out.print(" my ");
        System.out.print("name is: \n");
        System.out.println(name);
        System.out.printf("Hi %s", name);
//        System.out.println(" you are " + age + " years old.");  This is the same thing as the printf statement below!
        System.out.printf(" you are %d years old. \n", age);
        System.out.print("Your favorite letter is: ");
        System.out.println(favoriteLetter);
	}

	@Override
	public void theAssignment() {

	}

}
