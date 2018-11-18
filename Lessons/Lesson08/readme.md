# Lesson Eight

## Table of Contents  
[The Lesson](#lesson)  
[The Program](#program)  
[The Assignment](#assignment)  

<a name="lesson"/>

## The Lesson

 * In this lesson we will discuss arrays and switch statements.
	 * Arrays
		 * Arrays are a way to store multiple variables within one.
		 * They are usually used when you have to store multiple objects that are related.
		 * In order to create an array you must declare it very similar to a variable.
			 * Variable
				 * TYPE NAME = NEW TYPE();
			 * Array
				 * TYPE[] NAME = new TYPE[SIZE];
				 * Here TYPE is the same as when it is a variable.
				 * SIZE is the SIZE of the array.
					 * The size of an array cannot be changed once it has been made.
					 * That doesn't mean an array is always the same size, as you can use an integer variable for the size.
				 * Arrays can also be written as TYPE NAME[] but I prefer the first way.
		 * Once you have created an array you need to put things into it.
			 * In order to access a specific element of an array you need to write:
				 * NAME[INDEX]
					 * INDEX is the number of the element that you wish to access.
						 * Keep in mind that within programming and computers all counting starts at 0.
						 * This means that to access the first element in an array you would use an index of 0.
						 * This also means that to access the last element you would use an index of SIZE - 1.
		 * Arrays can be created with things already in them by writing:
			 * TYPE[] NAME = new TYPE[]{ELEMENTONE, ELEMENTTWO, ETC...};
	 * Switch statements
		 * Switch statements are a special type of logical expression similar to an if else statement.
		 * Switch  statements are declared by first writing "switch (VARIABLE) {...}"
			 * VARIABLE is what we will be testing and is usually an integer, char, or enum.
				 * We will be learning about enums in the next lesson.
			 * Switch statements allow you to compress the idea of "if (VARIABLE == NUMBER1) {...} else if (VARIABLE == NUMBER2) {...} ..."
				 * NUMBER1, NUMBER2, etc... are done within the body of the switch statement.
				 * Within the body you write "case NUMBER1:" and then on the next lines you write some code.
					 * Once you are done you write "break;" in order to show that you are done for that specific case.
					 * You then write the next case and continue down the line.
				 * If you do not write break then the code continues down the line and will run further code.
					 * This also means that you can have multiple cases run the same code by writing multiple cases line after line and then some code with a break.
				 * At the end of your switch statement you should have a special case called the default case.
					 * This is written as:  "default:" and then more code.
					 * You use the default case so to make sure that all cases are accounted for in a switch statement.
		 * Due to the fact that you must declare each individual case and the only way to do ranges is to declare every case in between, switch statements are only really used when you know exactly what you are dealing with.
			 * This usually means constants, such as the days of the week, because you know there are only 7 options.
				 * Then you just use the default case for if someone passes something in that does not match what you expected.

<a name="program"/>

## The Program

 * In this program we write a program similar to the one from Lesson 7 to use arrays.
 * We use arrays to store the names, ages, and favoriteletters of 5 people and then use a for loop to create the actual people that are stored in another array.
 * During the for loop we use a switch statement to test the favorite letter of the people and print out a certain line into the console.
	 * Here you will see how limited a switch statement can be and why it should only really be used when you know exactly what you are working with.

<a name="assignment"/>

## The Assignment
 * Practice coming up with index values for the elements in an array.
	 * Look at the following arrays and give the index values for the requested element.
		 * {6, 2, 7, 8, 5, 5, 13}, What index is 6 at?  What about 13?  What about 8?  What about the second 5?
		 * {'a', 'b', 'c', 'd', 'e', 'f', 'g'}, What indexes would we need to make the word cab?  What about the word bed?  What about bead?
 * Answers
	 * 0, 6, 3, and 5.
	 * 2, 0, 1 and 1, 4, 3 and 1, 4, 0, 3.
