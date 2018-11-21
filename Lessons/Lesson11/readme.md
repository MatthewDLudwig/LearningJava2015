# Lesson Eleven

## Table of Contents  
[The Lesson](#lesson)  
[The Program](#program)  
[The Assignment](#assignment)  

<a name="lesson"/>

## The Lesson

 * In this lesson we are going to focus on threads and their uses.
	 * What are threads?
		 * When you run a program it is considered to be it's own process on you computer.
		 * That means that what happens in other programs can not computationally effect your program.
			 * There are a few exceptions such as if another program causes a crash but that is unimportant.
		 * When you create one or more threads in your program, it is considered multithreaded and can gain a performance boost.
		 * Threads operate just like the separate processes on your computer except that they are all part of one process.
			 * That means that what happens in one thread will not computationally effect another thread.
		 * What does computationally effect mean?
			 * I am just saying that run time wise there will be no effect.  That means no log and pauses.
				 * Yet again there are some exceptions to this such as if another program or thread is actually hogging all resources.
	 * Why use threads?
		 * There are many reasons to use threads but some are better than others and each must be understood.
		 * To do multiple things at once:
			 * If you want to load multiple resources at once, do some calculations in the background of a program, or anything else simultaneous threads are your answer.
			 * Threads will allow these things to happen independent of each other allowing you to save time.
			 * But if you have 37 entities on a screen and want to update all of them YOU WOULD NOT USE THREADS!
				 * You would just go one by one and update each entity as your computer should be more than fast enough to do such a thing.
			 * You need to think long and hard about whether using another thread will make life easier when trying to do multiple things at once.
		 * To improve performance:
			 * The use of multiple threads can improve performance but it is not a magical fix so you have to know what you are doing.
				 * As we already said, threads allow you to do multiple thing s at once.
				 * So in order to improve performance we have to find a way to do multiple things at once in a performance useful way.
					 * In a game you could do resource loading in one thread, rendering in a second, and game updates in a third.
					 * You could also have two resource loading threads to improve performance further.
						 * So why not have 10 so you can load ten things at once?  We'll answer this later.
	 * Limits of threads?
		 * So what is going on behind the scenes when you have a new thread or when you have multiple programs running?
			 * Let's say that your computer can do 1 billion calculations per second (FLOPS) and all applications are at 60 fps.
				 * That means your computer can do about 16 million calculations per frame.
				 * FLOPS = FLoating point Operations Per Second
			 * My computer currently has 100 processes all running at "the same time".
				 * What the computer actually does is do a certain amount of calculations and then it switches to a different process.
				 * The switching between processes takes some time, obviously not a large amount of time because it switches so fast but still some time.
					 * This is how it looks like they are all doing things at the same time.
			 * Now with lets say it takes 10 operations to switch processes and we have our 100 processes.
				 * That means we basically have 150,000 operations per frame per process.  (I'm doing lots of rounding as none of these numbers are really accurate)
			 * If you make a new thread you can now do multiple things at the same time but have less operations you can do in that time.
				 * But if you had 100 entities and each had it's own thread we now have (in our scenario) 1000 operations wasted on switching.
				 * And each of these threads aren't doing much so it doesn't make much sense.
		 * There is also the problem of accessing data between threads which causes problems.
			 * Data can become out of sync when edited by different threads1
			 * Your program will crash if you modify certain types of data at the same time as well.
		 * So then how many threads should I use with all of this in mind?
			 * The number of threads to use in a program is a lot of trial and error as well as just knowing from experience.
			 * Usually you want to keep it reasonably low (no one thread for each entity) and bump it up by experimenting (2 or 3 threads for entity processing if necessary).
				 * Always make sure performance increased when you try bumping up as you may not have found the right place to multithread!
			 * Another safe guess is to use the number of threads that can be run at the same time.
				 * What the hell does that mean?
				 * Well my explanation for the behind the scenes is only true for one core.
					 * When you have multiple cores this is happening in each core.
				 * That means while with one core you only have the illusion of many things running simultaneously (it's pretty close).
					 * With multiple cores you ACTUALLY (PHYSICALLY, LITERALLY, pick your adjective) have multiple things running simultaneously.
				 * So how many cores do I have?
					 * Well this seems obvious as you can just look at your specs and the specs for your target audience / buyers.
					 * But there is a little bit of complexity.
					 * Some developers, such as intel, are finding ways to make one core act as 2.
						 * This is called hyperthreading for intel and don't ask me what kind of magic they use to do that as I am not sure.
							 * You could probably look it up if you are interested though.
					 * So for example, my computer has 2 physical cores but due to hyperthreading has 4 virtual cores.
					 * And it is the number of virtual cores that matters (which for some computers is the same as the number of physical cores).
	 * Locks and atomic data types
		 * When you are working with multiple threads accessing data you only have two options for your data access.
			 * Locks will freeze a thread until it is able to obtain the lock and therefore the data without worry of it being edited.
			 * Atomic data types are types that can be safely used by multiple threads without the use of locks.
		 * Why use locks?
			 * Locks should be used when you have a custom data type or set of things that need to be done and you want to make sure it is all thread safe.
			 * This can be useful in scenarios where two threads may want to output their final answer to a string and you don't want it modified at the same time.
		 * Why use atomic data types?
			 * Honestly atomic data types are used even less than actual threads as they can get quite complicated to make yourself.
			 * If there is an atomic data type for what you need you can use it to prevent the use of locks which cause thread locking to have truly concurrent programming.
	 * Creating threads:
		 * In order to create a thread you just create an object using a normal constructor.
		 * The constructor will accept any object of a type that implements runnable.
		 * Runnable?
			 * Runnable is an interface with the method run() which will be run once by the thread before it dies.
			 * So you can think of it as the main method for that thread or as main being the run method for the main thread.
			 * That means in order to loop we actually have to use loops as the thread only calls run() once.
		 * Then just call NAME.start() on the thread to start it.
	 * Useful methods:
		 * Thread.sleep(long milliseconds)
			 * This method is static as java knows you only are effecting the thread calling that method and makes that thread sleep.
			 * It will sleep for as long as you tell it to in milliseconds.
			 * This can throw an interruptedException which can happen if the program crashes or some other weird thing happens.
		 * VARIABLENAME.join()
			 * This will join the thread with the method being called into the calling thread.
				 * That is a bit confusing but just think of it as combining the thread with the method into the one calling it.
			 * This is usually used to combine threads back into the main thread.
			 * It will lock up the calling thread until the threads can be joined together (which means the thread with the method must be considered dead).
	 * Daemon Threads?
		 * Daemon threads are a topic you probably could have never learned about but I believe you should know about it even if you never use it.
		 * What are they?
			 * Daemon threads are those that will not prevent java from closing.
			 * If there is a single non-daemon thread running java will not close unless under special circumstances.
	 *  Creating them?
		 *  This is done by using the setDaemon() method on the thread object.
		 *  This can only be done before starting the method.
		 * Daemon threads are rarely used but an example is the java garbage collector which should not run if everything else is done.
		 * Threads inherit the Daemoninity (thats not a real word) of the parent thread.
		 * The main thread is not a Daemon thread so unless you tell a thread to be Daemon it never will be if it is made from the main one.

<a name="program"/>

## The Program

 * Here we create a small person class that implements runnable allowing it to be used in a thread.
 * We also create a house that has a bathroom and two bedrooms that can be used by our people.
 * Our people will randomly decide what they wish to do and will wait patiently until they can do what they want.
 * We will be using locks for the room and and atomic boolean for the door and this should give you a good example of what is going on.

<a name="assignment"/>

## The Assignment

 *  The assignment for this lesson is quite simple, create a sorting method called sleepsort.
 *  What is sleepsort?
	 *  Sleepsort is considered one of the most inefficient sorting methods available and is a common joke on the internet.
	 *  If you have an array of numbers, in order to sort that array using sleepsort you must:
		 *  Create one thread for each number.
		 *  Have each thread sleep depending on it's number.
		 *  Do something with the numbers as each thread wakes up effectively sorting from least to greatest.
	 *  This is a good way to practice what we have learned concerning threads.
 *  Input for this assignment:
	 *  There will be an array called "input" that is written in our code and that we can change as needed.
	 *  This will be the numbers to be sorted.
	 *  If you need some practice numbers check my version of the assignment
 *  When looking at my practice numbers, you will see that in the first set the 5s and 6s move around a bit
	 *  This is because a difference of 1 millisecond is weird for java to work with and so things get a bit out of sync.
		 *  This is another reason that sleepsort is a joke.
		 *  It doesn't help that waking a thread can take the tiniest fraction of time too.
