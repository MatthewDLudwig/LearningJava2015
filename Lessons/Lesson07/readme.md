# Lesson Seven

## Table of Contents  
[The Lesson](#lesson)  
[The Program](#program)  
[The Assignment](#assignment)  

<a name="lesson"/>

## The Lesson

 * In this lesson we will discuss methods that programmers call getters and setters along with scope of variables and methods.
	 * Scope
		 * In Java, and many other languages, there is an idea of something called scope.
		 * Scope has to do with what can see what within your program.
		 * When declaring the scope of a method or variable you use one of the three scope keywords within java.
		 * In Java there are 4 levels of scope and we will talk about two of them now.
			 * public:
				 * The public scope is used for when something should be able to be seen by all parts of the program.
					 * This does not mean that you can automatically use a public method or public variable.
					 * What it does mean though is that if you have a way to access them, you can.
						 * That means you need an object in order to access them but if you have one you are good.
				 * This scope is seen often in code but is rarely used on variables and is more commonly seen on methods.
					 * The reason for this will be seen shortly.
			 * private:
				 * The private scope is used when something should only be able to be seen by things within that class file.
					 * That means that classes declared within classes can access each other's private variables but nothing else can.
				 * This scope is seen used on most variables as only the class should be able to mess directly with it's variables.
					 * An example of this is the name class for our Person class which shouldn't be able to be changed by anyone except the person without permission.
						 * This means it should be private.
		 * Now if a variable is private but should be able to be changed or seen but only with permission how do we do that?
	 * Getters And Setters
		 * Getters and Setters are not actual features of Java.
			 * Instead, they are a common practice that all programmers do that is common among most Object Oriented Programming Languages.
		 * The idea of a getter is that it allows someone to gain access to a private variable from an object.
			 * So for a Person, we would have a method called getName().
			 * All getters are usually named getNAMEOFVARIABLE() or are similar.
		 * The idea of a setter is that it allows someone to set a private variable.
			 * So for a Person, we would have a method called setName().
			 * All setters are usually named setNAMEOFVARIABLE() or are similar.
		 * Getters and setters seem to just take up space within our code since if a private variable has a public getter and setter it might as well be public.
			 * The difference is that as your code becomes more complex you will create getters and setters that do more than just get or set a variable.
			 * It also allows you to rename a variable or do something else to your code without it affecting those that needed access to the variable.
				 * This is because we used a method to access it so the only problem that occurs is if something drastic changes to our method.
			 * An example of getters and setters doing something more than using the variable is this:
				 * Imagine you have a variable that only one object should be able to use at a time.
				 * When the getter method is called for that variable you would check a boolean variable to see if someone already has it.
					 * If they do then you would not be able to return the variable.
					 * If they don't then you can return it and then set the boolean to true.
				 * The setter method here would not be an ordinary setter as we don't want anything to set this variable at all only see it.
					 * Instead, we would have a method that allows someone to give back our variable so that someone else can obtain it through the getter method.
	 * Returning
		 * So we already have the tools to create setters but in order to do getters we need a new tool.
		 * Returning things from methods can be done by first changing the return type of the method.
			 * The return type that you will make the method will be the same as the type for if you were declaring a variable.
				 * That means it could be a primitive (int, char, etc.) or a class (String, Person, etc.)
			 * "void" is the return type we have been using in all of our methods and that return type is for when you plan to return nothing.
			 * Also keep in mind that you can only return one thing from a method.
			 * An example of declaring a method that will return something is:
				 * public String getName() {...}
		 * After stating the return type for a method you just code within the body as if it was a normal method.
			 * Then when you are done doing what you have to do you just have to return something of the type you stated at the beginning.
				 * This is done with the "return" keyword.
			 * Examples:
				 * return "Hi";
				 * return false;
				 * return ANYVARIABLE;
			 * You can return anything you can store in a variable.
				 * This includes other variables since you can store variables within variables.
			 * Keep in mind that return statements do not have to come at the end of a method only.
				 * You can have them during loops to force stops, or put them within nested if statements to do the same.
				 * One rule is that you must always have a return statement if you have told the IDE you are returning.
					 * This means that if you have an if statement and an else statement you need a return statement either:
						 * In one block and then at the end of the method.
						 * In both blocks and not at the end of the method.
						 * In neither block and only at the end of the method.
					 * No matter what, a method that is expected to return something MUST return it!
			 * If a method has a return type of void, you can still use the return keyword to quit out of the method.
				 * This is done by typing:  "return;"
	 * The "null" literal:
		 * The last piece of this lesson is about the null literal.
		 * When variables are created they begin containing nothing hence why you will get an error if you attempt to use one before initializing them.
			 * This actually only applies to local variables created within a method.
			 * A variable that is created within a class is initialized to a default value.
				 * For primitives it is 0 if it is a number, false if it is a boolean, and for characters it is ' '.
				 * For all other variables, they are initialized to a value called null.
		 * Now if we need to initialize a variable within a method so we can use it as I did in the previous assignment we can now do two things:
			 * Assign junk data which is now something you should not do as it is wasteful.
			 * Do what is done with class variables and assign the default value manually (null for non primitives).
		 * And if we want to see if a variable has been initialized we just have to see if the variable equals null.
			 * Example:  if (VARIABLE != null) {...}
				 * This makes sure the VARIABLE is not null before continuing.
		 * If you ever attempt to call a method within a null variable you will only get an error after your program compiles and is running.
			 * The error you will get is a NullPointerException and so if you see that it means something has not been initialized.
				 * That means you should either go hunt it down and initialize it or
				 * Use an if statement to check whether the value is null before continuing.
	 * Order of operations within if, while, and for logic that uses && or ||:
		 * When you test for something within the parenthesis of an if, while, or for loop a very cool order of operations like thing happens with your && and || operators.
		 * What happens is different depending on the operator:
			 * And operator (&&)
				 * If one part of the && is false then Java does not care about what comes after it as it does not matter due to the definition of how && works.
					 * The definition is that if even one piece comes out false then the whole thing is false.
					 * So let's say that we have a whole ton of logic that will all return these booleans:
						 * if (true && (true && false) && (false && true && false) && true && true && true) {...}
							 * First of all you should never have that many pieces of logic within an if statement but if they were all booleans there is a chance it would be acceptable.
								 * Just always remember to keep your code readable so make your best judgement!
							 * Second of all, Java would not care about anything after the third && as the second piece of our statement was false:
								 * First part = true, second part = (true && false) == false, nothing else matters.
			 * Or oprator (||)
				 * With the and operator we had to remember the definition to decide when we stop caring about what's in the loop so let's look at the definition of the or operator again.
					 * The definition is that if even one piece comes out true then the whole thing is true.
					 * That means that the second Java finds a piece that is true, it moves on as the whole block is considered true.
			 * These two rules can all be combined through the use of parenthesis to get some really cool things done.
		 * With these rules in mind that also means that we can check to make sure a variable is not null and do something with that variable in the same set of parenthesis
			 * This is because if the variable is null, we don't try to do something with it which would cause an error, but instead just move on.
		 * There will be some exercises to help you practice these rules with the assignment.


<a name="program"/>

## The Program

 * In this program we update our old Person class and make it so that we can assign that person a friend.
	 * We make it so that Person objects do something special when the sayTo(...) is called and their friend is passed in.
 * This is a small program showing getters and setters as they are a small but important topic.
 * We then create a bunch of Person objects and then make them eachother's friends.


<a name="assignment"/>

## The Assignment

 * Practice understanding the rules I taught you.
	 * Look at this logic and come up with what the answers are and check them in the comment below.
	 * No code is necessary for this.
		 * (true || false) = ???
		 * (false && (true || false)) = ???
		 * ((true && (false || true)) || (false || true || (true && (false || true)))) = ???
		 * ((((true && false) || false) && false) || true) = ???
		 * (((false && true) || ERROR) || true)) = If attempting to run the code replaced by ERROR will cause a crash in your program, will your program crash?
	 * If you ever need more practice with this kind of stuff you can ask for more of these or just type random combinations try them yourselve.
		 * To check whether you are correct just copy and paste them into a System.out.println(...) statement and see what prints.
 * I also encourage you to update your Person class from the last assignment with a setFriend(...) method that works like the one made in the program.
	 * I also would suggest that when one person object has it's friend set, the person being set to that object's friend should have that object set as it's friend.
		 * If that is not clear then check the below comment with the answers to the above part but you should start getting used to vague instructions.
			 * They do not come up often but when they do the programmer is usually expected to instinctively know what to do.
		 * Keep in mind that if you do this, if two different people are set to have the same friend, they will have that same friend but the same friend will only have the last one as it's friend.
			 * We will be doing this suggestion in the final assignment and will be fixing this small problem.
	 * These are all suggestions but if you want to do a little bit more programming you should do them.
 	 * If you did not understand the suggestion above, if Matt becomes Tony's friend through tony.setFriend(matt), Tony should become Matt's friend too.
 * Answers
	 * true
	 * false
	 * true
	 * true
	 * Yes your program will crash because the first parenthesis comes out to false so no short circuiting occurs and the second part of the || is checked which gives an ERRROR.
