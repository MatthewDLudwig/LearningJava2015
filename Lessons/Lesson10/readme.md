 * In this lesson, which is the last one of the second group, we will beginning to learn about inheritance.
	 * Inheritance
		 * In Java, classes can inherit things from each other.
			 * This means that if we have two classes, A and B, B can inherit methods from A.
			 * This is useful so that our code stays readable and also because it allows our code to be more flexible and reusable.
				 * Understand that programmers always try to go for readability, flexibility, and reusability in their code.
					 * These three make functionality, the end goal for a programmer, easier to accomplish.
		 * What do classes inherit from each other?
			 * When working with inheritance there are two terms you must know:
				 * Parent Class = Also called the super class, this is the class that things are being inherited from.
				 * Child Class = Also called the sub class, this is the class that is doing the inheriting.
			 * When inheriting from a class you do not choose exactly what pieces you want to inherit.
				 * The child class inherits everything it has access to from the parent class.
					 * This means public variables and methods but not private variables and methods.
						 * There are also protected variables and methods that will be inherited but we will discuss this more in later lessons.
			 * When a child inherits from it's parent, it is almost as if everything that was inherited from the parent is pasted into the class.
				 * You do not see it but all the methods and variables are there.
					 * That means if class A has the public method "getCar(String owner)" and B is a subclass of A:
						 * If you had an object of class A called "a" and an object of class B named "b" then:
							 * You could do a.getCar("Matt") and you could do b.getCar("Matt") and they would do the exact same thing.
								 * The only difference would be which object was having the thing done to it.
					 * That also means that if class A has the public variable "car" and B is a subclass of A:
						 * And you had the two objects "a" and "b":
							 * Then you could do a.car = new Car(); as well as b.car = new Car();
								 * Keep in mind that "a" has one car for itself, and "b" has one car for itself.
									 * Apart from inheriting the actual variables and methods there is no connection between objects of A and objects of B.
								 * Now the while the objects are all different the classes are connected.
									 * That means if in version 2 of our program we rename the variable "car" in the class A to "duck" it's automatically done for all B.
										 * We would still have to rename all calls to the variable "car" though like normal unless the IDE did it for us.
									 * That also means if you keep the name of a method the same (or if you change it) but change the body of it,
										 * It will still do the same thing for both objects of A and of B and that same thing will obviously be different from what it was before.
								 * I hope you can see the power of inheritance as we can change a method within one class and have the method change within all of it's children.
									 * But if you don't, we will talk about it more in the next few lessons.
	 * So how do we do inheritance?
		 * Don't worry about it for now, we will be coming to that in the next lesson but for now I feel I have already taught you enough complicated topics.
	 * So then why teach me about inheritance?
		 * The reason you need to inheritance for this lesson is so you can understand why we are about to do what we are going to do:
		 * The first thing you need to know is that in Java, all classes extend a class called Object.
			 * This is one of the many reasons why we call instances of a class, Objects.
		 * The reason that this is done is so that Java knows it can expect a few things from every single object in the program.
			 * Some of these things you do not have to worry about such as some methods that have to do with Garbage Collection.
				 * Garbage Collection is how Java forgets about old variables and objects that you are no longer using.
					 * This is a topic that is much more important in other languages where it is not taken care of for you but in Java it is!
						 * That means we don't have to worry about it as much and so for that reason I will not be teaching it for a while, if at all.
			 * Other methods such as the two we are going to learn about today are extremely helpful for you to know about and even override.
	 * What's overriding?
		 * When a class inherits a method from it's parent it does not just magically appear in the source code for that class.
			 * As we said, it's almost like it's there but not physically.
		 * But if we create a method within the subclass that shares the name AND parameters of the one inherited from the subclass, something cool happens.
			 * What happens is that we override the method that was inherited from the parent and can now make it do something custom.
				 * This is useful because just like how Java can expect something from ALL objects because they extend Object,
					 * Later you will be able to expect something from all objects that extend type A, even if they do something different.
					 * But this is a lesson for another day, for now just think about how cool that is.
				 * It is also useful because since Java is expecting certain things from your objects, you can override those things to do something different than the default.
			 * When you override a method, you must have the same name, return type, and parameter list but the names can differ since those are just the names of the variables the parameters will be stored in.
				 * All that matters is that the types of the parameters are the same.
		 * Keep in mind that you can't override variables since there's really no functionality behind a variable unlike with a method.
			 * Also know that you cannot decrease the scope of a method that you are overriding but you can increase it.
				 * You can take a private method and turn it public but not the other way around.
				 * This makes sense because if Java is expecting a certain method to be able to be seen you shouldn't be able to hide it.
	 * So what will be overriding in this lesson?
		 * The Object class has two methods that are important to override when you create a class.
			 * Keep in mind that you shouldn't override these methods every time as you may not need the use of them, but if you do then you should.
		 * The first method we may want to override is the toString() method.
			 * This is a method that Java expects to return a String representation of your object.
				 * This method is called when you pass an object into any of the print methods within System.out.
				 * This method should be overrode when you will be printing out your object, or will be needing to represent it as a String.
				 * In order to override this method you usually create an empty String and then add information to that String that has to do with the object.
			 * For our old Person class, our toString() method would probably return a String that somehow contained the name, gender, and age.
				 * This is because I as the programmer did not think the favoriteLetter would be important but you could.
				 * In the end all that is important is that the object YOU design will give the String representation that will be useful.
			 * The default method within the Object class returns the type name for the object combined with a unique identifier for the object.
				 * If we did not override toString() within our person class it would return, "Person@IDENTIFIER" where IDENTIFIER is the identifier.
					 * Because this default method is pretty useless, those that created Java recommend that every class overrides the toString() method.
						 * I suggest though that if it is a small class that won't have to worry about being represented as a String you really don't need to override this method.
							 * This is even more accurate as you get into guis and programs that are more visual rather than ones that only work with the console.
		 * The second method we may want to override is the equals(Object o) method.
			 * This is a method that Java expects to return a boolean saying whether or not the passed in object is equal to the object this method is being called on.
				 * A prime case of this method being overrode is by the String class.
					 * The reason that .equals(...) works on String objects when == doesn't is because they overrode the .equals(...) method.
						 * When I say they I mean the people who created Java.
						 * What they overrode the method with is one that checks whether the literals that the two Strings are based on are the same.
							 * Here they would use the == as it works with literals.
							 * In case you already didn't know, you can create String objects by creating them like objects and passing a String literal into the constructor.
								 * The literal that is passed in is the same one that will be compared when the .equals(...) method is called.
				 * This method is overrode is most of the classes within Java as it useful for you to be able to know when to objects have the same contents.
					 * The reason I say the same contents is because that is what the .equals(...) method should do, it should check to see if the two objects are logically the same.
						 * That means that all of the variables within them are the same.
					 * The == operator actually sees whether or not the two objects are in the EXACT SAME SPACE in your computer's memory and doesn't care about what is in the object.
			 * So for our old Person class, our .equals(...) method would probably return true only if the name, gender, age, and favoriteLetter were the same.
				 * If we added a new variable, such as the friend variable we added in a previous lesson, we would also check that one as well.
			 * The default method within the Object class actually just checks with the == operator whether the two Objects are in the exact same spot in memory.
				 * This is because for the most basic Object, that is all that matters and all that can be compared.
				 * But as we create more complicated classes and objects we will want to override this method so that our objects can be better compared.
			 * Keep in mind that Java expects a few things from the .equals(...) method that works for the default implementation and should work in yours.
				 * If it doesn't work in your version of the method you have done something wrong as all Java programmers know that they can expect these three things from ANY equals(...) method.
				 * The three things that Java, and all other programmers, expect from an equals(...) method is:
					 * If you call the equals method and pass in the object itself it should return true.
						 * x.equals(x) has to equal true.
					 * If you call the equals method and pass in one object, you should be able to pass in the first object into the second objects method and get the same result.
						 * x.equals(y) has to equal y.equals(x).
					 * If object one is equal to object two and object two is equal to object three, then object one should be equal to object three.
						 * if x.equals(y) and y.equals(z) both return true, then x.equals(z) should return true.
	 * The Program:
		 * In this program improve our Person class further in order to make it so that People can be represented as String and be compared.
		 * After adding a toString and equals method to our Person class, we just mess around with a few objects that we make to see how the methods we made work.

 * Assignment:
	 * Your assignment for this set of five lessons is to overhaul the Person class you made before.
	 * Features that the new and improves Person class should have:
		 * Each person should have a name, gender, birth date, and state.
		 * Birth date must be stored in 3 separate variables, one for the month, one for the day, and one for the year.
			 * You should check to make sure that the day is appropriate for the month specified.
				 * If it is not, set it to the highest possibly day for that month.
					 * For January, if 36 is entered, you should set day to 31.
					 * For February, use 28 as the highest possible day.
		 * State MUST be stored as an enum.
		 * Each person must also have an array full of all of their friends and enemies.
			 * That means there should be a method to add a friend and to add an enemy.
				 * When a friend or enemy is added it should remove that person from the opposite list if it is in it.
			 * The arrays should start out at a size of 2 and if there is no room for the new friend or enemy they should be expanded to twice the old size.
				 * This is slightly complicated and so if you get stuck just take a look at my example.
				 * It involves creating a new array as you can't actually change the size of an array.
		 * The toString() method must return the following information:
			 * The name, the gender, and THE AGE (based off December 31, 2014 like in the first assignment).
		 * The equals() method should compare every variable that is stored for the object.
			 * Remember that you have to copy and paste the line of code used in the program above that allows you to compare the object as if it was a person.
			 * You do not have to compare the friends and enemies for an object as the friends could be in a different order which might cause problems.
		 * The speakTo method should accept a person object and speak to that person as it always has.
			 * Women should speak differently from men.
			 * Person objects should speak different to friends, to enemies, and to people in neither list.
	 * After creating the new Person class you should create a few person objects and make sure that all criteria are met.
	 * Note:
		 * There is at least one other way you can use enums in this assignment to make your life easier.
		 * You can use the toString() method in order to make part of your speak() and speakTo() methods easier.
			 * Remember toString() is just a String representation that is useful to programmers
				 * As long as it is still useful in general, you could make it one that helps with the speak() method.
		 * I have to name my new Person class OtherPerson because I already have a class named Person.
		 * You are free to experiment and add a few extra features to this class but I recommend you do not make it so that when one person gets a friend that person becomes the friends friend.
			 * That means that when carly becomes matts friend that matt becomes carlys friend.
			 * I recommend you DO NOT do this because you will run into an error where you are infinitely repeating a function unless you work around that.
				 * It is definitely possibly but it is not something you should have to worry about.
					 * Especially since you will later learn a better way to work with something like this friends list and enemies list so that this is less likely to occur.
