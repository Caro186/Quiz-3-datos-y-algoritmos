package Quiz3;
public class Node {

    public static Object setData;
    public Object data;
    public Node last;
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
}