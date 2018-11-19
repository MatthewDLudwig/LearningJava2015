package newLessons.lessonThirteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import newLessons.Lesson;

public class LessonThirteen extends Lesson {
	
	/* 
	 * In this lesson we are going to talk about the standard list classes and a few other related topics.
	 * 	What is a list?
	 * 		A list is similar to an array except it is expandable and has some additional features arrays don't have.
	 * 	What methods can lists perform?
	 * 		.get(int)
	 * 			The get method will obtain the value at the specified index (you saw how this worked in the last lesson).
	 * 		.add(T)
	 * 			This add method will add the value at the end of the list.
	 * 		.add(int, T)
	 * 			This add method will add the value at the specified index.
	 * 		.remove(int)
	 * 			The remove method will remove the value at the specified index and close the gap created.
	 * 		.iterator()
	 * 			The iterator method will return an iterator that can iterate over the contents of the list.
	 * 				This will be explained more soon.
	 * 		.clear()
	 * 			The clear method will remove ever element from the list leaving it blank.
	 * 		There are some more methods that lists can perform but you will learn them as you need them.
	 * 	What are the types of lists
	 * 		The two MAJOR types of lists are the LinkedList and the ArrayList and each has it's benefits with certain methods.
	 * 		ArrayList
	 * 			This list is backed by an array which makes it good for random access.
	 * 			This means that the get method is O(1) [all it does is get from an array].
	 * 			The first add method will usually be O(1) [just adding to the end of an array as we did in the last lesson].
	 * 				There is the chance though, as you saw last lesson, that it become O(n) as the array has to get copied to a larger one.
	 * 			The second add method is O(n - index) [I had to look this one up].
	 * 				This is due to the fact that each element in the array needs to move over to make room.
	 * 			The remove method is the same O(n - index) for the same reason.
	 * 			The iterator method will give you an iterator just the same but the iterator will perform worse.
	 * 				This is due to the fact that iterators are all about ordered access whereas ArrayLists are best for random access.
	 * 			The clear method will just empty out the array and so there is no worry about time there.
	 * 		LinkedList
	 * 			This list is done with nodes linked to each other.
	 * 				The example we did last lesson was a singly linked list.
	 * 					Each node is linked to the next one allowing for moving easily down the list.
	 * 				The LinkedList in Java is doubly linked.
	 * 					Each node is linked to the next one and the previous one allowing for moving both forwards and backwards through the list.
	 * 			This means that the LinkedList is better for ordered access and not anything involving random things.
	 * 			The get method is O(n) as it has to go through each node until it gets to the specified one.
	 * 			The first add method is O(1) since a reference to the final node is kept like in our last lesson.
	 * 				You can also do it without a reference to the final node but then it becomes O(n) so keeping the reference is worth it.
	 * 			The second add method is O(n) as well as it works similar to the one I showed last lesson.
	 * 			The remove method is O(n) for the same reasons above.
	 * 			The iterator method will give you an iterator just the same but the iterator will perofrm better.
	 * 				All operations will be O(1) whereas in an ArrayList they are O(n - index).
	 * 			The clear method will just delete the references to the first and last nodes and the garbage collector will clean up.
	 * 		You should pick an ArrayList when you will want to store things and then access them seamingly randomly.
	 * 		You should pick a LinkedList when you want to store things and then access them in order.
	 * 			It is also useful if order doesn't matter (this sounds weird right?) because you can just go down the list in the list's order.
	 * 				You don't have to worry about which is number 1 and which is number 46.
	 * 			LinkedLists are usually used for storing entities as you really don't care about the order you update them just that you do so fast.
	 * 				And you want adding to be O(1) ALWAYS and not only sometimes.
	 * 					You can then just use the iterator to remove quickly.
	 * 		No matter whether you choose to use an ArrayList or a LinkedList the variable type should always be a List.
	 * 			You cannot actually create List objects so you will create an Array or Linked list but it will be cast down to a basic List.
	 * 			This is done so that if at some later point you wish to change from your old type to a new type of List (possibly even a custom type) you only have to change the part where you create the object.
	 *				This also allows you to write your methods that act on lists to just accept the List class and not worry about the special implementation aspects of the different classes.
	 * 	What is an iterator?
	 * 		An iterator is an object that allows you to go through each element in the iterator one by one.
	 * 		An iterator has a .hasNext method which will return true if there is a next element and false if there is not.
	 * 			This is useful to use in while loops in order to make sure you don't use the .next method and get a null pointer exception.
	 * 		An iterator also has a .next method which will return the next element in the iterator.
	 * 		Iterators also have a .remove method which will return the last element returned by .next from the underlying list / container.
	 * 		You can also get a ListIterator for the list by using the .listIterator method instead of the .iterator method.
	 * 			ListIterator has an extra method for adding an element to the underlying list at the current position.
	 * 		Iterators are all generic for the most part.
	 * 	Foreach loops:
	 * 		A foreach loop is a special type of for loop that iterates over each element in the given list or array.
	 * 			I use the word iterates on purpose as it uses an iterator behind the scenes although you don't have access to it.
	 * 		It can be used to replace most while loops using iterators and most for loops that increment a counter and then access elements.
	 * 			I say most as it cannot be used to replace the use of iterators to remove and add things.
	 * 			It can also not replace when you are moving or doing something with two arrays as you only iterate through one container not both.
	 * 				And you don't have access to the current index it is on.
	 * 					You actually never have this when working with an iterator but thats an unimportant point.
	 * 		The syntax for a foreach loop is:
	 * 			for (Type NAME : Collection) { ... }
	 * 	The Collections Class:
	 * 		The collections class is a utility class that contains many useful methods for working with collections.
	 * 		Lists are a type of collection and so we can use these methods with them.  There are other collections but we generally use lists for most things.
	 * 			Although as you need more specialized things you will probably use other collections.
	 * 		The methods:
	 * 			.addAll(Collection, T...)
	 * 				The addAll method will add all of the specified elements to the given collection.
	 * 					The ... means you can add as many as you want and we will talk about this in a later lesson.
	 * 			.copy(Collection, Collection)
	 * 				The copy method will copy all of the elements from the second collection into the first one.
	 * 					You must make sure that there is enough room in the first collection for all of the things in the second one.
	 * 			.fill(Collection, T)
	 * 				The fill method will fill the given collection with the specified element, replacing all current elements in the collection with the specified one.
	 * 					This method cannot fill past what already exists in the collection so an empty collection needs to be filled manually (to my knowledge).
	 * 			.sort(Collection)
	 * 				This sort method will sort the given collection using the natural ordering of the elements.
	 * 				For numbers this is from least to greatest, other things have different natural orderings.
	 * 			.sort(Collection, Comparator)
	 * 				This sort method will sort the given collection according to the ordering specified by the comparator.
	 * 					This could do practically anything and is used when you have custom types or want custom sorting.
	 * 			.reverse(Collection)
	 * 				The reverse method will reverse the ordering of all the elements in the collection.
	 * 					This has nothing to do with sorting and only reverses all of the elements.
	 * 	What are Comparators:
	 * 		Comparators are classes that define how a collection should be ordered.
	 * 		Any comparator must implement the Comparator interface and then the compare method for the specific (or generic) type.
	 * 		The compare method takes two objects of a certain type and returns an integer.
	 * 			The method is supposed to compare the first number to the second number (sort of like first > second or first == second etc...)
	 * 			The method should return 1 (or any positive number, it doesn't matter) if the first object is larger than the second.
	 * 				It should return -1 (or any negative number, same deal) if the first object is less than the second.
	 *  			It should return 0 if the objects are equal.
	 *  	Comparators can do absolutely anything including just returning random numbers.
	 *  		Any good comparator though follows a certain contract most programmers expect to be followed.
	 *  	Comparators must return the opposite value if the order of objects is reversed.
	 *  	Comparators must be transitive so if x == y and y == z (or any other thing such as > or <) then x == z.
	 * 	The Program:
	 * 		The program for this lesson consists of creating two lists, one ArrayList and one LinkedList and performing all of the discussed things on them.
	 * 			The only one left out is reverse but it's pretty self explanatory.
	 * 		If any of the functions used is confusing in this context just let me know and I can get you a better example.
	 * 	Use of random to fill the lists
 	 */
	@Override
	public void theLesson() {
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		
		Random r = new Random();
		
		for (int x = 0; x < r.nextInt(45); x++) {
			arrayList.add(r.nextInt(50));
			linkedList.add(r.nextInt(50));
		}
		
		for (int i : arrayList) {
			System.out.println(i);
		}
		
		System.out.println("--------------");
		Iterator<Integer> it = linkedList.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("--------------");
		arrayList.clear();
		linkedList.clear();
				
		Collections.addAll(arrayList, 1, 6, 5, 8);
		Collections.addAll(linkedList, 1, 2, 3, 4);
		Collections.copy(linkedList, arrayList);
		System.out.println(arrayList);
		System.out.println(linkedList);
		
//		Remember that even though they are in List<Integer> variables I could have easily passed in ArrayList<Integer> or LinkedList<Integer>
//		variables into the printAll method as they would just be cast down as I did when I stored them in the varaible.
//		The point of storing it in the variable was just to show you good practice and the fact that ArrayList and LinkedList are just implementations.
//			They really don't add much more.
		
		Collections.fill(linkedList, 8);
		System.out.println(arrayList);
		System.out.println(linkedList);
		
		Collections.shuffle(arrayList);
		System.out.println(arrayList);
		Collections.sort(arrayList);
		System.out.println(arrayList);
				
		linkedList.clear();
		
		for (int x = 0; x < r.nextInt(45); x++) {
			linkedList.add(r.nextInt(50));
		}
		
//		Here I am showing you that this weird comparator follows the contract even though that is not necessary.
//		I know it follows the first part about 1 < 100 and 100 > 1 but the transitive part (x < y < z) I am not sure about (due to that whole even thing)
//			That means this may not be a proper comparator although it looks like it is fine.
		Comparator<Integer> w = new Weirdo();
		System.err.println(w.compare(1, 100));  // -
		System.err.println(w.compare(100, 1));  // +
		System.err.println(w.compare(1, 100));  // -
		System.err.println(w.compare(100, 106));// -
		System.err.println(w.compare(1, 106));  // -

		
//		I could have used the old one above but I usually just create my comparators on the fly unless they are needed often.
		Collections.sort(linkedList, new Weirdo());
		System.out.println(linkedList);
	}
	
	/*
	 * As you can see here, when implementing or extending a class with generics you have to include the generics.
	 * 	You can either explicitly state it like I do in our comparator below (at it will only be used for Integers).
	 * 	Or you can have the class take a generic type and then pass that generic type to the parent class as is done in the example.
	 * 	I usually explicitly state it for my Comparators so that way it can only be used on the type I want and will work as expected.
	 * 		Although certain cases call for different things.
	 */
	private class Weirdo implements Comparator<Integer> {

//		This comparator will put even numbers above odd numbers and then bigger numbers above smaller numbers.
		
		@Override
		public int compare(Integer o1, Integer o2) {
			if (o1 == o2) {
				return 0;
			}
			
			boolean e1 = o1 % 2 == 0;
			boolean e2 = o2 % 2 == 0;
			
			if (e1 && e2 || !e1 && !e2) {
				return o1 > o2 ? 1 : -1;
			} else {
				return e1 ? 1 : -1;
			}
		}
	}
	
	private class Example<T> implements Comparator<T> {

		@Override
		public int compare(T o1, T o2) {
			// This class is useless.
			return 0;
		}
		
	}

	/*
	 * Assignment:
	 * 	Create an entity class that decides upon a random amount of updates to do before dying.
	 * 		Do not create a new Random object each constructor as this is wasteful.
	 * 	Put a random amount of entities in the appropriate list and then update them and remove dead objects until the list is empty and then end the program.
	 * 		All of these operations should be as efficient as possible!
	 * 			There is a most efficient way to do this.
	 * 	This will require you to learn one of two methods I didn't explain in the lesson.  See if you can find both.
	 * 		This will be an important skill in the future.
	 */
	@Override
	public void theAssignment() {
		List<Entity> l = new LinkedList<>();
		
		Random r = new Random();
		
		for (int x = 0; x < r.nextInt(20) + 8; x++) {
//			Add is O(1)
			l.add(new Entity());
		}
		
		System.out.println("Not done!");
		
		while (!l.isEmpty()) {
			Iterator<Entity> i = l.iterator();
			
			while (i.hasNext()) {
				Entity e = i.next();
				
				e.update();
				
				if (e.isDead) {
//					Removing through the use of an iterator is O(1) (normally removing is not for the linked list!).
					i.remove();
				}
			}
		}
		
		System.out.println("Done!");
	}
}
