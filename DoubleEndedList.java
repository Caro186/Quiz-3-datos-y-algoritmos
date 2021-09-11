/**
 * @author: Carolina Rodriguez
 */
package Quiz3;

public class DoubleEndedList {
    private Node head;
    private Node last;
    private Node next;

    private int size;

    public DoubleEndedList() {
        this.head = null;
        this.last = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.head == this.last && this.last == null;
    }

    public int size() {
        return this.size;
    }

    public void insertFirst(Object data) {
        Node NewNode = new Node(data);

        if (this.isEmpty()) {
            this.head = this.last = NewNode;
        } else {
            NewNode.setNext(this.head);
            this.head = NewNode;
        }
        this.size++;
    }

    public Node getHead() {
        return this.head;

    }

    public void insertLast(Object data) {
        Node newBNode = new Node(data);
        if (this.isEmpty()) {
            this.head = this.last = newBNode;
        } else {
            this.last.setNext(newBNode);
            this.last = newBNode;
        }
        this.size++;
    }

    public Node remove_first() {

        if (isEmpty())
            System.out.println("Error");
        else {
            // this.next = this.head;
            if (this.head == this.last) {
                this.head = this.last = null;

            } else {
                this.head = this.head.getNext();
                this.head.setPrev(null);

            }
        }

        this.size--;
        return next;
    }

    public void displayList() {
        Node current = this.head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

}