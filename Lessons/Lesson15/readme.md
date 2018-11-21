# Lesson Fifteen

## Table of Contents  
[The Lesson](#lesson)  
[The Program](#program)  
[The Assignment](#assignment)  

<a name="lesson"/>

## The Lesson

 * In this lesson we are going to focus on the final few important things in Java.
 * You must remember that Java is a big language so these fifteen lessons haven't made you a pro.
	 * They have though, made you a master (hopefully) of the most common parts of the standard library.
	 * Now in this last lesson I will be teaching you about some miscellaneous but very important features that you will find helpful.
		 * I will also be discussing the some of the new features introduced in Java 8.
 * The TODO tag:
	 * As you should already see, the word TODO is highlighed differently from the rest of the comment.
	 * This is because in most compilers (eclipse included) the word todo in a comment represents something you want need to do (duh).
	 * On eclipse, in order to see your Task List go to:
		 * Window (at the top) -> Show View -> Tasks
	 * I usually position it at the bottom with my Console.
	 * This is very useful for when you want to document things that need improvement or that need to be looked over later.
		 * It can also just be used for things that weren't even implemented at all and is just a shell.
 * JavaDocs:
	 * What are JavaDocs?
		 * They are a special type of documentation that Java uses separate from comments.
		 * Comments are meant to be used to indicate general information about your code, algorithms, etc. and are usually only seen by those with the source code.
		 * JavaDocs are supposed to be used in order to indicate the use of, warnings about, etc. concerning methods and classes.
	 * A JavaDoc is created like a block comment except using two stars rather than one. (/\*\*)
		 * JavaDocs are applied to whatever is below them.
	 * There are many special keywords used in JavaDocs that make them very useful and I will only list some of them.
		 * @author will make whatever comes after it be considered the author of whatever the JavaDoc applies to.
		 * @version will make whatever comes after it be considered the version of whatever the JavaDoc applies to.
		 * @since is used to show since what version or date the feature has existed in case anyone want's to go backwards.
		 * @deprecated shows whoever is viewing the JavaDoc that the feature is deprecated (is no longer supported, may be removed).
		 * @return allows you to show what is expected to be returned from the feature so it is well known to the user.
		 * @param shows what parameters are expected to be passed into the feature.
	 * The @Override tag:
		 * The @Override tag is not specifically considered a JavaDoc keyword but when included above a method can do some amazing things.
		 * The compiler and editor will check to make sure it is actually overriding another method.
			 * This gives a second check just in case you got the name or parameters wrong.
		 * The javadoc from the original method will be moved to the new method so it does not have to be rewritten.
	 * Why use JavaDocs?
		 * Well JavaDocs are easily visible in IDEs (use F2 in eclipse) which is extremely nice.
		 * You can also export all of your JavaDocs into an HTML webpage so people can learn about your library or api.
			 * This is what is done for the core java libraries and is a great place to learn about new classes in the standard library:
				 * https://docs.oracle.com/javase/7/docs/api/ -Java 7 is older but in case you are ever developing on an environment locked to it.
				 * https://docs.oracle.com/javase/8/docs/api/ -Java 8 is the newest version and comes with some awesome improvements and new features!
					 * I recommend always using Java 8 and looking at it's documentation when possible.
			 * Remember that it is usually best to use something in the standard library if it exists before obtaining a third party library.s
 * Some new line etiquette:
	 * When lines of code become too long (often in complex if statements) you should use new lines in order to logically separate the code.
	 * You will slowly learn some of the best ways to separate lines of code but I will give you a few examples of what I do.
		 * I will tend to separate long method calls when they return the same type.  This is done in StringBuilder in order to do multiple methods in a row.
			 * builder.append("HI")
				 * .append("How")
				 * .append("Are You?)
				 * .toString();
		 * I will tend to separate long if statements into different lines as well.
			 * if (value ||
				 * (v1 && v2) ||
				 * value2 ||
				 * method()) { ... }
	 * Check lesson fourteen's assignment to see an example of this splitting.
		 * Remember newlines, spaces, and tabs don't make a difference in code parsing for the most part.
 * Some shortcuts with eclipse:
	 * F2 will show you the javadoc for whatever you have clicked on.
	 * F3 will show you the source for whatever you have clicked on.
	 * There is no default key set for cutting a whole line out but I have manually set mine to (ctrl + shift + x) so you may want to set it to something.
	 * Holding down alt and clicking arrow keys will move the current line around.
		 * You can highlight multiple lines and move them around.  This is useful for moving code written before into a loop or if statement.
			 * Eclipse will automatically indent the lines that get moved which is nice.
 * Java 8:
	 * Now is the final topic of our lessons, Java 8, the new stuff!
		 * Most of the new features added in Java 8 were inspired by functional programming languages.
	 * Functional programming languages are the other side of the coin that object oriented programming is on.
		 * Whereas in OO we pass around objects and have them do things, Functional Programming involves passing around methods in order to be called elsewhere.
	 * The biggest and most important feature added to Java in Java 8 is Lambda Expressions!
		 * What they are is a way of passing around functionality (methods) around as if they were objects.
		 * How to write a lambda expression:
			 * Lamdas are written in two parts (just like methods... you'll see)
			 * The parameters:
				 * The parameters of the function are enclosed in parentheses and separated by commas.
					 * (If there is one parameter parenthesis are not needed)
			 * An arrow (->) is put between the parameters and the body of the function.
			 * The body:
				 * The body of the function is enclosed in brackets (like usual) and is written like a normal function.
		 * How to store a lambda expression:
			 * When you write a lambda expression and want to store it, Java will look so see what you are trying to store it in.
			 * If the variable is of a type of interface that contains one method matching both the parameters and return type of the lambda all is good.
			 * So if you have a lambda expression:  (a) -> {return a.name.equals("Joe")}; you could store it in a variable of type Predicate<Person>.
			 * What is Predicate?
				 * While you could technically write your own interface named PersonChecker that has a method accepting one Person object that returns a boolean this is a very common issue.
				 * Because of this the creators of Java decided there is no reason for you to have to make a new interface and instead created many interfaces already for you to use.
			 * Why store lambda expressions?
				 * What's the use of lambdas?  Passing around functionality to different places right?
				 * Well how do you pass around functionality if you don't have a way to store it in a variable or paremeter ;).
			 * All premade interfaces given in the standard java library are in the java.util.function package.
				 * I keep a link to the specific JavaDoc page for this package:  https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
	 * Along with lambdas comes many features that utilize them including a new .forEach method in iterables, a stream class, and method referencing.
		 * All of these you will learn as you go although I will quickly discuss method referencing.
		 * In order to reference a method, to my knowledge it must be static and accessible from the place it is being accessed.
			 * In order to access it just do CLASSNAME::METHODNAME.
				 * You can even save them in the java.util.function classes if they fit the correct build.

<a name="program"/>

## The Program
 * Nothing crazy for this lesson's program, just an example or two.

<a name="assignment"/>

## The Assignment

 * For this assignment your job will be to create a Worker class that can request jobs from a Boss class.
	 * The jobs are held as a list of functions that are randomly given to the worker.
 * The worker should ask for at least 5 jobs and the Boss class can be a completely static class if you prefer it.
