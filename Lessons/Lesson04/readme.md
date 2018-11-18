# Lesson Four

## Table of Contents  
[The Lesson](#lesson)  
[The Program](#program)  

<a name="lesson"/>

## The Lesson

 * In this lesson you learn how to use while and for loops:
 * Declaring multiple variables at the same time:
	 * As long as you are declaring the same type of variables, you can declare multiple variables on the same line.
		 * int numberOne, numberTwo, numberThree;
		 * String stringOne, stringTwo, stringThree;
		 * Doing this improves the readability of your code but is completely optional.
			 * I only do it on occasion if I feel it works well or if the variables are not just of the same type but are also related.
	 * You can also initialize multiple variables of the same type on the same line but this is slightly sloppier and I have never seen it.
		 * int numberOne = 12, numberTwo = 13, numberThree = 15;
		 * String stringOne = "", stringTwo = "hi", stringThree = "out of ideas";
		 * Just because I have not seen it doesn't mean it's never been done as it is a feature which means someone must use it.
			 * You should try to use standards that other programmers use though as it increases readability so use this technique sparingly.
 * While loops:
	 * While loops allow you to do something until what is being tested returns false.
		 * You can think of it as similar to an if statement if that helps.
			 * if (...) {do this and then check the if statement again} is the same as while (...)
			 * Just remember that you can not do something like I did in the if statement above so you must use a while loop.
	 * While loops are usually used in this manner to repeat something a certain number of times:
		 * int i = 0; while (i < SOMENUMBER) {DO SOMETHING AND THEN INCREMENT i}
			 * Keep in mind the while loop is usually not all on one line I am just trying to save space.
				 * Look at the program to see examples.
	 * You can use anything that returns or is a boolean in the parentheses of a while loop just like you can with an if statement.
 * Do while loops:
	 * Do while loops are special loops that you use to do whatever is within the body of your loop at least one time before checking your condition.
	 * They are rather basic loops and you will learn when it is best to use them over the normal while loop through practice.
	 * The syntax for a Do while loop is:
		 * do {DOSTUFF HERE} while (CHECK);
 * For loops:
	 * For loops are similar to while loops except that they compress what you are writing into one usually neat line.
		 * int i = 0; while (i < SOMENUMBER) {DO SOMETHING AND THEN INCREMENT i}
			 * is the same as
		 * for (int i = 0; i < SOMENUMBER; INCREMENT i) {DO SOMETHING}
	 * When looping through something a select number of times you should usually use a for loop rather than a while loop.
		 * I know I said while loops are usually used for that but that is true until you learn for loops and even then you still can.
		 * For loops just make sure you are always incrementing your i (which can be named anything by the way)
			 * Keep in mind ALL programmers not just beginners will sometimes forget to increment their i in a while loop.
			 * This leads to an infinite loop and your computer freezing up.
	 * For loops can be used for other things though so another way to look at the relationship between the two loops is this:
		 * STEP 1; while (STEP 2) {DO SOMETHING AND THEN STEP 3}
			 * which is the same as
		 * for (STEP 1; STEP 2; STEP 3) {DO SOMETHING}
			 * Keep in mind that:
				 * STEP 1 is usually declaring a variable.
				 * STEP 2 is usually a logical operation with that variable.
				 * STEP 3 is usually incrementing that variable.
 * More Operators:
	 * I hope you were studying your operators from the if statement lesson and if not you should go review them.
	 * There are two more types of operators we are going to learn here and then that only leaves two more which we won't learn for a while.
	 * Unary Operators:
		 * Unary operators are always attached to a variable or literal and can only be used on specific kinds.
		 * + and - are the operators used on numbers such as int, long, float, and double variables and literals.
			 * +6, -15
			 * int x = 15, y = -x;
		 * ++ and -- are the increment and decrement operators and they allow you to increase or decrease a number by 1.
			 * The definition of number for ++ and -- is similar to the one above except that it can only be variables and not literals.
				 * This is because you can change the value of a variable but not of a literal (hence its name).
			 * ++ and -- can be used before or after a number and it changes the order that things are done in your program.
				 * While the order may be different, the number will end up the same whether ++ or -- are before or after a number.
				 * If we have an int variable called x which equals 5 (int x = 5) then:
					 * System.out.println(++x) will print 6 as we add before printing the variable.
					 * System.out.println(x++) will print 5 as we add after printing the variable.
					 * System.out.println(x) after either of these lines will always print 6 though since we incremented no matter the order.
						 * The same logic applies to the -- operator.
		 * ! is the logical complement operator.
			 * The name of this operator is just a fancy way to say that it reverses the value of a boolean.
			 * That means if we have a boolean variable names x that equals true (boolean x = true) then:
				 * if (x) {System.out.println("Hi"} will print "Hi" but...
				 * if (!x) {System.out.println("Hi"} will not print "Hi" as the if statement only sees false.
					 * You cannot do x! like you can with ++ and --.
					 * You are also not changing the value of x like with ++ and --.
	 * Conditional Operators:
		 * Conditional operators are useful in if statements as well as within loops and can be seen along with the logical complement operator.
		 * && is the "conditional and" which checks if the two things on both sides of it are true.
			 * System.out.println(true && true) will print true.
			 * System.out.println(true && false) will print false no matter the order.
			 * System.out.println(false && false) will print false.
		 * || is the "conditional or" which checks if either of the two things on either side of it are true.
			 * System.out.println(true || true) will print true.
			 * System.out.println(true || false) will print true no matter the order.
			 * System.out.println(false || false) will print false.
		 * There is a third conditional operator but we will be ignoring it for now as it slightly complicates things.
			 * It also causes code to be less readable but only if used incorrectly so for now we should focus on easier things.


<a name="program"/>

## The Program

 * In this program we have the user input an integer as many times as they want and add it to the total variable.
 * We only stop looking for input when the user enters -1.
 * At the end of the program you can also see both a while and a for loop being used for incrementing.
 * Unfortunately I do not use any of the new conditional operators we learned but its better that you know them now.
	 * Make sure to study them so when we start using them you are a pro (which will be helpful as we only keep learning from here).
