import java.util.Random;
public class ThingList {
    Node head; //first Node in the list
    int count;

    public ThingList() {
        head = null;
        count = 0;
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


    // moves all nodes around at random
    public void moveAll(Random rand) {
        for( Node T = head; T != null; T = T.getNext()) {
            T.getData().maybeTurn(rand);
            T.getData().step();
        }
        count++;
    }
}
