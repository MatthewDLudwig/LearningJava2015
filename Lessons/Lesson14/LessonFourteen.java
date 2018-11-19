package newLessons.lessonFourteen;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import newLessons.Lesson;

public class LessonFourteen extends Lesson {
	
	/* 
	 * In this lesson we are going to learn about some things you can do with Arrays and Strings.
	 * 	The Arrays class:
	 * 		The Arrays class is a utility class that is very similar to the Collections class in use except it works with arrays.
	 * 		There are methods for searching and filling as well as copying into new arrays.
	 * 		Some of the special methods that exist are:
	 * 			asList(T[]) which returns a List of type <T> from the array.
	 * 				The type of the list returned is a custom type defined for the Arrays.
	 * 				If you would like a certain type you can usually just construct it and pass in the list returned by this method as a parameter.
	 * 				It will usually copy it in.
	 * 			toString(T[]) which returns a string representation of the array which the normal toString method for the array doesn't do correctly.
	 * 		Just as Arrays can turn an array into a list a list can be turned into an array.
	 * 			Just use the toArray method within a list object.
	 * 				This is not affected by whether it is an ArrayList, LinkedList, or any other type of list.
	 * 			You can pass in nothing in which case an Object[] array is given or you can pass in an array of the correct type to be filled.
	 * 				If the passed in array is not large enough or is null then a new array is created and returned so I usually do this.
	 * 			If I am making many arrays I will create a constant for my class that is null.
	 * 				If it is only once in a while I will just do:  list.toArray(new T[0]) where T is the correct type [since arrays can't be generic!].
	 * 	varargs:
	 * 		WHAT IS THIS CRAZY WORD?
	 * 		This word represents the idea of passing in multiple parameters in as one array.
	 * 		The syntax for using Varargs is ... after the variable type (String... vars).
	 * 		It can only be done for the final variable in a parameter list as it allows the user to pass in an unlimited amount of variables into the function.
	 * 			If it was allowed to be in the middle parsing the method would be really complicated for the compiler.
	 * 		This is very useful in cases such as printf where it needs to take in as many arguments as you need.
	 * 			So generally it is useful when you want to be able to accept as many things as possible.
	 * 		The variable will be treated as if it was an array and infact an array can be passed in, instead of a bunch of variables.
	 * 	Methods on Strings:
	 * 		Strings also have a few important methods that are useful for us to know how to use.
	 * 		.charAt(int)
	 * 			This method returns the character at the selected position.  Remember all positions are usually from 0.
	 * 		.contains(String)
	 * 			This method returns true if the string being searched has the specified string within it.
	 * 		.indexOf(String)
	 * 			This method finds the index of the first letter in the specified string within the string being searched.
	 * 				In ababab, .indexOf("bab") would return 1.
	 * 		.endsWith(String)	
	 * 			This method returns true if the string being searched ends with the string specified.
	 * 				There is also a .startsWith method that is self explanatory.
	 * 		.lastIndexOf(String)
	 * 			This method works similar to indexOf but instead it finds the final string if there were multiples.
	 * 			It still counts from the left even though it is like it is searching from the right for the first match.
	 * 				In ababab, .lastIndexOf("bab") would return 3 and not 1.
	 * 		.getBytes()
	 * 			This method returns an array of bytes representing each character within the string.
	 * 			It is useful for writing all bytes to a file and I use it for a way of encrypting strings that I can show you.
	 * 		Through the use of a StringBuilder you can also reverse strings as I do in the example program.
	 * 		The String class also has a static method called format which is quite useful.
	 * 			It works like printf except it doesn't print it automatically.
	 * 	The Program:
	 * 		In this program I show you how all of the Array and String methods work through examples.
	 * 		It is important to note that the arrays created by List.toArray and the lists created by Arrays.toList are not linked to the original which I show.
 	 */
	@Override
	public void theLesson() {
		arrayStuff();
		System.out.println("|------------------------|");
		stringStuff();
	}
	
	private void arrayStuff(Integer... vars) {
//		Be careful with using int[] or any primitive array for asList.
//			The list returned will be of type <primitive[]> not <primitive> which is probably not what you expect.
		System.out.println(Arrays.asList(vars));

		List<String> l = new LinkedList<>();
		l.add("My mom!");
		l.add("Your mom!");
		l.add("Twelve");
		l.add("The mom!");
		String[] s = l.toArray(new String[0]);

		System.out.println(l);
		System.out.println(s); //Incorrect representation of an array!
		System.out.println(Arrays.toString(s));
		
		s[2] = "Six";
		System.out.println(l);
		System.out.println(Arrays.toString(s));
		
		l.set(1, "Whose mom?");
		System.out.println(l);
		System.out.println(Arrays.toString(s));
	}
	
	public void stringStuff() {
		String s = "Stressed";
		
		System.out.println(s);
		System.out.println(s.charAt(4));
		System.out.println(s.contains("esse"));
		System.out.println(s.indexOf("se"));
		System.out.println(s.endsWith("sed"));
		System.out.println(s.lastIndexOf("se"));
		System.out.println(Arrays.toString(s.getBytes()));

		StringBuilder b = new StringBuilder(s);
		s = b.append(" live").reverse().toString();

		System.out.println(s);
		System.out.println(s.charAt(4));
		System.out.println(s.contains("esse"));
		System.out.println(s.indexOf("se"));
		System.out.println(s.endsWith("sed"));
		System.out.println(s.lastIndexOf("se"));
		System.out.println(Arrays.toString(s.getBytes()));
	}

	/*
	 *  Assignment:
	 *  	Create a method that accepts an unknown amount of Strings and finds out how many start with a vowel and how many start with consonants.
	 *  	Then take all of these strings and put them into a list and remove all of the strings that have a consonant as the 4th character (only if it is large enough check).
	 *  		This will require one more method that you may not know from the String class so think about it.
	 *  	Then turn the list back into an array and print out the array.
	 */
	@Override
	public void theAssignment() {
//		You could do multiple tests but I choose only to do one.
		theMethod("dsfsdf", "fieouot", "auoqwe", "ihorivu", "dslfiuvyb", "wefiuofiu", "erliguoiwqy");
	}
	
	public void theMethod(String... strings) {
		int vCount = 0, cCount = 0;
		
		for (String s : strings) {
			if (s.startsWith("a") || 
					s.startsWith("e") || 
					s.startsWith("i") ||
					s.startsWith("o") || 
					s.startsWith("u")) {
				vCount++;
			} else {
				cCount++;
			}
		}
		
		System.out.println(String.format("The list contains %d strings that start with vowels and %d that start with consonants.", vCount, cCount));
		
		List<String> l = new LinkedList<>(Arrays.asList(strings));
		Iterator<String> i = l.iterator();
		
		while (i.hasNext()) {
			String s = i.next();
			
			if (s.length() > 3) {
//				Remember that I want the fourth character which should be the 3rd index.
				switch (s.charAt(3)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					break;
				default:
					i.remove();
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(l.toArray()));
	}
}
