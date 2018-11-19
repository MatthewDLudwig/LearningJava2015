package newLessons.lessonTen;

public class OtherPerson {
	private String name;
	private boolean gender;
	private Month month;
	private int day;
	private int year;
	private State state;
	private OtherPerson[] friends;
	private OtherPerson[] enemies;
	
	public OtherPerson(String personsName, boolean personsGender, Month month, int day, int year, State state) {
		this.name = personsName;
		this.gender = personsGender;
		this.month = month;
		this.day = this.month.fixDay(day);
		this.year = year;
		this.state = state;
		this.friends = new OtherPerson[2];
		this.enemies = new OtherPerson[2];
	}
	
	public void addFriend(OtherPerson friend) {
		boolean added = false;
		
		for (int count = 0; count < this.friends.length; count++) {
			if (!added) {
				if (this.friends[count] == null) {
					this.friends[count] = friend;
					added = true;
				}
			}
		}
		
		if (!added) {
			OtherPerson[] tempArray = this.friends;
			this.friends = new OtherPerson[this.friends.length * 2];
			
			for (int count = 0; count < tempArray.length; count++) {
				this.friends[count] = tempArray[count];
			}
			
			this.friends[tempArray.length] = friend;
		}
		
		for (int count = 0; count < this.enemies.length; count++) {
			if (this.enemies[count] != null && this.enemies[count].equals(friend)) {
				this.enemies[count] = null;
			}
		}
	}
	
	public void addEnemy(OtherPerson enemy) {
		boolean added = false;
		
		for (int count = 0; count < this.enemies.length; count++) {
			if (!added) {
				if (this.enemies[count] == null) {
					this.enemies[count] = enemy;
					added = true;
				}
			}
		}
		
		if (!added) {
			OtherPerson[] tempArray = this.enemies;
			this.enemies = new OtherPerson[this.enemies.length * 2];
			
			for (int count = 0; count < tempArray.length; count++) {
				this.enemies[count] = tempArray[count];
			}
			
			this.enemies[tempArray.length] = enemy;
		}
		
		for (int count = 0; count < this.friends.length; count++) {
			if (this.friends[count] != null && this.friends[count].equals(enemy)) {
				this.friends[count] = null;
			}
		}
	}
			
	public void speak() {
		System.out.println(this.toString());
	}
	
	public void speakTo(OtherPerson person) {
		System.out.print("Hello " + person.name + "!  ");
		this.speak();
		
		for (int count = 0; count < this.friends.length; count++) {
			if (person.equals(this.friends[count])) {
				System.out.println("You are my friend!");
			}
		}
		
		for (int count = 0; count < this.enemies.length; count++) {
			if (person.equals(this.enemies[count])) {
				System.out.println("You are my enemy!");
			}
		}
	}
	
	@Override
	public String toString() {
		String info = "My name is " + this.name + " and I am a ";
		
		info += (2014 - this.year) + " year old ";
		
		if (gender) {
			info += "boy!";
		} else {
			info += "girl!";
		}
		
		return info;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof OtherPerson) {
			OtherPerson person = (OtherPerson)o;
			boolean name = this.name.equals(person.name);
			boolean gender = this.gender == person.gender;
			boolean month = this.month == person.month;
			boolean day = this.day == person.day;
			boolean year = this.year == person.year;
			boolean state = this.state == person.state;
			return name && gender && month && day && year && state;			
		} else {
			return false;
		}
	}
}