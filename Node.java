public class Node {
    private Thing data;
    private Node next;

    public Node(Thing t) {
        data = t;
    }

    public Thing getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node n) {
        next = n;
    }
}
