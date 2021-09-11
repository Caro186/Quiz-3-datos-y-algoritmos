/**
 * @author: Carolina Rodriguez
 */

package Quiz3;

public class main {

    public static void main(String[] args) {
        // Create an empty linked list
        LinkedList linked_list = new LinkedList();
        DoubleEndedList y3 = new DoubleEndedList();

        // some elements in the list
        linked_list.insertFirst(3);
        linked_list.insertFirst(8);
        linked_list.insertFirst(9);
        linked_list.insertFirst(1);
        linked_list.insertFirst(9);
        // some elements in the Doublelist
        y3.insertFirst(77);
        y3.insertFirst(7);
        y3.insertFirst(444);
        y3.insertFirst(444);
        y3.insertFirst(51);
        y3.insertLast(1);
        y3.insertLast(71);
        y3.displayList();

    }
}

// Una vez realizadas las diferentes pruebas, el resultado fue el esperado.