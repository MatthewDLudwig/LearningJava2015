package newLessons.lessonTen;

public class Person {
	private String name;
	private boolean gender;
	private int age;
	private char favoriteLetter;
	private Person friend;
	
	public Person(String personsName, boolean personsGender, int personsAge, char favoriteLetter) {
		this.name = personsName;
		this.gender = personsGender;
		this.age = personsAge;
		this.favoriteLetter = favoriteLetter;
	}
	
	public void setFriend(Person newFriend) {
		this.friend = newFriend;
	}

	public void speak() {
        System.out.printf("Hi, my name is %s!  I am %d years old and my favorite letter is:  %s\n", this.name, this.age, this.favoriteLetter);
	}
	
	public void speakTo(Person person) {
		if (this.friend != null && this.friend.equals(person)) {
	        System.out.printf("Hello %s!  You are my friend and my name is %s!  I am %d years old and my favorite letter is:  %s\n", name, this.name, this.age, this.favoriteLetter);
		} else {
	        System.out.printf("Hello %s, my name is %s!  I am %d years old and my favorite letter is:  %s\n", name, this.name, this.age, this.favoriteLetter);
		}
	}
	
//		When you are overriding a method from a parent class you should usually put the word "@Override" over the method so that other programmers know you are overriding a method.
//		This is also useful because your IDE will usually tell you if you make a mistake and are not actually overriding a method if you use "@Override" above the method.
	@Override
	public String toString() {
		String string = "";
		string += this.name;
		string += " is a ";
		string += this.age + " year old " + this.gender;
		string += " whose favorite letter is " + this.favoriteLetter + ".";
		return string;
	}
	
	@Override
	public boolean equals(Object o) {
//			The lines I write here are necessary for comparing two objects so we can make sure they are the same class.
//			For now you just have to write it and trust me but in the next set of five lessons it will make sense why we do this.
		
		if (o instanceof Person) {
			Person personToCompare = (Person)o;
			
//				Here is where you can write code to compare the two objects using the personToCompare variable.
			boolean nameGood = this.name.equals(personToCompare.name);
			boolean genderGood = this.gender == personToCompare.gender;
			boolean ageGood = this.age == personToCompare.age;
			boolean favoriteLetterGood = this.favoriteLetter == personToCompare.favoriteLetter;
			
			return nameGood && genderGood && ageGood && favoriteLetterGood;
		} else {
			return false;
		}
	}
}