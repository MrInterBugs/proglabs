public class LinkedListTest {
        public static LinkedList list;

        public static void main(String[] args) {
        list = new LinkedList();
        list.addHead("Test");
        list.addHead("One more");
        list.addHead("One last one");

	list.printList();
	}
}
