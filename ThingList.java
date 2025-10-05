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

    // prints all nodes
    public void printAll() {
        Node current = head;
        while (current != null) {
            System.out.println(current.toString());
            current = current.getNext();
        } 
        System.out.println("done");
        System.out.flush();
    }

}
