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
        // y3.insertFirst(77);
        // y3.insertFirst(70);
        // y3.insertFirst(5);
        y3.insertFirst(4);
        y3.insertFirst(7);
        y3.insertLast(71);
        y3.remove_first();

        y3.displayList();

        // Get and print the size of the list.

        int size = linked_list.size();

        // Node head = y3.remove_first();
        // int element = (int) head.getData();

        // System.out.println(element);
    }

}

// Una vez realizadas las diferentes pruebas, el resultado fue el esperado.