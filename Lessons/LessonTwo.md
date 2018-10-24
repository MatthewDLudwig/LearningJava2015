 * In this lesson you can see how to get input from the user:
 * 	Scanner:
 * 		Scanner is a class that we create an object out of in order to obtain input from the console.
 * 			Scanner is going to be the type for our variable (remember how I said classes can be used as types?).
 * 			To create a Scanner object you must use "new Scanner(System.in)".
 * 				Do not worry about creating objects and how this works as we'll be dealing with that subject soon enough.
 * 		Once you've created your object you must store it within a variable (we use input in this example).
 * 		In order to obtain any information from the scanner there are three important methods you must remember:
 * 			next() - This method will input up until the first whitespace in the console and return it to you in a String.
 * 				If "abcdefg" is in the console then next() will first return "a", then "b", etc...
 * 			nextLine() - This method will return all input typed so far up and until the user hit the RETURN/ENTER key.
 * 				If "abcdefg" is in the console then nextLine() will return "abcdefg".
 * 			nextInt() - This method will return what was in the console as if it was an int.
 * 				If "12" is in the console then nextInt() will return 12.
 * 				If "abc" is in the console then nextInt() will cause an error as "abc" is not an int.
 * 				You can mess around with typing in different things into the console and seeing what nextInt returns.
 * 			Keep in mind none of these methods will return anything until the enter key is pressed.
 * 				This means you need to pay attention to what you are doing or else you could easily do something wrong.
 * 			Also keep in mind that there are a lot more methods that you can call that you may use in the future.
 * 		Once you are done working with a scanner be sure to call the close() method on it so that it is not taking up system resources.
 * 			This is something we will discuss in more detail much much later but you should learn to form good habits.
 *	The Program:
 *		In this program we do something very similar to what was done in the last lesson's program.
 *		The only difference is that we ask the user for their name, age, and favoriteLetters and then use that.
