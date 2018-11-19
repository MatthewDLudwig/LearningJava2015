package newLessons.lessonFifteen;

public class Worker {
//	This is a instance initializer block.
//	It is called each time the object is initialized no matter which constructor is used.
//		There is a specific order when working with initializer blocks.
//		This order assumes that none of the static initialization blocks have been called yet.  If they have then they won't be recalled.
//			1. static initialization blocks of super classes
//			2. static initialization blocks of the class
//			3. instance initialization blocks of super classes
//			4. constructors of super classes
//			5. instance initialization blocks of the class
//			6. constructor of the class.
	{
		System.out.println("I can do stuff!");
	}
	
//	There can be multiple of either initialization block (to my knowledge) and then they are called in the order they appear.
//		There is usually no reason to do such a thing though!
//	Static initialization blocks are pretty useful
//	Instance initialization blocks are rare since you can just call a method in the constructor.
//	Multiple of either block is SUPER rare and makes your code way more confusing than using one.
//		Even one instance initialization block can be confusing.  Static ones are more easy to understand.
	{
		System.out.println("I can do more stuff!");
	}
	
	/**
	 * A method that starts the Worker working where he will obtain 5 jobs from his boss.
	 */
	public void start() {
		for (int x = 0; x < 5; x++) {
			Boss.getJob().run();
		}
	}
}
