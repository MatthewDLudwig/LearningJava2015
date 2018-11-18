 * In this lesson we are going to discuss the ideas of Enums:
	 * Enums:
		 * Enums are an amazing way to use the idea of constants in Java.
			 * You can consider them as smart constants.
		 * To create a set of enums you first declare a special type of class.
			 * Remember that to declare a class you write "public class CLASSNAME {...}"
			 * Well in order to decalre a set of enums you write "public enum ENUMSETNAME {...}"
				 * When I say ENUMSETNAME I mean that you should name it something that generalizes all of the enums/constants.
					 * You should also make sure that this name is singular as that is the naming convention.
						 * This is because each enum is considered to be a ENUMSETNAME and so ENUMSETNAME should be singular.
					 * So if you want a constant for states you would name it State.
						 * If you wanted one for TV channels you would name it Channel.
							 * ETC...
		 * Once you have declared a set of enums you then start to fill in your list of enums by declaring them.
			 * Because enums are constants, which means that they cannot change, you should name them in ALL CAPS.
			 * You then write the enums as a comma seperated list so for the states example:
				 * FLORIDA, GEORGIA, NEWJERSEY, NEWYORK;
				 * Is this not very similar to declaring what would initially be in an array?
			 * The specific enums that you declare are all constants (meaning they cannot change), and are actually objects of type ENUMSETNAME.
				 * Remember that ENUMSETNAME is what we called our set of enums when we declared them as this special type of class.
					 * Just because it's a special type of class doesn't mean it is not a class!
						 * Which means we can make objects out of it.
				 * So when we are declaring our enums, while the names I used in the example above work I prefer to make it more obvious that they are objects.
					 * FLORIDA(), GEORGIA(), NEWJERSEY(), NEWYORK();
					 * The reason I do this is because we also have the option to add parameters as you will soon see.
						 * By doing this it is much easier to add parameters since I already have the parenthesis there.
					 * As a note, remember that programmers like to leave their code easy to read so in our code we usually put a new line after each comma.
		 * Now the reason I say that enums are smart constants is because they are objects and so they can have added features.
			 * If we want to add a custom constructor for our enums we can through the use of:
				 * private ENUMSETNAME() {...}
			 * Notice how I use the private scope keyword and not public like usual.
				 * The reason for this is because we specifically do not want anyone to make any more enums since our list should be constant.
					 * That means nothing can be made without it being made in the initial list we make.
				 * If you try to make the constructor public within an enum you will get an error from your IDE.
			 * We can also add methods within the ENUMSETNAME class as even though we used the keyword enum instead of class when declaring it, it is still a class.
				 * The only reason we use the keyword enum is so that our IDE can do some special things to the class upon compilation that makes our life easier.
					 * One such thing is creating all of the constants we put in our initial list and making sure no others can be created.
			 * Apart from the list of enums at the top of the class and the private constructor if you add one, you can write an enum just like any other class.
	 * Java Coding Conventions:
		 * In talking about enums we are getting into the topic of constants and how to name them.
			 * Since we have started this topic I would like to give you some info on how to name your classes, variables, and methods in the future.
				 * The advice I am giving you is based on the standards that most programmers and definitely most Java programmers hold themselves to.
		 * Classes:
			 * Classes should have all words start in uppercase.
				 * ThisIsAClass
		 * Methods:
			 * Methods should use camel case which means that the first word is lowercase and then all other words start with uppercase.
				 * thisIsAMethod()
		 * Packages
			 * We have not talked too much about packages but as we will soon be getting into them, all package names should be lowercase and one word.
			 * When you put packages inside of other packages, which we haven't talked about so just relax, you separate the names with a period.
				 * this.is.a.package
		 * Variables
			 * Variables should also use camel case like methods.
			 * In order to tell the difference remember that variables do not have the parenthesis after the name.
				 * thisIsAVariable
		 * Constants
			 * Constants are denoted in all upper case so that they can be easily found and so other programmers know they are constants.
			 * Remember that constants never change their values!
				 * THISISACONSTANT
	 * More about enums:
		 * Remember when I said that we use the special enum keyword instead of the class keyword so our IDE/compiler will do some special stuff for us?
			 * If not re-read this lesson!
		 * Well some of the special stuff the compiler does is that it gives us access to three methods without us having to write a thing!
			 * The first of these methods is the values() method which will return an array full of all of your enums.
				 * So if we called State.values()[3] on our state enums we talked about earlier we would get the NEWYORK enum.
					 * Remember that the first element is 0!
			 * The second method is the .name() method which will return the declared name of your enum.
				 * This is usually something we cannot do with variables as the name is unimportant for all of our variables but enums are special!
				 * This means if you used State.values()[2].name() on our state enums we would get the string "NEWJERSEY".
				 * This is not a method that is used often as usually you would just have a constructor with a more friendly name and a method to obtain that nicer name.
					 * But it is good to know the method exists so you don't accidentally name a variable name and mix it up with the method due to automatic code completion.
						 * I know this one from a personal mistake!
			 * The third method is the .ordinal() method which will return the number of your enum in which it was declared.
				 * That means that it is just returning the index of our enum within our values array.
				 * This is another method that is not used often but it is still good to know about.
				 * If we wrote this line, "State.values(State.GEORGIA.ordinal())" we should get back our GEORGIA enum.
		 * Have you noticed how to obtain an enum since I never pointed that out?
			 * You type the name of your enum type (ENUMSETNAME) and then use the dot seperator as if ENUMSETNAME was an object.
				 * You can then type the name of any of your enums or values() in order to get the array of all enums of that type.
				 * Once you have an enum you can then do whatever you want with it including the .name() and .ordinal() methods.
			 * This way of accessing things is something that we have not fully explained and will not go into for a while.
				 * For now just know that in order to access an enum you must do this.
				 * I hate to keep information from you but there is much more important information for you to learn first before going into this method of accessing variables and methods.
	 * The Program:
		 * In this program we create a card class that requires the use of two enums.
			 * The first enum is the suit of the card.
				 * Possibly suits are Clubs, Spades, Hearts, and Diamonds.
			 * The second enum is the type of the card.
				 * Possibly types are Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, and King.
			 * If you do not know how a normal deck of cards works, there are 52 cards with four suits of 13 cards.
				 * The 13 cards are numbered from Ace to King in the way that I described for the types.
			 * Since there are only four possibly suits and 13 possibly types, enums are a wonderful way to do this.
		 * Aside from the card class that requires the use of two enums, we also create a card class that uses Strings and integers in place of enums.
			 * This is to show how insecure and inefficient they are.
		 * After creating the two classes, we then instantiate (create) a few objects of each and see what happens as we test a few of the functions that they have.

 * Assignment:
	 * Practice coming up with enums for sets of information.
		 * I am going to give you the name of the class we are storing our enums in and you need to tell me what all of the enums should be.
			 * Answers are in the comment below this one!
			 * Keep in mind some of these you will not be able to come up with them all since there are so many.
				 * Depending on your specific program you would only need a certain subset of every type of something and that would be what you make your enums out of.
		 * public enum IceCreamFlavor {...} (This is an example of one with way too many answers so just pick a small subset to answer with)
		 * public enum Gender {...}
		 * public enum HairColor {...}
		 * public enum BodyPart {...} (This is another example of one with quite a few answers so just work with the basic ones)

 * For IceCreamFlavor I would do - VANILLA, CHOCOLATE, STRAWBERRY, VANILLACHOCOLATEMIX, COOKIESANDCREAM;
	 * Gender - MALE, FEMALE;
	 * HairColor - RED, BLACK, BROWN, BLONDE, DYED;
	 * BodyPart - LEG, ARM, HEAD, BODY, FOOT, HAND, EYE, HAIR;
