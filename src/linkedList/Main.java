package linkedList;

public class Main {
public static void main(String[] args) {
	LinkedList list=new LinkedList();
	list.insert(1);
	list.insert(2);
	list.insert(3);
	list.insertAtStart(4);
	list.insertAt(3, 44);
	list.delete(2);
	list.show();
}
}
