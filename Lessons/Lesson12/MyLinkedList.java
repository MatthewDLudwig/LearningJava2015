package newLessons.lessonTwelve;

public class MyLinkedList<T> {
	private Node<T> firstNode;
	private Node<T> lastNode;
	private int size;
	
	public MyLinkedList() {
		size = 0;
	}
	
	public void add(T data) {
		Node<T> node = new Node<T>(data);
		
		if (firstNode == null) {
			firstNode = node;
			lastNode = node;
		} else {
			lastNode.nextNode = node;
			lastNode = node;
		}
		
		size++;
	}
	
	public T getLast() {
		return lastNode.data;
	}
	
	public T get(int index) {
		return firstNode.get(index);
	}
	
	public int getSize() {
		return size;
	}
	
//	Because Node is within MyLinkedList I can use the generic from MyLinkedList.
//	Alternatively they could have been two different classes each with generics and you passed the generic through.
//		I have showed you both (I pass in the type but do not use it as I prefer the cleaner way).
//			Most people wouldn't use another generic in the Node class as I said.
//	This is another reason why you should put classes that are related to each other in one physical class.
	private class Node<K> {
		private T data;
		private Node<T> nextNode;
		
		public Node(T data) {
			this.data = data;
		}
		
		public T get(int index) {
//			This is the ternary operator.  The first 1/3 is the test, the second one is what is done if it is true, and the third if it is false.
			return index == 0 ? data : nextNode.get(index - 1);
		}
	}
}
