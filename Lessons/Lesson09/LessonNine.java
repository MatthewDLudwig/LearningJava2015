package Lesson09;

import logic.Lesson;

public class LessonNine {
	public void theLesson() {
		Card firstCard = new Card(Suit.DIAMONDS, Type.SEVEN);
		Card secondCard = new Card(Suit.CLUBS, Type.JACK);
		Card thirdCard = new Card(Suit.SPADES, Type.FOUR);
		Card fourthCard = new Card(Suit.DIAMONDS, Type.THREE);
		Card fifthCard = new Card(Suit.HEARTS, Type.NINE);

//		Here we have someone trying to make the same card as the first one but not knowing that 7 is actually the card type 6 since counting starts at 0 in our code.
		BadCard sixthCard = new BadCard("Diamonds", 7);
//		Here we have someone trying to make the same card as the second one and succeeding.
		BadCard seventhCard = new BadCard("Clubs", 10);
//		Here we have someone accidentally but the type in as the first parameter and then the card type 2 (actual number 1) for the type.
		BadCard eightCard = new BadCard("Jacks", 1);
//		Here we have someone make another card that is of the suit clubs but is of some type that our system has no idea what it is.
//			We also have them creating a String object instead of using the literal like before which will cause problems later.
//		When you create a String object (which you rarely actually do but this is for the demonstration) you must pass in a literal.
//			The object then would act just like the literal if passed into a System.out.println() or something like that.
//			Where it won't work now though is in a == as it is not two literals equaling each other (as we try to do later) but a literal and an object.
		BadCard ninthCard = new BadCard(new String("Clubs"), 27);
//		And finally we have someone making fun of our code by putting things that don't even make sense into our cosntructor as parameters.
		BadCard tenthCard = new BadCard("What do I put here?", 69);

//		Here we print out all of the info for each card.  Notice how the first five print perfectly but that we get some strange results with the last five.
		System.out.println(firstCard.getInfo());
		System.out.println(secondCard.getInfo());
		System.out.println(thirdCard.getInfo());
		System.out.println(fourthCard.getInfo());
		System.out.println(fifthCard.getInfo());
		System.out.println(sixthCard.getInfo());
		System.out.println(seventhCard.getInfo());
		System.out.println(eightCard.getInfo());
		System.out.println(ninthCard.getInfo());
		System.out.println(tenthCard.getInfo());

//		Here we have some of the cards see if they are of the same type.
//			Notice how it works perfectly for the first five.
//			Also notice how it works perfectly for if they are not the same suit for the last five.
//				The problem is that we cannot see whether they are the same since we used the == instead of .equals().
//					This is a mistake that you can make sometimes with Strings if you are not careful but could never happen with enums!
//				Also, even if we did use .equals(), I hope you have realized that .equals() is case sensitive for strings.
//					If you haven't, go into your test program and try it out.
//					That means that the two suits "Clubs" and "clubs" are different which yet again can't happen with enums!
//				Now if we had used two literals instead of creating the new object as I did when creating the ninthCard we would have been correct.
//					It still would have had the problem with the case though which we will fix soon enough.
		System.out.println(firstCard.areSameSuit(secondCard));
		System.out.println(secondCard.areSameSuit(thirdCard));
		System.out.println(firstCard.areSameSuit(fourthCard));
		System.out.println(sixthCard.areSameSuit(seventhCard));
		System.out.println(seventhCard.areSameSuit(tenthCard));
		System.out.println(seventhCard.areSameSuit(ninthCard));

	}

    public class Card {
        private Suit suit;
        private Type type;

        public Card(Suit suit, Type type) {
            this.suit = suit;
            this.type = type;
        }

//      This is an example of a getter (the thing we learned about last lesson) being used to return info that isn't just a variable within our object.
//      We do something like this because someone who has a Card object shouldn't have access to the actual Suit or Type but can still know what each is.
        public String getInfo() {
//        	See how I use type.getTypeName() to retrive the name of the type since the typeName field (another word for variable remember) is private.
//        	Also see how I can just access the suitName normally even though it is private.  This is because the Card, Suit, and Type class are all within the LessonNine class.
//        	So in reality we could remove the getters for both names and make our code more secure as just in case someone got their hands on a Suit or Type they would be unable to get the name.
//        		This is because they would not be in this class and would be locked out of all the private variables.
        	return "I am the " + type.getTypeName() + " of " + suit.suitName;
        }

        public boolean areSameSuit(Card card) {
//        	The same logic we used in getInfo() to access the private variable in our Suit object can even be used on other objects of the same type.
//        		Since all objects of the same type come from the same class we can have objects of the same type access each other's private variables.
//        			This is useful since we don't want anyone being able to obtain the suit so we don't have to make a getter but can still look at it to see if they are the same.
//        	Also note how == can be used on enums as they are all constants.
//        		That means no matter how many times you call Suit.Diamonds it will always be the same one.
//        		You could still use .equals(...) though if it makes you feel better.
            return this.suit == card.suit;
        }
    }

    public enum Suit {
        DIAMONDS("Diamonds", true), CLUBS("Clubs", false),
        HEARTS("Hearts", true),  SPADES("Spades", false);

        private String suitName;
        private boolean redOrBlack;

        private Suit(String name, boolean color) {
            this.suitName = name;
            this.redOrBlack = color;
        }

        public String getSuitName() {
            return this.suitName;
        }

//      This will never get used in my example but could be used in a larger scale program.
        public boolean isRedOrBlack() {
            return this.redOrBlack;
        }
    }

    public enum Type {
        ACE("A"),
        TWO("2"),
        THREE("3"),
        FOUR("4"),
        FIVE("5"),
        SIX("6"),
        SEVEN("7"),
        EIGHT("8"),
        NINE("9"),
        TEN("10"),
        JACK("J"),
        QUEEN("Q"),
        KING("K");

        private String typeName;

        private Type(String name) {
            this.typeName = name;
        }

//      Notice that with this method we get nicer names than if we were to call .name() since we actually choose what to put in this variable.
//      	With .name() we just get what we declared the variable as and since they are constants we always make them in all uppercase which may not be as nice.
        public String getTypeName() {
        	return this.typeName;
        }
    }

    public class BadCard {
        private String suit;
        private int type;

        public BadCard(String suit, int type) {
            this.suit = suit;
            this.type = type;
        }

        public String getInfo() {
//        	Notice how I need a method to convert our int into a string that makes sense to the user.
//        	We could have had them pass in another string but as you will see with the suit, that just makes it more insecure.
        	return "I am the " + this.getTypeName() + " of " + suit;
        }

//      Notice how this method is private as it is only a method that the BadCard class needs to use.  No one else should need this information.
//        	If they do they can call the method we want them to call which is getInfo().
//      This shows another reason to use private which is for methods that are only useful to make your life easier locally within a class.
        private String getTypeName() {
//        	Notice that I do not need break; in my switch statements here as the return keyword already makes it so that no more code within this method could run.
//        		That technically means you do not need a break after the default case as there is no more code to run in the switch statement anyway.
//        	Also notice how return returns out of the method and not just the switch statement.
//        		This is just how return works, nothing you can do about it.
//        		There are other keywords to just get out of certain pieces of code but you are usually better just making a function that returns instead of messing with those.
//        			You will see examples of this as our code becomes more complex but for now do not worry about it.
//        			Also, if you just need to break out of a switch statement you can use the break keyword.
        	switch (this.type) {
        		case 0:
        			return "A";
        		case 1:
        			return "2";
        		case 2:
        			return "3";
        		case 3:
        			return "4";
        		case 4:
        			return "5";
        		case 5:
        			return "6";
        		case 6:
        			return "7";
        		case 7:
        			return "8";
        		case 8:
        			return "9";
        		case 9:
        			return "10";
        		case 10:
        			return "J";
        		case 11:
        			return "Q";
        		case 12:
        			return "K";
    			default:
        			return "UNKNOWN!";
        	}
        }

        public boolean areSameSuit(BadCard card) {
            return this.suit == card.suit;
        }
    }
}
