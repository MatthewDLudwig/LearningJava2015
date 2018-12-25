## Preface:

 * Included in this readme file is the note included in the revised version of the lessons released after the 10th lesson.
 * Since these lessons are now on github as one package rather than the first 10 and then the full 15, this readme is in an awkward place.
 * I figured the note was still important though and should be kept for authenticity.

## The Note:

 * Welcome to the real world!  Now that you have finished the first 10 lessons things start to become a lot of fun.
 * For starters, now all new and old lessons are in their own packages and have been tidied up.
	* That means that everything we have done before that you were comfortable with, you should revisit and see how it would look in a real program.
		* In case you ever want to refer to the old lessons they are in a package appropriately named.
		* Keep in mind that I had to change the scope of some of the methods that we called as they are no longer in the same class file and so private doesn't work.
		* Also keep in mind that I did not look through the comments in these old classes so some comments about being able to access parts of the code may have changed.
	* Before we get much farther let's talk about packages:
		* Packages are how programmers in Java organize their different class files.
			* At the most basic level, all a package is, is a folder!
				* You can look at the src folder for these lessons and all you will see is a folder for each of our packages.
			* What makes a package different from a folder then is two things:
				* 1.  When you start releasing JAR files with all of your classes in them, your packages will go into that JAR file.
					* In fact all a JAR file is, is a special zip file and classes are just text files.
						* So a JAR file, your java program, is just a zipped up folder containing more folders containing text files.
						* But that is a confusing way to put it, especially since these folders and files are special.
							* And that is why we use the terminology JAR file, package, and class file.
				* 2.  Packages can be referenced by your code because they are expected to always contain only class files.
					* Every time you import a class, such as the Scanner class, what you are writing is simply the file path for that class file.
						* That means java.util.Scanner is just like java/util/scanner which is similar to C:\Users\You\Documents\TuesdaysHomework.txt.
							* We just use . instead of / because we are working with packages and it is another way to make sure we remember the difference.
								* Another factor is that on different operating systems the file separator is different.
									* Sometimes it is /, sometimes it is \\, and sometimes it could be something else.
			* In order to create a new package you just go in your IDE and do what you would do to create a class.
				* That means either File -> New or right clicking, and instead of picking Class you pick package.
				* If you don't have an IDE and are still using a text editor (WHICH YOU SHOULDN'T BE) you can simply create a new folder.
			* Keep in mind that package names start with lowercase letters by convention and when a package should be within another you name it appropriately.
				* That means if you have the package fish and want to put the package tuna inside of it you would name the package fish.tuna.
				* This helps your IDE keep everything together
					* So if you renamed the fish package to "animal", your IDE would just find all packages with fish.whatever and replace it with animal.whatever.
				* Now if you are still using a text editor you don't have to name your folders like this.
					* The tuna folder is still called "tuna" but in order to access the package in your code you would have to do fish.tuna.
		* Packages should be used to group together like or similar classes and sub-packages should be made when a group of classes fits under a more general group.
			* It's very similar to what is done with the animal kingdoms in science.
				* Where the outer package is the genus and the inner package the species.
			* That means if your whole program has 70 classes but they could be split into 7 groups of 10 you should do that.
				* Then if a few of those groups of ten could be split into 2 gruops of 5 then you should do that.
				* Just make sure not to over package your code or else you lose the organizational part and it just looks sloppy and complicated.
			* You will get better at working with packages as you practice so don't worry too much about it and just do your best.
				* For example, if a class fits well under two different packages you have to decide which it is better under.
					* Or maybe your two packages need to be rethought out and combined into one package or two different packages.
 * Second of all, we are now going to be using inheritance and learning about the wonderful things you can do with it.
	* As you can see from our new main method, all objects are of the basic type Lesson.
		* When you want a different lesson you just change what the real type of the object is but none of the method calls have to change.
		* This is the benefit of inheritance and is specifically called Polymorphism.
			* But we will be talking about that a bit later so for now, if you find it easier you can skip out on having the type be Lesson.
 *	As a final note, you do not need to import classes that are within your package, hence why you haven't had to do much importing before.
