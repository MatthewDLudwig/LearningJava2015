package newLessons.lessonTen;

public enum Month {
	JANUARY(31),
	FEBRUARY(28),
	MARCH(31),
	APRIL(30),
	MAY(31),
	JUNE(30),
	JULY(31),
	AUGUST(31),
	SEPTEMBER(30),
	OCTOBER(31),
	NOVEMBER(30),
	DECEMBER(31);		
	
	private int maxAmountOfDays;
	
	private Month(int maxDays) {
		this.maxAmountOfDays = maxDays;
	}
	
//		Notice that I could use the private scope modifier since the Person class and the Month class were inside the same class.
//		private really means that it is private only within the file.
//		
//		Now notice that I have to use public as they are no longer in the same class.
	public int fixDay(int dayToFix) {
		if (dayToFix > this.maxAmountOfDays) {
			return this.maxAmountOfDays;
		} else {
			return dayToFix;
		}
	}
}