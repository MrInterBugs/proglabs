class Node {

	private String payload;
	private Node next;

	public Node(String payload) {
		this.payload = payload;
		this.next = null;
	}

	public Node(String payload, Node next) {
		this.payload = payload;
		this.next = next;
	}

	public String getPayload() {
		return this.payload;
  	}

  	public Node getNext() {
    		return this.next;
  	}

  	public void setPayload(String payload) {
    		this.payload = payload;
  	}

  	public void setNext(Node next) {
    		this.next = next;
 	}

	public static void main(String[] args) {
		Node node1 = new Node("Node 1");
		Node node2 = new Node("Node 2", node1);
		Node node3 = new Node("Node 3", node2);

		Node current = node3;
		while (current != null) {
			System.out.println(current.getPayload());
			current = current.getNext();
		}
	}
}
