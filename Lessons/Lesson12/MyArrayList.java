package newLessons.lessonTwelve;

public class MyArrayList<T> {
	private Object[] wrappedArray;
	private int currentIndex;
	
	public MyArrayList() {
		this(10);
	}
	
	public MyArrayList(int initialSize) {
		wrappedArray = new Object[initialSize];
		currentIndex = 0;
	}
	
	public void add(T object) {
		if (currentIndex == wrappedArray.length) {
			Object[] newArray = new Object[wrappedArray.length * 2];
			System.arraycopy(wrappedArray, 0, newArray, 0, wrappedArray.length);
			
//			This could be alternatively done with:
//			for (int x = 0; x < wrappedArray.length; x++) {
//				newArray[x] = wrappedArray[x];
//			}
//			System.arraycopy is just easier and can work with offsets and different lengths.  I can explain this more if necessary.
			
			wrappedArray = newArray;
		}
		
		wrappedArray[currentIndex++] = object;
	}
	
	public T get(int index) {
		return (T) wrappedArray[index];
	}
	
	public int getSize() {
		return wrappedArray.length;
	}
	
	public void set(int index, T object) {
		if (index < wrappedArray.length) {
			wrappedArray[index] = object;
		} else {
			throw new IllegalArgumentException("Index is larger than size of array for MyArrayList!");
		}
	}
}
