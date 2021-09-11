package Quiz3;

public class Node {

    public static Object setData;
    public Object data;
    public Node last;
    private Node rear;
    public Node next;

    public Node(Object data) {
        this.next = null;
        this.last = null;
        this.data = data;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public Node getRear() {
        return rear;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }
}