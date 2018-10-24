	 * In this lesson you can see how to do some simple math, and use if/else statements
	 * 	if statements:
	 * 		If statements are a very simple feature of Java that can do some really amazing and complicated things.
	 * 			If there is anything you ever see in an if statement that confuses you just ask.
	 * 		In general, if statements test whether a boolean is true or false.
	 * 			You can pass a boolean variable or literal into an if statement to test it.
	 * 				if (hi) {
	 * 					Keep in mind hi is a variable that we are pretending we declared elsewhere.
	 * 				if (true) {
	 * 					This is used to create an infinite and unending loop.
	 * 			You can also pass in logical expressions which are evaluated as if they were booleans.
	 * 				Think of them as methods that return booleans.
	 * 				if (6 > 7) {
	 * 				if (i > j) {
	 * 					Keep in mind i and j are variables that we are pretending we declared elsewhere.
	 * 			You can also pass in methods that actually do return booleans.
	 * 				if (person.isAwake()) {
	 * 					Keep in mind person is a variable that we are pretending we declared that is of some Class with an isAwake() method.
	 * 	else statements:
	 * 		If statements are usually followed by else statements that are obviously used for if the if statement failed.
	 *			Remember that if statements will fail when what is passed in is false and not true.
	 *		You can put another if statement after an else statement to make your code more legible.
	 *			This is called an "else if" or "elseif" statement.
	 *			} else if (...) {
	 *	Nested if statements:
	 *		You can put if, else, and elseif statements anywhere in your code including within the bodies of other if and else statements.
	 *		This is called nesting if statements.
	 *	Comparing two variables, objects, or literals:
	 *		There are two ways to compare things in Java.
	 *		Double Equals Sign (==)
	 *			This is used when comparing two literals or two variables/objects that are the exact same.
	 *				When I say exact same I mean LITERALLY AND EXACTLY the same hence why we use this with literals.
	 *					This means that they must be in the same exact spot in memory so == is usually a very dangerous thing to use.
	 *						You should pretty much only use this with literals or when you want to know if two things are the exact same.
	 *		.equals()
	 *			This is a special method that will check to see if two variables or objects are equal to each other.
	 *				We will learn more about this method later so for now just remember that it allows you to compare two Strings.
	 *	Operators:
	 *		There are many types of operators but for now we will only focus on three of them.
	 *		Assignment Operator:
	 *			= is the only assignment operator and we already talked about what it does when discussing variables.
	 *		Arithmetic Operators:
	 *			+, -, *, /, and % are the only arithmetic operators and they are all self explanatory except for %.
	 *			% is called the Modulus or Modulo and it gives you the remainder of the division of two numbers.
	 *				6 % 2 = 0
	 *				7 % 2 = 1
	 *				It is useful for determining whether numbers are odd or even.
	 *			If you ever want to compress the idea of adding a number to a variable (var = var + NUM) you can write this:
	 *				"var += NUM" which directly adds NUM to the var and then sets it equal to var.
	 *				You can do the same with all of the arithmetic operators:
	 *					var /= num, var -= num, var %= num, etc...
	 *		Equality and Relational Operators:
	 *			== and != are used for testing for equality with != meaning "not equal".
	 *				Just because == is an operator doesn't mean you should only use it.  Don't forget .equals()!
	 *			> and < are used for seeing whether something is greater or less than another.
	 *				You can also use >= and <= for greater than or equal to and less than or equal to.
	 *	The Program:
	 *		In this program we create a fairly simple calculator that allows the user to choose what operation they wish to perform on two numbers.
