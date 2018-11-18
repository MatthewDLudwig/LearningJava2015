 * In this lesson we are going to focus on methods, mainly ones that require parameters.
	 * Methods:
		 * As a review, a method is almost like a mini program or subroutine that you can run during your program.
		 * We use methods in order to organize our code but more importantly so that it is more flexible.
			 * If we had everything within only one method (the main method) things would get quite messy.
			 * We would also be unable to call specific pieces of our code.
				 * Stuff like speak(), die(), fly(), etc...
	 * Creating Methods:
		 * The way we create a method is by declaring it within our code with this structure:
			 * SCOPE RETURNTYPE NAME(PARAMETERLIST) {BODY}
				 * SCOPE
					 * SCOPE refers to the scope keyword that we use in front of our methods.
					 * For now just use the "public" keyword but soon we will be discussing other keywords you can use.
				 * RETURNTYPE
					 * RETURNTYPE refers to the type that will be returned by our method.
					 * For now just use the "void" keyword to tell Java that we will not be returning anything.
					 * Soon enough we will be discussing returning other things within our methods.
				 * NAME
					 * NAME should be fairly obvious but it refers to what we choose to call our method.
				 * PARAMETERLIST
					 * PARAMETERLIST refers to the list of parameters that our method will be expecting every time it is called.
					 * These will be a major part of this lesson so I will get to it in a small amount of time.
				 * BODY
					 * BODY is the final and arguably most important part of a method.
					 * It will be where you put all of the code you want ran when your method is called.
	 * Calling Methods:
		 * I keep using this word "call" and so I should give you a quick explanation of what it means.
		 * When programmers say that they want to call a method or are calling a method that just means that they are using it.
		 * In order to call a method you must have some way to access that method and so for now we are creating objects in order to get this access.
			 * There are more ways to obtain access to a method but we will be discussing these in a later lesson.
		 * Once you have a way to access that method you just use the dot seperator we talked about in the last lesson.
			 * OBJECT.METHODNAME();
		 * When calling a method that expects parameters you would pass those in within the parentheses each time you call your method.
			 * OBJECT.METHODNAME(PARAMETERS);
	 * Parameters:
		 * Now what exactly are parameters?
			 * Parameters are things that you as a programmer are expected by your own code to pass in to a method to be used.
		 * Why are we making our code expect us to pass in different things when we should have full control over our code?
			 * The answer to this question is really simple.
			 * It allows our methods to do different things in different situations without us making a new method.
			 * In each different situation we just have to pass in different parameters.
			 * An example of this is with the System.out.println(PARAMETERS) method you have been using.
				 * The PARAMETERS we pass into this method are what will actually be printed even though we don't rewrite a new method.
			 * Another reason our code expects parameters is so that if someone else was to use our method, it is much more likely to be used correctly.
				 * I only say much more likely since someone could always pass in incorrect methods (which is quite difficult to do).
				 * They could also do other things wrong but we will deal with that later.
		 * So how do we ask for parameters when writing a method?
			 * In the space between our two parentheses we list out the variables that the parameters we expect will be stored in.
				 * Once this has been done our code now knows that it cannot run unless you pass in some things to fill those variables.
			 * A few examples of this could be:
				 * public void saySomething(String somethingToSay) {...}
				 * public void meetThisPerson(Person personToMeet) {...}
				 * public void setAge(int newAge) {...}
					 * With all examples the ... is to say that there would be code there that I am not typing.
					 * With the second example we are assuming Person is a class that we made elsewhere.
					 * The third example is an example of a type of method we call setters.
						 * We will be talking about these in the next lesson so just keep the idea in mind.
		 * Calling methods that ask for or accept parameters
			 * In the space between our two parentheses we list out the variables, literals, and objects that we are giving to the method.
				 * You can only give a method what it asks for.  Nothing more and nothing less.
			 * A few examples of this using the previous examples are:
				 * OBJECT.saySomething("Hi guys!");
				 * OBJECT.meetThisPerson(new Person("Tom"));
				 * OBJECT.setAge(16);
	 * Constructors:
		 * Now as we are getting into methods that accept parameters, we can talk about a special type of method called a constructor.
		 * You have used constructors A LOT without even noticing it.
			 * Every time you create an object you HAVE TO call that object's constructor.
			 * Sometimes a class, and therefore all of it's objects, will not have a declared constructor.
				 * In this case you do what you have normally done which is:
					 * CLASS VARIABLENAME = new CLASS();
				 * We did this in the last lesson with:
					 * Person firstPerson = new Person();
		 * Every class has a constructor that accepts no parameters and just creates the object by default.
			 * You can make your own constructor though that does special things when an object is created.
				 * You can choose to create a new constructor that also accepts no parameters.
					 * Although it accepts no parameters it should do something more than just creating the object.
					 * By the way, when you create your own constructor you do not have to worry about creating the object.
						 * That is still done automatically you just now have a chance to do something more afterwards.
				 * You can choose to create a new constructor that accepts some parameters.
					 * When you do this you now have some variables to work with from the start in your constructor.
					 * This could allow someone to create a person with an initial name, age, or other feature.
						 * This doesn't just apply to people (or Person objects) but anything else too!
					 * When this is done, anyone trying to create an object by using no parameters will get an error.
						 * This is because you created your own constructor so the default one is not needed.
					 * Just like before, you still do not have to worry about actually creating the object.
			 * In order to make your own constructor just type this:
				 * SCOPE CLASSNAME() {...} with no return type.
					 * The scope will almost always be public as there are few reasons where we would create a constructor that cannot be called.
	 * Variables within classes:
		 * When you are working within classes you can choose to declare a variable for the object that will be created from that class.
			 * This differs from variables declared within methods in a few different ways:
				 * Variables declared within methods are forgotten by Java once the method is over.
					 * Variables declared within a class is remembered by Java as long as the object is.
				 * Variables declared within methods can only be used by that method unless it is passed somewhere else.
					 * Variables declared within a class can be used anywhere within that class and are different for each instance of that class.
						 * Remember than an instance of a class is just a fancy way to say an object.
					 * Ways to pass a variable created within a method somewhere else are:
						 * Calling another method within the first method that accepts a parameter and so you pass in your variable.
						 * Returning the variable from the method which is something we will discuss in the next lesson.
				 * Variables declared within classes can use the scope modifiers that methods use in order to limit their visibility.
					 * This works similar to methods but since we have not discussed this yet just use public as we do with methods.
		 * In order to declare a variable within a class you do something similar to declaring a variable within a method:
			 * Within a method:
				 * TYPE VARIABLENAME;
			 * Within a class:
				 * SCOPE TYPE VARIABLENAME;
					 * You can optionally leave the SCOPE out and declare it the same way as you do within a method.
						 * I suggest you don't do this for now as it can get confusing for a begginning programmer.
				 * An example of this is:
					 * public String name;
		 * Just like variables declared within methods you can set a variable declared within a class to different values.
			 * The only difference when you are setting variables within a class is that you should use the "this" keyword.
				 * I say should because you do not have to but it is a helpful habit to get used to in my opinion.
					 * Others will argue that you should only use the "this" keyword when necessary so do what makes you comfortable.
				 * The only time you need to use the "this" keyword is when you have two variables that are named the same thing in both your method and class.
					 * Those that argue you should only use the "this" keyword when necessary also argue that you should just use different names for your variables.
						 * I agree with this point for the most part as it helps keep your code readable.
							 * You should know that programmers prefer to keep their code readable so other programmers can look and learn from it.
	 * The "this" keyword:
		 * The "this" keyword is a special keyword that gives you access to variables of the specific instance of the class you are coding.
			 * It is a really weird idea as you cannot control what the "this" keyword refers to.
				 * All you can do is use it when you want to use certain properties of the current object.
				 * It should start to make more sense as we use it within our code.
			 * Remember though that the "this" keyword is not always necessary.
				 * Our code assumes we are working with the variables and methods within the specific instance even when we don't use "this".
					 * But, if we declare a new variable with the same name as a variable within our class then it assumes we want that one so we have to use "this".
		 * In order to access things within the specific instance you use "this" as if it was a reference to the specific object/instance.
			 * That may seem redundant but I want you to realize that it works as if we had declared an object just like before.
				 * That means we just use the dot separator!
			 * The reason it works this was is because that actually is what it is doing!
			 * Example:  this.VARIABLENAME; or this.METHODNAME();
		 * Understanding the "this" keyword can be quite hard for some people so if you have any questions just ask!
	 * The Program:
		 * In this program we create a Person class that simplifies the code we wrote in our first and second program.
			 * Reread those two programs and then try to spot the similarities to this program.
		 * What we do is to take what was associated with what a person was in those two programs and put it into a class.
			 * This allows us to make objects that can be used as if they were people.
			 * Remember that what defined a person in that program could be said to be:
				 * Having a name, age, and a favorite letter.
		 * After creating the person class we use a few of the methods within it to show how it is like the first and second program.
			 * To do this we create ten different people and use the methods within each object.
				 * This shows you how each object has it's own information separate from all other objects.
					 * This is because while they all come from the same class, each is it's own unique instance of that class.
			 * Try to imagine how much work it would have been to do what we did in the first and second program 10 times.
				 * Now look at the program here and see how much easier it is when we can use variables and methods within objects.


 *  Assignment:
	 * Now I am going to give you an assignment that relates to this lesson.  The assignments are going to be coming up more often from now on.
	 * Your assignment is to write your own person class.
		 * This person class will have to have all of the same fields (another name for variables) as the one created for this lesson's program.
		 * It will also have to have a gender which you can pass into the constructor and store in any way.
			 * The constructor should no longer clutter the console with "Hello World" statements.
		 * When the speak method is called for this new Person class, men and women should say something different but still give the same information as before.
			 * It does not have to give the gender although it can if you want.
		 * The speakTo method will now have to have a Person object passed in rather than a String.
			 * You will then access the passed in object's name variable to print out the statement from before.
	 * After creating your own person class have the user input a name, age, favoriteLetter, and gender for as many people as they want.
		 * The program should stop asking for input's when the name "STOP" is input.
		 * Every other person should speak to the person who came before them.
			 * First person should use the speak() method, the second the speakTo(...) method, etc...
	 * My person class for this assignment is named OtherPerson due to the fact that there is already a class called Person above.
		 * You don't have to do this since your assignment should be done in a different package and so you won't have the original Person class.
 *  As a note:
 *  	If you get any errors from your IDE / compiler telling you that one of your variables may not be initialized you should fix that.
 *  		Ways to fix this is to just initialize them to some useless value.
 *  		The reason you get this error is because there is a some scenario where your code will run and it would crash if you did not initialize it.
 *  		The reason we can fix this is by initializing it to some useless value is because we are confident it won't get used.
 *  		There will be better ways to fix this in the future.
 *  	Also, input from the console using a scanner can sometimes be messy when you mix nextLine() with other methods such as next()
 *  		I suggest using only nextLine() and storing age as a String.
 *  		You can also use this line of code if you want to use an int but you are not expected to understand it.
 *  			Integer.valueOf(input.nextLine());
 *  I am going to say this again, please experiment when doing the assignments.
 *  	I don't do it here as the less experimenting I do the more I can work on the next lesson.
 *  	Possible ideas though are having the speakTo(...) method say something different if the object speaking is a man or woman.
 *  		You can also have something different be said if the person the object you are speaking to is a man or woman.
 *  		You can also add some other methods that say different things in the console.
