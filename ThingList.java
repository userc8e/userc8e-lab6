public class ThingList {
    Node head; //first Node in the list

    public ThingList() {
        head = null;
    }

    // adds a new Node into the list
    public void addThing(Node n) {
        if (head == null) {
            head = n;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(n); 
        }
    }

    
}
