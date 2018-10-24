 * In this lesson you can see how to create objects and how to call methods within them.
 * 	Note:
 * 		Congrats on making it this far you now know how to code in almost any programming language!!!
 * 			What I mean by this is that with the knowledge you now know you could create a simple program in almost any language.
 * 			This is because you understand the basics of input, output, math, and logic.
 * 		From here it will start to get harder but we are also starting the largest and most important concept in Java:  Objects.
 * 		This first tutorial on objects (and the final in this group) will be short but that is because you must understand it perfectly.
 * 			That means you should spend just as much time as you spent on the larger topics understanding this small piece of a topic.
 * 			But now let's begin!
 * 	Objects:
 * 		Everything we have been working on so far has been building up to objects and you may have forgotten but we have actually already used objects.
 * 			We have made Scanner objects in nearly every lesson's program.
 * 		An object is an instance of a class.
 * 			For such a small line it probably contains a lot that makes no sense even if you believe you understand it.
 * 		For now we will discuss classes and methods which are required to understand objects and then we can come back to this.
 * 	Class:
 * 		A class is what defines an object.
 * 		All of the methods within a class are accessible to an object that is of that class type.
 * 			This means that we can define the behavior of all objects of a certain type just by making methods within the class.
 * 		A class can be created within another class (like what we have done with the Person class in this lesson).
 * 			Classes can also be created in their own files.  (The file you are currently reading is for the Main class)
 * 		When you are declaring a class you write "public class CLASSNAME".
 * 			The public keyword is just like the keyword on all of your methods.
 * 			Usually when a class has the public keyword on it you should have it in its own file and so in the future we will do that.
 * 			For now we will also be ignoring the other possible keywords in order to make this lesson a bit easier to handle.
 * 			The word class in all lowercase is also a keyword that lets Java know that you are declaring a class (it's a big deal!)
 * 	Method
 * 		A method is what is contained within a class and is what allows you to do the actual defining of an object.
 * 		Methods are declared by writing "public void METHODNAME".
 * 			public is yet again the same keyword that is used on classes and will be discussed in more detail.
 * 			void is the return type of the method.
 * 				You can make the return type of a method anything that you could use as the type for a variable.
 * 					This is because unless you say void you will be FORCED to return a variable of that type.
 * 				As a review, possible types include:
 * 					Any primitive type (int, float, boolean, etc...)
 * 					Classes (String, Scanner, Person, etc...)
 * 				void is not a type of variable but just tells Java that you will not be returning anything.
 * 				We will discuss returning from methods more later but for now just use void.
 * 		In order to call a method within a class you must have an object of that class type.
 * 			You then use the dot seperator to access what's within that object.
 * 				Example:  object.method();
 * 					object is the object.
 * 					. is the dot seperator necessary any time you are accessing something within an object.
 * 					method() is the method.
 * 	Objects again:
 * 		Now that we know more about Classes and Methods we can learn some more about objects.
 * 		When I said earlier that an object is an instance of a class I hope it now makes more sense.
 * 			I hope it's also clear how much work it took to explain that one line and what it entails.
 * 			If you missed the connection between what was just discussed and my statement about objects reread the lesson up to this point.
 * 				This is THAT important.
 * 			If you did understand the connection then still reread the lesson and then this summary.
 * 				Objects allow you to access methods within a class.
 * 		Now if you know anything else about objects from other sources it would be helpful to forget it so this information stays clear.
 *	The Program:
 *		In this program we create a new class called Person and then create two objects of that same Person class.
 *		We can then call the sayHello() method for both objects which prints "Hello World!" to the console.

/*
 * The Assignment:
 * 	Make a program that will ask for the user's date of birth.
 * 		The program must ask for the month, day, and year separately.
 * 		The month must be in String form and not number form when input into the program.
 * 			The user should be able to enter both the full month name as well as the 3 letter abbreviation.
 * 				Example.  February - Feb, March - Mar, June - Jun, November - Nov
 * 			You should continuously ask for the month until a correct format is entered.
 * 		The day must be within the range for the month.
 * 			You should continuously ask for the day until a correct day is entered.
 * 				For February, 29 is an acceptable day so you don't have to worry about leap years.
 * 		The year must be realistic.
 * 			It cannot be larger than 2010.
 * 			It cannot be smaller than 1700.
 * 			Do these dates sound realistic?
 * 				Maybe for 2010 but not for 1700.
 * 				As the person assigning this I can choose to make anything realistic though.
 * 			As I hope you guessed, you should continuously ask until a correct year is entered.
 * 		For both the day and the year, for now there is nothing you can do about whether or not they actually enter a number.
 * 			Just assume that the user is a good user and will enter a number.
 * 	The program must then calculate the users age from December 31, 2014
 * 		This means that everyone born within a certain year will be the same age.
 * 			For example:  Born 2014:  0 years old.
 * 			For example:  Born 1996:  18 years old.
 * 			For example:  Born 1914:  100 years old.
 * 	The program must then state how old the user is and make a comment about that age.
 * 		You can be as specific or unspecific as you want.
 * 			Example:  "You are 14 years old, wow you are young!", "You are 200 years old, are you lying?", etc...
 * 		You can use age ranges so people within certain categories have the same comment.
 * 	I encourage you to experiment a tiny bit before calling this a finished program.
 * 		Make a comment when someone enters a special date.
 * 		Make a comment for your birthday.
 * 		Experiment, have fun, surprise me!
 * 	Note:
 * 		I understand this has nothing to do with objects which is unfortunate but please still review the concepts gone over in lesson 5.
 * 			It is better that I introduce it to you early so you have time to absorb the information before we dive in head first.
 * 		I also recommend typing everything out rather than copying and pasting as it helps you get used to typing faster.
 * 			It will also help you get used to the way java code is written and your IDE's auto-complete feature.
 * 	Below is my version of the program for you to look at AFTER YOU ARE DONE.
 * 		Mine is done with readability and efficiency in mind although it is not perfect.
 * 		You may run this program though to see exactly what it is I am looking for.
 * 			I encourage you though to come up with a rough idea, maybe write out a plan for your program, before running mine.
 * 			This will improve how well you can come up with programming ideas as you will not always have an example to see what the user wants.
 *	Good luck, have fun, and don't stress over this!  If you have any questions or need any help don't be scared to ask!
