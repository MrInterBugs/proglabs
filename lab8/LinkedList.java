class LinkedList {

    private static int counter;
    private Node head;
	
    public LinkedList() {

   }
    public LinkedList (Node head){
        this.head = head;
    }

    public void printList() {
	while (this.head != null) {
		System.out.println(head.getPayload());
		this.head = head.getNext();
	}
	System.out.println("End of list.");
    }

    public void addHead(String data) {
	Node LinkedList = new Node(data);
	Node currenthead = head;

	if (head == null) {
			head = new Node(data);
		}

	if (currenthead != null) {
			// starting at the head node, crawl to the end of the list and then add element after last node
			while (currenthead.getNext() != null) {
				currenthead = currenthead.getNext();
			}
			// the last node's "next" reference set to our new node
			currenthead.setNext(LinkedList);
		}
	addone();
    }

	private static void addone() {
		counter++;
	}
	private static void minusone() {
		counter--;
	}

	public boolean removeHead(int index) {
 
		// if the index is out of range, exit
		if (index < 1 || index > size())
			return false;
 
		Node Current = head;
		if (head != null) {
			for (int i = 0; i < index; i++) {
				if (Current.getNext() == null)
					return false;
 
				Current = Current.getNext();
			}
			Current.setNext(Current.getNext().getNext());
 
			// decrement the number of elements variable
			minusone();
			return true;
 
		}
		return false;
	}

	public int size() {
		return getCounter();
	}

	private static int getCounter() {
		return counter;
	}

}
