package newLessons.lessonTwelve;

import java.util.Random;

import newLessons.Lesson;

public class LessonTwelve extends Lesson {
	
	/* 
	 * In this lesson we are going to learn about a wonderful feature called generics!
	 * 	What is generic programming?
	 * 		Generic programming is programming when you don't really know about the data type you are working with.
	 * 		This is very useful when working with storage types as well as for a few other things.
	 * 	How do Generics work?
	 * 		When doing generic programing, langauges usually go about two different ways of doing it:
	 * 			The first is called Template programming and is used in C++, and a few other languages.
	 * 				When you specify the type for the object the whole class is copied and the template type is replaced with the specified one.
	 * 				This is really powerful as you can do different things for different templates if necessary.
	 * 				It does result in slightly longer compile times and larger files.
	 * 					But since whole new classes are made there is no casting or type checking so it is usually faster.
	 * 			The second method is called Generic programming and is clearly used by Java (and some others) since the names are the same.
	 * 				When you compile your code the compiler will look at all of the uses of your generic class and then do what is called type erasure.
	 * 				Type erasure will take the information you write in your code and decide on a good base class for everything.
	 * 				So if you are creating a box class that can only hold things that extend the square class the compiler will replace the generic type with Square.
	 * 					But if you are creating a very general list that can hold anything it will probably use the Object class.
	 * 						The Object class is used most often as it fits most cases.
	 * 				Then after doing type erasure the compiler inserts casts and type checks into your code.
	 * 					These casts and type checks are done at execution/run time and so it SLIGHTLY slows your code.
	 * 						The decrease in speed is impossible to notice between a program that uses generics and one that doesn't.
	 * 						The only time this decrease is noticed is when comparing languages that use generics and ones that use templates.
	 * 						So if you think you should use generics don't be afraid to use them the speed decrease is incredibly small.
	 * 					Because of type erasure and the casts and type checks code compilation tends to be faster and files smaller.
	 * 						This is because there are not a lot of versions of your generic class and instead only one.
	 * 	How do we use generics in java?
	 * 		There are two cases where generics can be used:  Creating generic classes and parametizing (specifying the type) for a generic class.
	 * 			In both cases we will be using the carrot brackets ("<" and ">") with something in between them.
	 * 		Creation:
	 * 			When creating a generic class we put the brackets next to the name of the class when we declare it (where we write "class NAME")
	 * 				Within the brackets we write the name of our generic type.
	 * 				We try to keep names to one letter and there is a certain convention that we try to follow.
	 * 					E - Element
	 * 					K - Key (Used in maps)
	 * 					V - Value (Used in maps)
	 * 					N - Number (No idea where this is used)
	 * 					T - Type (The most common generic type)
	 * 					S, U, V, etc. - 2nd, 3rd, 4th types
	 * 				These aren't the only names you can use and the name means absolutely nothing.
	 * 					It will help people understand what you are trying to do with your generic type though which is helpful.
	 * 			After creating the generic class, any time we need to use that generic class just refer to it by it's name as if it was a normal class.
	 * 				So if a method must return our generic type and our type is called "U" (apparently T and S were taken) we would type:
	 * 					U METHODNAME() { ... }
	 * 		Paremetizing
	 * 			Paremetizing a generic class is pretty easy.
	 * 			When you go to create a new instance of that class all you have to do is type the type within brackets after the class name.
	 * 				Example:  new ArrayList<String>() or new LinkedList<Babies>()
	 * 			You can optionally leave out the paremetization but this is extremely frowned upon.
	 * 				The only reason you can even do it is for backwards compatibility with older code.
	 * 	Limits of generics:
	 * 		Generics are really cool and all but there are some limits to what they can do.
	 * 		Arrays:
	 * 			The first problem is that you cannot create an array from a generic type.
	 * 				This is because in java, arrays like to know a few things about themselves at compile time.
	 * 					One of these things happens to be it's type and so generic arrays really can't be done.
	 * 				But then how does the generic class ArrayList (which is backed by an array) work?
	 * 					Well it is most likely a little bit more complicated than our program below but I did my best to show you a rough draft.
	 * 						The real version would probably have more safety checks and such since it is actually part of java.
	 * 		instanceof:
	 * 			You cannot use the "instanceof" keyword with generics as yet again, we really don't know the type of a generic so we can't see if something matches it.
	 * 				This is made worse because of type erasure so most things would just wind up being "instanceof Object" which everything is.
	 * 		primitive data types:
	 * 			You cannot use primitive data types inside your parametization (no ArrayList<int> or <float>).
	 * 			Instead you have to use the Class versions of the primitives (Integer, Float, Double, etc...).
	 * 			You don't have to worry too much about interchanging between the Class versions and the primitives as the compiler will take care of this for you.
	 * 				This is called auto boxing and it is a cool feature but a dangerous one.
	 * 					We will talk about it soon.
	 * 	Generics in parameters:
	 * 		One really cool thing you can do with generics is accept specific types of generic objects in your parameters.
	 * 		For example, the Class class is actually generic and is generic according to the class of the object.
	 * 			So if you have a String object and call the .getClass() method on it, it will return a Class<String> object.
	 * 		When creating something that stores classes of a certain type (for example a list of all entity classes) you can use inheritance with your generics.
	 * 			If all of our entities extend the Entity class we can use the wildcard operator along with generic bounding to improve our list.
	 * 		Wild Card Operator:
	 * 			The wild card is the question mark (?) and is used for an unknown type.
	 * 		Generic Bounding:
	 * 			This is quite an interesting and complicated topic but for now you just need to know that you can use this to tell if something extends another class.
	 * 			This is done with the "extends" keyword.
	 * 		So for our object that stores classes that all extend Entity we could have it be parametized to <? extends Entity>.
	 * 			Now it can store any type (?) but only if it extends Entity.
	 * 	The Diamond (<>):
	 * 		The diamond is one of the few new features in java that I will actually be teaching you.
	 * 		All it does is prevent you from having to retype the parametization if it is already obvious what it is.
	 * 			This usally happens when you declare and instantialize a variable at the same time.
	 * 		The compiler will infer the parametization and put it in for you.
	 * 		In order to use the diamond just use empty brackets.
	 * 		An example of this is:  Box<Box<String>> boxOfBoxes = new Box<>();
	 * 	Inheritance:
	 * 		The Java official tutorials makes a special point about this so I decided I would do the same.
	 * 		Due to how generics work, inheritance is impossible to do for the most part and when it can be done it is not like you think.
	 * 		If you have class B that extends from class A (making A the base class) and then have an arraylist of a and b, then:
	 * 			While an object of type B could be stored in a variable of type A.
	 * 			An object of type ArrayList<B> could NOT be stored in a variable of type ArrayList<A>.
	 * 		Even though the generic type being used is a subclass of the other one, the two arraylists are not related.
	 * 	The Program:
	 * 		In this program I have made a simple version of an ArrayList (a common list we will learn about next lesson).
	 * 		This list uses generics in order to allow you to make a list that can store any data type.
	 * 		Our arraylist will automatically resize to double the previous size when you try to add a new element past it's old limit.
 	 */
	@Override
	public void theLesson() {
		MyArrayList<String> sList = new MyArrayList<>();
		MyArrayList<Integer> iList = new MyArrayList<>(2);
		
		sList.add("A");
		sList.add("B");
		sList.add("C");
		sList.add("D");
		sList.add("E");
		sList.add("F");
		sList.add("G");
		sList.add("H");
		sList.add("H");
		sList.add("I");
		sList.add("J");
		sList.add("J");
		sList.add("J");

		Random r = new Random();
		
		for (int x = 0; x < r.nextInt(45); x++) {
			iList.add(r.nextInt());
		}
		
		for (int x = 0; x < sList.getSize(); x++) {
			System.out.println(sList.get(x));
		}
		
		for (int x = 0; x < iList.getSize(); x++) {
			System.out.println(iList.get(x));
		}
		
//		When the things stored in the lists get printed you will see a few null values in there.
//			This is because of the fact that we expand by doubling (with an initial size of 10 [2 for the Integer list]) so there are some empty spaces.
	}

	/*
	 *  Assignment:
	 *  	Your assignment for this lesson is to create your own version of a Linked List.
	 *  	What is a Linked List:
	 *  		It is called a linked list because the list consists of nodes that are linked to each other.
	 *  		The actual Linked List will usually contain a variable for the first node in the list, and one for the last node.
	 *  		Upon adding something to the list you add it to the Node, add the new node to the last node, and then make the new node the last node.
	 *  		If you need get a certain one you can do this with a counter decremented each time it moves to the next node.
	 *  		You should be able to store and retrieve anything using generics.
	 */
	@Override
	public void theAssignment() {
		MyLinkedList<String> list = new MyLinkedList<>();
		
//		Remember that our list is 0 indexed.
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth`");
		
		System.out.println(list.getSize());
		
		for (int x = 0; x < list.getSize(); x++) {
			System.out.println(list.get(x));
		}
	}
}
